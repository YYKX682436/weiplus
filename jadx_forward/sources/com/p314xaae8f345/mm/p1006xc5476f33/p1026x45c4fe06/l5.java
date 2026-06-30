package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public abstract class l5 extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc, xi1.g, xi1.i {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f165753d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f165754e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f165755f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f165756g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f165757h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 f165758i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f165759m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f165760n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc f165761o;

    /* renamed from: p, reason: collision with root package name */
    public xi1.p f165762p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k5 f165763q;

    public l5(android.content.Context context, java.lang.Class cls) {
        super(context);
        this.f165754e = true;
        this.f165759m = new java.util.LinkedList();
        this.f165760n = new java.util.HashMap();
        this.f165757h = this;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1(getContext(), this);
        this.f165758i = h1Var;
        addView(h1Var);
        this.f165761o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.h5(this);
        this.f165763q = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k5(0, 0, 0, 0);
        this.f165753d = context;
        this.f165756g = cls;
    }

    public void A() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "dispatchResume tid[%d], mResumed[%b]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Boolean.valueOf(this.f165754e));
        if (this.f165754e) {
            return;
        }
        this.f165754e = true;
        C(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i5(this));
    }

    public void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        if (!this.f165759m.contains(c11510xdd90c2f22)) {
            this.f165759m.push(c11510xdd90c2f22);
            if (this.f165757h.indexOfChild(c11510xdd90c2f22.f156343s) == -1) {
                m(c11510xdd90c2f22.f156343s);
            }
            ((java.util.HashMap) this.f165760n).remove(c11510xdd90c2f22.f156336n);
        }
        java.util.LinkedList linkedList = this.f165759m;
        linkedList.remove(c11510xdd90c2f22);
        linkedList.push(c11510xdd90c2f22);
        c11510xdd90c2f22.f156343s.setVisibility(0);
        android.widget.FrameLayout frameLayout = this.f165757h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar = c11510xdd90c2f22.f156343s;
        if (frameLayout.indexOfChild(qVar) == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "bringRtViewToTop: such runtime view does not exist");
        } else {
            frameLayout.bringChildToFront(qVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = this.f165758i;
            if (h1Var != null) {
                frameLayout.bringChildToFront(h1Var);
            }
            D();
            this.f165757h.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        }
        c11510xdd90c2f22.h0();
        c11510xdd90c2f22.f156337o = c11510xdd90c2f2;
        c11510xdd90c2f22.e0(c11808xe47dc718);
        if (c11510xdd90c2f2 != null) {
            c11510xdd90c2f2.f0();
            c11510xdd90c2f22.i0();
        }
    }

    public final void C(java.lang.Runnable runnable) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    public final void D() {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.g5(this));
            return;
        }
        android.widget.FrameLayout frameLayout = this.f165757h;
        this.f165763q.getClass();
        frameLayout.setPadding(0, 0, 0, 0);
    }

    @Override // xi1.i
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.C12547xf52fd300 c12547xf52fd300, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
    }

    @Override // xi1.i
    public android.view.ViewGroup.LayoutParams b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        return null;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this == ((xi1.g) obj) ? 0 : -1;
    }

    @Override // xi1.g, xi1.s
    /* renamed from: createFullscreenHandler */
    public xi1.m mo51609xe80d1173(xi1.k kVar) {
        return (xi1.m) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o1.a("Luggage.WXA.WindowFullscreenHandler.Dummy", xi1.m.class);
    }

    @Override // xi1.i
    public void d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c;
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 4 || (mo48805xd384d23c = mo48805xd384d23c()) == null || mo48805xd384d23c.L0()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        mo48805xd384d23c.Z0();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    /* renamed from: getActiveRuntime */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) this.f165759m.peek();
    }

    /* renamed from: getActivity */
    public final android.app.Activity m51610x19263085() {
        return q75.a.a(this.f165753d);
    }

    @Override // xi1.g
    /* renamed from: getNavigationBar */
    public xi1.e mo51611xad2f8da9() {
        return null;
    }

    @Override // xi1.g, xi1.s
    /* renamed from: getOrientationHandler */
    public xi1.p mo51612x60543150() {
        if (this.f165762p == null) {
            this.f165762p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.la(this);
        }
        return this.f165762p;
    }

    @Override // xi1.g
    /* renamed from: getSafeAreaInsets */
    public android.graphics.Rect mo51613x2ae93e46() {
        return null;
    }

    @Override // xi1.s
    /* renamed from: getScale */
    public float mo51614x7520af94() {
        return 1.0f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    /* renamed from: getStackSize */
    public int mo48806x666b03f3() {
        return this.f165759m.size();
    }

    @Override // xi1.s
    /* renamed from: getStatusBar */
    public xi1.f mo51615x8408480b() {
        return null;
    }

    @Override // xi1.g, xi1.s
    /* renamed from: getVDisplayMetrics */
    public android.util.DisplayMetrics mo48807xad90d981() {
        android.util.DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        android.util.DisplayMetrics displayMetrics2 = new android.util.DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k5 m51616x67006ed6 = m51616x67006ed6();
        int width = getWidth();
        m51616x67006ed6.getClass();
        displayMetrics2.widthPixels = width + 0 + 0;
        displayMetrics2.heightPixels = getHeight() + 0 + 0;
        return displayMetrics2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    /* renamed from: getWindowAndroid */
    public xi1.g mo48808xee5260a9() {
        return this;
    }

    /* renamed from: getWindowCompatInfo */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.k5 m51616x67006ed6() {
        return this.f165763q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2 == null) {
            throw new java.lang.NullPointerException("Null runtime");
        }
        java.util.ListIterator listIterator = this.f165759m.listIterator();
        boolean z17 = false;
        while (listIterator.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) listIterator.next();
            if (c11510xdd90c2f22 == c11510xdd90c2f2) {
                z17 = true;
            } else if (z17) {
                return c11510xdd90c2f22;
            }
        }
        if (z17) {
            return null;
        }
        throw new java.lang.IllegalAccessError(java.lang.String.format("Runtime not in stack %s", c11510xdd90c2f2.f156336n));
    }

    @Override // xi1.g
    /* renamed from: isInMultiWindowMode */
    public boolean mo51617xea4a57dd() {
        return false;
    }

    @Override // xi1.s
    /* renamed from: isLargeScreenWindow */
    public boolean mo51618xbcb3824d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        if (c11808xe47dc718 == null) {
            return;
        }
        C(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c5(this, c11510xdd90c2f2, c11808xe47dc718));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2 == null) {
            return;
        }
        this.f165759m.remove(c11510xdd90c2f2);
        ((java.util.HashMap) this.f165760n).remove(c11510xdd90c2f2.f156336n, c11510xdd90c2f2);
        android.view.ViewParent parent = c11510xdd90c2f2.f156343s.getParent();
        android.widget.FrameLayout frameLayout = this.f165757h;
        if (parent == frameLayout) {
            frameLayout.removeView(c11510xdd90c2f2.f156343s);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.q qVar) {
        android.widget.FrameLayout frameLayout = this.f165757h;
        int childCount = frameLayout.getChildCount();
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = this.f165758i;
        if (h1Var != null) {
            int childCount2 = frameLayout.getChildCount();
            if (childCount2 > 1 || (childCount2 == 1 && h1Var != null)) {
                i17 = childCount - 1;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "loadNewRtContentView: name = [%s], index = [%d]", qVar.getTag(), java.lang.Integer.valueOf(i17));
        if (qVar.getParent() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "loadNewRtContentView : parent is not null");
            ((android.view.ViewGroup) qVar.getParent()).removeView(qVar);
        }
        frameLayout.addView(qVar, i17);
        frameLayout.setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        D();
        mo48805xd384d23c().P(4, 1, this.f165761o);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public boolean n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        return this.f165759m.contains(c11510xdd90c2f2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2 == null) {
            return;
        }
        c11510xdd90c2f2.B1(this.f165761o);
        this.f165759m.remove(c11510xdd90c2f2);
        ((java.util.HashMap) this.f165760n).remove(c11510xdd90c2f2.f156336n, c11510xdd90c2f2);
    }

    @Override // xi1.g
    public boolean q5() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        if (c11510xdd90c2f2 == null) {
            return;
        }
        C(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.f5(this, c11510xdd90c2f2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
    }

    @Override // xi1.g, xi1.s
    /* renamed from: setSoftOrientation */
    public void mo51619xfa43b684(java.lang.String str) {
    }

    @Override // xi1.g
    /* renamed from: setWindowDescription */
    public void mo48810x4820daa(xi1.d dVar) {
    }

    @Override // xi1.g, xi1.s
    /* renamed from: shouldInLargeScreenCompatMode */
    public boolean mo51620x1ab1e3d4() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, java.lang.Object obj, java.lang.Runnable runnable) {
    }

    public final void u() {
        java.util.Iterator it = this.f165759m.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2) it.next();
            c11510xdd90c2f2.f156343s.setVisibility(8);
            ((java.util.HashMap) this.f165760n).put(c11510xdd90c2f2.f156336n, c11510xdd90c2f2);
            c11510xdd90c2f2.d1();
        }
        this.f165759m.clear();
    }

    public void w() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "dispatchPause tid[%d], mResumed[%b]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()), java.lang.Boolean.valueOf(this.f165754e));
        if (this.f165754e) {
            this.f165754e = false;
            C(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j5(this));
        }
    }
}
