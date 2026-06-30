package com.p314xaae8f345.p457x3304c6.p459x2e06d1;

/* renamed from: com.tencent.maas.base.Vec2 */
/* loaded from: classes5.dex */
public class C3974x289f3e implements java.io.Serializable, java.lang.Cloneable {

    /* renamed from: INVALID_VEC2 */
    public static final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f15793xab4f6ca6 = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(Float.NaN, Float.NaN);

    /* renamed from: serialVersionUID */
    private static final long f15794x3a3ed56c = 1;

    /* renamed from: x, reason: collision with root package name */
    public float f129332x;

    /* renamed from: y, reason: collision with root package name */
    public float f129333y;

    public C3974x289f3e() {
        this(0.0f, 0.0f);
    }

    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e add(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        return new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(this.f129332x + c3974x289f3e.f129332x, this.f129333y + c3974x289f3e.f129333y);
    }

    /* renamed from: isValid */
    public final boolean m32431x7b953cf2() {
        return (java.lang.Float.isNaN(this.f129332x) || java.lang.Float.isInfinite(this.f129332x) || java.lang.Float.isNaN(this.f129333y) || java.lang.Float.isInfinite(this.f129333y)) ? false : true;
    }

    /* renamed from: length */
    public final double m32432xbe0e3ae6() {
        float f17 = this.f129332x;
        float f18 = this.f129333y;
        return java.lang.Math.sqrt((f17 * f17) + (f18 * f18));
    }

    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e mul(float f17) {
        return new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(this.f129332x * f17, this.f129333y * f17);
    }

    /* renamed from: negate */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m32433xc174a702() {
        return new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(-this.f129332x, -this.f129333y);
    }

    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e set(float f17, float f18) {
        this.f129332x = f17;
        this.f129333y = f18;
        return this;
    }

    /* renamed from: setZero */
    public final void m32434x76532e2a() {
        this.f129332x = 0.0f;
        this.f129333y = 0.0f;
    }

    /* renamed from: skew */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m32435x35e50a() {
        return new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(-this.f129333y, this.f129332x);
    }

    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e sub(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        return new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(this.f129332x - c3974x289f3e.f129332x, this.f129333y - c3974x289f3e.f129333y);
    }

    /* renamed from: toString */
    public final java.lang.String m32437x9616526c() {
        return "(" + this.f129332x + "," + this.f129333y + ")";
    }

    public C3974x289f3e(float f17, float f18) {
        this.f129332x = f17;
        this.f129333y = f18;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m32430x5a5dd5d() {
        return new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(this.f129332x, this.f129333y);
    }

    /* renamed from: skew */
    public final void m32436x35e50a(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        c3974x289f3e.f129332x = -this.f129333y;
        c3974x289f3e.f129333y = this.f129332x;
    }

    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e set(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        this.f129332x = c3974x289f3e.f129332x;
        this.f129333y = c3974x289f3e.f129333y;
        return this;
    }

    public C3974x289f3e(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        this(c3974x289f3e.f129332x, c3974x289f3e.f129333y);
    }
}
