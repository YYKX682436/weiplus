package oy1;

/* loaded from: classes13.dex */
public abstract class l implements ez1.a {

    /* renamed from: d, reason: collision with root package name */
    public android.net.ConnectivityManager.NetworkCallback f431416d;

    public l() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233>(a0Var) { // from class: com.tencent.mm.plugin.datareport.cgi.newreport.BaseCgiReporter$exptIListener$1
            {
                this.f39173x3fe91575 = -31521245;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 c5386xed4ad233) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5386xed4ad233 event = c5386xed4ad233;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                oy1.l.this.d("expt_change");
                return false;
            }
        }.mo48813x58998cd();
    }

    public final void a(android.content.Context context) {
        if (this.f431416d == null) {
            if (context == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            java.lang.Object systemService = context != null ? context.getSystemService("connectivity") : null;
            android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    oy1.j jVar = new oy1.j(this, connectivityManager);
                    this.f431416d = jVar;
                    connectivityManager.requestNetwork(new android.net.NetworkRequest.Builder().build(), jVar);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCgiReport", "check on line err " + e17);
                    try {
                        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f431416d;
                        if (networkCallback != null) {
                            connectivityManager.unregisterNetworkCallback(networkCallback);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    this.f431416d = null;
                }
            }
        }
    }

    public final void b() {
        ((ku5.t0) ku5.t0.f394148d).l(new oy1.k(this), 1000L, "MicroMsg.BaseCgiReport");
    }

    @Override // ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
    }

    public abstract void c(int i17, java.util.List list, boolean z17);

    public abstract void d(java.lang.String str);

    public abstract void e(boolean z17);

    public void f(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ez1.g.f339373i.Y(this);
            java.lang.Object systemService = context.getSystemService("connectivity");
            android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    android.net.ConnectivityManager.NetworkCallback networkCallback = this.f431416d;
                    if (networkCallback != null) {
                        connectivityManager.unregisterNetworkCallback(networkCallback);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }
}
