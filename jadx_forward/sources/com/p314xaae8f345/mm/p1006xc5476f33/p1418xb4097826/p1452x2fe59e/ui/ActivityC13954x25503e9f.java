package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderFollowAggregationUI */
/* loaded from: classes2.dex */
public final class ActivityC13954x25503e9f extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f190778y = 0;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f190779t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f190780u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f190781v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f190782w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f190783x;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e7i;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            recreate();
            setResult(-1);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        findViewById(com.p314xaae8f345.mm.R.id.f78240xeb4d83f5).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.t2(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tf7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f190779t = findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.vbz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f190780u = findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.txz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f190781v = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.txy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f190782w = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f566564l5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f190783x = (android.widget.TextView) findViewById5;
        android.view.View view = this.f190779t;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchIcon");
            throw null;
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.u2(this));
        android.view.View view2 = this.f190779t;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchIcon");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowAggregationUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        dv2.v vVar = (dv2.v) pf5.z.f435481a.a(this).a(dv2.v.class);
        if (vVar == null) {
            throw new java.lang.IllegalStateException("FinderFollowAggregationTabUIC not registered".toString());
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = vVar.f325495z;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(j2Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.v2(this)), v65.m.b(this));
        p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(new p3325xe03a0797.p3326xc267989b.p3328x30012e.f2(j2Var, vVar.f325492w, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.w2(null)), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x2(this, null)), v65.m.b(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.remove(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class);
        set.addAll(kz5.z.D0(new java.lang.Class[]{dv2.v.class, hy2.f.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00.class}));
    }
}
