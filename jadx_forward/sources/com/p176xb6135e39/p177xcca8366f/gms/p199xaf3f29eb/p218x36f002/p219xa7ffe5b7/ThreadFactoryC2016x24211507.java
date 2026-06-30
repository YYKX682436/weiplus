package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.p219xa7ffe5b7;

/* renamed from: com.google.android.gms.common.util.concurrent.NamedThreadFactory */
/* loaded from: classes13.dex */
public class ThreadFactoryC2016x24211507 implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.ThreadFactory zzb = java.util.concurrent.Executors.defaultThreadFactory();

    public ThreadFactoryC2016x24211507(java.lang.String str) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(str, "Name must not be null");
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread newThread = this.zzb.newThread(new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.p219xa7ffe5b7.zza(runnable, 0));
        newThread.setName(this.zza);
        return newThread;
    }
}
