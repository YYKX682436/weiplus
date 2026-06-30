package com.tencent.mm.modelcdntran;

@j95.b
/* loaded from: classes13.dex */
public class h1 extends i95.w implements sx.d0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile android.content.Context f70974d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f70975e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.network.r0 f70976f = new com.tencent.mm.modelcdntran.e1(this);

    /* renamed from: g, reason: collision with root package name */
    public final android.content.BroadcastReceiver f70977g = new com.tencent.mm.modelcdntran.f1(this);

    /* renamed from: h, reason: collision with root package name */
    public final android.net.ConnectivityManager.NetworkCallback f70978h = new com.tencent.mm.modelcdntran.g1(this);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f70979i = new java.util.concurrent.atomic.AtomicInteger(-1);

    public static void wi(com.tencent.mm.modelcdntran.h1 h1Var, java.lang.String str) {
        android.content.Context context = h1Var.f70974d;
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdnNetworkMonitorService", "handleNetworkChanged: networkContext is null");
            return;
        }
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(context);
        int i17 = h1Var.f70979i.get();
        if (netType != i17 && h1Var.f70979i.compareAndSet(i17, netType)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnNetworkMonitorService", "onNetworkChange: %d -> %d reason %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(netType), str);
            new com.tencent.mm.feature.cdn.api.NetworkChangeEvent(i17, netType, str).b(android.os.Looper.getMainLooper());
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        this.f70974d = context;
        if (!this.f70975e.get() && this.f70975e.compareAndSet(false, true)) {
            android.content.Context context2 = this.f70974d;
            if (context2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CdnNetworkMonitorService", "startMonitorIfNeed: networkContext is null");
                this.f70975e.set(false);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnNetworkMonitorService", "start network monitor");
            this.f70979i.set(com.tencent.mars.comm.NetStatusUtil.getNetType(context2));
            try {
                gm0.j1.n().a(this.f70976f);
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
                if (fp.h.a(33)) {
                    context2.registerReceiver(this.f70977g, intentFilter);
                } else {
                    context2.registerReceiver(this.f70977g, intentFilter, 2);
                }
            } catch (java.lang.Exception unused) {
            }
            android.net.ConnectivityManager.NetworkCallback networkCallback = this.f70978h;
            if (fp.h.a(21)) {
                return;
            }
            android.content.Context context3 = this.f70974d;
            if (context3 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CdnNetworkMonitorService", "registerNetworkTypeCallback: networkContext is null");
                return;
            }
            try {
                ((android.net.ConnectivityManager) context3.getSystemService("connectivity")).registerNetworkCallback(new android.net.NetworkRequest.Builder().build(), networkCallback);
            } catch (java.lang.Exception unused2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CdnNetworkMonitorService", "missing the appropriate permissions");
            }
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        if (this.f70975e.get() && this.f70975e.compareAndSet(true, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CdnNetworkMonitorService", "stop network monitor");
            gm0.j1.n().d(this.f70976f);
            android.content.Context context2 = this.f70974d;
            if (context2 != null) {
                try {
                    context2.unregisterReceiver(this.f70977g);
                } catch (java.lang.IllegalArgumentException e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.CdnNetworkMonitorService", "unregisterReceiver failed: " + e17.getMessage());
                }
            }
            android.net.ConnectivityManager.NetworkCallback networkCallback = this.f70978h;
            if (!fp.h.a(21)) {
                android.content.Context context3 = this.f70974d;
                if (context3 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.CdnNetworkMonitorService", "unregisterNetworkTypeCallback: networkContext is null");
                } else {
                    try {
                        ((android.net.ConnectivityManager) context3.getSystemService("connectivity")).unregisterNetworkCallback(networkCallback);
                    } catch (java.lang.IllegalArgumentException e18) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.CdnNetworkMonitorService", "unregisterNetworkCallback failed: " + e18.getMessage());
                    }
                }
            }
        }
        this.f70974d = null;
    }
}
