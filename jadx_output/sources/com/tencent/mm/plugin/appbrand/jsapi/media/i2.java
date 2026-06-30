package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes.dex */
public class i2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f81843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.k2 f81845f;

    public i2(com.tencent.mm.plugin.appbrand.jsapi.media.k2 k2Var, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f81845f = k2Var;
        this.f81843d = c0Var;
        this.f81844e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        java.util.HashMap hashMap = new java.util.HashMap(1);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCheckDeviceSupportHevc", "supportHevc:%b", java.lang.Boolean.valueOf(iPCBoolean.f68400d));
        hashMap.put("supportHevc", java.lang.Boolean.valueOf(iPCBoolean.f68400d));
        com.tencent.mm.plugin.appbrand.jsapi.media.k2 k2Var = this.f81845f;
        k2Var.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        hashMap.put("errno", 0);
        this.f81843d.a(this.f81844e, k2Var.t("ok", hashMap));
    }
}
