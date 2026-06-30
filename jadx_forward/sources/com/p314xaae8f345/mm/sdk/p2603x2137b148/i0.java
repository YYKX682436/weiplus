package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public final class i0 {
    public i0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.t0 a(android.content.Context context, android.net.wifi.WifiManager wifiManager) {
        android.net.wifi.WifiInfo wifiInfo;
        try {
            if ((context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 || context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) && (wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo27", "(Landroid/content/Context;Landroid/net/wifi/WifiManager;)Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) != null) {
                return new com.p314xaae8f345.mm.sdk.p2603x2137b148.t0(wifiInfo);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConnectivityCompat", th6, "get wifi info failed directly", new java.lang.Object[0]);
        }
        try {
            java.util.List list = (java.util.List) yj0.a.j(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo27", "(Landroid/content/Context;Landroid/net/wifi/WifiManager;)Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConfiguredNetworks", "()Ljava/util/List;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getConfiguredNetworks(...)");
            android.net.wifi.WifiInfo wifiInfo2 = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "acquireWiFiInfo27", "(Landroid/content/Context;Landroid/net/wifi/WifiManager;)Lcom/tencent/mm/sdk/platformtools/ConnectivityCompat$WiFiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((android.net.wifi.WifiConfiguration) it.next()).networkId == wifiInfo2.getNetworkId()) {
                    return new com.p314xaae8f345.mm.sdk.p2603x2137b148.t0(wifiInfo2);
                }
            }
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConnectivityCompat", th7, "get wifi info failed from configurations", new java.lang.Object[0]);
        }
        return new com.p314xaae8f345.mm.sdk.p2603x2137b148.t0(null);
    }

    public final void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat").putLong("wifi_info_update_timestamp", java.lang.System.currentTimeMillis());
    }

    public final synchronized int c() {
        try {
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
                return java.lang.Math.abs(h());
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274562c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ConnectivityCompat", "getStrength phone Listener has not been inited");
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.j0 j0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274564e;
            boolean z17 = true;
            if (j0Var.f274282a != 1) {
                z17 = false;
            }
            return java.lang.Math.abs(java.lang.Math.abs(z17 ? j0Var.f274284c : (j0Var.f274283b * 2) - 113));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ConnectivityCompat", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    public final java.lang.String d(boolean z17) {
        java.lang.String f17 = f(z17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f17, "02:00:00:00:00:00")) {
            return "";
        }
        java.util.Locale ENGLISH = java.util.Locale.ENGLISH;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ENGLISH, "ENGLISH");
        java.lang.String lowerCase = f17.toLowerCase(ENGLISH);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final java.lang.String e(boolean z17) {
        java.lang.String j17 = j(z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j17, "<unknown ssid>")) {
            return "";
        }
        if (r26.i0.y(j17, "\"", false) && r26.i0.n(j17, "\"", false)) {
            j17 = j17.substring(1, j17.length() - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "substring(...)");
        }
        return j17;
    }

    public final java.lang.String f(boolean z17) {
        java.lang.String str;
        if (!z17) {
            return (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.sdk.p2603x2137b148.t0.f274511f.a().f274515c).mo141623x754a37bb();
        }
        java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat").u("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "decodeString(...)");
        if (u17.equals("<unknown ssid>")) {
            return "02:00:00:00:00:00";
        }
        java.lang.String u18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat").u("connectivity_compat_key_wifi_bssid" + u17.hashCode(), null);
        return (u18 == null || (str = com.p314xaae8f345.mm.sdk.p2603x2137b148.m0.f274377c.a(u18).f274378a) == null) ? "02:00:00:00:00:00" : str;
    }

    public final int g(boolean z17) {
        return ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.sdk.p2603x2137b148.t0.f274511f.a().f274517e).mo141623x754a37bb()).intValue();
    }

    public final int h() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat").o("connectivity_compat_key_wifi_rssi", 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if ((r3 != null && r3.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(boolean r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.i0.i(boolean):java.util.List");
    }

    public final java.lang.String j(boolean z17) {
        if (!z17) {
            return (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.sdk.p2603x2137b148.t0.f274511f.a().f274516d).mo141623x754a37bb();
        }
        java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat").u("connectivity_compat_key_wifi_ssid", "<unknown ssid>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "decodeString(...)");
        return u17;
    }

    public final void k() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274562c) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274562c = true;
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) systemService;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.g0 g0Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.g0(telephonyManager.getPhoneType());
        if (!fp.h.a(31)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.f0 f0Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.f0();
            f0Var.f274193a = g0Var;
            telephonyManager.registerTelephonyCallback(java.util.concurrent.Executors.newSingleThreadExecutor(), f0Var);
            return;
        }
        jz5.g gVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274565f;
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.e0) ((jz5.n) gVar).mo141623x754a37bb()).f274079a = g0Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.e0 e0Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.e0) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(256);
        arrayList.add(e0Var);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "initSignalStrengthListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(telephonyManager, "com/tencent/mm/sdk/platformtools/ConnectivityCompat$Companion", "initSignalStrengthListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.tencent.mm.sdk.platformtools.ConnectivityCompat$Receiver] */
    public final void l() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "registerReceiver");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274563d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.k0();
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().removeCapability(14).build();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.k0 k0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274563d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
        ((android.net.ConnectivityManager) systemService).registerNetworkCallback(build, k0Var);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274561b == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274561b = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.sdk.platformtools.ConnectivityCompat$Receiver
                @Override // android.content.BroadcastReceiver
                public void onReceive(android.content.Context context, android.content.Intent intent) {
                    java.lang.String action = intent != null ? intent.getAction() : null;
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode == -1172645946) {
                            if (action.equals(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "connectivity action updated");
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a.b();
                                return;
                            }
                            return;
                        }
                        if (hashCode != -385684331) {
                            if (hashCode == 1878357501 && action.equals("android.net.wifi.SCAN_RESULTS")) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "scan results available, invalid last get time");
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat").putInt("connectivity_compat_key_wifi_last_get_time", 0);
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat").putLong("wifi_scan_result_update_timestamp", java.lang.System.currentTimeMillis());
                                return;
                            }
                            return;
                        }
                        if (action.equals("android.net.wifi.RSSI_CHANGED")) {
                            int intExtra = intent.getIntExtra("newRssi", 0);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "new rssi available, rssi: " + intExtra);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat").A("connectivity_compat_key_wifi_rssi", intExtra);
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.i0 i0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274560a;
                        }
                    }
                }
            };
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
            intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274561b, intentFilter);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConnectivityCompat", "connectivity compat receiver has been registered, check " + com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.a());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("connectivity_compat").A("connectivity_compat_key_wifi_rssi", 0);
    }

    public final void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "unregisterReceiver");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C20990xa46f3a1a c20990xa46f3a1a = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274561b;
        if (c20990xa46f3a1a != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(c20990xa46f3a1a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "unregister connectivity receiver");
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274563d != null) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.k0 k0Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.v0.f274563d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k0Var);
            ((android.net.ConnectivityManager) systemService).unregisterNetworkCallback(k0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConnectivityCompat", "unregister network callback(api >= 24)");
        }
    }
}
