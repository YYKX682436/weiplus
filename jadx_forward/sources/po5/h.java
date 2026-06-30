package po5;

/* loaded from: classes11.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final po5.h f438886d = new po5.h();

    public h() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("wifi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) systemService;
        return android.os.Build.VERSION.SDK_INT >= 29 ? wifiManager.createWifiLock(4, "VoIPMPLowLatencyLock") : wifiManager.createWifiLock(1, "VoIPMPLock");
    }
}
