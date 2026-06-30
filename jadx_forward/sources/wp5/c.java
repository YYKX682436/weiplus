package wp5;

/* loaded from: classes13.dex */
public final class c extends com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22913x8bd6f566 {
    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22913x8bd6f566
    /* renamed from: getActiveCellularNetworkHandle */
    public long mo83236x69385010() {
        android.net.NetworkCapabilities networkCapabilities;
        xp5.a aVar = wp5.e.f529999d;
        aVar.getClass();
        jz5.g gVar = aVar.f537493a;
        try {
            android.net.Network activeNetwork = ((android.net.ConnectivityManager) ((jz5.n) gVar).mo141623x754a37bb()).getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = ((android.net.ConnectivityManager) ((jz5.n) gVar).mo141623x754a37bb()).getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasTransport(0) && networkCapabilities.hasCapability(12)) {
                return activeNetwork.getNetworkHandle();
            }
        } catch (java.lang.SecurityException unused) {
        }
        return -1L;
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22913x8bd6f566
    /* renamed from: startMonitoring */
    public boolean mo83239xdfa8b24a() {
        xp5.a aVar = wp5.e.f529999d;
        synchronized (aVar.f537496d) {
            if (aVar.f537495c) {
                return true;
            }
            try {
                ((android.net.ConnectivityManager) ((jz5.n) aVar.f537493a).mo141623x754a37bb()).requestNetwork(new android.net.NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), aVar.f537497e);
                aVar.f537495c = true;
                return true;
            } catch (java.lang.SecurityException unused) {
                return false;
            } catch (java.lang.RuntimeException unused2) {
                return false;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22913x8bd6f566
    /* renamed from: stopMonitoring */
    public void mo83240xe94bedea() {
        xp5.a aVar = wp5.e.f529999d;
        synchronized (aVar.f537496d) {
            if (aVar.f537495c) {
                ((android.net.ConnectivityManager) ((jz5.n) aVar.f537493a).mo141623x754a37bb()).unregisterNetworkCallback(aVar.f537497e);
                aVar.f537495c = false;
            }
        }
    }
}
