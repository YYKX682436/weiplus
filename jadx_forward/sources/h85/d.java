package h85;

/* loaded from: classes16.dex */
public final class d extends g85.b {

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f361114c = kz5.b0.c(new f85.f(new h85.b(this), h85.c.f361113d));

    @Override // g85.b, g85.c
    public void a(java.lang.Object obj) {
        android.net.wifi.WifiInfo wifiInfo = obj instanceof android.net.wifi.WifiInfo ? (android.net.wifi.WifiInfo) obj : null;
        if (wifiInfo == null || wifiInfo.getNetworkId() == -1) {
            return;
        }
        this.f351086a = obj;
        this.f351087b = java.lang.System.currentTimeMillis();
    }

    @Override // g85.c
    public java.util.List b() {
        return this.f361114c;
    }

    @Override // g85.c
    public java.lang.String c() {
        return "getConnectionInfo";
    }
}
