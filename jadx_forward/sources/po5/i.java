package po5;

/* loaded from: classes13.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public android.net.Network f438887a;

    /* renamed from: b, reason: collision with root package name */
    public android.net.ConnectivityManager.NetworkCallback f438888b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f438889c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f438890d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_voip_wifi_low_latency, false);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f438891e = jz5.h.b(po5.h.f438886d);

    /* renamed from: f, reason: collision with root package name */
    public final po5.f f438892f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2793xcfa97743.v2.p2799x6de15a2e.C22891x7dd9e9b0 f438893g;

    /* renamed from: h, reason: collision with root package name */
    public final po5.e f438894h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f438895i;

    /* renamed from: j, reason: collision with root package name */
    public int f438896j;

    /* JADX WARN: Type inference failed for: r0v13, types: [com.tencent.mm.voipmp.v2.network.VoIPMPNetWorkController$connectivityReceiver$1] */
    public i() {
        ve0.e eVar = (ve0.e) i95.n0.c(ve0.e.class);
        po5.b bVar = new po5.b(this);
        ((o95.k) eVar).getClass();
        o95.k.f425285p = bVar;
        this.f438892f = new po5.f(this);
        this.f438893g = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.voipmp.v2.network.VoIPMPNetWorkController$connectivityReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent.getAction(), io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be)) {
                    po5.i.b(po5.i.this);
                }
            }
        };
        this.f438894h = new po5.e(this);
        this.f438896j = -1;
    }

    public static final void b(po5.i iVar) {
        boolean z17;
        java.lang.String sb6;
        iVar.getClass();
        int a17 = co5.i.f125372a.a();
        if (a17 == iVar.f438896j) {
            return;
        }
        iVar.f438896j = a17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "onNetworkChange: " + a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
        er4.y a18 = er4.y.a(a17);
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        try {
            java.lang.reflect.Method declaredMethod = android.net.ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            java.lang.Object invoke = declaredMethod.invoke(connectivityManager, new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Boolean");
            z17 = ((java.lang.Boolean) invoke).booleanValue();
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        if (z17) {
            java.lang.Object systemService2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("phone");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            java.lang.String simOperator = ((android.telephony.TelephonyManager) systemService2).getSimOperator();
            if (simOperator != null && simOperator.length() >= 3) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String substring = simOperator.substring(0, 3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                sb7.append(substring);
                sb7.append(':');
                java.lang.String substring2 = simOperator.substring(3, simOperator.length());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
                sb7.append(substring2);
                sb6 = sb7.toString();
                v0Var.u(a18, r26.i0.m(sb6), po5.c.f438881a);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPHelper", "nic_op NULL");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIPHelper", "mobile network not connectedorconnecting");
        }
        sb6 = "";
        v0Var.u(a18, r26.i0.m(sb6), po5.c.f438881a);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "try to UnregisterCellularNetwork");
        if (fp.h.c(21)) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            if (this.f438888b != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unregister networkcallback hashCode: ");
                android.net.ConnectivityManager.NetworkCallback networkCallback = this.f438888b;
                sb6.append(networkCallback != null ? networkCallback.hashCode() : 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", sb6.toString());
                try {
                    android.net.ConnectivityManager.NetworkCallback networkCallback2 = this.f438888b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(networkCallback2);
                    connectivityManager.unregisterNetworkCallback(networkCallback2);
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "unregisterNetworkCallback Error");
                }
                this.f438888b = null;
                this.f438887a = null;
            }
        }
    }

    public final void c(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "start bindSocket " + i17 + " ToNetwork " + this.f438887a + " rebind " + z17);
        if (i17 == -1) {
            a();
        }
        if (!z17) {
            this.f438889c.add(java.lang.Integer.valueOf(i17));
        }
        if (this.f438887a == null || !fp.h.c(23)) {
            return;
        }
        java.io.FileDescriptor fileDescriptor = new java.io.FileDescriptor();
        try {
            java.lang.reflect.Field declaredField = java.io.FileDescriptor.class.getDeclaredField("descriptor");
            declaredField.setAccessible(true);
            declaredField.setInt(fileDescriptor, i17);
            android.net.Network network = this.f438887a;
            if (network != null) {
                network.bindSocket(fileDescriptor);
            }
            java.util.Objects.toString(this.f438887a);
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "bindSocketToNetwork Error");
        }
    }

    public final android.net.wifi.WifiManager.WifiLock d() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f438891e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.net.wifi.WifiManager.WifiLock) mo141623x754a37bb;
    }

    public final void e() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "registerNetworkReceiver");
            gm0.j1.n().a(this.f438892f);
            android.content.IntentFilter intentFilter = new android.content.IntentFilter(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
            boolean a17 = fp.h.a(33);
            com.p314xaae8f345.mm.p2793xcfa97743.v2.p2799x6de15a2e.C22891x7dd9e9b0 c22891x7dd9e9b0 = this.f438893g;
            if (a17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c22891x7dd9e9b0, intentFilter);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(c22891x7dd9e9b0, intentFilter, 2);
            }
            f();
            this.f438895i = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPNetWorkController", "registerNetworkReceiver err: " + e17.getMessage());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "In networkRequestViaCellular");
        if (fp.h.c(21)) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
            builder.addTransportType(0);
            builder.addCapability(12);
            android.net.NetworkRequest build = builder.build();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "NetworkRequest toString: " + build + " hashCode: " + build.hashCode());
            try {
                connectivityManager.requestNetwork(build, new po5.d(this));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "missing the appropriate permissions");
            }
        }
        this.f438896j = co5.i.f125372a.a();
        if (android.os.Build.VERSION.SDK_INT < 29) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPNetWorkController", "Wi-Fi low latency mode is not supported on this platform");
            return;
        }
        if (this.f438890d) {
            d();
            if (d().isHeld()) {
                return;
            }
            d().acquire();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "Acquired Wi-Fi low latency lock");
        }
    }

    public final void f() {
        if (fp.h.c(21)) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
            android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().build();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "NetworkRequest toString: " + build + " hashCode: " + build.hashCode());
            try {
                connectivityManager.registerNetworkCallback(build, this.f438894h);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "missing the appropriate permissions");
            }
        }
    }

    public final void g() {
        try {
            if (this.f438895i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "unregisterNetworkReceiver");
                gm0.j1.n().d(this.f438892f);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this.f438893g);
                if (fp.h.c(21)) {
                    java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("connectivity");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                    ((android.net.ConnectivityManager) systemService).unregisterNetworkCallback(this.f438894h);
                }
                this.f438895i = false;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoIPMPNetWorkController", "unregisterNetworkReceiver err: " + e17.getMessage());
        }
        a();
        this.f438896j = -1;
        if (this.f438890d) {
            d();
            if (d().isHeld()) {
                d().release();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPNetWorkController", "Released Wi-Fi low latency lock");
            }
        }
    }
}
