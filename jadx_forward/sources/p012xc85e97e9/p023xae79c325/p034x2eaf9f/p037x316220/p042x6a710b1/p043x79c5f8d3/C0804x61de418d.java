package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3;

/* renamed from: androidx.camera.core.impl.utils.executor.CameraXExecutors */
/* loaded from: classes14.dex */
public final class C0804x61de418d {
    private C0804x61de418d() {
    }

    /* renamed from: audioExecutor */
    public static java.util.concurrent.Executor m5977x697c2c9() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0802x3636f2a9.m5975x9cf0d20b();
    }

    /* renamed from: directExecutor */
    public static java.util.concurrent.Executor m5978x5ebfffdc() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0805x2306cbfc.m5986x9cf0d20b();
    }

    /* renamed from: highPriorityExecutor */
    public static java.util.concurrent.Executor m5979xa2909059() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0807xae55c479.m5990x9cf0d20b();
    }

    /* renamed from: ioExecutor */
    public static java.util.concurrent.Executor m5980xf96be419() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0808x703dc039.m5991x9cf0d20b();
    }

    /* renamed from: isSequentialExecutor */
    public static boolean m5981x5752e1bc(java.util.concurrent.Executor executor) {
        return executor instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12;
    }

    /* renamed from: mainThreadExecutor */
    public static java.util.concurrent.ScheduledExecutorService m5982x891c9b16() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0809xf6e05736.m5992x9cf0d20b();
    }

    /* renamed from: myLooperExecutor */
    public static java.util.concurrent.ScheduledExecutorService m5983x5ba0b310() {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f.m5989x7798c2d6();
    }

    /* renamed from: newHandlerExecutor */
    public static java.util.concurrent.ScheduledExecutorService m5984x3281647d(android.os.Handler handler) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ScheduledExecutorServiceC0806x660aff3f(handler);
    }

    /* renamed from: newSequentialExecutor */
    public static java.util.concurrent.Executor m5985x592e8cb2(java.util.concurrent.Executor executor) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.ExecutorC0810xf2680b12(executor);
    }
}
