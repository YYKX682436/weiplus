package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class KGenDigitalCrtReq {
    public int mCertEncryptType;
    public java.lang.String mCreTail;
    public java.lang.String mIdNo;
    public int mIdType;
    public java.lang.String mReqKey;
    public java.lang.String mToken;
    public int mType;
    public java.lang.String mVerifyCode;

    public KGenDigitalCrtReq() {
    }

    public KGenDigitalCrtReq(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i19) {
        this.mType = i17;
        this.mIdType = i18;
        this.mIdNo = str;
        this.mReqKey = str2;
        this.mVerifyCode = str3;
        this.mToken = str4;
        this.mCreTail = str5;
        this.mCertEncryptType = i19;
    }

    public int getCertEncryptType() {
        return this.mCertEncryptType;
    }

    public java.lang.String getCreTail() {
        return this.mCreTail;
    }

    public java.lang.String getIdNo() {
        return this.mIdNo;
    }

    public int getIdType() {
        return this.mIdType;
    }

    public java.lang.String getReqKey() {
        return this.mReqKey;
    }

    public java.lang.String getToken() {
        return this.mToken;
    }

    public int getType() {
        return this.mType;
    }

    public java.lang.String getVerifyCode() {
        return this.mVerifyCode;
    }

    public java.lang.String toString() {
        return "KGenDigitalCrtReq{mType=" + this.mType + ",mIdType=" + this.mIdType + ",mIdNo=" + this.mIdNo + ",mReqKey=" + this.mReqKey + ",mVerifyCode=" + this.mVerifyCode + ",mToken=" + this.mToken + ",mCreTail=" + this.mCreTail + ",mCertEncryptType=" + this.mCertEncryptType + "}";
    }
}
