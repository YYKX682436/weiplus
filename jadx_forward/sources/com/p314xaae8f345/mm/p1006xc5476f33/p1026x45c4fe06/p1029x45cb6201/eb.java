package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes4.dex */
public final class eb extends qj1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f157050f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cb.f157014t;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f157051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cb.f157013s, "WxaPluginCodeVersionInfo", dm.ad.f317290h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f157051e = db6;
    }

    public final java.lang.String y0(java.lang.String id6, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cb cbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.cb();
        cbVar.f65947x9f94ffc4 = id6;
        cbVar.f65948x5da57faf = i17;
        java.lang.String str = get(cbVar, new java.lang.String[0]) ? cbVar.f65949xa880884f : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxaPluginCodeVersionInfoStorage", "getPluginStringVersion with id:" + id6 + " version:" + i17 + ", returns:" + str);
        return str;
    }
}
