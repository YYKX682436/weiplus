package uh1;

/* loaded from: classes13.dex */
public abstract class y1 {

    /* renamed from: b, reason: collision with root package name */
    public volatile android.net.Network f509473b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f509472a = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f509474c = jz5.h.b(uh1.s1.f509435d);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f509475d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f509476e = jz5.h.b(new uh1.u1(this));

    /* renamed from: f, reason: collision with root package name */
    public volatile long f509477f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f509478g = jz5.h.b(new uh1.x1(this));

    public y1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public abstract android.net.NetworkRequest a();

    public final void b(uh1.p1 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.net.Network network = this.f509473b;
        if (network != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkProvider", "provide, curNetwork not null");
            callback.a(network);
            return;
        }
        this.f509472a.add(callback);
        ((ku5.t0) ku5.t0.f394148d).k(new uh1.v1(this, callback), 4000L);
        this.f509477f = android.os.SystemClock.uptimeMillis() + 30000;
        if (this.f509475d.compareAndSet(false, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkProvider", "doRequest, requestNetwork");
            try {
                ((android.net.ConnectivityManager) ((jz5.n) this.f509474c).mo141623x754a37bb()).requestNetwork(a(), (uh1.t1) ((jz5.n) this.f509476e).mo141623x754a37bb());
                ((ku5.t0) ku5.t0.f394148d).k((java.lang.Runnable) ((jz5.n) this.f509478g).mo141623x754a37bb(), 30000L);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkProvider", "doRequest, requestNetwork fail since " + e17);
                this.f509475d.set(false);
            }
        }
    }
}
