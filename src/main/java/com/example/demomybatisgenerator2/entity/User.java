package com.example.demomybatisgenerator2.entity;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private String userInstid;

    private String userId;

    private Short userState;

    private String userName;

    private String userKey;

    private String userSex;

    private String email;

    private Date cDate;

    private Date updateDate;

    private String mphone;

    private String orgId;

    private String userIdcard;

    private Date userBirthday;

    private BigDecimal userSbflg;

    private String userInname;

    public String getUserInstid() {
        return userInstid;
    }

    public void setUserInstid(String userInstid) {
        this.userInstid = userInstid == null ? null : userInstid.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Short getUserState() {
        return userState;
    }

    public void setUserState(Short userState) {
        this.userState = userState;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey == null ? null : userKey.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone == null ? null : mphone.trim();
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard == null ? null : userIdcard.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public BigDecimal getUserSbflg() {
        return userSbflg;
    }

    public void setUserSbflg(BigDecimal userSbflg) {
        this.userSbflg = userSbflg;
    }

    public String getUserInname() {
        return userInname;
    }

    public void setUserInname(String userInname) {
        this.userInname = userInname == null ? null : userInname.trim();
    }
}