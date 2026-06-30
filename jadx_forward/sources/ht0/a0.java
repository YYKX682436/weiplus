package ht0;

/* loaded from: classes10.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.c0 f366194d;

    public a0(ht0.c0 c0Var) {
        this.f366194d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f366194d.f366196a) {
            boolean z17 = ht0.c0.z(this.f366194d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "stopImpl result: %s", java.lang.Boolean.valueOf(z17));
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureSuccess");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 39L, 1L);
                ht0.c0 c0Var = this.f366194d;
                ht0.c0.A(c0Var, ai3.d.p(c0Var.f366198c));
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(this.f366194d.f366198c, true);
                    if (d17 != null) {
                        int i17 = d17.f243916b;
                        int i18 = d17.f243919e;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureResult, bitrate:" + i17 + ", fps:" + i18);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var.C(985L, 38L, (long) i17);
                        g0Var.C(985L, 41L, (long) i18);
                    }
                } catch (java.lang.Exception unused) {
                }
                if (this.f366194d.C != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.X264MP4MuxRecorder", "call stopCallback");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f366194d.C);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264CaptureFailed");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 37L, 1L);
                this.f366194d.f366213r.c();
                if (this.f366194d.B != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ht0.z(this));
                }
            }
            long j17 = rs0.p.f480844b;
            if (j17 > 0) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markX264WaitStop, waitTime:" + elapsedRealtime);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var2.C(985L, 34L, elapsedRealtime);
                g0Var2.C(985L, 35L, 1L);
                rs0.p.f480844b = -1L;
            }
        }
    }
}
