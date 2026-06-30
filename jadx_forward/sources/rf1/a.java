package rf1;

/* loaded from: classes13.dex */
public class a extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rf1.b f476149a;

    public a(rf1.b bVar) {
        this.f476149a = bVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        super.onAvailable(network);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, network: " + network);
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        if (connectivityManager == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, connectivityManager is null");
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        rf1.b bVar = this.f476149a;
        if (i17 >= 29) {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, networkCapabilities is null");
                return;
            } else {
                bVar.a(true, networkCapabilities.hasTransport(1));
                return;
            }
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.ConnectWifiEvents", "onAvailable, networkInfo is null");
        } else {
            bVar.a(true, activeNetworkInfo.getType() == 1);
        }
    }
}
