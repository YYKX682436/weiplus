package j7;

/* loaded from: classes13.dex */
public final class g implements j7.d {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f379539d;

    /* renamed from: e, reason: collision with root package name */
    public final j7.c f379540e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f379541f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f379542g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.BroadcastReceiver f379543h = new j7.f(this);

    public g(android.content.Context context, j7.c cVar) {
        this.f379539d = context.getApplicationContext();
        this.f379540e = cVar;
    }

    public boolean i(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) context.getSystemService("connectivity");
        q7.n.b(connectivityManager);
        try {
            android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (java.lang.RuntimeException unused) {
            android.util.Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    @Override // j7.k
    /* renamed from: onDestroy */
    public void mo15461xac79a11b() {
    }

    @Override // j7.k
    /* renamed from: onStart */
    public void mo15462xb05099c3() {
        if (this.f379542g) {
            return;
        }
        android.content.Context context = this.f379539d;
        this.f379541f = i(context);
        try {
            context.registerReceiver(this.f379543h, new android.content.IntentFilter(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be));
            this.f379542g = true;
        } catch (java.lang.SecurityException unused) {
            android.util.Log.isLoggable("ConnectivityMonitor", 5);
        }
    }

    @Override // j7.k
    /* renamed from: onStop */
    public void mo15463xc39f8281() {
        if (this.f379542g) {
            this.f379539d.unregisterReceiver(this.f379543h);
            this.f379542g = false;
        }
    }
}
