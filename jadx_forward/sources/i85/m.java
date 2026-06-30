package i85;

/* loaded from: classes12.dex */
public final class m implements d85.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d85.m1 f371197a;

    public m(d85.m1 m1Var) {
        this.f371197a = m1Var;
    }

    @Override // d85.m1
    public jz5.l a(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        android.net.Network activeNetwork;
        jz5.l mo131090x6ac9171;
        java.lang.String name;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 29) {
            if (((method == null || (name = method.getName()) == null || !name.equals("getConnectionInfo")) ? false : true) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(method.getReturnType(), android.net.wifi.WifiInfo.class)) {
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210 c4681x94468210 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495;
                if (c4681x94468210.mo40965x320351f8() && mm.l.a() && mm.o.h(false, 1, null)) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("appExpFg", java.lang.Boolean.FALSE);
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9 c4670x2e7549c9 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4670x2e7549c9.f19946x4fbc8495;
                    hashMap.put("hasOverlayWindow", java.lang.Boolean.valueOf(c4670x2e7549c9.m41037x57bab7e6()));
                    hashMap.put("hasVisibleWindow", java.lang.Boolean.valueOf(c4670x2e7549c9.m41038x913b4288()));
                    java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
                    hashMap.put("recentScene", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134268q);
                    hashMap.put("visibleScene", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134273v);
                    ap.a.a(1, "errLocationAlert", new java.lang.Throwable(), hashMap, "getConnectionInfo");
                }
                if (i17 >= 31 && c4681x94468210.mo40965x320351f8()) {
                    java.util.HashMap hashMap2 = g85.d.f351088a;
                    g85.c cVar = (g85.c) g85.d.f351088a.get(method.getName());
                    if (cVar != null && (mo131090x6ac9171 = cVar.mo131090x6ac9171()) != null && !((java.lang.Boolean) mo131090x6ac9171.f384366d).booleanValue()) {
                        java.lang.Object obj2 = mo131090x6ac9171.f384367e;
                        if (obj2 != null ? obj2 instanceof android.net.wifi.WifiInfo : true) {
                            return mo131090x6ac9171;
                        }
                    }
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                        try {
                            java.lang.Object systemService = context.getSystemService("connectivity");
                            android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
                            if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null) {
                                android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                                if ((networkCapabilities != null ? networkCapabilities.getTransportInfo() : null) instanceof android.net.wifi.WifiInfo) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HookWifiManagerProcessor", "[onServiceMethodIntercept] mapping method: WifiManager#getConnectionInfo >> NetworkCapabilities#getTransportInfo");
                                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                                    android.net.TransportInfo transportInfo = networkCapabilities.getTransportInfo();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(transportInfo, "null cannot be cast to non-null type android.net.wifi.WifiInfo");
                                    return new jz5.l(bool, (android.net.wifi.WifiInfo) transportInfo);
                                }
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HookWifiManagerProcessor", "getNetworkCapabilities failed: " + th6.getMessage());
                        }
                    }
                }
            }
        }
        return this.f371197a.a(obj, method, objArr);
    }

    @Override // d85.m1
    public void b(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        this.f371197a.b(method, objArr);
    }

    @Override // d85.m1
    public void c(java.lang.reflect.Method method, java.lang.Object obj) {
        this.f371197a.c(method, obj);
    }
}
