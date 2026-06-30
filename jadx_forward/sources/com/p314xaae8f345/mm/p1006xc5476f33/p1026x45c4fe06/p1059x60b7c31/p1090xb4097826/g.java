package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* loaded from: classes7.dex */
public class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34292x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34293x24728b = "fetchFinderProfileFeed";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiFetchFinderProfileFeed", "JsApiFetchFinderProfileFeed");
        if (jSONObject == null) {
            e9Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5, "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            e9Var.a(i17, o("fail:username is null or nil"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("maxId", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            e9Var.a(i17, o("fail:maxId is null or nil"));
            return;
        }
        r45.z13 z13Var = new r45.z13();
        z13Var.set(2, java.lang.Long.valueOf(java.lang.Long.valueOf(optString2).longValue()));
        z13Var.set(1, optString);
        com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar2.f152200d = 3736;
        lVar2.f152199c = "${FinderCgiConstants.CGI_PRE}/finderuserpage";
        lVar2.f152197a = z13Var;
        lVar2.f152198b = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar2.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.f(this, e9Var, i17));
    }
}
