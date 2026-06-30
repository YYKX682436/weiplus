package com.google.android.gms.internal.base;

/* loaded from: classes13.dex */
final class zas implements com.google.android.gms.internal.base.zaq {
    private zas() {
    }

    public /* synthetic */ zas(com.google.android.gms.internal.base.zar zarVar) {
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final java.util.concurrent.ExecutorService zaa(java.util.concurrent.ThreadFactory threadFactory, int i17) {
        return zac(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final java.util.concurrent.ExecutorService zab(int i17, int i18) {
        return zac(4, java.util.concurrent.Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.base.zaq
    public final java.util.concurrent.ExecutorService zac(int i17, java.util.concurrent.ThreadFactory threadFactory, int i18) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i17, i17, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
