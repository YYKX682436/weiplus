package com.p314xaae8f345.p457x3304c6.p477x633fb29;

/* renamed from: com.tencent.maas.model.MJSpatialInfo */
/* loaded from: classes5.dex */
public class C4118xbb09bdf5 {

    /* renamed from: a, reason: collision with root package name */
    public float f129822a;

    /* renamed from: b, reason: collision with root package name */
    public float f129823b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f129824c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f129825d;

    public C4118xbb09bdf5(float f17, float f18, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        this.f129822a = f17;
        this.f129823b = f18;
        this.f129824c = c3974x289f3e;
        this.f129825d = new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e(0.5f, 0.5f);
    }

    /* renamed from: getAnchorPoint */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33868x7cf552a5() {
        return this.f129825d;
    }

    /* renamed from: getPosition */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m33869xa86cd69f() {
        return this.f129824c;
    }

    /* renamed from: getRotation */
    public float m33870x79734cf4() {
        return this.f129823b;
    }

    /* renamed from: getScale */
    public float m33871x7520af94() {
        return this.f129822a;
    }

    /* renamed from: setAnchorPoint */
    public void m33872x135ac619(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        this.f129825d = c3974x289f3e;
    }

    /* renamed from: setPosition */
    public void m33873xa32537ab(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e) {
        this.f129824c = c3974x289f3e;
    }

    /* renamed from: setRotation */
    public void m33874x742bae00(float f17) {
        this.f129823b = f17;
    }

    /* renamed from: setScale */
    public void m33875x53aeca08(float f17) {
        this.f129822a = f17;
    }

    /* renamed from: toString */
    public java.lang.String m33876x9616526c() {
        return "MJSpatialInfo{scale=" + this.f129822a + ", rotation=" + this.f129823b + ", position=" + this.f129824c + ", anchorPoint=" + this.f129825d + '}';
    }

    public C4118xbb09bdf5(float f17, float f18, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e2) {
        this.f129822a = f17;
        this.f129823b = f18;
        this.f129824c = c3974x289f3e;
        this.f129825d = c3974x289f3e2;
    }
}
