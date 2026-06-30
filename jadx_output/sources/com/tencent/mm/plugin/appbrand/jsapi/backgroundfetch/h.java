package com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch;

/* loaded from: classes7.dex */
public class h implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f79846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.k f79848f;

    public h(com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.k kVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f79848f = kVar;
        this.f79846d = c0Var;
        this.f79847e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiTriggerBackgroundFetch", "result:%s", iPCString);
        com.tencent.mm.plugin.appbrand.jsapi.backgroundfetch.k kVar = this.f79848f;
        int i17 = this.f79847e;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f79846d;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            c0Var.a(i17, kVar.o("fail"));
        } else {
            c0Var.a(i17, kVar.o(iPCString.f68406d));
        }
    }
}
