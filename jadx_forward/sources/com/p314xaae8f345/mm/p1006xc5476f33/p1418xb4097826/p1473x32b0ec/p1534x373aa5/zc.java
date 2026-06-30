package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes10.dex */
public final class zc {

    /* renamed from: a, reason: collision with root package name */
    public float f198396a;

    /* renamed from: b, reason: collision with root package name */
    public float f198397b;

    /* renamed from: c, reason: collision with root package name */
    public float f198398c;

    /* renamed from: d, reason: collision with root package name */
    public final float f198399d;

    /* renamed from: e, reason: collision with root package name */
    public final float f198400e;

    public zc(float f17, float f18, float f19, float f27, float f28, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f18 = (i17 & 2) != 0 ? 0.0f : f18;
        f27 = (i17 & 8) != 0 ? 80.0f : f27;
        f28 = (i17 & 16) != 0 ? 22.0f : f28;
        this.f198396a = f17;
        this.f198397b = f18;
        this.f198398c = f19;
        this.f198399d = f27;
        this.f198400e = f28;
    }

    public final void a(float f17) {
        float min = java.lang.Math.min(f17, 0.05f);
        float f18 = this.f198396a;
        float f19 = (-this.f198399d) * (f18 - this.f198398c);
        float f27 = -this.f198400e;
        float f28 = this.f198397b;
        float f29 = f28 + ((f19 + (f27 * f28)) * min);
        this.f198397b = f29;
        this.f198396a = f18 + (f29 * min);
    }

    /* renamed from: equals */
    public boolean m57834xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.zc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.zc zcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.zc) obj;
        return java.lang.Float.compare(this.f198396a, zcVar.f198396a) == 0 && java.lang.Float.compare(this.f198397b, zcVar.f198397b) == 0 && java.lang.Float.compare(this.f198398c, zcVar.f198398c) == 0 && java.lang.Float.compare(this.f198399d, zcVar.f198399d) == 0 && java.lang.Float.compare(this.f198400e, zcVar.f198400e) == 0;
    }

    /* renamed from: hashCode */
    public int m57835x8cdac1b() {
        return (((((((java.lang.Float.hashCode(this.f198396a) * 31) + java.lang.Float.hashCode(this.f198397b)) * 31) + java.lang.Float.hashCode(this.f198398c)) * 31) + java.lang.Float.hashCode(this.f198399d)) * 31) + java.lang.Float.hashCode(this.f198400e);
    }

    /* renamed from: toString */
    public java.lang.String m57836x9616526c() {
        return "Spring(value=" + this.f198396a + ", velocity=" + this.f198397b + ", target=" + this.f198398c + ", stiffness=" + this.f198399d + ", damping=" + this.f198400e + ')';
    }
}
