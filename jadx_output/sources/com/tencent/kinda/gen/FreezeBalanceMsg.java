package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class FreezeBalanceMsg {
    public long mBgColor;
    public java.lang.String mLeftIcon;
    public java.lang.String mRightIcon;
    public java.lang.String mRouteUrl;
    public java.lang.String mWording;
    public long mWordingColor;
    public int mWordingSize;

    public FreezeBalanceMsg() {
    }

    public FreezeBalanceMsg(java.lang.String str, long j17, int i17, long j18, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.mWording = str;
        this.mWordingColor = j17;
        this.mWordingSize = i17;
        this.mBgColor = j18;
        this.mRouteUrl = str2;
        this.mLeftIcon = str3;
        this.mRightIcon = str4;
    }

    public long getBgColor() {
        return this.mBgColor;
    }

    public java.lang.String getLeftIcon() {
        return this.mLeftIcon;
    }

    public java.lang.String getRightIcon() {
        return this.mRightIcon;
    }

    public java.lang.String getRouteUrl() {
        return this.mRouteUrl;
    }

    public java.lang.String getWording() {
        return this.mWording;
    }

    public long getWordingColor() {
        return this.mWordingColor;
    }

    public int getWordingSize() {
        return this.mWordingSize;
    }

    public java.lang.String toString() {
        return "FreezeBalanceMsg{mWording=" + this.mWording + ",mWordingColor=" + this.mWordingColor + ",mWordingSize=" + this.mWordingSize + ",mBgColor=" + this.mBgColor + ",mRouteUrl=" + this.mRouteUrl + ",mLeftIcon=" + this.mLeftIcon + ",mRightIcon=" + this.mRightIcon + "}";
    }
}
