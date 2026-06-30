package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class KJumpRemindInfo {
    public boolean mIsPopUpWindows;
    public int mJumpType;
    public java.lang.String mLeftButtonWording;
    public java.lang.String mRightButtonWording;
    public java.lang.String mTitle;
    public com.tencent.kinda.gen.KRedirectUrl mUrl;
    public java.lang.String mWording;

    public KJumpRemindInfo() {
    }

    public KJumpRemindInfo(int i17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.kinda.gen.KRedirectUrl kRedirectUrl, java.lang.String str4) {
        this.mJumpType = i17;
        this.mIsPopUpWindows = z17;
        this.mWording = str;
        this.mLeftButtonWording = str2;
        this.mRightButtonWording = str3;
        this.mUrl = kRedirectUrl;
        this.mTitle = str4;
    }

    public boolean getIsPopUpWindows() {
        return this.mIsPopUpWindows;
    }

    public int getJumpType() {
        return this.mJumpType;
    }

    public java.lang.String getLeftButtonWording() {
        return this.mLeftButtonWording;
    }

    public java.lang.String getRightButtonWording() {
        return this.mRightButtonWording;
    }

    public java.lang.String getTitle() {
        return this.mTitle;
    }

    public com.tencent.kinda.gen.KRedirectUrl getUrl() {
        return this.mUrl;
    }

    public java.lang.String getWording() {
        return this.mWording;
    }

    public java.lang.String toString() {
        return "KJumpRemindInfo{mJumpType=" + this.mJumpType + ",mIsPopUpWindows=" + this.mIsPopUpWindows + ",mWording=" + this.mWording + ",mLeftButtonWording=" + this.mLeftButtonWording + ",mRightButtonWording=" + this.mRightButtonWording + ",mUrl=" + this.mUrl + ",mTitle=" + this.mTitle + "}";
    }
}
