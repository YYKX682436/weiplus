package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class p4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.q4 f82488f;

    public p4(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.q4 q4Var) {
        this.f82486d = lVar;
        this.f82487e = i17;
        this.f82488f = q4Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.appbrand.jsapi.q4 q4Var = this.f82488f;
        int i17 = this.f82487e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82486d;
        if (bundle == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckStrangerIsFriend", "onCallback，data == null");
            lVar.a(i17, q4Var.o("fail data == null "));
        } else {
            try {
                jSONObject = new org.json.JSONObject(bundle.getString("resJo", ""));
            } catch (java.lang.Throwable unused) {
                jSONObject = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckStrangerIsFriend", "onCallback，result ：%s", jSONObject);
            lVar.a(i17, q4Var.s("ok", jSONObject));
        }
    }
}
