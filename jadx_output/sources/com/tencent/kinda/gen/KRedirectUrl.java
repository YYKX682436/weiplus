package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class KRedirectUrl {
    public java.lang.String mAppVersion;
    public java.lang.String mAppid;
    public java.lang.String mBtnName;
    public java.lang.String mPath;
    public int mType;

    public KRedirectUrl() {
    }

    public KRedirectUrl(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.mType = i17;
        this.mAppid = str;
        this.mAppVersion = str2;
        this.mPath = str3;
        this.mBtnName = str4;
    }

    public java.lang.String getAppVersion() {
        return this.mAppVersion;
    }

    public java.lang.String getAppid() {
        return this.mAppid;
    }

    public java.lang.String getBtnName() {
        return this.mBtnName;
    }

    public java.lang.String getPath() {
        return this.mPath;
    }

    public int getType() {
        return this.mType;
    }

    public java.lang.String toString() {
        return "KRedirectUrl{mType=" + this.mType + ",mAppid=" + this.mAppid + ",mAppVersion=" + this.mAppVersion + ",mPath=" + this.mPath + ",mBtnName=" + this.mBtnName + "}";
    }
}
