package iw1;

/* loaded from: classes12.dex */
public final class n extends p3325xe03a0797.p3326xc267989b.p0 implements java.io.Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static int f376758g;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f376759e = jz5.h.b(iw1.m.f376757d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f376760f = jz5.h.b(new iw1.l(this));

    @Override // p3325xe03a0797.p3326xc267989b.p0
    public void D(oz5.l context, java.lang.Runnable block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        ((android.os.Handler) ((jz5.n) this.f376760f).mo141623x754a37bb()).post(block);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((android.os.Handler) ((jz5.n) this.f376760f).mo141623x754a37bb()).removeMessages(0);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f376759e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.os.HandlerThread) mo141623x754a37bb).quit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.MTRHandlerThreadDispatcher", "worker thread stopped");
    }
}
