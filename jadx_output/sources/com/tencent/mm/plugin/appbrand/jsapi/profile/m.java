package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class m implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f82811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f82812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.n f82813c;

    public m(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.profile.n nVar) {
        this.f82811a = lVar;
        this.f82812b = i17;
        this.f82813c = nVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.plugin.appbrand.jsapi.profile.n nVar = this.f82813c;
        int i19 = this.f82812b;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f82811a;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof com.tencent.mm.protocal.protobuf.GetProfileInfoResponse)) {
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetProfileInfoResponse");
            java.util.Map a17 = com.tencent.mm.plugin.appbrand.utils.x3.a(1, (com.tencent.mm.protocal.protobuf.GetProfileInfoResponse) fVar);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("response", a17);
            nVar.getClass();
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            lVar.a(i19, nVar.t("ok", hashMap));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.operateWxappCGI", "handleGetProfileInfo error, errMsg: %s", str);
        nVar.getClass();
        java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:cgi failed for response null" : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 109);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        lVar.a(i19, nVar.u(str3, jSONObject));
    }
}
