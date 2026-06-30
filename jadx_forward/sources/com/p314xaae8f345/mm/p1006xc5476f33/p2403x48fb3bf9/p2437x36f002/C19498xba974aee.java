package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/util/WebViewControllerPreloadMrg;", "", "<init>", "()V", "webview-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg */
/* loaded from: classes8.dex */
public final class C19498xba974aee {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee f269264a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f269265b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f269266c = new java.util.concurrent.ConcurrentHashMap();

    private C19498xba974aee() {
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee c19498xba974aee, final java.lang.String url, final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 controller, boolean z17, int i17, int i18, int i19, boolean z18, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            z17 = true;
        }
        if ((i27 & 8) != 0) {
            i17 = -1;
        }
        if ((i27 & 16) != 0) {
            i18 = -1;
        }
        if ((i27 & 32) != 0) {
            i19 = 80;
        }
        if ((i27 & 64) != 0) {
            z18 = true;
        }
        synchronized (c19498xba974aee) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
            if (!c19498xba974aee.c(url)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewControllerPreloadMrg", "addToCache, url=" + url + " has cached!");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewControllerPreloadMrg", "addToCache ".concat(url));
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f269265b;
            controller.M = z18;
            if (com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.x0()) {
                android.content.Context m81400x569210f3 = controller.f263449a.m81400x569210f3();
                if (m81400x569210f3 instanceof android.app.Activity) {
                    android.view.View decorView = ((android.app.Activity) m81400x569210f3).getWindow().getDecorView();
                    android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
                    if (viewGroup != null) {
                        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(m81400x569210f3);
                        frameLayout.setVisibility(4);
                        frameLayout.addView(controller.f263449a);
                        viewGroup.addView(frameLayout, 0);
                    }
                }
            }
            if (i17 <= 0) {
                i17 = i65.a.B(controller.f263449a.getContext());
            }
            int k17 = i65.a.k(controller.f263449a.getContext());
            if (i18 <= 0) {
                i18 = z17 ? (int) (k17 * 0.75d) : k17;
            }
            controller.f263449a.mo120188x874abeed(i17, i18);
            controller.f263449a.mo81410x6fd49b97(new com.p314xaae8f345.p3210x3857dc.s0() { // from class: com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg$addToCache$1$2
                @Override // com.p314xaae8f345.p3210x3857dc.s0
                public void o(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, java.lang.String str) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0.this.f263479p = str;
                }
            });
            pw4.c cVar = controller.f263471l;
            cVar.f440246b = z17;
            cVar.f440261q = true;
            controller.D(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3() { // from class: com.tencent.mm.plugin.webview.util.WebViewControllerPreloadMrg$addToCache$1$3
                @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3
                public void e() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0.this;
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m6 m6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m6(new java.lang.ref.WeakReference(r0Var));
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.f269266c.put(url, m6Var);
                        nw4.n g07 = r0Var.g0();
                        if (g07 != null) {
                            g07.f422433n = m6Var;
                        }
                        r0Var.e0().rg(m6Var, r0Var.U());
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewControllerPreloadMrg", th6, "addToCache exception", new java.lang.Object[0]);
                    }
                    r0Var.L0(this);
                }
            });
            controller.q0();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", url);
            intent.putExtra("useJs", true);
            intent.putExtra("geta8key_scene", i19);
            controller.j(intent);
            concurrentHashMap.put(url, controller);
        }
    }

    public final synchronized int b() {
        int size;
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : f269265b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) entry.getValue();
            boolean z17 = false;
            if (r0Var != null && !r0Var.K) {
                z17 = true;
            }
            if (z17 && r0Var.M) {
                r0Var.f263449a.mo52095x5cd39ffa();
                r0Var.D0();
                linkedList.add(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewControllerPreloadMrg", "destroy " + str);
            }
        }
        size = f269265b.size();
        for (java.lang.String str2 : linkedList) {
            f269266c.remove(str2);
            f269265b.remove(str2);
        }
        return size;
    }

    public final boolean c(java.lang.String url) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f269265b;
        if (concurrentHashMap.size() <= 2) {
            return concurrentHashMap.get(url) == null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewControllerPreloadMrg", "shouldPreload, do not cache more than 2 WebViewController!!!");
        return false;
    }
}
