package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ob extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f84864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f84866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.b7 f84867g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(java.lang.String str, int i17, com.tencent.mm.plugin.appbrand.launching.b7 b7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f84865e = str;
        this.f84866f = i17;
        this.f84867g = b7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.launching.ob(this.f84865e, this.f84866f, this.f84867g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.launching.ob) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        org.json.JSONObject jSONObject;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f84864d;
        com.tencent.mm.plugin.appbrand.launching.b7 b7Var = this.f84867g;
        java.lang.String str = this.f84865e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mm.plugin.appbrand.appcache.x xVar = new com.tencent.mm.plugin.appbrand.appcache.x(str, this.f84866f);
                this.f84864d = 1;
                obj = xVar.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            r45.ts3 ts3Var = (r45.ts3) obj;
            java.lang.String str2 = ts3Var.f386757d;
            if (str2 == null || str2.length() == 0) {
                com.tencent.mm.plugin.appbrand.launching.ib.b("CgiGetWxaDebugInfo-ext_json_empty", b7Var);
                return java.lang.Boolean.FALSE;
            }
            try {
                jSONObject = new org.json.JSONObject(ts3Var.f386757d);
            } catch (java.lang.Exception unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                java.lang.String str3 = this.f84865e;
                java.lang.String optString = jSONObject.optString("checkSumMd5");
                java.lang.String optString2 = jSONObject.optString("downloadURL");
                if (!(optString == null || optString.length() == 0)) {
                    if (!(optString2 == null || optString2.length() == 0)) {
                        com.tencent.mm.plugin.appbrand.app.r9.Di().k(str3, 1, optString2, optString, 0L, java.util.concurrent.TimeUnit.HOURS.toSeconds(2L) + com.tencent.mm.sdk.platformtools.t8.i1());
                    }
                }
            }
            if (((com.tencent.mm.plugin.appbrand.launching.a5) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.launching.a5.class)).D0(str, 1, ts3Var.f386757d, true)) {
                com.tencent.luggage.sdk.processes.r.u(com.tencent.mm.plugin.appbrand.task.u0.f89199h.a(), this.f84865e, 1, false, 4, null);
            }
            return java.lang.Boolean.TRUE;
        } catch (com.tencent.mm.ipcinvoker.wx_extension.d e17) {
            com.tencent.mm.plugin.appbrand.launching.ib.b("CgiGetWxaDebugInfo-ERROR-" + e17, b7Var);
            return java.lang.Boolean.FALSE;
        }
    }
}
