package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class KPayMenuRedDotItem {
    public long mExpireTime;
    public java.lang.String mItemName;
    public java.lang.String mWording;

    public KPayMenuRedDotItem() {
    }

    public KPayMenuRedDotItem(java.lang.String str, long j17, java.lang.String str2) {
        this.mItemName = str;
        this.mExpireTime = j17;
        this.mWording = str2;
    }

    public long getExpireTime() {
        return this.mExpireTime;
    }

    public java.lang.String getItemName() {
        return this.mItemName;
    }

    public java.lang.String getWording() {
        return this.mWording;
    }

    public java.lang.String toString() {
        return "KPayMenuRedDotItem{mItemName=" + this.mItemName + ",mExpireTime=" + this.mExpireTime + ",mWording=" + this.mWording + "}";
    }
}
