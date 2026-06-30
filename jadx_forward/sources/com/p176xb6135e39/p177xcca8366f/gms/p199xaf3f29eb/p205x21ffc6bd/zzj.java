package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
final class zzj {
    static final java.util.concurrent.ExecutorService zza;

    static {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p228xaf3f29eb.zzh.zza();
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.p219xa7ffe5b7.ThreadFactoryC2016x24211507("CallbackExecutor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
