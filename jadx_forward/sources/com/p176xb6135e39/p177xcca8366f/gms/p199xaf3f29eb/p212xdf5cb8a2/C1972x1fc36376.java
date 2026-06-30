package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p212xdf5cb8a2;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.common.providers.PooledExecutorsProvider */
/* loaded from: classes13.dex */
public class C1972x1fc36376 {
    private static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p212xdf5cb8a2.C1972x1fc36376.PooledExecutorFactory zza;

    /* renamed from: com.google.android.gms.common.providers.PooledExecutorsProvider$PooledExecutorFactory */
    /* loaded from: classes13.dex */
    public interface PooledExecutorFactory {
        @java.lang.Deprecated
        /* renamed from: newSingleThreadScheduledExecutor */
        java.util.concurrent.ScheduledExecutorService mo18454xcd28948e();
    }

    private C1972x1fc36376() {
    }

    @java.lang.Deprecated
    /* renamed from: getInstance */
    public static synchronized com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p212xdf5cb8a2.C1972x1fc36376.PooledExecutorFactory m18453x9cf0d20b() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p212xdf5cb8a2.C1972x1fc36376.PooledExecutorFactory pooledExecutorFactory;
        synchronized (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p212xdf5cb8a2.C1972x1fc36376.class) {
            if (zza == null) {
                zza = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p212xdf5cb8a2.zza();
            }
            pooledExecutorFactory = zza;
        }
        return pooledExecutorFactory;
    }
}
