package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class KRect {
    public com.tencent.kinda.gen.KPoint mOrigin;
    public com.tencent.kinda.gen.KSize mSize;

    public KRect() {
    }

    public KRect(com.tencent.kinda.gen.KPoint kPoint, com.tencent.kinda.gen.KSize kSize) {
        this.mOrigin = kPoint;
        this.mSize = kSize;
    }

    public com.tencent.kinda.gen.KPoint getOrigin() {
        return this.mOrigin;
    }

    public com.tencent.kinda.gen.KSize getSize() {
        return this.mSize;
    }

    public java.lang.String toString() {
        return "KRect{mOrigin=" + this.mOrigin + ",mSize=" + this.mSize + "}";
    }
}
