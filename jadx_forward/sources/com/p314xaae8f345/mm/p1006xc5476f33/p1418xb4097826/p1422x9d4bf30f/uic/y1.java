package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes2.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public int f183508a;

    /* renamed from: b, reason: collision with root package name */
    public int f183509b;

    public y1(int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? 2 : i17;
        i18 = (i19 & 2) != 0 ? 0 : i18;
        this.f183508a = i17;
        this.f183509b = i18;
    }

    /* renamed from: equals */
    public boolean m55440xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.y1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.y1 y1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.y1) obj;
        return this.f183508a == y1Var.f183508a && this.f183509b == y1Var.f183509b;
    }

    /* renamed from: hashCode */
    public int m55441x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f183508a) * 31) + java.lang.Integer.hashCode(this.f183509b);
    }

    /* renamed from: toString */
    public java.lang.String m55442x9616526c() {
        return "JoinResult(joinActivityResult=" + this.f183508a + ", interceptType=" + this.f183509b + ')';
    }
}
