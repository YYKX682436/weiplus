package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class k extends gp1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n f174838a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar) {
        this.f174838a = nVar;
    }

    @Override // gp1.k
    public android.graphics.Point a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f174838a.f174851c;
        if (c12929x567537a0 == null) {
            return new android.graphics.Point(i17, i18);
        }
        if (c12929x567537a0.L != null && c12929x567537a0.Y1 && (c12929x567537a0.W() || c12929x567537a0.f175072l2 || c12929x567537a0.Z1)) {
            i18 = c12929x567537a0.L.m54152x57b75f0d();
        }
        return new android.graphics.Point(i17 + qp1.e0.a(qp1.c0.f447240p), i18 + qp1.e0.a(qp1.c0.f447237m));
    }

    @Override // gp1.k
    public android.graphics.Point b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f174838a.f174851c;
        if (c12929x567537a0 != null) {
            return c12929x567537a0.m54193x92b9084e();
        }
        return null;
    }

    @Override // gp1.k
    public android.graphics.Point c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f174838a.f174851c;
        if (c12929x567537a0 != null) {
            return c12929x567537a0.m54192xe49e1b76();
        }
        return null;
    }

    @Override // gp1.k
    public android.graphics.Point d(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f174838a.f174851c;
        return c12929x567537a0 != null ? c12929x567537a0.v(i17, i18) : new android.graphics.Point(i17, i18);
    }

    @Override // gp1.k
    public java.lang.Boolean e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f174838a.f174851c;
        if (c12929x567537a0 != null) {
            return java.lang.Boolean.valueOf(c12929x567537a0.f175096x1);
        }
        return null;
    }

    @Override // gp1.k
    public java.lang.Integer f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0 = this.f174838a.f174851c;
        if (c12929x567537a0 != null) {
            return java.lang.Integer.valueOf(c12929x567537a0.m54191x8efc4c8d());
        }
        return null;
    }
}
