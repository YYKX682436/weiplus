package zf4;

/* loaded from: classes13.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f554225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf4.w f554226e;

    public v(zf4.w wVar) {
        this.f554226e = wVar;
        this.f554225d = new zf4.u(this, wVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        zf4.w wVar = this.f554226e;
        if (wVar.f554228a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindRecorder", "Stop Record Failed recorder == null");
            return;
        }
        synchronized (wVar) {
            try {
                oy.i iVar = (oy.i) i95.n0.c(oy.i.class);
                if (iVar != null && ((com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1) iVar).f146886p != oy.k.f431356d) {
                    try {
                        java.lang.Thread.sleep(300L);
                    } catch (java.lang.Exception unused) {
                    }
                }
                zf4.w wVar2 = this.f554226e;
                if (!wVar2.f554228a.mo166725x8e35cb53(zf4.r.b(wVar2.f554231d, true))) {
                    zf4.r.a(this.f554226e.f554231d);
                    zf4.w wVar3 = this.f554226e;
                    wVar3.f554231d = null;
                    wVar3.f554228a = null;
                }
                this.f554226e.f554232e = android.os.SystemClock.elapsedRealtime();
                java.lang.String str = this.f554226e.f554231d;
                android.os.SystemClock.elapsedRealtime();
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
        this.f554225d.mo50307xb9e94560(0, 1L);
    }
}
