package uh1;

/* loaded from: classes13.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh1.y1 f509452d;

    public w1(uh1.y1 y1Var) {
        this.f509452d = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = this.f509452d.f509477f - android.os.SystemClock.uptimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkProvider", "run#unregisterNetworkCallbackTask, timeToUnregisterMs: " + uptimeMillis);
        if (uptimeMillis > 0) {
            ((ku5.t0) ku5.t0.f394148d).k((java.lang.Runnable) ((jz5.n) this.f509452d.f509478g).mo141623x754a37bb(), uptimeMillis);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkProvider", "run#unregisterNetworkCallbackTask, unregisterNetworkCallback");
        try {
            ((android.net.ConnectivityManager) ((jz5.n) this.f509452d.f509474c).mo141623x754a37bb()).unregisterNetworkCallback((uh1.t1) ((jz5.n) this.f509452d.f509476e).mo141623x754a37bb());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetworkProvider", "run#unregisterNetworkCallbackTask, unregisterNetworkCallback fail since " + e17);
        }
        this.f509452d.f509475d.set(false);
        this.f509452d.f509473b = null;
    }
}
