package uh1;

/* loaded from: classes13.dex */
public final class t1 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh1.y1 f509439a;

    public t1(uh1.y1 y1Var) {
        this.f509439a = y1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkProvider", "onAvailable, network: " + network);
        super.onAvailable(network);
        this.f509439a.f509473b = network;
        uh1.y1 y1Var = this.f509439a;
        y1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkProvider", "consumePendingCallbacks, network: " + network);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = y1Var.f509472a;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((uh1.p1) it.next()).a(network);
        }
        copyOnWriteArraySet.clear();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkProvider", "onLost, network: " + network);
        super.onLost(network);
        this.f509439a.f509473b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetworkProvider", "onUnavailable");
        super.onUnavailable();
        this.f509439a.f509473b = null;
    }
}
