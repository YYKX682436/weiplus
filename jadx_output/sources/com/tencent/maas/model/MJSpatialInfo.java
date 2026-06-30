package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJSpatialInfo {

    /* renamed from: a, reason: collision with root package name */
    public float f48289a;

    /* renamed from: b, reason: collision with root package name */
    public float f48290b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.maas.base.Vec2 f48291c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.maas.base.Vec2 f48292d;

    public MJSpatialInfo(float f17, float f18, com.tencent.maas.base.Vec2 vec2) {
        this.f48289a = f17;
        this.f48290b = f18;
        this.f48291c = vec2;
        this.f48292d = new com.tencent.maas.base.Vec2(0.5f, 0.5f);
    }

    public com.tencent.maas.base.Vec2 getAnchorPoint() {
        return this.f48292d;
    }

    public com.tencent.maas.base.Vec2 getPosition() {
        return this.f48291c;
    }

    public float getRotation() {
        return this.f48290b;
    }

    public float getScale() {
        return this.f48289a;
    }

    public void setAnchorPoint(com.tencent.maas.base.Vec2 vec2) {
        this.f48292d = vec2;
    }

    public void setPosition(com.tencent.maas.base.Vec2 vec2) {
        this.f48291c = vec2;
    }

    public void setRotation(float f17) {
        this.f48290b = f17;
    }

    public void setScale(float f17) {
        this.f48289a = f17;
    }

    public java.lang.String toString() {
        return "MJSpatialInfo{scale=" + this.f48289a + ", rotation=" + this.f48290b + ", position=" + this.f48291c + ", anchorPoint=" + this.f48292d + '}';
    }

    public MJSpatialInfo(float f17, float f18, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.base.Vec2 vec22) {
        this.f48289a = f17;
        this.f48290b = f18;
        this.f48291c = vec2;
        this.f48292d = vec22;
    }
}
