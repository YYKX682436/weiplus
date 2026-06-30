package com.p314xaae8f345.mm.p642xad8b531f;

/* renamed from: com.tencent.mm.booter.MMReceivers$BootReceiver */
/* loaded from: classes12.dex */
public class C10291x2f496121 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f144787a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null) {
            return;
        }
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        final long j17 = elapsedRealtime - com.p314xaae8f345.mm.app.x.f135440b;
        android.os.Process.myPid();
        boolean p17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BootReceiver", "system booted, pid=" + android.os.Process.myPid() + ", isPushProc=" + p17 + ", durationMs=" + j17 + ", elapsedRealtimeMs=" + elapsedRealtime);
        if (mm.o.a() || (mm.o.g() && mm.o.j(false, 1, null))) {
            ((ku5.t0) ku5.t0.f394148d).k(new java.lang.Runnable() { // from class: com.tencent.mm.booter.MMReceivers$BootReceiver$$a
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p642xad8b531f.C10291x2f496121.f144787a;
                    ap.a.a(10000, "CompatProfiler", null, null, "booted", java.lang.String.valueOf(j17), java.lang.String.valueOf(elapsedRealtime));
                }
            }, 5000L);
        }
        if (!p17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BootReceiver", "just do nothing when receive BOOT_COMPLETED in non-push proc");
        } else {
            if (com.p314xaae8f345.mm.p642xad8b531f.n.a(context, "auto", true)) {
                return;
            }
            com.p314xaae8f345.mm.p642xad8b531f.C10290xfadc4140.c(context);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
        }
    }
}
