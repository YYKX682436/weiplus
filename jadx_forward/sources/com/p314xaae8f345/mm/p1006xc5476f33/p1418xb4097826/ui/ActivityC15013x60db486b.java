package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderBlackListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lzy2/gc;", "Lr45/kh2;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderBlackListUI */
/* loaded from: classes3.dex */
public final class ActivityC15013x60db486b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa implements zy2.gc {
    public static final /* synthetic */ int D = 0;
    public android.view.View A;
    public android.view.View B;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ListView f210047t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f210048u;

    /* renamed from: x, reason: collision with root package name */
    public boolean f210051x;

    /* renamed from: y, reason: collision with root package name */
    public rl5.r f210052y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f210053z;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e f210049v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e(this);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f210050w = new java.util.ArrayList();
    public final java.lang.Runnable C = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.d1(this);

    public final void c7() {
        android.view.View view = this.A;
        if (view != null) {
            view.removeCallbacks(this.C);
        }
        android.view.View view2 = this.A;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "dismissLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "dismissLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void d7() {
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f210053z;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        new bq.c0(gVar, xy2.c.d(mo55332x76847179)).l().q(new cq.d0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.f1(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.h1(this)));
    }

    public final void e7() {
        c7();
        android.view.View view = this.B;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderBlackListUI", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f210050w.isEmpty()) {
            android.widget.TextView textView = this.f210048u;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
            textView.setVisibility(0);
            android.widget.TextView textView2 = this.f210048u;
            if (textView2 != null) {
                textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmk));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
                throw null;
            }
        }
        android.widget.ListView listView = this.f210047t;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView.setVisibility(0);
        android.widget.TextView textView3 = this.f210048u;
        if (textView3 != null) {
            textView3.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyTip");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqn));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ceg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f210047t = (android.widget.ListView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dft);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f210048u = (android.widget.TextView) findViewById2;
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.i1(this));
        this.f210052y = new rl5.r(this);
        android.widget.ListView listView = this.f210047t;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e eVar = this.f210049v;
        listView.setAdapter((android.widget.ListAdapter) eVar);
        android.widget.ListView listView2 = this.f210047t;
        if (listView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView2.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.j1(this));
        eVar.f210617g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.k1(this);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.oai);
        this.A = findViewById3;
        if (findViewById3 != null) {
            findViewById3.postDelayed(this.C, 400L);
        }
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.oav);
        this.B = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.l1(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        d7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m1(ret, this, req));
    }
}
