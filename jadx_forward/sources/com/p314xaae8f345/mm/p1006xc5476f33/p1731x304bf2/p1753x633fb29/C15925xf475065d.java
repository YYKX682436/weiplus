package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener */
/* loaded from: classes8.dex */
public class C15925xf475065d extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991> {

    /* renamed from: f, reason: collision with root package name */
    public static volatile long f221713f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile long f221714g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile java.lang.String f221715h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Set f221716i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Set f221717m = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public long f221718d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w3 f221719e;

    @mk0.a
    /* renamed from: com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener$a */
    /* loaded from: classes8.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            if (bundle == null) {
                if (rVar != null) {
                    rVar.a(bundle);
                    return;
                }
                return;
            }
            java.lang.String string = bundle.getString("call_raw_url");
            boolean z17 = bundle.getBoolean("preload_webcore", false);
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload webcore");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload entrance url:%s, isToolsProcess:%b", string, java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.s()));
            if (com.p314xaae8f345.mm.p794xb0fa9b5e.d0.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload wepkg");
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.d().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t3(this, bundle, z17, rVar));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "prestart WepkgMainProcessService and preload wepkg");
                com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.a(string, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.v3(this, bundle, z17, rVar));
            }
        }
    }

    public C15925xf475065d() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f39173x3fe91575 = 1423904129;
    }

    public static void c(android.os.Bundle bundle, boolean z17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15925xf475065d.class) {
            boolean z18 = bundle.getBoolean("is_luggage", false);
            java.lang.String string = bundle.getString("call_raw_url");
            java.lang.String string2 = bundle.getString("float_layer_url");
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(string);
            if (z18) {
                sd.o0 c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.c(string);
                if (c17 != null) {
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "has preloaded webcore, return");
                    } else {
                        com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.q3(c17));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.v0.b(c17, string, true);
                    }
                    bundle.putBoolean("has_preload_webcore", true);
                    if (rVar != null) {
                        rVar.a(bundle);
                    }
                } else if (!z17) {
                    e(string2);
                    e(string);
                    if (rVar != null) {
                        rVar.a(bundle);
                    }
                } else {
                    if (b17.f149720t != 0) {
                        rVar.a(bundle);
                        return;
                    }
                    if (!e(string)) {
                        if (rVar != null) {
                            rVar.a(bundle);
                        }
                    } else {
                        e(string2);
                        b17.f149711h = 1;
                        b17.f149723w = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(939L, 0L, 1L);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1.e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.s1.class, string, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.s3(string, b17, rVar, bundle));
                    }
                }
            } else {
                e(string2);
                e(string);
                if (rVar != null) {
                    rVar.a(bundle);
                }
            }
        }
    }

    public static boolean e(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f(str)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preloadWePkg, url: %s", str);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc b17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.api.C10723x8ab106bc.b(str);
        b17.f149721u = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s c17 = vz4.s.c(str);
        b17.f149722v = java.lang.System.currentTimeMillis();
        return c17.f269928a == 0;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public /* bridge */ /* synthetic */ boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 c5756xf590b991) {
        d(c5756xf590b991);
        return false;
    }

    public boolean d(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 c5756xf590b991) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "callback, type = %d", java.lang.Integer.valueOf(c5756xf590b991.f136075g.f88966a));
        am.nl nlVar = c5756xf590b991.f136075g;
        if (nlVar.f88968c == null) {
            return false;
        }
        if (nlVar.f88966a == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval: %d, lastActionTime: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f221718d), java.lang.Long.valueOf(this.f221718d));
            if (java.lang.System.currentTimeMillis() - this.f221718d < 500) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval smaller than 500 ms, return");
                return false;
            }
        }
        this.f221718d = java.lang.System.currentTimeMillis();
        am.nl nlVar2 = c5756xf590b991.f136075g;
        int i17 = nlVar2.f88966a;
        if (i17 == 0 || i17 == 1 || i17 == 2) {
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(hashCode());
            objArr[2] = java.lang.Integer.valueOf(c5756xf590b991.hashCode());
            objArr[3] = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
            objArr[4] = java.lang.Boolean.valueOf(java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "on NotifyGameWebviewOperationListener operation listener, type:%d, hashcode:%s, event hashcode:%s, threadId:%s, isUIThead:%s", objArr);
            java.lang.String str = "";
            try {
                str = c5756xf590b991.f136075g.f88968c.getStringExtra("rawUrl");
            } catch (java.lang.Exception unused) {
            }
            java.lang.String stringExtra = c5756xf590b991.f136075g.f88968c.getStringExtra("game_float_layer_url");
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15925xf475065d.class) {
                java.lang.String str2 = f221715h;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equalsIgnoreCase(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "forbid to open same page two times");
                    return false;
                }
                f221715h = str;
                f221713f = java.lang.System.currentTimeMillis();
                f221714g = java.lang.System.currentTimeMillis();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "exist pkgid:%s, to reload", kh0.i.a(str));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(kk.k.g((str == null ? "" : str).getBytes()));
                    sb6.append("_");
                    sb6.append(java.lang.System.currentTimeMillis());
                    c5756xf590b991.f136075g.f88969d = sb6.toString();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w3 w3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.w3(this, c5756xf590b991);
                    this.f221719e = w3Var;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(w3Var, 500L);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("call_raw_url", str);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                        bundle.putString("float_layer_url", stringExtra);
                    }
                    if (c5756xf590b991.f136075g.f88966a == 2) {
                        bundle.putBoolean("is_luggage", true);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p.a(bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15925xf475065d.a.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.l3(this, c5756xf590b991));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "dont have pkgid or disable wepkg, normal turn page.");
                    f(c5756xf590b991, null);
                }
            }
        } else if (i17 == 3) {
            java.lang.String stringExtra2 = nlVar2.f88968c.getStringExtra("rawUrl");
            java.util.Set set = f221717m;
            if (!((java.util.HashSet) set).contains(stringExtra2) && com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f(stringExtra2)) {
                ((java.util.HashSet) set).add(stringExtra2);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("call_raw_url", stringExtra2);
                bundle2.putBoolean("preload_webcore", true);
                bundle2.putBoolean("is_luggage", true);
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p.a(bundle2, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.C15925xf475065d.a.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.m3(this, stringExtra2));
                com.p314xaae8f345.mm.p794xb0fa9b5e.w0.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.n3(this, stringExtra2), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
            }
        }
        return false;
    }

    public final synchronized void f(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5756xf590b991 c5756xf590b991, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turnPage");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f221719e);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o3(this), 1000L);
        if (c5756xf590b991 == null) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5756xf590b991.f136075g.f88969d)) {
            java.util.Set set = f221716i;
            if (((java.util.HashSet) set).contains(c5756xf590b991.f136075g.f88969d)) {
                ((java.util.HashSet) set).remove(c5756xf590b991.f136075g.f88969d);
                return;
            }
            ((java.util.HashSet) set).add(c5756xf590b991.f136075g.f88969d);
        }
        am.nl nlVar = c5756xf590b991.f136075g;
        android.content.Context context = nlVar.f88967b;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (nlVar.f88968c == null) {
            nlVar.f88968c = new android.content.Intent();
        }
        java.lang.String stringExtra = c5756xf590b991.f136075g.f88968c.getStringExtra("rawUrl");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turn page, start web ui, time: " + java.lang.System.currentTimeMillis());
        c5756xf590b991.f136075g.f88968c.putExtra("start_activity_time", java.lang.System.currentTimeMillis());
        am.nl nlVar2 = c5756xf590b991.f136075g;
        int i17 = nlVar2.f88966a;
        if (i17 == 0) {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", nlVar2.f88968c, null);
        } else if (i17 == 1) {
            j45.l.j(context, "webview", ".ui.tools.TransparentWebViewUI", nlVar2.f88968c, null);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p3(this, context, c5756xf590b991), bundle != null ? bundle.getBoolean("has_preload_webcore", false) : false ? 100L : 0L);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - f221713f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turn to GameWebViewUI time:%d", java.lang.Long.valueOf(currentTimeMillis));
        try {
            c5756xf590b991.f136075g.f88967b = null;
        } catch (java.lang.Exception unused) {
        }
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("preloadWebTime", stringExtra, kh0.i.a(stringExtra), null, -1L, currentTimeMillis, null);
    }
}
