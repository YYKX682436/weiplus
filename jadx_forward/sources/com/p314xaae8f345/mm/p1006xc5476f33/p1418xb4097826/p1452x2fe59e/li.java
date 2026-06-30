package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class li implements fs2.c, ym5.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh f188827d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vh f188828e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f188829f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f188830g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f188831h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f188832i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f188833m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f188834n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f188835o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f188836p;

    /* renamed from: q, reason: collision with root package name */
    public rl5.r f188837q;

    /* renamed from: r, reason: collision with root package name */
    public final int f188838r;

    public li(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, android.view.View notifyView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh presenter, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.vh vhVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyView, "notifyView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f188827d = presenter;
        this.f188828e = vhVar;
        this.f188829f = true;
        this.f188830g = activity;
        this.f188831h = notifyView;
        this.f188838r = 100;
    }

    public static final java.lang.String l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar) {
        java.lang.String num;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = liVar.f188830g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) abstractActivityC21394xb3d2c0cf : null;
        return (abstractActivityC15087xee12defa == null || (num = java.lang.Integer.valueOf(abstractActivityC15087xee12defa.W6()).toString()) == null) ? "" : num;
    }

    @Override // ym5.l1
    public boolean a(int i17, int i18, int i19, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f188835o;
        if (c22627xa933f8e4 == null) {
            return false;
        }
        c22627xa933f8e4.b(i18 / ((int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561217cj)));
        return false;
    }

    @Override // ym5.l1
    public void g(int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f188835o;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.d();
        }
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f188830g;
    }

    @Override // ym5.l1
    public boolean j(int i17, int i18, int i19, boolean z17, boolean z18) {
        return false;
    }
}
