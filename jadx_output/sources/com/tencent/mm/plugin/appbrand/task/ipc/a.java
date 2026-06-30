package com.tencent.mm.plugin.appbrand.task.ipc;

/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.ipc.b f89062d;

    public a(com.tencent.mm.plugin.appbrand.task.ipc.b bVar) {
        this.f89062d = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        if (((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj).f68400d) {
            return;
        }
        com.tencent.mm.plugin.appbrand.task.ipc.b bVar = this.f89062d;
        bVar.getClass();
        com.tencent.mm.plugin.appbrand.task.e eVar = (com.tencent.mm.plugin.appbrand.task.e) i95.n0.c(com.tencent.mm.plugin.appbrand.task.e.class);
        kotlin.jvm.internal.o.d(eVar);
        eVar.wi(bVar.f89064b, bVar.f89065c);
    }
}
