package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public final class y4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f172159g;

    public y4(int i17, java.util.concurrent.ExecutorService executorService) {
        super(i17);
        this.f172159g = executorService;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a aVar, yz5.a onEnd) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q4 taskWrapper = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q4) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskWrapper, "taskWrapper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEnd, "onEnd");
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        g0Var.f391654d = android.os.SystemClock.uptimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleAsyncTaskConcurrentExecutor", "MicroMsg.SimpleAsyncTaskConcurrentExecutor|" + hashCode() + "|start|" + taskWrapper.f172069d);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w4 w4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w4(taskWrapper, g0Var, this, onEnd);
        java.util.concurrent.ExecutorService executorService = this.f172159g;
        if (executorService != null) {
            executorService.execute(new java.lang.Runnable(w4Var) { // from class: com.tencent.mm.plugin.appbrand.utils.x4

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f172152d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(w4Var, "function");
                    this.f172152d = w4Var;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f172152d.mo152xb9724478();
                }
            });
        } else {
            w4Var.mo152xb9724478();
        }
    }

    public final void f(java.lang.String name, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p4 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q4(name, task));
    }

    public final void g(java.lang.String name, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p4 task, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (j17 <= 0) {
            f(name, task);
        } else {
            f(name, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.u4(j17, task, name));
        }
    }
}
