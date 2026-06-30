package com.p314xaae8f345.p457x3304c6.p477x633fb29;

/* renamed from: com.tencent.maas.model.MJLocation */
/* loaded from: classes5.dex */
public class C4113xcb092072 {

    /* renamed from: a, reason: collision with root package name */
    public final float f129798a;

    /* renamed from: b, reason: collision with root package name */
    public final float f129799b;

    public C4113xcb092072(float f17, float f18) {
        this.f129798a = f17;
        this.f129799b = f18;
    }

    /* renamed from: equals */
    public boolean m33840xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072 c4113xcb092072 = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4113xcb092072) obj;
        return java.lang.Float.compare(c4113xcb092072.f129798a, this.f129798a) == 0 && java.lang.Float.compare(c4113xcb092072.f129799b, this.f129799b) == 0;
    }

    /* renamed from: getLatitude */
    public float m33841x2605e9e2() {
        return this.f129799b;
    }

    /* renamed from: getLongitude */
    public float m33842x79d7af9() {
        return this.f129798a;
    }

    /* renamed from: hashCode */
    public int m33843x8cdac1b() {
        return java.util.Objects.hash(java.lang.Integer.valueOf((int) (this.f129798a * 100.0f)), java.lang.Integer.valueOf((int) (this.f129799b * 10.0f)));
    }
}
