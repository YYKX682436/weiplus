package com.tencent.mm.plugin.appbrand.jsapi.lab;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lab.d f81380f;

    public a(com.tencent.mm.plugin.appbrand.jsapi.lab.d dVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81380f = dVar;
        this.f81378d = lVar;
        this.f81379e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$GetLabInfoResult jsApiGetLabInfo$GetLabInfoResult = (com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo$GetLabInfoResult) obj;
        com.tencent.mm.plugin.appbrand.jsapi.lab.d dVar = this.f81380f;
        int i17 = this.f81379e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81378d;
        if (jsApiGetLabInfo$GetLabInfoResult == null) {
            lVar.a(i17, dVar.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("exist", java.lang.Boolean.valueOf(jsApiGetLabInfo$GetLabInfoResult.f81374d));
        hashMap.put("enabled", java.lang.Boolean.valueOf(jsApiGetLabInfo$GetLabInfoResult.f81375e));
        lVar.a(i17, dVar.p("ok", hashMap));
    }
}
