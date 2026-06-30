package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1;

/* loaded from: classes13.dex */
final class zas implements com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zaq {
    private zas() {
    }

    public /* synthetic */ zas(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zar zarVar) {
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zaq
    public final java.util.concurrent.ExecutorService zaa(java.util.concurrent.ThreadFactory threadFactory, int i17) {
        return zac(1, threadFactory, 1);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zaq
    public final java.util.concurrent.ExecutorService zab(int i17, int i18) {
        return zac(4, java.util.concurrent.Executors.defaultThreadFactory(), 2);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zaq
    public final java.util.concurrent.ExecutorService zac(int i17, java.util.concurrent.ThreadFactory threadFactory, int i18) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i17, i17, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
