package yo5;

/* loaded from: classes12.dex */
public final class h extends p3325xe03a0797.p3326xc267989b.p0 implements java.io.Closeable {

    /* renamed from: h, reason: collision with root package name */
    public static int f545901h;

    /* renamed from: e, reason: collision with root package name */
    public final int f545902e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voip_ilink_usesafequit, 0);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f545903f = jz5.h.b(yo5.g.f545900d);

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f545904g = jz5.h.b(new yo5.f(this));

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        ((android.os.Handler) ((jz5.n) this.f545904g).mo141623x754a37bb()).post(block);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        jz5.g gVar = this.f545903f;
        int i17 = this.f545902e;
        if (i17 == 0) {
            ((android.os.Handler) ((jz5.n) this.f545904g).mo141623x754a37bb()).removeMessages(0);
            java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.os.HandlerThread) mo141623x754a37bb).quit();
        } else {
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((android.os.HandlerThread) mo141623x754a37bb2).quitSafely();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread stopped, safeQuit: " + i17);
    }
}
