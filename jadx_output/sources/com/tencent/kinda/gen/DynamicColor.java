package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class DynamicColor {
    public long mDarkmodeColor;
    public long mNormalColor;

    public DynamicColor() {
    }

    public DynamicColor(long j17, long j18) {
        this.mNormalColor = j17;
        this.mDarkmodeColor = j18;
    }

    public long getDarkmodeColor() {
        return this.mDarkmodeColor;
    }

    public long getNormalColor() {
        return this.mNormalColor;
    }

    public java.lang.String toString() {
        return "DynamicColor{mNormalColor=" + this.mNormalColor + ",mDarkmodeColor=" + this.mDarkmodeColor + "}";
    }
}
