package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb;

/* loaded from: classes4.dex */
public class d extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f170534d = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.c.f170533r, "WxaCheckDemoInfo")};

    public d(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.c.f170533r, "WxaCheckDemoInfo", dm.wc.f322456h);
    }

    public void y0() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "deleteAll");
            super.m145253xb158737d("WxaCheckDemoInfo", "delete from WxaCheckDemoInfo");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", e17, " deleteAll Exception", new java.lang.Object[0]);
        }
    }

    public boolean z0(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "setWxaCheckDemoInfoData,invalid input %s", str);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1195x17c91eeb.c();
        cVar.f69054x28d45f97 = str;
        boolean z18 = get(cVar, new java.lang.String[0]);
        cVar.f69055x5a3d3237 = z17;
        cVar.f69056x94e09be0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        if (!(z18 ? mo9952xce0038c9(cVar, new java.lang.String[0]) : mo880xb970c2b9(cVar))) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTaskWxaCheckDemoInfoStorage", "setWxaCheckDemoInfoData appId:%s ok", str);
        return true;
    }
}
