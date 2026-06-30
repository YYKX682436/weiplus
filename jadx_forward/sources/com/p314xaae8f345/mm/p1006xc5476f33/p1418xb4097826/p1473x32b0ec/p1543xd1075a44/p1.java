package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes15.dex */
public final class p1 implements w25.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 f200875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f200876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f200877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f200878g;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var, boolean z17, float f17, float f18) {
        this.f200875d = t1Var;
        this.f200876e = z17;
        this.f200877f = f17;
        this.f200878g = f18;
    }

    @Override // w25.e
    public void i3(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var = this.f200875d;
        java.lang.String i07 = t1Var.i0();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPoiCityInfo: onGetLbsLifes, isNeedLoadingToast: ");
        boolean z17 = this.f200876e;
        sb6.append(z17);
        sb6.append(" city:");
        sb6.append(str);
        sb6.append(", list size:");
        jz5.f0 f0Var = null;
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i07, sb6.toString());
        if (z17) {
            t1Var.I.b();
        }
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1.f0(t1Var, z17);
            return;
        }
        t1Var.L = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3.f183932a.e(list != null ? (r45.c64) kz5.n0.Z(list) : null, this.f200877f, this.f200878g, str);
        t1Var.getClass();
        r45.ze2 ze2Var = t1Var.L;
        if (ze2Var != null) {
            t1Var.m0(ze2Var);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1.f0(t1Var, z17);
        }
    }
}
