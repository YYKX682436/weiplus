package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
final class zzj {
    static final java.util.concurrent.ExecutorService zza;

    static {
        com.google.android.gms.internal.common.zzh.zza();
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("CallbackExecutor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
