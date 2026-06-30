package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class NoticeItem {
    public int mIsShowNotice;
    public java.lang.String mJumpUrl;
    public java.lang.String mLeftIcon;
    public java.lang.String mNoticeId;
    public java.lang.String mWording;

    public NoticeItem() {
    }

    public NoticeItem(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.mIsShowNotice = i17;
        this.mWording = str;
        this.mLeftIcon = str2;
        this.mJumpUrl = str3;
        this.mNoticeId = str4;
    }

    public int getIsShowNotice() {
        return this.mIsShowNotice;
    }

    public java.lang.String getJumpUrl() {
        return this.mJumpUrl;
    }

    public java.lang.String getLeftIcon() {
        return this.mLeftIcon;
    }

    public java.lang.String getNoticeId() {
        return this.mNoticeId;
    }

    public java.lang.String getWording() {
        return this.mWording;
    }

    public java.lang.String toString() {
        return "NoticeItem{mIsShowNotice=" + this.mIsShowNotice + ",mWording=" + this.mWording + ",mLeftIcon=" + this.mLeftIcon + ",mJumpUrl=" + this.mJumpUrl + ",mNoticeId=" + this.mNoticeId + "}";
    }
}
