package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public class MMReceivers$BootReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f63254a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null) {
            return;
        }
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        final long j17 = elapsedRealtime - com.tencent.mm.app.x.f53907b;
        android.os.Process.myPid();
        boolean p17 = com.tencent.mm.sdk.platformtools.x2.p();
        com.tencent.mars.xlog.Log.e("MicroMsg.BootReceiver", "system booted, pid=" + android.os.Process.myPid() + ", isPushProc=" + p17 + ", durationMs=" + j17 + ", elapsedRealtimeMs=" + elapsedRealtime);
        if (mm.o.a() || (mm.o.g() && mm.o.j(false, 1, null))) {
            ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable() { // from class: com.tencent.mm.booter.MMReceivers$BootReceiver$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.booter.MMReceivers$BootReceiver.f63254a;
                    ap.a.a(10000, "CompatProfiler", null, null, "booted", java.lang.String.valueOf(j17), java.lang.String.valueOf(elapsedRealtime));
                }
            }, 5000L);
        }
        if (!p17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BootReceiver", "just do nothing when receive BOOT_COMPLETED in non-push proc");
        } else {
            if (com.tencent.mm.booter.n.a(context, "auto", true)) {
                return;
            }
            com.tencent.mm.booter.MMReceivers$AlarmReceiver.c(context);
            com.tencent.mars.xlog.Log.appenderFlush();
        }
    }
}
