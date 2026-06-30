package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService */
/* loaded from: classes8.dex */
public class ServiceC19302xd3c5b06e extends android.app.Service implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int B = 0;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d A;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f265014d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.t0 f265015e = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.s(this);

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f265016f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f265017g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f265018h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f265019i;

    /* renamed from: m, reason: collision with root package name */
    public int f265020m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f265021n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 f265022o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 f265023p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0 f265024q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 f265025r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.s0 f265026s;

    /* renamed from: t, reason: collision with root package name */
    public uh4.i0 f265027t;

    /* renamed from: u, reason: collision with root package name */
    public m33.w1 f265028u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f265029v;

    /* renamed from: w, reason: collision with root package name */
    public int f265030w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f265031x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f265032y;

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f265033z;

    public ServiceC19302xd3c5b06e() {
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f265017g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.2
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e;
                java.util.Map map;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
                if ((c5886xd11a0be72 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7) && ((map = (serviceC19302xd3c5b06e = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.this).f265016f) == null || map.containsKey(c5886xd11a0be72.f136194g.f87901a))) {
                    java.util.Map map2 = serviceC19302xd3c5b06e.f265016f;
                    if (map2 != null) {
                        map2.remove(c5886xd11a0be72.f136194g.f87901a);
                    }
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6 s6Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a;
                    java.lang.String e17 = s6Var.e(c5886xd11a0be72);
                    int c17 = s6Var.c(c5886xd11a0be72);
                    int d17 = s6Var.d(c5886xd11a0be72);
                    try {
                        java.util.Iterator it = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
                            int i17 = c19336x1603547.f265329e;
                            if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.b(serviceC19302xd3c5b06e, c19336x1603547)) {
                                c19336x1603547.f265328d.t3(c5886xd11a0be72.f136194g.f87901a, e17, c17, d17);
                            }
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewStubService", e18, "", new java.lang.Object[0]);
                    }
                    com.p314xaae8f345.mm.vfs.w6.h(c5886xd11a0be72.f136194g.f87901a);
                }
                return false;
            }
        };
        this.f265018h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7>(a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.3
            {
                this.f39173x3fe91575 = 1700407223;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c72 = c5885x60bd3c7;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.this;
                java.util.Map map = serviceC19302xd3c5b06e.f265016f;
                if (map != null && !map.containsKey(c5885x60bd3c72.f136193g.f87811a)) {
                    return false;
                }
                java.util.Map map2 = serviceC19302xd3c5b06e.f265016f;
                if (map2 != null) {
                    map2.remove(c5885x60bd3c72.f136193g.f87811a);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubService", "delete qb recog fail: %s", c5885x60bd3c72.f136193g.f87811a);
                com.p314xaae8f345.mm.vfs.w6.h(c5885x60bd3c72.f136193g.f87811a);
                return false;
            }
        };
        this.f265019i = new java.util.ArrayList();
        this.f265020m = 0;
        this.f265029v = new java.util.HashSet();
        this.f265030w = -1;
        this.f265031x = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0>(this, a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.4
            {
                this.f39173x3fe91575 = 1121981664;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 c5795x6c1c62d0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5795x6c1c62d0 c5795x6c1c62d02 = c5795x6c1c62d0;
                java.lang.String str = c5795x6c1c62d02.f136104g.f89251a;
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268517a;
                android.os.Bundle bundle = new android.os.Bundle();
                am.qm qmVar = c5795x6c1c62d02.f136104g;
                bundle.putString("localFeedId", qmVar.f89251a);
                bundle.putBoolean("isLike", qmVar.f89252b);
                bundle.putBoolean("isFav", qmVar.f89254d);
                bundle.putInt("likeCount", qmVar.f89253c);
                bundle.putInt("favCount", qmVar.f89255e);
                bVar.b(bundle);
                return false;
            }
        };
        this.f265032y = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5793x280baadc>(this, a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.5
            {
                this.f39173x3fe91575 = 1342273228;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5793x280baadc c5793x280baadc) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "onExitFinderFullscreenEvent");
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268517a.d(2, c5793x280baadc);
                return false;
            }
        };
        this.f265033z = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5792x2373e800>(this, a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.6
            {
                this.f39173x3fe91575 = -97019376;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5792x2373e800 c5792x2373e800) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "onEnterFinderFullscreenEvent");
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268517a.d(1, c5792x2373e800);
                return false;
            }
        };
        this.A = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6269xaa0ef1b5>(a0Var) { // from class: com.tencent.mm.plugin.webview.stub.WebViewStubService.7
            {
                this.f39173x3fe91575 = 193090981;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6269xaa0ef1b5 c6269xaa0ef1b5) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6269xaa0ef1b5 c6269xaa0ef1b52 = c6269xaa0ef1b5;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(c6269xaa0ef1b52.f136518g.f88850b);
                am.m20 m20Var = c6269xaa0ef1b52.f136518g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "onImagePreviewPositionChanged pos: %s, webViewId: %s", valueOf, java.lang.Integer.valueOf(m20Var.f88849a));
                try {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putInt("key_webview_id", m20Var.f88849a);
                    bundle.putInt("key_image_pos", m20Var.f88850b);
                    java.util.Iterator it = ((java.util.ArrayList) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.this.f265019i).iterator();
                    while (it.hasNext()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next()).f265328d.mo70207xf5bc2045(121003, bundle);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewStubService", e17, "onImagePreviewPositionChanged exception", new java.lang.Object[0]);
                }
                return false;
            }
        };
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e, int i17, android.os.Bundle bundle, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var;
        java.util.Iterator it = ((java.util.ArrayList) serviceC19302xd3c5b06e.f265019i).iterator();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547 = null;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x16035472 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next();
            if (c19336x16035472 != null && c19336x16035472.f265329e == i18) {
                c19336x1603547 = c19336x16035472;
            }
        }
        if (c19336x1603547 == null || (z0Var = c19336x1603547.f265328d) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(serviceC19302xd3c5b06e, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b.class);
        intent.putExtras(bundle);
        intent.putExtra("proxyui_action_code_key", i17);
        intent.putExtra("webview_stub_callbacker_key", c19336x1603547);
        intent.putExtra("webview_binder_id", i18);
        intent.putExtra("screen_orientation", serviceC19302xd3c5b06e.f265030w);
        intent.addFlags(268435456);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.e(intent.getExtras(), "webview", ".stub.WebViewStubProxyUI", z0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.i0(serviceC19302xd3c5b06e, intent));
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e serviceC19302xd3c5b06e, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547 c19336x1603547) {
        serviceC19302xd3c5b06e.getClass();
        if (c19336x1603547 == null) {
            return false;
        }
        android.os.IBinder asBinder = c19336x1603547.f265328d.asBinder();
        return asBinder.isBinderAlive() && asBinder.pingBinder();
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "WebViewStubService onBind");
        return this.f265015e;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "WebViewStubService onCreate");
        this.f265021n = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f265022o = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.k0(this);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().a(this.f265022o);
        this.f265023p = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.l0(this);
        this.f265031x.mo48813x58998cd();
        this.f265024q = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.c0(this);
        this.f265032y.mo48813x58998cd();
        this.f265033z.mo48813x58998cd();
        this.f265025r = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.d0(this);
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268517a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0 listener = this.f265024q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268518b;
        synchronized (arrayList) {
            arrayList.size();
            arrayList.add(listener);
        }
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        bVar.a(this.f265025r);
        this.A.mo48813x58998cd();
        this.f265026s = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.e0(this);
        gm0.j1.n().a(this.f265026s);
        this.f265027t = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.f0(this);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).Kb(this.f265027t);
        if (gm0.j1.a() && com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj().b(this.f265023p);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.g0 g0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.g0(this);
        this.f265028u = g0Var;
        m33.s0.f404863a.add(g0Var);
    }

    @Override // android.app.Service
    public void onDestroy() {
        java.util.List list = this.f265019i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "WebViewStubService onDestroy");
        super.onDestroy();
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().s(this.f265022o);
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.i4 bj6 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.z.bj();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 m0Var = this.f265023p;
            java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f264471e;
            if (copyOnWriteArraySet != null && m0Var != null) {
                copyOnWriteArraySet.remove(m0Var);
            }
        }
        try {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19336x1603547) it.next()).f265328d.mo70207xf5bc2045(1000000, new android.os.Bundle());
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewStubService", e17, "onDestroy exception", new java.lang.Object[0]);
        }
        gm0.j1.n().d(this.f265026s);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(this.f265027t);
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268517a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k0 listener = this.f265024q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268518b;
        synchronized (arrayList) {
            arrayList.remove(listener);
        }
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 listener2 = this.f265025r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener2, "listener");
        java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.b.f268519c;
        synchronized (arrayList2) {
            arrayList2.remove(listener2);
        }
        this.f265031x.mo48814x2efc64();
        this.f265032y.mo48814x2efc64();
        this.f265033z.mo48814x2efc64();
        this.A.mo48814x2efc64();
        this.f265026s = null;
        this.f265022o = null;
        this.f265027t = null;
        ((java.util.ArrayList) list).clear();
        m33.w1 w1Var = this.f265028u;
        if (w1Var != null) {
            m33.s0.f404863a.remove(w1Var);
        } else {
            java.util.LinkedList linkedList = m33.s0.f404863a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0320 A[Catch: Exception -> 0x035f, TryCatch #0 {Exception -> 0x035f, blocks: (B:100:0x031c, B:102:0x0320, B:103:0x0328, B:104:0x032e, B:106:0x0334, B:108:0x033c, B:111:0x0341), top: B:99:0x031c }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0334 A[Catch: Exception -> 0x035f, TryCatch #0 {Exception -> 0x035f, blocks: (B:100:0x031c, B:102:0x0320, B:103:0x0328, B:104:0x032e, B:106:0x0334, B:108:0x033c, B:111:0x0341), top: B:99:0x031c }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0446 A[Catch: Exception -> 0x0481, TryCatch #5 {Exception -> 0x0481, blocks: (B:177:0x0442, B:179:0x0446, B:180:0x044e, B:181:0x0454, B:183:0x045a, B:185:0x0462, B:188:0x0467), top: B:176:0x0442 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x045a A[Catch: Exception -> 0x0481, TryCatch #5 {Exception -> 0x0481, blocks: (B:177:0x0442, B:179:0x0446, B:180:0x044e, B:181:0x0454, B:183:0x045a, B:185:0x0462, B:188:0x0467), top: B:176:0x0442 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02ff  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p944x882e457a.m1 r22) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ServiceC19302xd3c5b06e.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        android.util.SparseArray sparseArray;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubService", "WebViewStubService onUnbind");
        android.util.SparseArray sparseArray2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.f266770a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandlerHolder", "detach");
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.class) {
            int i17 = 0;
            while (true) {
                sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.f266770a;
                if (i17 >= sparseArray.size()) {
                    break;
                }
                sparseArray.keyAt(i17);
                i17++;
            }
            sparseArray.clear();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.f266771b != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.f266771b = null;
        }
        ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.c6.f264361a).clear();
        return super.onUnbind(intent);
    }
}
