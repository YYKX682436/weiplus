package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.ThreadConfig */
/* loaded from: classes14.dex */
public interface InterfaceC0841xc9cca20c extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72 {

    /* renamed from: OPTION_BACKGROUND_EXECUTOR */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.util.concurrent.Executor> f2096x863889fa = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.thread.backgroundExecutor", java.util.concurrent.Executor.class);

    /* renamed from: androidx.camera.core.internal.ThreadConfig$Builder */
    /* loaded from: classes14.dex */
    public interface Builder<B> {
        /* renamed from: setBackgroundExecutor */
        B mo4447x1de78823(java.util.concurrent.Executor executor);
    }

    /* renamed from: getBackgroundExecutor */
    default java.util.concurrent.Executor m6142x86bc0617(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) mo5380x77ba97d1(f2096x863889fa, executor);
    }

    /* renamed from: getBackgroundExecutor */
    default java.util.concurrent.Executor m6141x86bc0617() {
        return (java.util.concurrent.Executor) mo5379x77ba97d1(f2096x863889fa);
    }
}
