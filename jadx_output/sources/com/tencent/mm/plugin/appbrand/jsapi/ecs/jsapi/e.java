package com.tencent.mm.plugin.appbrand.jsapi.ecs.jsapi;

/* loaded from: classes.dex */
public final class e implements c00.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f80792a;

    public e(com.tencent.mm.ipcinvoker.r rVar) {
        this.f80792a = rVar;
    }

    @Override // c00.n3
    public void a() {
        com.tencent.mm.ipcinvoker.r rVar = this.f80792a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleResult(1, null));
        }
    }

    @Override // c00.n3
    public void b(org.json.JSONObject jSONObject) {
        com.tencent.mm.ipcinvoker.r rVar = this.f80792a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleResult(0, java.lang.String.valueOf(jSONObject)));
        }
    }

    @Override // c00.n3
    public void c(c00.x2 event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.ipcinvoker.r rVar = this.f80792a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleResult(3, ((v00.a) event).a()));
        }
    }

    @Override // c00.n3
    public void d(org.json.JSONObject jSONObject) {
        com.tencent.mm.ipcinvoker.r rVar = this.f80792a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleResult(1, java.lang.String.valueOf(jSONObject)));
        }
    }

    @Override // c00.n3
    public void onCancel() {
        com.tencent.mm.ipcinvoker.r rVar = this.f80792a;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.plugin.appbrand.jsapi.ecs.ipc.EcsIPCHandleResult(2, null));
        }
    }
}
