package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f80361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f80363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f80364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.c0 f80365h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.chattool.c0 c0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f80362e = jSONObject;
        this.f80363f = c0Var;
        this.f80364g = i17;
        this.f80365h = c0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.jsapi.chattool.b0(this.f80362e, this.f80363f, this.f80364g, this.f80365h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.jsapi.chattool.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        j91.e eVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f80361d;
        com.tencent.mm.plugin.appbrand.jsapi.chattool.c0 c0Var = this.f80365h;
        int i18 = this.f80364g;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = this.f80363f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.f80362e == null) {
                    throw new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(jc1.f.f298919h);
                }
                j91.d dVar = (j91.d) c0Var2.t3().K1(j91.d.class);
                if (dVar == null) {
                    throw new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(jc1.f.f298917f);
                }
                this.f80361d = 1;
                obj = ((com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar).j(true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            eVar = (j91.e) obj;
        } catch (com.tencent.mm.plugin.appbrand.jsapi.chattool.f e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getChatToolInfo e:");
            jc1.d dVar2 = e17.f80391d;
            sb6.append(dVar2);
            com.tencent.mars.xlog.Log.w("Luggage.JsApigetChatToolInfo", sb6.toString());
            c0Var2.a(i18, c0Var.r(null, dVar2, null));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("Luggage.JsApigetChatToolInfo", "getChatToolInfo e:" + th6.getMessage());
            java.lang.String str = "fail:" + th6.getMessage();
            c0Var.getClass();
            java.lang.String str2 = android.text.TextUtils.isEmpty(null) ? str : null;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", -1);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var2.a(i18, c0Var.u(str2, jSONObject));
        }
        if (eVar == null) {
            throw new com.tencent.mm.plugin.appbrand.jsapi.chattool.f(new jc1.d(-1, "fail:server error, resp is null"));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("encryptedData", eVar.f298349a);
        hashMap.put("iv", eVar.f298350b);
        hashMap.put("cloudID", eVar.f298351c);
        c0Var.getClass();
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        c0Var2.a(i18, c0Var.t("ok", hashMap));
        return jz5.f0.f302826a;
    }
}
