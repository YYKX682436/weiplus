package h6;

/* loaded from: classes13.dex */
public final class l implements android.content.ComponentCallbacks2, b6.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f360661d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f360662e;

    /* renamed from: f, reason: collision with root package name */
    public final b6.d f360663f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f360664g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f360665h;

    public l(r5.p imageLoader, android.content.Context context, boolean z17) {
        android.net.ConnectivityManager connectivityManager;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageLoader, "imageLoader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f360661d = context;
        this.f360662e = new java.lang.ref.WeakReference(imageLoader);
        int i17 = b6.d.f99653a;
        b6.d dVar = b6.a.f99652b;
        if (z17 && (connectivityManager = (android.net.ConnectivityManager) b3.l.m9714xac92a5d0(context, android.net.ConnectivityManager.class)) != null) {
            if (b3.l.m9698x3fed0563(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                try {
                    dVar = new b6.f(connectivityManager, this);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        this.f360663f = dVar;
        this.f360664g = dVar.a();
        this.f360665h = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f360661d.registerComponentCallbacks(this);
    }

    public final void a() {
        if (this.f360665h.getAndSet(true)) {
            return;
        }
        this.f360661d.unregisterComponentCallbacks(this);
        this.f360663f.mo9870xf5e80656();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        if (((r5.p) this.f360662e.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        jz5.f0 f0Var;
        r5.p pVar = (r5.p) this.f360662e.get();
        if (pVar == null) {
            f0Var = null;
        } else {
            a6.s sVar = pVar.f474092d;
            sVar.f83223a.a(i17);
            sVar.f83224b.a(i17);
            pVar.f474091c.a(i17);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            a();
        }
    }
}
