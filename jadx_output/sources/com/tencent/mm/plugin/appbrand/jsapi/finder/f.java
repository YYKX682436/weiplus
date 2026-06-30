package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class f implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81207b;

    public f(com.tencent.mm.plugin.appbrand.jsapi.finder.g gVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81206a = e9Var;
        this.f81207b = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        int i19 = this.f81207b;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81206a;
        if (i17 != 0 || i18 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (i17 == 4) {
                e9Var.a(i19, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a(str, i18, jSONObject));
                return;
            } else {
                e9Var.a(i19, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a(str, -1, jSONObject));
                return;
            }
        }
        com.tencent.mm.protocal.protobuf.FinderUserPageResponse finderUserPageResponse = (com.tencent.mm.protocal.protobuf.FinderUserPageResponse) oVar.f70711b.f70700a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2 = pm0.b0.b(finderUserPageResponse);
            e9Var.a(i19, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a("", 0, jSONObject2));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Finder.JsApiFetchFinderProfileFeed", e17, "JsApiFetchFinderProfileFeed", new java.lang.Object[0]);
            e9Var.a(i19, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a(e17.getMessage(), -1, jSONObject2));
        }
    }
}
