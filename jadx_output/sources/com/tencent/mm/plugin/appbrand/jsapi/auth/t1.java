package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class t1 implements com.tencent.mm.plugin.appbrand.jsapi.auth.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f79734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.v1 f79736c;

    public t1(com.tencent.mm.plugin.appbrand.y yVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.auth.v1 v1Var) {
        this.f79734a = yVar;
        this.f79735b = i17;
        this.f79736c = v1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.v4
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserCancel appId:");
        com.tencent.mm.plugin.appbrand.y yVar = this.f79734a;
        sb6.append(yVar.getAppId());
        sb6.append(", callbackId:");
        int i17 = this.f79735b;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiChooseLicensePlate", sb6.toString());
        yVar.a(i17, this.f79736c.o("fail cancel"));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.v4
    public void b(java.lang.String plateNo) {
        kotlin.jvm.internal.o.g(plateNo, "plateNo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlateNoChosen plateNo:");
        sb6.append(plateNo);
        sb6.append(", appId:");
        com.tencent.mm.plugin.appbrand.y yVar = this.f79734a;
        sb6.append(yVar.getAppId());
        sb6.append(", callbackId:");
        int i17 = this.f79735b;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiChooseLicensePlate", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("plateNumber", plateNo);
        yVar.a(i17, this.f79736c.p("ok", hashMap));
    }
}
