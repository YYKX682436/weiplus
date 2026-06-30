package yn1;

/* loaded from: classes11.dex */
public final class g2 extends android.net.ConnectivityManager.NetworkCallback {
    public g2(yz5.l lVar) {
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        super.onAvailable(network);
        yn1.h2.f545221d.mo146xb9724478("onAvailable");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(networkCapabilities, "networkCapabilities");
        yn1.z0 z0Var = yn1.z0.f545466a;
        if (yn1.z0.f545484s) {
            bw5.he0 f17 = z0Var.f();
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f fVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.f.f298923b;
            if (!fVar.f()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "updateMigrateNetworkStatus, manager not init, return");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "updateMigrateNetworkStatus, migrateNetworkStatusNow = " + yn1.z0.f545478m + ", status = " + f17);
            if (yn1.z0.f545478m != f17) {
                yn1.z0.f545478m = f17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", "updateMigrateNetworkStatus, status = " + f17);
                fVar.n(f17);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        super.onLost(network);
        yn1.h2.f545221d.mo146xb9724478("onLost");
    }
}
