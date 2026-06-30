package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f80798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f80800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f80801g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f80802h;

    public h(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, int i17) {
        this.f80798d = c0Var;
        this.f80799e = jSONObject;
        this.f80800f = jSONObject2;
        this.f80801g = k0Var;
        this.f80802h = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.Integer num;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleResult ecsIPCHandleResult = (com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleResult) obj;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k kVar = com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k.f80805a;
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k.a(kVar, this.f80798d, this.f80799e, this.f80800f);
        com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.k.b(kVar, this.f80798d, this.f80801g, this.f80802h, (ecsIPCHandleResult == null || (num = ecsIPCHandleResult.f80781d) == null) ? -1 : num.intValue(), ecsIPCHandleResult != null ? ecsIPCHandleResult.f80782e : null);
    }
}
