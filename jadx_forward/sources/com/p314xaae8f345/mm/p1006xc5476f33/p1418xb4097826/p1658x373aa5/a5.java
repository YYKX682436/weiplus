package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f213151a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f213152b;

    public a5(int i17, boolean z17) {
        this.f213151a = i17;
        this.f213152b = z17;
    }

    /* renamed from: equals */
    public boolean m62516xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.a5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.a5 a5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.a5) obj;
        return this.f213151a == a5Var.f213151a && this.f213152b == a5Var.f213152b;
    }

    /* renamed from: hashCode */
    public int m62517x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f213151a) * 31) + java.lang.Boolean.hashCode(this.f213152b);
    }

    /* renamed from: toString */
    public java.lang.String m62518x9616526c() {
        return "DrawerCreateData(scene=" + this.f213151a + ", safeMode=" + this.f213152b + ')';
    }
}
