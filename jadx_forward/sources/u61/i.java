package u61;

/* loaded from: classes13.dex */
public final class i extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f506421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.locks.ReentrantLock f506422b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.locks.Condition f506423c;

    public i(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.concurrent.locks.ReentrantLock reentrantLock, java.util.concurrent.locks.Condition condition) {
        this.f506421a = h0Var;
        this.f506422b = reentrantLock;
        this.f506423c = condition;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GateWayRegHelper", "onAvailable");
        this.f506421a.f391656d = network;
        u61.o oVar = u61.o.f506457a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f506422b;
        reentrantLock.lock();
        this.f506423c.signal();
        reentrantLock.unlock();
    }
}
