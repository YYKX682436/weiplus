package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class y4 extends com.tencent.mm.plugin.appbrand.utils.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f90626g;

    public y4(int i17, java.util.concurrent.ExecutorService executorService) {
        super(i17);
        this.f90626g = executorService;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c
    public void e(com.tencent.mm.plugin.appbrand.utils.a aVar, yz5.a onEnd) {
        com.tencent.mm.plugin.appbrand.utils.q4 taskWrapper = (com.tencent.mm.plugin.appbrand.utils.q4) aVar;
        kotlin.jvm.internal.o.g(taskWrapper, "taskWrapper");
        kotlin.jvm.internal.o.g(onEnd, "onEnd");
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = android.os.SystemClock.uptimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|" + hashCode() + "|start|" + taskWrapper.f90536d);
        final com.tencent.mm.plugin.appbrand.utils.w4 w4Var = new com.tencent.mm.plugin.appbrand.utils.w4(taskWrapper, g0Var, this, onEnd);
        java.util.concurrent.ExecutorService executorService = this.f90626g;
        if (executorService != null) {
            executorService.execute(new java.lang.Runnable(w4Var) { // from class: com.tencent.mm.plugin.appbrand.utils.x4

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f90619d;

                {
                    kotlin.jvm.internal.o.g(w4Var, "function");
                    this.f90619d = w4Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f90619d.invoke();
                }
            });
        } else {
            w4Var.invoke();
        }
    }

    public final void f(java.lang.String name, com.tencent.mm.plugin.appbrand.utils.p4 task) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(task, "task");
        a(new com.tencent.mm.plugin.appbrand.utils.q4(name, task));
    }

    public final void g(java.lang.String name, com.tencent.mm.plugin.appbrand.utils.p4 task, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(task, "task");
        if (j17 <= 0) {
            f(name, task);
        } else {
            f(name, new com.tencent.mm.plugin.appbrand.utils.u4(j17, task, name));
        }
    }
}
