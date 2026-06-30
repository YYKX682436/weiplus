package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f80793a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80794b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80795c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f80796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f80797e;

    public g(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, int i17) {
        this.f80793a = c0Var;
        this.f80794b = jSONObject;
        this.f80795c = jSONObject2;
        this.f80796d = k0Var;
        this.f80797e = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.Integer num;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandResult ecsIPCHandleAPPBrandResult = (com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k kVar = com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k.f80805a;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k.a(kVar, this.f80793a, this.f80794b, this.f80795c);
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k.b(kVar, this.f80793a, this.f80796d, this.f80797e, (ecsIPCHandleAPPBrandResult == null || (num = ecsIPCHandleAPPBrandResult.f80775d) == null) ? -1 : num.intValue(), ecsIPCHandleAPPBrandResult != null ? ecsIPCHandleAPPBrandResult.f80776e : null);
    }
}
