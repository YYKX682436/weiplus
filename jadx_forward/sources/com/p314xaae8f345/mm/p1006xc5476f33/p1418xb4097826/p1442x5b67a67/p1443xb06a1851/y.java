package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851;

/* loaded from: classes2.dex */
public final class y extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.d9 {

    /* renamed from: d, reason: collision with root package name */
    public long f186719d;

    /* renamed from: e, reason: collision with root package name */
    public long f186720e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f186721f;

    /* renamed from: g, reason: collision with root package name */
    public gx2.q f186722g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f186723h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f186724i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f186725m;

    /* renamed from: n, reason: collision with root package name */
    public gx2.q f186726n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f186727o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f186728p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f186729q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f186724i = m158354x19263085().getIntent().getBooleanExtra("native_drama_open_drawer", false);
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f186728p = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209289id).mo141623x754a37bb()).r()).booleanValue();
        this.f186729q = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void O6() {
        if (this.f186722g == null) {
            android.view.View decorView = m158354x19263085().getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.i iVar = null;
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup == null) {
                return;
            }
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(m80379x76847179());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(com.p314xaae8f345.mm.R.id.tfd);
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            this.f186723h = frameLayout;
            int k17 = i65.a.k(m80379x76847179()) + com.p314xaae8f345.mm.ui.bk.p(m80379x76847179());
            float a17 = kx2.a.f394811a.a(m80379x76847179());
            float dimension = m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561259di);
            float f17 = k17 * a17;
            if (dimension < f17) {
                dimension = f17;
            }
            gx2.a aVar = new gx2.a();
            aVar.f358870c = dimension;
            aVar.f358871d = new hx2.g(m80379x76847179(), 0, 0, 0, false, false, 62, null);
            android.widget.FrameLayout frameLayout2 = this.f186723h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout2);
            aVar.f358872e = new hx2.c(frameLayout2);
            aVar.f358873f = new hx2.b(m80379x76847179(), false, 2, iVar);
            aVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1443xb06a1851.q(this));
            this.f186722g = aVar.b(viewGroup);
        }
    }

    public final void P6() {
        gx2.q qVar = this.f186726n;
        if (qVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, null, false, null, 15, null);
        }
        gx2.q qVar2 = this.f186722g;
        if (qVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar2, false, null, false, null, 15, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        gx2.q qVar = this.f186726n;
        boolean z17 = false;
        if (qVar != null && qVar.isDrawerOpen) {
            if (qVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar, false, null, false, null, 15, null);
            }
            return true;
        }
        gx2.q qVar2 = this.f186722g;
        if (qVar2 != null && qVar2.isDrawerOpen) {
            z17 = true;
        }
        if (!z17) {
            return super.mo2274xbdc3c5dc();
        }
        if (qVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(qVar2, false, null, false, null, 15, null);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f186722g = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f186724i = m158354x19263085().getIntent().getBooleanExtra("native_drama_open_drawer", false);
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f186728p = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209289id).mo141623x754a37bb()).r()).booleanValue();
        this.f186729q = new java.util.concurrent.CopyOnWriteArrayList();
    }
}
