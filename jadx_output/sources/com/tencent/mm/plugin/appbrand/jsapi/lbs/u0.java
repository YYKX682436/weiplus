package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class u0 implements lk1.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 f81485f;

    public u0(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81485f = v0Var;
        this.f81483d = e9Var;
        this.f81484e = i17;
    }

    @Override // lk1.b
    public void j(int i17, java.lang.String str, lk1.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMapApp", "errCode:%d, errStr:%s, location:%s", java.lang.Integer.valueOf(i17), str, aVar);
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var = this.f81485f;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var = v0Var.f81499p;
        com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81483d;
        c1Var.b(e9Var.getRuntime());
        if (i17 == 0) {
            com.tencent.mm.plugin.location.model.LocationInfo locationInfo = v0Var.f81501r;
            locationInfo.f144586e = aVar.f318996a;
            locationInfo.f144587f = aVar.f318997b;
            locationInfo.f144588g = 15;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.lbs.t0(this));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        e9Var.a(this.f81484e, v0Var.p("fail:" + str, hashMap));
    }
}
