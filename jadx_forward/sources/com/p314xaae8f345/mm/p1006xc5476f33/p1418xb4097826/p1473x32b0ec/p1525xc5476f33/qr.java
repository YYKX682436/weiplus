package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class qr implements w25.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f195573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f195574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f195575f;

    public qr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, float f17, float f18) {
        this.f195573d = etVar;
        this.f195574e = f17;
        this.f195575f = f18;
    }

    @Override // w25.e
    public void i3(java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f195573d;
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
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.w1(etVar);
            return;
        }
        etVar.f193980l1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n3.f183932a.e(list != null ? (r45.c64) kz5.n0.Z(list) : null, this.f195574e, this.f195575f, str);
        etVar.getClass();
        r45.ze2 ze2Var = etVar.f193980l1;
        if (ze2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.u1(etVar, ze2Var);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.w1(etVar);
        }
    }
}
