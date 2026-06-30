package com.tencent.maas.base;

/* loaded from: classes5.dex */
public class Vec2 implements java.io.Serializable, java.lang.Cloneable {
    public static final com.tencent.maas.base.Vec2 INVALID_VEC2 = new com.tencent.maas.base.Vec2(Float.NaN, Float.NaN);
    private static final long serialVersionUID = 1;

    /* renamed from: x, reason: collision with root package name */
    public float f47799x;

    /* renamed from: y, reason: collision with root package name */
    public float f47800y;

    public Vec2() {
        this(0.0f, 0.0f);
    }

    public final com.tencent.maas.base.Vec2 add(com.tencent.maas.base.Vec2 vec2) {
        return new com.tencent.maas.base.Vec2(this.f47799x + vec2.f47799x, this.f47800y + vec2.f47800y);
    }

    public final boolean isValid() {
        return (java.lang.Float.isNaN(this.f47799x) || java.lang.Float.isInfinite(this.f47799x) || java.lang.Float.isNaN(this.f47800y) || java.lang.Float.isInfinite(this.f47800y)) ? false : true;
    }

    public final double length() {
        float f17 = this.f47799x;
        float f18 = this.f47800y;
        return java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
    }

    public final com.tencent.maas.base.Vec2 mul(float f17) {
        return new com.tencent.maas.base.Vec2(this.f47799x * f17, this.f47800y * f17);
    }

    public final com.tencent.maas.base.Vec2 negate() {
        return new com.tencent.maas.base.Vec2(-this.f47799x, -this.f47800y);
    }

    public final com.tencent.maas.base.Vec2 set(float f17, float f18) {
        this.f47799x = f17;
        this.f47800y = f18;
        return this;
    }

    public final void setZero() {
        this.f47799x = 0.0f;
        this.f47800y = 0.0f;
    }

    public final com.tencent.maas.base.Vec2 skew() {
        return new com.tencent.maas.base.Vec2(-this.f47800y, this.f47799x);
    }

    public final com.tencent.maas.base.Vec2 sub(com.tencent.maas.base.Vec2 vec2) {
        return new com.tencent.maas.base.Vec2(this.f47799x - vec2.f47799x, this.f47800y - vec2.f47800y);
    }

    public final java.lang.String toString() {
        return "(" + this.f47799x + "," + this.f47800y + ")";
    }

    public Vec2(float f17, float f18) {
        this.f47799x = f17;
        this.f47800y = f18;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.tencent.maas.base.Vec2 m43clone() {
        return new com.tencent.maas.base.Vec2(this.f47799x, this.f47800y);
    }

    public final void skew(com.tencent.maas.base.Vec2 vec2) {
        vec2.f47799x = -this.f47800y;
        vec2.f47800y = this.f47799x;
    }

    public final com.tencent.maas.base.Vec2 set(com.tencent.maas.base.Vec2 vec2) {
        this.f47799x = vec2.f47799x;
        this.f47800y = vec2.f47800y;
        return this;
    }

    public Vec2(com.tencent.maas.base.Vec2 vec2) {
        this(vec2.f47799x, vec2.f47800y);
    }
}
