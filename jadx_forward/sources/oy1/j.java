package oy1;

/* loaded from: classes13.dex */
public final class j extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oy1.l f431410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f431411b;

    public j(oy1.l lVar, android.net.ConnectivityManager connectivityManager) {
        this.f431410a = lVar;
        this.f431411b = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.BaseCgiReport");
        this.f431410a.e(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCgiReport", "net work onAvailable");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        ((ku5.t0) ku5.t0.f394148d).l(new oy1.i(this.f431411b, this.f431410a), 1000L, "MicroMsg.BaseCgiReport");
    }
}
