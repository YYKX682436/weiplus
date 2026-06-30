package com.tencent.mm.plugin.appbrand.jsapi.finder;

/* loaded from: classes7.dex */
public class m0 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.finder.n0 f81214c;

    public m0(com.tencent.mm.plugin.appbrand.jsapi.finder.n0 n0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81214c = n0Var;
        this.f81212a = lVar;
        this.f81213b = i17;
    }

    @Override // nf.j
    public void onResult(int i17, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.finder.n0 n0Var = this.f81214c;
        try {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                int i18 = this.f81213b;
                com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81212a;
                if (i17 == -1) {
                    jSONObject.put("isSuccess", true);
                    jSONObject.put("isCancel", false);
                    lVar.a(i18, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a("", 0, jSONObject));
                } else if (i17 == 0) {
                    jSONObject.put("isSuccess", false);
                    jSONObject.put("isCancel", true);
                    lVar.a(i18, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a("", 1, jSONObject));
                } else {
                    jSONObject.put("isSuccess", false);
                    jSONObject.put("isCancel", false);
                    lVar.a(i18, com.tencent.mm.plugin.appbrand.jsapi.finder.a.a("", i17, jSONObject));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Finder.JsApiShareFinderEndorsementToFriend", e17.getMessage());
            }
        } finally {
            n0Var.getClass();
        }
    }
}
