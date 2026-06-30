package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.IoConfig */
/* loaded from: classes14.dex */
public interface InterfaceC0835x7adec28 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72 {

    /* renamed from: OPTION_IO_EXECUTOR */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.util.concurrent.Executor> f2079x4183cf02 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.io.ioExecutor", java.util.concurrent.Executor.class);

    /* renamed from: androidx.camera.core.internal.IoConfig$Builder */
    /* loaded from: classes14.dex */
    public interface Builder<B> {
        /* renamed from: setIoExecutor */
        B mo4564x15d0ea1b(java.util.concurrent.Executor executor);
    }

    /* renamed from: getIoExecutor */
    default java.util.concurrent.Executor mo5462xe7ac9c0f(java.util.concurrent.Executor executor) {
        return (java.util.concurrent.Executor) mo5380x77ba97d1(f2079x4183cf02, executor);
    }

    /* renamed from: getIoExecutor */
    default java.util.concurrent.Executor mo5461xe7ac9c0f() {
        return (java.util.concurrent.Executor) mo5379x77ba97d1(f2079x4183cf02);
    }
}
