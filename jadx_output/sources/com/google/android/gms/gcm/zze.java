package com.google.android.gms.gcm;

/* loaded from: classes13.dex */
final class zze implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger zzx = new java.util.concurrent.atomic.AtomicInteger(1);

    public zze(com.google.android.gms.gcm.GcmTaskService gcmTaskService) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        int andIncrement = this.zzx.getAndIncrement();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(20);
        sb6.append("gcm-task#");
        sb6.append(andIncrement);
        java.lang.Thread thread = new java.lang.Thread(runnable, sb6.toString());
        thread.setPriority(4);
        return thread;
    }
}
