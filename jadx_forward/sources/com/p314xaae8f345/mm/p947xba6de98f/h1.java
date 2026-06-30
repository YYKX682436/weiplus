package com.p314xaae8f345.mm.p947xba6de98f;

@j95.b
/* loaded from: classes13.dex */
public class h1 extends i95.w implements sx.d0 {

    /* renamed from: d, reason: collision with root package name */
    public volatile android.content.Context f152507d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f152508e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p971x6de15a2e.r0 f152509f = new com.p314xaae8f345.mm.p947xba6de98f.e1(this);

    /* renamed from: g, reason: collision with root package name */
    public final android.content.BroadcastReceiver f152510g = new com.p314xaae8f345.mm.p947xba6de98f.f1(this);

    /* renamed from: h, reason: collision with root package name */
    public final android.net.ConnectivityManager.NetworkCallback f152511h = new com.p314xaae8f345.mm.p947xba6de98f.g1(this);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f152512i = new java.util.concurrent.atomic.AtomicInteger(-1);

    public static void wi(com.p314xaae8f345.mm.p947xba6de98f.h1 h1Var, java.lang.String str) {
        android.content.Context context = h1Var.f152507d;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnNetworkMonitorService", "handleNetworkChanged: networkContext is null");
            return;
        }
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context);
        int i17 = h1Var.f152512i.get();
        if (m40067xab9ed241 != i17 && h1Var.f152512i.compareAndSet(i17, m40067xab9ed241)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnNetworkMonitorService", "onNetworkChange: %d -> %d reason %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(m40067xab9ed241), str);
            new com.p314xaae8f345.mm.p689xc5a27af6.cdn.api.C10498xeb0bddc(i17, m40067xab9ed241, str).b(android.os.Looper.getMainLooper());
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        super.mo204xfac946a6(context);
        this.f152507d = context;
        if (!this.f152508e.get() && this.f152508e.compareAndSet(false, true)) {
            android.content.Context context2 = this.f152507d;
            if (context2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnNetworkMonitorService", "startMonitorIfNeed: networkContext is null");
                this.f152508e.set(false);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnNetworkMonitorService", "start network monitor");
            this.f152512i.set(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(context2));
            try {
                gm0.j1.n().a(this.f152509f);
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be);
                if (fp.h.a(33)) {
                    context2.registerReceiver(this.f152510g, intentFilter);
                } else {
                    context2.registerReceiver(this.f152510g, intentFilter, 2);
                }
            } catch (java.lang.Exception unused) {
            }
            android.net.ConnectivityManager.NetworkCallback networkCallback = this.f152511h;
            if (fp.h.a(21)) {
                return;
            }
            android.content.Context context3 = this.f152507d;
            if (context3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnNetworkMonitorService", "registerNetworkTypeCallback: networkContext is null");
                return;
            }
            try {
                ((android.net.ConnectivityManager) context3.getSystemService("connectivity")).registerNetworkCallback(new android.net.NetworkRequest.Builder().build(), networkCallback);
            } catch (java.lang.Exception unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnNetworkMonitorService", "missing the appropriate permissions");
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        super.mo836xb8969aab(context);
        if (this.f152508e.get() && this.f152508e.compareAndSet(true, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnNetworkMonitorService", "stop network monitor");
            gm0.j1.n().d(this.f152509f);
            android.content.Context context2 = this.f152507d;
            if (context2 != null) {
                try {
                    context2.unregisterReceiver(this.f152510g);
                } catch (java.lang.IllegalArgumentException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnNetworkMonitorService", "unregisterReceiver failed: " + e17.getMessage());
                }
            }
            android.net.ConnectivityManager.NetworkCallback networkCallback = this.f152511h;
            if (!fp.h.a(21)) {
                android.content.Context context3 = this.f152507d;
                if (context3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnNetworkMonitorService", "unregisterNetworkTypeCallback: networkContext is null");
                } else {
                    try {
                        ((android.net.ConnectivityManager) context3.getSystemService("connectivity")).unregisterNetworkCallback(networkCallback);
                    } catch (java.lang.IllegalArgumentException e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnNetworkMonitorService", "unregisterNetworkCallback failed: " + e18.getMessage());
                    }
                }
            }
        }
        this.f152507d = null;
    }
}
