package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes.dex */
public final class c implements c00.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.d f80791a;

    public c(com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi.d dVar) {
        this.f80791a = dVar;
    }

    @Override // c00.n3
    public void a() {
        this.f80791a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandResult(1, ""));
    }

    @Override // c00.n3
    public void b(org.json.JSONObject jSONObject) {
        this.f80791a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandResult(0, jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // c00.n3
    public void c(c00.x2 event) {
        kotlin.jvm.internal.o.g(event, "event");
        this.f80791a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandResult(3, ((v00.a) event).a()));
    }

    @Override // c00.n3
    public void d(org.json.JSONObject jSONObject) {
        this.f80791a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandResult(1, jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // c00.n3
    public void onCancel() {
        this.f80791a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleAPPBrandResult(2, ""));
    }
}
