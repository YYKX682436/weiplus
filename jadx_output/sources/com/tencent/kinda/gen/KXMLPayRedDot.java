package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class KXMLPayRedDot {
    public long mExpireTime;
    public java.lang.String mReddotId;
    public java.lang.String mWording;

    public KXMLPayRedDot() {
    }

    public KXMLPayRedDot(java.lang.String str, long j17, java.lang.String str2) {
        this.mReddotId = str;
        this.mExpireTime = j17;
        this.mWording = str2;
    }

    public long getExpireTime() {
        return this.mExpireTime;
    }

    public java.lang.String getReddotId() {
        return this.mReddotId;
    }

    public java.lang.String getWording() {
        return this.mWording;
    }

    public java.lang.String toString() {
        return "KXMLPayRedDot{mReddotId=" + this.mReddotId + ",mExpireTime=" + this.mExpireTime + ",mWording=" + this.mWording + "}";
    }
}
