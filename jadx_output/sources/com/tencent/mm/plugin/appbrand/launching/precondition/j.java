package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class j implements com.tencent.mm.plugin.appbrand.ipc.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f85000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.f f85001b;

    public j(com.tencent.mm.plugin.appbrand.launching.precondition.f fVar, java.lang.Runnable runnable) {
        this.f85001b = fVar;
        this.f85000a = runnable;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.n
    public void a() {
        this.f85000a.run();
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.n
    public void cancel() {
        this.f85001b.f84980c.f84957f.e(null, null);
    }
}
