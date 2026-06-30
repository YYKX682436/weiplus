package vz4;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.m f523269d;

    public l(vz4.m mVar) {
        this.f523269d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vz4.m mVar = this.f523269d;
        if (mVar.f523271e == null) {
            mVar.f523271e = new com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.g gVar = mVar.f523271e;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgListener", "wepkg start listen");
        gVar.f270027c.mo48813x58998cd();
        gVar.f270026b.mo48813x58998cd();
        if (xz4.q.f539828a == null) {
            xz4.q.f539828a = new xz4.p(null);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(xz4.q.f539828a, intentFilter);
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgAutoDownloader", "WepkgAutoDownloader startListen");
        gVar.f270025a.m43071x58998cd();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            return;
        }
        try {
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("we_pkg_sp", 4);
            if (sharedPreferences == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgListener", "sp is null");
                return;
            }
            if (sharedPreferences.getBoolean("disable_we_pkg", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgListener", "enable wepkg");
                sharedPreferences.edit().putBoolean("disable_we_pkg", false).commit();
            }
            sharedPreferences.edit().putInt("white_screen_times", 0).commit();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WepkgListener", e17.getMessage());
        }
    }
}
