package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 f274498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 t0Var) {
        super(0);
        this.f274498d = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 t0Var = this.f274498d;
        android.net.wifi.WifiInfo wifiInfo = t0Var.f274513a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = t0Var.f274514b;
        if (wifiInfo == null) {
            str = null;
        } else if (o4Var.u("connectivity_compat_key_wifi_ssid", "<unknown ssid>").equals("<unknown ssid>")) {
            str = wifiInfo.getSSID();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "getSsid from cache");
            str = o4Var.u("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
        }
        if (str == null) {
            str = "<unknown ssid>";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSsid ");
        sb6.append(str);
        sb6.append(' ');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", sb6.toString());
        if (!str.equals("<unknown ssid>")) {
            o4Var.D("connectivity_compat_key_wifi_ssid", str);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t0.f274512g = t0Var;
        }
        return str;
    }
}
