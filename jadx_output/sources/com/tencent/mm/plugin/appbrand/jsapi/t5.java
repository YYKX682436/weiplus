package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes4.dex */
public final class t5 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f83457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.u5 f83459f;

    public t5(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.u5 u5Var) {
        this.f83457d = e9Var;
        this.f83458e = i17;
        this.f83459f = u5Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData jsApiGamelifeManager$GetGameLifeRedCountData = (com.tencent.mm.plugin.appbrand.jsapi.JsApiGamelifeManager$GetGameLifeRedCountData) obj;
        boolean z17 = jsApiGamelifeManager$GetGameLifeRedCountData.f78516f;
        int i17 = this.f83458e;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f83457d;
        if (!z17) {
            e9Var.a(i17, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("unreadRedCount", java.lang.Integer.valueOf(jsApiGamelifeManager$GetGameLifeRedCountData.f78514d));
        e9Var.a(i17, this.f83459f.p("ok", hashMap));
    }
}
