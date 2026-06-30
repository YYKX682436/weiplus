package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes2.dex */
public final class t4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f90567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f90568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f90569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f90570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, kotlin.jvm.internal.h0 h0Var, java.lang.String str, yz5.a aVar) {
        super(1);
        this.f90567d = atomicBoolean;
        this.f90568e = h0Var;
        this.f90569f = str;
        this.f90570g = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        boolean compareAndSet = this.f90567d.compareAndSet(false, true);
        java.lang.String str = this.f90569f;
        if (compareAndSet) {
            wu5.c cVar = (wu5.c) this.f90568e.f310123d;
            if (cVar != null) {
                cVar.cancel(false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|execute timeout wrapper end|" + str + "|reason=" + reason);
            this.f90570g.invoke();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|execute timeout wrapper end ignored (already ended)|" + str + "|reason=" + reason);
        }
        return jz5.f0.f302826a;
    }
}
