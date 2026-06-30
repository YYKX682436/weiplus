package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class ia implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f168290a;

    /* renamed from: e, reason: collision with root package name */
    public float[] f168294e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f168295f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.qd f168296g;

    /* renamed from: h, reason: collision with root package name */
    public xi1.m f168297h;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.gb f168299j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12498x9f7db235 f168300k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.FrameLayout f168301l;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.kb f168302m;

    /* renamed from: d, reason: collision with root package name */
    public int f168293d = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f168298i = -1;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f168291b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Deque f168292c = new java.util.concurrent.ConcurrentLinkedDeque();

    public ia(android.view.ViewGroup viewGroup) {
        this.f168290a = viewGroup;
        this.f168295f = new android.view.View(viewGroup.getContext());
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar) {
        iaVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) iaVar.f168292c).iterator();
        while (it.hasNext()) {
            linkedList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it.next());
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            iaVar.s(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it6.next()).f168215b);
        }
        linkedList.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s
    public c01.l2 a(int i17) {
        return c01.n2.d().e(hashCode() + "#" + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s
    public c01.l2 b(int i17, boolean z17) {
        return c01.n2.d().c(hashCode() + "#" + i17, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s
    public boolean c(android.view.View view, int i17, int i18, float[] fArr, int i19, boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.aa aaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.aa(this, 1000L, java.lang.Boolean.FALSE, view, i17, i18, fArr, i19, z17, z18, z19);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) aaVar.a(null)).booleanValue() : ((java.lang.Boolean) aaVar.a(this.f168291b)).booleanValue();
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
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = (java.util.concurrent.ConcurrentLinkedDeque) this.f168292c;
        java.util.Iterator it = concurrentLinkedDeque2.iterator();
        int i29 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha haVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it.next();
            if (i18 == haVar.f168216c && i28 >= haVar.f168217d) {
                i29++;
            }
        }
        if (i29 < 0) {
            i29 = 0;
        }
        int mo50865xfda7723f = n17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.s0 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.s0) n17).mo50865xfda7723f() : n17.getChildCount();
        int i37 = i29 > mo50865xfda7723f ? mo50865xfda7723f : i29;
        if (i19 >= 0) {
            int i38 = i19 == 0 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha haVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha(view, i17, i18, i27, z17, z18, z19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "addViewInfo: [%d, %d]", java.lang.Integer.valueOf(haVar2.f168215b), java.lang.Integer.valueOf(haVar2.f168216c));
        concurrentLinkedDeque.add(haVar2);
        if (i18 == 0 && (n17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd) && z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ga gaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ga(null);
            gaVar.f168174a = view;
            gaVar.f168175b = f18;
            float f47 = f17;
            gaVar.f168176c = f47;
            android.view.ViewGroup viewGroup = this.f168290a;
            gaVar.f168177d = viewGroup.getScrollX();
            float scrollY = viewGroup.getScrollY();
            f19 = f18 + gaVar.f168177d;
            f27 = f47 + scrollY;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd) n17).k(gaVar);
            haVar2.f168221h = gaVar;
        } else {
            f19 = f18;
            f27 = f17;
        }
        view.setX(f19);
        view.setY(f27);
        return true;
    }

    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "clear: ");
        java.util.Deque deque = this.f168292c;
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) deque).iterator();
        while (it.hasNext()) {
            c01.l2 a17 = a(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it.next()).f168215b);
            if (a17 != null) {
                a17.h();
            }
        }
        ((java.util.concurrent.ConcurrentLinkedDeque) deque).clear();
    }

    public boolean i(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.qd qdVar, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ea eaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ea(this, 1000L, java.lang.Boolean.FALSE, i17, qdVar, i18);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) eaVar.a(null)).booleanValue() : ((java.lang.Boolean) eaVar.a(this.f168291b)).booleanValue();
    }

    public boolean j(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fa faVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fa(this, 1000L, java.lang.Boolean.FALSE, i17);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) faVar.a(null)).booleanValue() : ((java.lang.Boolean) faVar.a(this.f168291b)).booleanValue();
    }

    public final java.util.List k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha haVar) {
        int i17 = haVar.f168216c;
        int i18 = haVar.f168215b;
        if (i17 == i18) {
            return new java.util.LinkedList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) this.f168292c).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha haVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it.next();
            if (i18 == haVar2.f168216c && haVar.f168216c != haVar2.f168215b) {
                linkedList.addAll(k(haVar2));
            }
        }
        linkedList.add(haVar);
        return linkedList;
    }

    public int l(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p17;
        int i18;
        if (i17 == 0 || (p17 = p(i17)) == null) {
            return -1;
        }
        android.view.View view = (android.view.View) p17.f168214a.get();
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) {
            boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).f162167o;
            if (z17) {
                return p17.f168215b;
            }
            if (!z17 && (i18 = p17.f168216c) > 0) {
                return l(i18);
            }
        }
        return -1;
    }

    public android.view.ViewGroup m() {
        if (this.f168300k == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12498x9f7db235 c12498x9f7db235 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12498x9f7db235(this.f168290a.getContext());
            this.f168300k = c12498x9f7db235;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.gb gbVar = this.f168299j;
            if (gbVar != null) {
                gbVar.a(c12498x9f7db235);
            }
        }
        return this.f168300k;
    }

    public final android.view.ViewGroup n(int i17, boolean z17, boolean z18) {
        android.view.ViewGroup viewGroup = this.f168290a;
        if (z18) {
            if (this.f168301l == null) {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
                this.f168301l = frameLayout;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.kb kbVar = this.f168302m;
                if (kbVar != null) {
                    ce.s sVar = (ce.s) kbVar;
                    if (frameLayout.getParent() == null) {
                        sVar.f122255a.f122218f.addView(frameLayout, 0, new android.view.ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
            return this.f168301l;
        }
        if (z17) {
            return m();
        }
        if (i17 == 0) {
            return viewGroup;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p17 = p(i17);
        if (p17 == null) {
            return null;
        }
        android.view.View view = (android.view.View) p17.f168214a.get();
        if ((view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12071xcd11487c) && (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.t0) && (view instanceof android.view.ViewGroup)) {
            return (android.view.ViewGroup) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12071xcd11487c) view).d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1082xe7814c81.C12070x7562ec09.class);
        }
        if ((view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.t0) && (view instanceof android.view.ViewGroup)) {
            return (android.view.ViewGroup) view;
        }
        return null;
    }

    public android.view.View o(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p17 = p(i17);
        if (p17 == null) {
            return null;
        }
        return (android.view.View) p17.f168214a.get();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p(int i17) {
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) this.f168292c).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha haVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it.next();
            if (haVar.f168215b == i17) {
                return haVar;
            }
        }
        return null;
    }

    public boolean q(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p17;
        int i18;
        if (i17 == 0 || (p17 = p(i17)) == null) {
            return false;
        }
        android.view.View view = (android.view.View) p17.f168214a.get();
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) {
            boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) view).f162167o;
            if (z17) {
                return true;
            }
            if (!z17 && (i18 = p17.f168216c) > 0) {
                return q(i18);
            }
        }
        return false;
    }

    public boolean r(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ba baVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ba(this, 1000L, java.lang.Boolean.FALSE, i17);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) baVar.a(null)).booleanValue() : ((java.lang.Boolean) baVar.a(this.f168291b)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p17 = p(i17);
        if (p17 == null) {
            return false;
        }
        if (i17 == this.f168293d && p(i17) != null) {
            this.f168297h.g();
        }
        u(p17);
        int i18 = p17.f168216c;
        android.view.ViewGroup n17 = n(i18, p17.f168219f, p17.f168220g);
        if (n17 == 0) {
            return false;
        }
        t(p17);
        n17.removeView((android.view.View) p17.f168214a.get());
        if (i18 != 0 || !(n17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd) || !p17.f168218e) {
            return true;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd) n17).e(p17.f168221h);
        return true;
    }

    public final void t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha haVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "removeViewInfo: [%d, %d]", java.lang.Integer.valueOf(haVar.f168215b), java.lang.Integer.valueOf(haVar.f168216c));
        ((java.util.concurrent.ConcurrentLinkedDeque) this.f168292c).remove(haVar);
    }

    public final void u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha haVar) {
        try {
            java.util.Iterator it = k(haVar).iterator();
            while (it.hasNext()) {
                t((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it.next());
            }
        } catch (java.lang.StackOverflowError unused) {
            java.util.LinkedList linkedList = new java.util.LinkedList(this.f168292c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "dumpViewInfoBeforeCrash: oops");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "dumpViewInfoBeforeCrash: root: [id] = %d [parent] = %d", java.lang.Integer.valueOf(haVar.f168215b), java.lang.Integer.valueOf(haVar.f168216c));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "==================ViewInfoListBegin==================");
            java.util.Iterator it6 = linkedList.iterator();
            int i17 = -1;
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha haVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha) it6.next();
                i17++;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "dumpViewInfoBeforeCrash: vi#%d [id] = %d [parent] = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(haVar2.f168215b), java.lang.Integer.valueOf(haVar2.f168216c));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "==================ViewInfoListEnd==================");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40530x65a4a38();
            throw new java.lang.StackOverflowError();
        }
    }

    public void v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.gb gbVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(gbVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWebViewCustomViewContainer", "setFullScreenViewObtainer fullScreenViewAttacher:%b", objArr);
        this.f168299j = gbVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12498x9f7db235 c12498x9f7db235 = this.f168300k;
        if (c12498x9f7db235 != null) {
            gbVar.a(c12498x9f7db235);
        }
    }

    public boolean w(int i17, float[] fArr, int i18, java.lang.Boolean bool, java.lang.Boolean bool2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.da daVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.da(this, 1000L, java.lang.Boolean.FALSE, i17, fArr, i18, bool, bool2);
        return java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread() ? ((java.lang.Boolean) daVar.a(null)).booleanValue() : ((java.lang.Boolean) daVar.a(this.f168291b)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean x(int i17, float[] fArr, int i18, java.lang.Boolean bool, java.lang.Boolean bool2) {
        if (this.f168298i == i17 || this.f168293d == i17) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p17 = p(i17);
        if (p17 == null) {
            return false;
        }
        android.view.View view = (android.view.View) p17.f168214a.get();
        boolean z17 = p17.f168219f;
        boolean booleanValue = bool2 != null ? bool2.booleanValue() : z17;
        int i19 = p17.f168216c;
        android.view.ViewGroup n17 = n(i19, booleanValue, p17.f168220g);
        if (n17 == 0) {
            return false;
        }
        if (i18 >= 0) {
            int i27 = i18 == 0 ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
        int i28 = p17.f168217d;
        int i29 = isNaN ? i28 : (int) f28;
        boolean z18 = p17.f168218e;
        boolean booleanValue2 = bool != null ? bool.booleanValue() : z18;
        if (i28 != i29 || z17 != booleanValue) {
            t(p17);
            n17.removeView(view);
            if (view.getParent() != null) {
                if (p17.f168221h != null && (view.getParent() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd) view.getParent()).e(p17.f168221h);
                }
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            if (g(view, i17, p17.f168216c, fArr, i18, booleanValue2, booleanValue, false)) {
                return true;
            }
            u(p17);
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ga gaVar = p17.f168221h;
        if (i19 == 0 && (n17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd) && booleanValue2 != z18) {
            if (booleanValue2) {
                if (gaVar == null) {
                    gaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ga(null);
                    gaVar.f168174a = view;
                    p17.f168221h = gaVar;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd) n17).k(gaVar);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd) n17).e(gaVar);
            }
        }
        if (gaVar != null) {
            gaVar.f168175b = f17;
            gaVar.f168176c = f18;
            android.view.ViewGroup viewGroup = this.f168290a;
            gaVar.f168177d = viewGroup.getScrollX();
            float scrollY = viewGroup.getScrollY();
            f17 += gaVar.f168177d;
            f18 += scrollY;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) f19;
        layoutParams.height = (int) f27;
        view.setX(f17);
        view.setY(f18);
        view.requestLayout();
        android.view.View view2 = this.f168295f;
        int indexOfChild = n17.indexOfChild(view2);
        if (n17.indexOfChild(view) != -1 || indexOfChild == -1) {
            return true;
        }
        n17.addView(view, indexOfChild);
        n17.removeView(view2);
        return true;
    }
}
