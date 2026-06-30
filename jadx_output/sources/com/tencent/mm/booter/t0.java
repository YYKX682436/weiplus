package com.tencent.mm.booter;

/* loaded from: classes9.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.booter.u0 f63570d;

    public t0(com.tencent.mm.booter.u0 u0Var) {
        this.f63570d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.b().m()) {
            if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NotifyReceiver", "not init finish , do not post sync task");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = com.tencent.mm.booter.u0.f63576d;
            if (currentTimeMillis - j17 <= 0 || currentTimeMillis - j17 >= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
                com.tencent.mm.booter.u0.f63576d = currentTimeMillis;
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "begin post sync task");
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                new com.tencent.mm.autogen.events.PostSyncTaskEvent().e();
                com.tencent.mars.xlog.Log.i("MicroMsg.NotifyReceiver", "end post sync task, cost=%d, Idle done", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                this.f63570d.a(3000L);
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|doPostSyncTask";
    }
}
