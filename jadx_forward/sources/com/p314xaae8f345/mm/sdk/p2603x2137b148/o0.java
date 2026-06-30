package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 f274423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 t0Var) {
        super(0);
        this.f274423d = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 t0Var = this.f274423d;
        if (((java.lang.String) ((jz5.n) t0Var.f274516d).mo141623x754a37bb()).equals("<unknown ssid>")) {
            return "02:00:00:00:00:00";
        }
        java.lang.String str = "connectivity_compat_key_wifi_bssid" + ((java.lang.String) ((jz5.n) t0Var.f274516d).mo141623x754a37bb()).hashCode();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = t0Var.f274514b;
        java.lang.String u17 = o4Var.u(str, null);
        if (u17 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.m0 a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m0.f274377c.a(u17);
            long H1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(a17.f274379b);
            java.lang.String str2 = a17.f274378a;
            if (H1 < 86400 && !str2.equals("02:00:00:00:00:00")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "getBssid from cache:" + str2 + ' ' + new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                return str2;
            }
        }
        android.net.wifi.WifiInfo wifiInfo = t0Var.f274513a;
        java.lang.String bssid = wifiInfo != null ? wifiInfo.getBSSID() : null;
        if (bssid == null) {
            bssid = "02:00:00:00:00:00";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBssid:");
        sb6.append(bssid);
        sb6.append(' ');
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", sb6.toString());
        if (!bssid.equals("02:00:00:00:00:00")) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t0.f274512g = t0Var;
            o4Var.D(str, bssid + ',' + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
        }
        return bssid;
    }
}
