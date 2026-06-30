package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    public final int f194328a;

    /* renamed from: b, reason: collision with root package name */
    public final int f194329b;

    public hc(int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? android.graphics.Color.parseColor("#66000000") : i17;
        i18 = (i19 & 2) != 0 ? android.graphics.Color.parseColor("#59000000") : i18;
        this.f194328a = i17;
        this.f194329b = i18;
    }

    /* renamed from: equals */
    public boolean m56967xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hc hcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hc) obj;
        return this.f194328a == hcVar.f194328a && this.f194329b == hcVar.f194329b;
    }

    /* renamed from: hashCode */
    public int m56968x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f194328a) * 31) + java.lang.Integer.hashCode(this.f194329b);
    }

    /* renamed from: toString */
    public java.lang.String m56969x9616526c() {
        return "AnimationColors(color40Percent=" + this.f194328a + ", color35Percent=" + this.f194329b + ')';
    }
}
