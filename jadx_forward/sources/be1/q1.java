package be1;

/* loaded from: classes7.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f101029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(boolean z17) {
        super(2);
        this.f101029d = z17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean isWifiEnabled;
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRes, "outRes");
        if (this.f101029d) {
            isWifiEnabled = be1.f0.f100999m.get();
        } else {
            java.lang.Object systemService = context != null ? context.getSystemService("wifi") : null;
            android.net.wifi.WifiManager wifiManager = systemService instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService : null;
            isWifiEnabled = wifiManager != null ? wifiManager.isWifiEnabled() : false;
        }
        outRes.put("wifiEnabled", java.lang.Boolean.valueOf(isWifiEnabled));
        return jz5.f0.f384359a;
    }
}
