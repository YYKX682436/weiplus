package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class t0 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n0 f274511f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n0(null);

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 f274512g;

    /* renamed from: a, reason: collision with root package name */
    public final android.net.wifi.WifiInfo f274513a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f274514b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f274515c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f274516d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f274517e;

    public t0(android.net.wifi.WifiInfo wifiInfo) {
        android.net.wifi.WifiInfo wifiInfo2;
        this.f274513a = wifiInfo;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat");
        this.f274514b = M;
        jz5.h.b(new com.p314xaae8f345.mm.sdk.p2603x2137b148.r0(this));
        this.f274515c = jz5.h.b(new com.p314xaae8f345.mm.sdk.p2603x2137b148.o0(this));
        this.f274516d = jz5.h.b(new com.p314xaae8f345.mm.sdk.p2603x2137b148.s0(this));
        jz5.h.b(new com.p314xaae8f345.mm.sdk.p2603x2137b148.q0(this));
        this.f274517e = jz5.h.b(new com.p314xaae8f345.mm.sdk.p2603x2137b148.p0(this));
        if (wifiInfo == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "wifiInfo is null");
            f274512g = null;
            M.D("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 t0Var = f274512g;
        if (t0Var != null) {
            boolean equals = java.util.Objects.equals((t0Var == null || (wifiInfo2 = t0Var.f274513a) == null) ? null : java.lang.Integer.valueOf(wifiInfo2.getIpAddress()), wifiInfo != null ? java.lang.Integer.valueOf(wifiInfo.getIpAddress()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "wifiNotChange: " + equals);
            if (equals) {
                return;
            }
        }
        f274512g = null;
        M.D("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "init wifiInfo");
    }
}
