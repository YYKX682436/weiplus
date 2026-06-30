package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJTextStyle {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.model.MJColor f48336a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.maas.model.MJColor f48337b;

    /* renamed from: c, reason: collision with root package name */
    public float f48338c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.maas.model.MJColor f48339d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.maas.base.Vec2 f48340e;

    /* renamed from: f, reason: collision with root package name */
    public float f48341f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f48342g;

    /* renamed from: h, reason: collision with root package name */
    public float f48343h;

    public MJTextStyle(com.tencent.maas.model.MJColor mJColor, com.tencent.maas.model.MJColor mJColor2, float f17, com.tencent.maas.model.MJColor mJColor3, com.tencent.maas.base.Vec2 vec2, float f18) {
        this.f48336a = mJColor;
        this.f48337b = mJColor2;
        this.f48338c = f17;
        this.f48339d = mJColor3;
        this.f48340e = vec2;
        this.f48341f = f18;
        this.f48342g = "";
        this.f48343h = 0.0f;
    }

    public com.tencent.maas.model.MJColor getFillColor() {
        return this.f48336a;
    }

    public java.lang.String getFontName() {
        return this.f48342g;
    }

    public float getFontSize() {
        return this.f48343h;
    }

    public com.tencent.maas.model.MJColor getShadowColor() {
        return this.f48339d;
    }

    public com.tencent.maas.base.Vec2 getShadowOffset() {
        return this.f48340e;
    }

    public float getShadowRaduis() {
        return this.f48341f;
    }

    public com.tencent.maas.model.MJColor getStrokeColor() {
        return this.f48337b;
    }

    public float getStrokeWidth() {
        return this.f48338c;
    }

    public void setFillColor(com.tencent.maas.model.MJColor mJColor) {
        this.f48336a = mJColor;
    }

    public void setFontName(java.lang.String str) {
        this.f48342g = str;
    }

    public void setFontSize(float f17) {
        this.f48343h = f17;
    }

    public void setShadowColor(com.tencent.maas.model.MJColor mJColor) {
        this.f48339d = mJColor;
    }

    public void setShadowOffset(com.tencent.maas.base.Vec2 vec2) {
        this.f48340e = vec2;
    }

    public void setShadowRaduis(float f17) {
        this.f48341f = f17;
    }

    public void setStrokeColor(com.tencent.maas.model.MJColor mJColor) {
        this.f48337b = mJColor;
    }

    public void setStrokeWidth(float f17) {
        this.f48338c = f17;
    }

    public MJTextStyle(com.tencent.maas.model.MJColor mJColor, com.tencent.maas.model.MJColor mJColor2, float f17, com.tencent.maas.model.MJColor mJColor3, com.tencent.maas.base.Vec2 vec2, float f18, java.lang.String str, float f19) {
        this(mJColor, mJColor2, f17, mJColor3, vec2, f18);
        this.f48342g = str;
        this.f48343h = f19;
    }
}
