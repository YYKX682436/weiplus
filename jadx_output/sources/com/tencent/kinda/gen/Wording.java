package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class Wording {
    public java.lang.String mDesc;
    public java.lang.String mEntryTip;
    public boolean mNeedshow;
    public java.lang.String mSubDesc;
    public java.lang.String mSubTitle;
    public java.lang.String mTitle;

    public Wording() {
    }

    public Wording(boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.mNeedshow = z17;
        this.mEntryTip = str;
        this.mTitle = str2;
        this.mSubTitle = str3;
        this.mDesc = str4;
        this.mSubDesc = str5;
    }

    public java.lang.String getDesc() {
        return this.mDesc;
    }

    public java.lang.String getEntryTip() {
        return this.mEntryTip;
    }

    public boolean getNeedshow() {
        return this.mNeedshow;
    }

    public java.lang.String getSubDesc() {
        return this.mSubDesc;
    }

    public java.lang.String getSubTitle() {
        return this.mSubTitle;
    }

    public java.lang.String getTitle() {
        return this.mTitle;
    }

    public java.lang.String toString() {
        return "Wording{mNeedshow=" + this.mNeedshow + ",mEntryTip=" + this.mEntryTip + ",mTitle=" + this.mTitle + ",mSubTitle=" + this.mSubTitle + ",mDesc=" + this.mDesc + ",mSubDesc=" + this.mSubDesc + "}";
    }
}
