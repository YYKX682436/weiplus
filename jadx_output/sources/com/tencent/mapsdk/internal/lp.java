package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class lp extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference<android.net.ConnectivityManager> f50339b;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f50341d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.ref.WeakReference<android.net.wifi.WifiManager> f50342e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<com.tencent.map.tools.net.NetStatusListener, java.lang.Boolean> f50338a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Runnable f50340c = new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.lp.1
        @Override // java.lang.Runnable
        public final void run() {
            com.tencent.mapsdk.internal.lp.this.a();
            com.tencent.mapsdk.internal.lp.this.f50341d.postDelayed(this, 1000L);
        }
    };

    public lp(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) context.getApplicationContext().getSystemService("wifi");
        this.f50339b = new java.lang.ref.WeakReference<>(connectivityManager);
        this.f50342e = new java.lang.ref.WeakReference<>(wifiManager);
        this.f50341d = new android.os.Handler(context.getMainLooper());
    }

    private void b(com.tencent.map.tools.net.NetStatusListener netStatusListener) {
        if (java.lang.Boolean.TRUE.equals(this.f50338a.remove(netStatusListener)) && this.f50338a.isEmpty()) {
            try {
                android.net.ConnectivityManager connectivityManager = this.f50339b.get();
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(this);
                }
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                this.f50341d.removeCallbacks(this.f50340c);
                throw th6;
            }
            this.f50341d.removeCallbacks(this.f50340c);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(android.net.Network network) {
        android.net.ConnectivityManager connectivityManager;
        int i17;
        android.net.wifi.WifiManager wifiManager;
        super.onAvailable(network);
        this.f50341d.removeCallbacks(this.f50340c);
        if (this.f50338a.isEmpty() || (connectivityManager = this.f50339b.get()) == null) {
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
            if (i17 == 1 && (wifiManager = this.f50342e.get()) != null) {
                i18 = android.net.wifi.WifiManager.calculateSignalLevel(wifiManager.getConnectionInfo().getRssi(), 6);
            }
        } catch (java.lang.Exception unused2) {
            i17 = -1;
        }
        for (com.tencent.map.tools.net.NetStatusListener netStatusListener : this.f50338a.keySet()) {
            if (netStatusListener != null) {
                netStatusListener.onConnect(i17, i18);
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(android.net.Network network, int i17) {
        super.onLosing(network, i17);
        if (this.f50338a.isEmpty()) {
            return;
        }
        for (com.tencent.map.tools.net.NetStatusListener netStatusListener : this.f50338a.keySet()) {
            if (netStatusListener != null) {
                netStatusListener.onLost(1);
            }
        }
        this.f50341d.removeCallbacks(this.f50340c);
        this.f50341d.post(this.f50340c);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        super.onLost(network);
        if (this.f50338a.isEmpty()) {
            return;
        }
        for (com.tencent.map.tools.net.NetStatusListener netStatusListener : this.f50338a.keySet()) {
            if (netStatusListener != null) {
                netStatusListener.onLost(0);
            }
        }
        this.f50341d.removeCallbacks(this.f50340c);
        this.f50341d.post(this.f50340c);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        super.onUnavailable();
        if (this.f50338a.isEmpty()) {
            return;
        }
        for (com.tencent.map.tools.net.NetStatusListener netStatusListener : this.f50338a.keySet()) {
            if (netStatusListener != null) {
                netStatusListener.onLost(2);
            }
        }
        this.f50341d.removeCallbacks(this.f50340c);
        this.f50341d.post(this.f50340c);
    }

    private void a(com.tencent.map.tools.net.NetStatusListener netStatusListener) {
        if (this.f50338a.containsKey(netStatusListener)) {
            return;
        }
        this.f50338a.put(netStatusListener, java.lang.Boolean.TRUE);
        if (this.f50338a.size() == 1) {
            a();
        }
    }

    public final void a() {
        android.net.ConnectivityManager connectivityManager;
        if (this.f50338a.isEmpty() || (connectivityManager = this.f50339b.get()) == null) {
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
