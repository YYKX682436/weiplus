package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class z0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35168x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f35169x24728b = "returnGeneratedPoster";

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.u0 f170129g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.u0(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f170130h = new java.util.concurrent.ConcurrentHashMap();

    public static final java.lang.Object C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z0 z0Var, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        z0Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "downloadImageSynchronously: imageUrl=" + r26.p0.E0(str, 50) + "..., savePath=" + str2);
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "downloadImageSynchronously: savePath is null or empty");
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        } else {
            o11.f fVar = new o11.f();
            fVar.f423615f = str2;
            fVar.f423611b = true;
            fVar.f423610a = true;
            n11.a.b().d(str, fVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.w0(str2, nVar));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReturnGeneratedPoster", "invoke: env is null");
            return;
        }
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j1.a(jSONObject != null ? jSONObject.optString("customPosterUrl") : null, "");
        java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j1.a(jSONObject != null ? jSONObject.optString("posterTaskId") : null, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "invoke: posterTaskId=" + a18 + ", customPosterUrl=" + r26.p0.E0(a17, 50) + "...");
        if (a18.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReturnGeneratedPoster", "posterTaskId is empty");
            D(e9Var, a18, i17);
            return;
        }
        if (a17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReturnGeneratedPoster", "customPosterUrl is empty, treating as failure");
            D(e9Var, a18, i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterUrl: posterTaskId=" + a18 + ", url=" + r26.p0.E0(a17, 50) + "...");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = e9Var.t3();
            if (t37 != null && (c20976x6ba6452a = t37.Q) != null) {
                com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a.e(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.y0(a18, this, a17, null), 1, null);
            }
        }
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        java.lang.String str2 = str != null ? str : "";
        java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str2, jSONObject2));
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiReturnGeneratedPoster", "handleCustomPosterGenFailure: posterTaskId=" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = e9Var.t3();
        if (t37 == null || (c20976x6ba6452a = t37.Q) == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a.e(c20976x6ba6452a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.x0(str, null), 1, null);
    }
}
