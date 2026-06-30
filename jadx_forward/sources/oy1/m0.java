package oy1;

/* loaded from: classes13.dex */
public final class m0 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f431430a;

    public m0(android.net.ConnectivityManager connectivityManager) {
        this.f431430a = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.CgiReportService");
        qy1.g gVar = qy1.g.f449258a;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = qy1.g.f449259b;
        if (!atomicBoolean.get()) {
            oy1.u.f431461a.e();
        }
        atomicBoolean.set(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReportService", "net work onAvailable");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        ((ku5.t0) ku5.t0.f394148d).l(new oy1.l0(this.f431430a), 1000L, "MicroMsg.CgiReportService");
    }
}
