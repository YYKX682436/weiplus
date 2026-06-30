package be1;

/* loaded from: classes7.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f19496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(boolean z17) {
        super(2);
        this.f19496d = z17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean isWifiEnabled;
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g(outRes, "outRes");
        if (this.f19496d) {
            isWifiEnabled = be1.f0.f19466m.get();
        } else {
            java.lang.Object systemService = context != null ? context.getSystemService("wifi") : null;
            android.net.wifi.WifiManager wifiManager = systemService instanceof android.net.wifi.WifiManager ? (android.net.wifi.WifiManager) systemService : null;
            isWifiEnabled = wifiManager != null ? wifiManager.isWifiEnabled() : false;
        }
        outRes.put("wifiEnabled", java.lang.Boolean.valueOf(isWifiEnabled));
        return jz5.f0.f302826a;
    }
}
