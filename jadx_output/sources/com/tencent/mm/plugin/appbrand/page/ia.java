package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class ia implements com.tencent.mm.plugin.appbrand.jsapi.s {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f86757a;

    /* renamed from: e, reason: collision with root package name */
    public float[] f86761e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f86762f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.qd f86763g;

    /* renamed from: h, reason: collision with root package name */
    public xi1.m f86764h;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.gb f86766j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView f86767k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.FrameLayout f86768l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.kb f86769m;

    /* renamed from: d, reason: collision with root package name */
    public int f86760d = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f86765i = -1;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f86758b = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Deque f86759c = new java.util.concurrent.ConcurrentLinkedDeque();

    public ia(android.view.ViewGroup viewGroup) {
        this.f86757a = viewGroup;
        this.f86762f = new android.view.View(viewGroup.getContext());
    }

    public static void d(com.tencent.mm.plugin.appbrand.page.ia iaVar) {
        iaVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) iaVar.f86759c).iterator();
        while (it.hasNext()) {
            linkedList.add((com.tencent.mm.plugin.appbrand.page.ha) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            iaVar.s(((com.tencent.mm.plugin.appbrand.page.ha) it6.next()).f86682b);
        }
        linkedList.clear();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.s
    public c01.l2 a(int i17) {
        return c01.n2.d().e(hashCode() + "#" + i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.s
    public c01.l2 b(int i17, boolean z17) {
        return c01.n2.d().c(hashCode() + "#" + i17, z17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.s
    public boolean c(android.view.View view, int i17, int i18, float[] fArr, int i19, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.appbrand.page.aa aaVar = new com.tencent.mm.plugin.appbrand.page.aa(this, 1000L, java.lang.Boolean.FALSE, view, i17, i18, fArr, i19, z17, z18, z19);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) aaVar.a(null)).booleanValue() : ((java.lang.Boolean) aaVar.a(this.f86758b)).booleanValue();
    }

    public boolean e(android.view.View view, int i17, int i18, float[] fArr, int i19, boolean z17) {
        return f(view, i17, i18, fArr, i19, z17, false);
    }

    public boolean f(android.view.View view, int i17, int i18, float[] fArr, int i19, boolean z17, boolean z18) {
        return c(view, i17, i18, fArr, i19, z17, z18, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(android.view.View view, int i17, int i18, float[] fArr, int i19, boolean z17, boolean z18, boolean z19) {
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque;
        android.view.ViewGroup.LayoutParams layoutParams;
        int i27;
        float f17;
        float f18;
        float f19;
        float f27;
        if (view == null || fArr == null || fArr.length < 5) {
            return false;
        }
        android.view.ViewGroup n17 = n(i18, z18, z19);
        if (n17 == 0 || o(i17) != null) {
            return false;
        }
        float f28 = fArr[0];
        float f29 = fArr[1];
        float f37 = fArr[2];
        float f38 = fArr[3];
        float f39 = fArr[4];
        int i28 = java.lang.Float.isNaN(f39) ? 0 : (int) f39;
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.view.ViewGroup.LayoutParams((int) f37, (int) f38);
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = (java.util.concurrent.ConcurrentLinkedDeque) this.f86759c;
        java.util.Iterator it = concurrentLinkedDeque2.iterator();
        int i29 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.ha haVar = (com.tencent.mm.plugin.appbrand.page.ha) it.next();
            if (i18 == haVar.f86683c && i28 >= haVar.f86684d) {
                i29++;
            }
        }
        if (i29 < 0) {
            i29 = 0;
        }
        int targetViewChildCount = n17 instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.s0 ? ((com.tencent.mm.plugin.appbrand.jsapi.coverview.s0) n17).getTargetViewChildCount() : n17.getChildCount();
        int i37 = i29 > targetViewChildCount ? targetViewChildCount : i29;
        if (i19 >= 0) {
            int i38 = i19 == 0 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i38));
            java.util.Collections.reverse(arrayList);
            concurrentLinkedDeque = concurrentLinkedDeque2;
            layoutParams = layoutParams2;
            i27 = i28;
            f17 = f29;
            f18 = f28;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandWebViewCustomViewContainer", "addViewImpl", "(Landroid/view/View;II[FIZZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandWebViewCustomViewContainer", "addViewImpl", "(Landroid/view/View;II[FIZZZ)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            concurrentLinkedDeque = concurrentLinkedDeque2;
            layoutParams = layoutParams2;
            i27 = i28;
            f17 = f29;
            f18 = f28;
        }
        n17.addView(view, i37, layoutParams);
        com.tencent.mm.plugin.appbrand.page.ha haVar2 = new com.tencent.mm.plugin.appbrand.page.ha(view, i17, i18, i27, z17, z18, z19);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "addViewInfo: [%d, %d]", java.lang.Integer.valueOf(haVar2.f86682b), java.lang.Integer.valueOf(haVar2.f86683c));
        concurrentLinkedDeque.add(haVar2);
        if (i18 == 0 && (n17 instanceof com.tencent.mm.plugin.appbrand.page.sd) && z17) {
            com.tencent.mm.plugin.appbrand.page.ga gaVar = new com.tencent.mm.plugin.appbrand.page.ga(null);
            gaVar.f86641a = view;
            gaVar.f86642b = f18;
            float f47 = f17;
            gaVar.f86643c = f47;
            android.view.ViewGroup viewGroup = this.f86757a;
            gaVar.f86644d = viewGroup.getScrollX();
            float scrollY = viewGroup.getScrollY();
            f19 = f18 + gaVar.f86644d;
            f27 = f47 + scrollY;
            ((com.tencent.mm.plugin.appbrand.page.sd) n17).k(gaVar);
            haVar2.f86688h = gaVar;
        } else {
            f19 = f18;
            f27 = f17;
        }
        view.setX(f19);
        view.setY(f27);
        return true;
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "clear: ");
        java.util.Deque deque = this.f86759c;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) deque).iterator();
        while (it.hasNext()) {
            c01.l2 a17 = a(((com.tencent.mm.plugin.appbrand.page.ha) it.next()).f86682b);
            if (a17 != null) {
                a17.h();
            }
        }
        ((java.util.concurrent.ConcurrentLinkedDeque) deque).clear();
    }

    public boolean i(int i17, com.tencent.mm.plugin.appbrand.page.qd qdVar, int i18) {
        com.tencent.mm.plugin.appbrand.page.ea eaVar = new com.tencent.mm.plugin.appbrand.page.ea(this, 1000L, java.lang.Boolean.FALSE, i17, qdVar, i18);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) eaVar.a(null)).booleanValue() : ((java.lang.Boolean) eaVar.a(this.f86758b)).booleanValue();
    }

    public boolean j(int i17) {
        com.tencent.mm.plugin.appbrand.page.fa faVar = new com.tencent.mm.plugin.appbrand.page.fa(this, 1000L, java.lang.Boolean.FALSE, i17);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) faVar.a(null)).booleanValue() : ((java.lang.Boolean) faVar.a(this.f86758b)).booleanValue();
    }

    public final java.util.List k(com.tencent.mm.plugin.appbrand.page.ha haVar) {
        int i17 = haVar.f86683c;
        int i18 = haVar.f86682b;
        if (i17 == i18) {
            return new java.util.LinkedList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) this.f86759c).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.ha haVar2 = (com.tencent.mm.plugin.appbrand.page.ha) it.next();
            if (i18 == haVar2.f86683c && haVar.f86683c != haVar2.f86682b) {
                linkedList.addAll(k(haVar2));
            }
        }
        linkedList.add(haVar);
        return linkedList;
    }

    public int l(int i17) {
        com.tencent.mm.plugin.appbrand.page.ha p17;
        int i18;
        if (i17 == 0 || (p17 = p(i17)) == null) {
            return -1;
        }
        android.view.View view = (android.view.View) p17.f86681a.get();
        if (view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) {
            boolean z17 = ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).f80634o;
            if (z17) {
                return p17.f86682b;
            }
            if (!z17 && (i18 = p17.f86683c) > 0) {
                return l(i18);
            }
        }
        return -1;
    }

    public android.view.ViewGroup m() {
        if (this.f86767k == null) {
            com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView appBrandPageFullScreenView = new com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView(this.f86757a.getContext());
            this.f86767k = appBrandPageFullScreenView;
            com.tencent.mm.plugin.appbrand.page.gb gbVar = this.f86766j;
            if (gbVar != null) {
                gbVar.a(appBrandPageFullScreenView);
            }
        }
        return this.f86767k;
    }

    public final android.view.ViewGroup n(int i17, boolean z17, boolean z18) {
        android.view.ViewGroup viewGroup = this.f86757a;
        if (z18) {
            if (this.f86768l == null) {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
                this.f86768l = frameLayout;
                com.tencent.mm.plugin.appbrand.page.kb kbVar = this.f86769m;
                if (kbVar != null) {
                    ce.s sVar = (ce.s) kbVar;
                    if (frameLayout.getParent() == null) {
                        sVar.f40722a.f40685f.addView(frameLayout, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
            return this.f86768l;
        }
        if (z17) {
            return m();
        }
        if (i17 == 0) {
            return viewGroup;
        }
        com.tencent.mm.plugin.appbrand.page.ha p17 = p(i17);
        if (p17 == null) {
            return null;
        }
        android.view.View view = (android.view.View) p17.f86681a.get();
        if ((view instanceof com.tencent.mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView) && (view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.t0) && (view instanceof android.view.ViewGroup)) {
            return (android.view.ViewGroup) ((com.tencent.mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView) view).d(com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView.class);
        }
        if ((view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.t0) && (view instanceof android.view.ViewGroup)) {
            return (android.view.ViewGroup) view;
        }
        return null;
    }

    public android.view.View o(int i17) {
        com.tencent.mm.plugin.appbrand.page.ha p17 = p(i17);
        if (p17 == null) {
            return null;
        }
        return (android.view.View) p17.f86681a.get();
    }

    public final com.tencent.mm.plugin.appbrand.page.ha p(int i17) {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) this.f86759c).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.ha haVar = (com.tencent.mm.plugin.appbrand.page.ha) it.next();
            if (haVar.f86682b == i17) {
                return haVar;
            }
        }
        return null;
    }

    public boolean q(int i17) {
        com.tencent.mm.plugin.appbrand.page.ha p17;
        int i18;
        if (i17 == 0 || (p17 = p(i17)) == null) {
            return false;
        }
        android.view.View view = (android.view.View) p17.f86681a.get();
        if (view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) {
            boolean z17 = ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).f80634o;
            if (z17) {
                return true;
            }
            if (!z17 && (i18 = p17.f86683c) > 0) {
                return q(i18);
            }
        }
        return false;
    }

    public boolean r(int i17) {
        com.tencent.mm.plugin.appbrand.page.ba baVar = new com.tencent.mm.plugin.appbrand.page.ba(this, 1000L, java.lang.Boolean.FALSE, i17);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) baVar.a(null)).booleanValue() : ((java.lang.Boolean) baVar.a(this.f86758b)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s(int i17) {
        com.tencent.mm.plugin.appbrand.page.ha p17 = p(i17);
        if (p17 == null) {
            return false;
        }
        if (i17 == this.f86760d && p(i17) != null) {
            this.f86764h.g();
        }
        u(p17);
        int i18 = p17.f86683c;
        android.view.ViewGroup n17 = n(i18, p17.f86686f, p17.f86687g);
        if (n17 == 0) {
            return false;
        }
        t(p17);
        n17.removeView((android.view.View) p17.f86681a.get());
        if (i18 != 0 || !(n17 instanceof com.tencent.mm.plugin.appbrand.page.sd) || !p17.f86685e) {
            return true;
        }
        ((com.tencent.mm.plugin.appbrand.page.sd) n17).e(p17.f86688h);
        return true;
    }

    public final void t(com.tencent.mm.plugin.appbrand.page.ha haVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "removeViewInfo: [%d, %d]", java.lang.Integer.valueOf(haVar.f86682b), java.lang.Integer.valueOf(haVar.f86683c));
        ((java.util.concurrent.ConcurrentLinkedDeque) this.f86759c).remove(haVar);
    }

    public final void u(com.tencent.mm.plugin.appbrand.page.ha haVar) {
        try {
            java.util.Iterator it = k(haVar).iterator();
            while (it.hasNext()) {
                t((com.tencent.mm.plugin.appbrand.page.ha) it.next());
            }
        } catch (java.lang.StackOverflowError unused) {
            java.util.LinkedList linkedList = new java.util.LinkedList(this.f86759c);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "dumpViewInfoBeforeCrash: oops");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "dumpViewInfoBeforeCrash: root: [id] = %d [parent] = %d", java.lang.Integer.valueOf(haVar.f86682b), java.lang.Integer.valueOf(haVar.f86683c));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "==================ViewInfoListBegin==================");
            java.util.Iterator it6 = linkedList.iterator();
            int i17 = -1;
            while (it6.hasNext()) {
                com.tencent.mm.plugin.appbrand.page.ha haVar2 = (com.tencent.mm.plugin.appbrand.page.ha) it6.next();
                i17++;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "dumpViewInfoBeforeCrash: vi#%d [id] = %d [parent] = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(haVar2.f86682b), java.lang.Integer.valueOf(haVar2.f86683c));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "==================ViewInfoListEnd==================");
            com.tencent.mars.xlog.Log.appenderFlushSync();
            throw new java.lang.StackOverflowError();
        }
    }

    public void v(com.tencent.mm.plugin.appbrand.page.gb gbVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(gbVar != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "setFullScreenViewObtainer fullScreenViewAttacher:%b", objArr);
        this.f86766j = gbVar;
        com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView appBrandPageFullScreenView = this.f86767k;
        if (appBrandPageFullScreenView != null) {
            gbVar.a(appBrandPageFullScreenView);
        }
    }

    public boolean w(int i17, float[] fArr, int i18, java.lang.Boolean bool, java.lang.Boolean bool2) {
        com.tencent.mm.plugin.appbrand.page.da daVar = new com.tencent.mm.plugin.appbrand.page.da(this, 1000L, java.lang.Boolean.FALSE, i17, fArr, i18, bool, bool2);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) daVar.a(null)).booleanValue() : ((java.lang.Boolean) daVar.a(this.f86758b)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x(int i17, float[] fArr, int i18, java.lang.Boolean bool, java.lang.Boolean bool2) {
        if (this.f86765i == i17 || this.f86760d == i17) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.page.ha p17 = p(i17);
        if (p17 == null) {
            return false;
        }
        android.view.View view = (android.view.View) p17.f86681a.get();
        boolean z17 = p17.f86686f;
        boolean booleanValue = bool2 != null ? bool2.booleanValue() : z17;
        int i19 = p17.f86683c;
        android.view.ViewGroup n17 = n(i19, booleanValue, p17.f86687g);
        if (n17 == 0) {
            return false;
        }
        if (i18 >= 0) {
            int i27 = i18 == 0 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandWebViewCustomViewContainer", "updateViewImpl", "(I[FILjava/lang/Boolean;Ljava/lang/Boolean;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandWebViewCustomViewContainer", "updateViewImpl", "(I[FILjava/lang/Boolean;Ljava/lang/Boolean;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (fArr == null || fArr.length < 5) {
            return true;
        }
        float f17 = fArr[0];
        float f18 = fArr[1];
        float f19 = fArr[2];
        float f27 = fArr[3];
        float f28 = fArr[4];
        boolean isNaN = java.lang.Float.isNaN(f28);
        int i28 = p17.f86684d;
        int i29 = isNaN ? i28 : (int) f28;
        boolean z18 = p17.f86685e;
        boolean booleanValue2 = bool != null ? bool.booleanValue() : z18;
        if (i28 != i29 || z17 != booleanValue) {
            t(p17);
            n17.removeView(view);
            if (view.getParent() != null) {
                if (p17.f86688h != null && (view.getParent() instanceof com.tencent.mm.plugin.appbrand.page.sd)) {
                    ((com.tencent.mm.plugin.appbrand.page.sd) view.getParent()).e(p17.f86688h);
                }
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            if (g(view, i17, p17.f86683c, fArr, i18, booleanValue2, booleanValue, false)) {
                return true;
            }
            u(p17);
            return false;
        }
        com.tencent.mm.plugin.appbrand.page.ga gaVar = p17.f86688h;
        if (i19 == 0 && (n17 instanceof com.tencent.mm.plugin.appbrand.page.sd) && booleanValue2 != z18) {
            if (booleanValue2) {
                if (gaVar == null) {
                    gaVar = new com.tencent.mm.plugin.appbrand.page.ga(null);
                    gaVar.f86641a = view;
                    p17.f86688h = gaVar;
                }
                ((com.tencent.mm.plugin.appbrand.page.sd) n17).k(gaVar);
            } else {
                ((com.tencent.mm.plugin.appbrand.page.sd) n17).e(gaVar);
            }
        }
        if (gaVar != null) {
            gaVar.f86642b = f17;
            gaVar.f86643c = f18;
            android.view.ViewGroup viewGroup = this.f86757a;
            gaVar.f86644d = viewGroup.getScrollX();
            float scrollY = viewGroup.getScrollY();
            f17 += gaVar.f86644d;
            f18 += scrollY;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) f19;
        layoutParams.height = (int) f27;
        view.setX(f17);
        view.setY(f18);
        view.requestLayout();
        android.view.View view2 = this.f86762f;
        int indexOfChild = n17.indexOfChild(view2);
        if (n17.indexOfChild(view) != -1 || indexOfChild == -1) {
            return true;
        }
        n17.addView(view, indexOfChild);
        n17.removeView(view2);
        return true;
    }
}
