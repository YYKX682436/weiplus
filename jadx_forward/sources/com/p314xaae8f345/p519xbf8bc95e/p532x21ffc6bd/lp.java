package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class lp extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference<android.net.ConnectivityManager> f131872b;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f131874d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.ref.WeakReference<android.net.wifi.WifiManager> f131875e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3, java.lang.Boolean> f131871a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f131873c = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.lp.1
        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lp.this.a();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lp.this.f131874d.postDelayed(this, 1000L);
        }
    };

    public lp(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f131872b = new java.lang.ref.WeakReference<>(connectivityManager);
        this.f131875e = new java.lang.ref.WeakReference<>(wifiManager);
        this.f131874d = new android.os.Handler(context.getMainLooper());
    }

    private void b(com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3 interfaceC4331x8e5805a3) {
        if (java.lang.Boolean.TRUE.equals(this.f131871a.remove(interfaceC4331x8e5805a3)) && this.f131871a.isEmpty()) {
            try {
                android.net.ConnectivityManager connectivityManager = this.f131872b.get();
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(this);
                }
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                this.f131874d.removeCallbacks(this.f131873c);
                throw th6;
            }
            this.f131874d.removeCallbacks(this.f131873c);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        android.net.ConnectivityManager connectivityManager;
        int i17;
        android.net.wifi.WifiManager wifiManager;
        super.onAvailable(network);
        this.f131874d.removeCallbacks(this.f131873c);
        if (this.f131871a.isEmpty() || (connectivityManager = this.f131872b.get()) == null) {
            return;
        }
        int i18 = 0;
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            i17 = activeNetworkInfo.getType();
            if (networkCapabilities != null) {
                try {
                    int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
                    if (linkDownstreamBandwidthKbps > 1000) {
                        i18 = 6;
                    } else if (linkDownstreamBandwidthKbps > 800) {
                        i18 = 5;
                    } else if (linkDownstreamBandwidthKbps > 600) {
                        i18 = 4;
                    } else if (linkDownstreamBandwidthKbps > 400) {
                        i18 = 3;
                    } else if (linkDownstreamBandwidthKbps > 100) {
                        i18 = 2;
                    } else if (linkDownstreamBandwidthKbps > 10) {
                        i18 = 1;
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            if (i17 == 1 && (wifiManager = this.f131875e.get()) != null) {
                i18 = android.net.wifi.WifiManager.calculateSignalLevel(wifiManager.getConnectionInfo().getRssi(), 6);
            }
        } catch (java.lang.Exception unused2) {
            i17 = -1;
        }
        for (com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3 interfaceC4331x8e5805a3 : this.f131871a.keySet()) {
            if (interfaceC4331x8e5805a3 != null) {
                interfaceC4331x8e5805a3.mo36029x885a7a0b(i17, i18);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(android.net.Network network, int i17) {
        super.onLosing(network, i17);
        if (this.f131871a.isEmpty()) {
            return;
        }
        for (com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3 interfaceC4331x8e5805a3 : this.f131871a.keySet()) {
            if (interfaceC4331x8e5805a3 != null) {
                interfaceC4331x8e5805a3.mo36030xc39c41a3(1);
            }
        }
        this.f131874d.removeCallbacks(this.f131873c);
        this.f131874d.post(this.f131873c);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        super.onLost(network);
        if (this.f131871a.isEmpty()) {
            return;
        }
        for (com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3 interfaceC4331x8e5805a3 : this.f131871a.keySet()) {
            if (interfaceC4331x8e5805a3 != null) {
                interfaceC4331x8e5805a3.mo36030xc39c41a3(0);
            }
        }
        this.f131874d.removeCallbacks(this.f131873c);
        this.f131874d.post(this.f131873c);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        if (this.f131871a.isEmpty()) {
            return;
        }
        for (com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3 interfaceC4331x8e5805a3 : this.f131871a.keySet()) {
            if (interfaceC4331x8e5805a3 != null) {
                interfaceC4331x8e5805a3.mo36030xc39c41a3(2);
            }
        }
        this.f131874d.removeCallbacks(this.f131873c);
        this.f131874d.post(this.f131873c);
    }

    private void a(com.p314xaae8f345.map.p511x696c9db.net.InterfaceC4331x8e5805a3 interfaceC4331x8e5805a3) {
        if (this.f131871a.containsKey(interfaceC4331x8e5805a3)) {
            return;
        }
        this.f131871a.put(interfaceC4331x8e5805a3, java.lang.Boolean.TRUE);
        if (this.f131871a.size() == 1) {
            a();
        }
    }

    public final void a() {
        android.net.ConnectivityManager connectivityManager;
        if (this.f131871a.isEmpty() || (connectivityManager = this.f131872b.get()) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this);
            android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addCapability(12).addCapability(15).build();
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                connectivityManager.requestNetwork(build, this, 1000);
            } else {
                connectivityManager.requestNetwork(build, this);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
