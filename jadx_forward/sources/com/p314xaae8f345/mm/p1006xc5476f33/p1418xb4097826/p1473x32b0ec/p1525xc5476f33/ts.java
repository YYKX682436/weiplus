package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ts implements w25.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f196006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f196007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f196008f;

    public ts(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, float f17, float f18) {
        this.f196006d = etVar;
        this.f196007e = f17;
        this.f196008f = f18;
    }

    @Override // w25.e
    public void i3(java.lang.String str, java.util.List list) {
        bm2.m3 m3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f196006d;
        if (!etVar.f193983p1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", "getPoiCityInfo: mounted = false");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPoiCityInfo: onGetLbsLifes, city:");
        sb6.append(str);
        sb6.append(", list size:");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveInputPlugin", sb6.toString());
        if (str == null || str.length() == 0) {
            return;
        }
        etVar.f193980l1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3.f183932a.e(list != null ? (r45.c64) kz5.n0.Z(list) : null, this.f196007e, this.f196008f, str);
        r45.ze2 ze2Var = etVar.f193980l1;
        if (ze2Var == null || (m3Var = etVar.L) == null) {
            return;
        }
        m3Var.y(ze2Var);
    }
}
