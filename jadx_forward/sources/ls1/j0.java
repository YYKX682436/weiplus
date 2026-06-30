package ls1;

/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ls1.j0 f402528a = new ls1.j0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f402529b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f402530c = new java.util.concurrent.ConcurrentHashMap();

    public static final void a(ls1.j0 j0Var, int i17) {
        synchronized (j0Var) {
            if (i17 == 6) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner]tmplParams: " + i17);
            r45.wm6 c17 = is1.l.c(i17);
            if (c17 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f402529b;
                if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplWebViewManager", "preload skip when exist:" + i17);
                } else {
                    ls1.e0 b17 = f402528a.b(c17, new android.content.MutableContextWrapper(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
                    if (b17 != null) {
                        concurrentHashMap.put(java.lang.Integer.valueOf(i17), b17);
                        ls1.g0 g0Var = new ls1.g0(i17, b17);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = b17.f263450a0;
                        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = (java.util.concurrent.ConcurrentLinkedDeque) concurrentHashMap2.get(-103);
                        if (concurrentLinkedDeque == null) {
                            concurrentLinkedDeque = new java.util.concurrent.ConcurrentLinkedDeque();
                            concurrentHashMap2.put(-103, concurrentLinkedDeque);
                        }
                        concurrentLinkedDeque.add(g0Var);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplWebViewManager", "preload:" + i17 + ", " + b17.U());
                    }
                }
            }
        }
    }

    public final ls1.e0 b(r45.wm6 wm6Var, android.content.MutableContextWrapper mutableContextWrapper) {
        int i17 = wm6Var.f470825d;
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner] empty tmplType %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wm6Var.f470827f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner] initUrl " + wm6Var.f470827f + " is empty");
            return null;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(wm6Var.f470828g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplWebViewManager", "[preloadWebViewInner] filePath %s isn't exist", wm6Var.f470828g);
            return null;
        }
        try {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59.F;
            com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.v0(mutableContextWrapper, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? "mm" : "tools", null);
            ls1.e0 e0Var = new ls1.e0(wm6Var, new ls1.f0(mutableContextWrapper));
            e0Var.q0();
            return e0Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplWebViewManager", "createWebView ex " + e17.getMessage());
            return null;
        }
    }

    public final ls1.e0 c(android.content.Context context, int i17, android.content.Intent intent, long j17) {
        ls1.e0 e0Var;
        synchronized (this) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f402530c;
            e0Var = (ls1.e0) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
            if (e0Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
                boolean z17 = false;
                if (e0Var.f263448J) {
                    java.lang.String stringExtra = intent.getStringExtra("rawUrl");
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra != null ? r26.i0.w(stringExtra, "http://", "https://", false) : null, e0Var.i())) {
                        z17 = true;
                    }
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplWebViewManager", "pick started:" + i17 + ", " + e0Var.U());
                    concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f402529b;
            e0Var = (ls1.e0) concurrentHashMap2.get(java.lang.Integer.valueOf(i17));
            if (e0Var != null) {
                if (e0Var.p0(-102)) {
                    concurrentHashMap2.remove(java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplWebViewManager", "pick cached:" + i17 + ", " + e0Var.U());
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplWebViewManager", "pick null when tmpl not ready:" + i17 + ", " + e0Var.U());
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Preload.TmplWebViewManager", "pick null:" + i17);
            e0Var = null;
        }
        if (e0Var == null) {
            return null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = e0Var.f263449a;
        c22633x83752a59.m81402xac35af48().a("onCreateStart", j17);
        c22633x83752a59.i(context);
        c22633x83752a59.m81402xac35af48().a("onCreateEnd", java.lang.System.currentTimeMillis());
        return e0Var;
    }

    public final void d(int i17) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k0.a().getBoolean("preload_tmpl_test_no_preload_next", false)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Preload.TmplWebViewManager", "tryPreloadTmplWebview:" + i17);
        pm0.v.X(new ls1.i0(i17));
    }
}
