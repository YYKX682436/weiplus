package xp5;

/* loaded from: classes13.dex */
public final class c extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xp5.a f537498a;

    public c(xp5.a aVar) {
        this.f537498a = aVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        java.util.ArrayList<xp5.b> arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        super.onAvailable(network);
        xp5.a aVar = this.f537498a;
        synchronized (aVar.f537496d) {
            arrayList = new java.util.ArrayList(aVar.f537494b);
        }
        for (xp5.b bVar : arrayList) {
            long networkHandle = network.getNetworkHandle();
            ((wp5.d) bVar).getClass();
            com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22913x8bd6f566 abstractC22913x8bd6f566 = wp5.e.f530000e;
            if (abstractC22913x8bd6f566 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cellularNetworkHandler");
                throw null;
            }
            abstractC22913x8bd6f566.m83237x53ec983a(networkHandle);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        java.util.ArrayList<xp5.b> arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(network, "network");
        super.onLost(network);
        xp5.a aVar = this.f537498a;
        synchronized (aVar.f537496d) {
            arrayList = new java.util.ArrayList(aVar.f537494b);
        }
        for (xp5.b bVar : arrayList) {
            long networkHandle = network.getNetworkHandle();
            ((wp5.d) bVar).getClass();
            com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22913x8bd6f566 abstractC22913x8bd6f566 = wp5.e.f530000e;
            if (abstractC22913x8bd6f566 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cellularNetworkHandler");
                throw null;
            }
            abstractC22913x8bd6f566.m83238xa8df5713(networkHandle);
        }
    }
}
