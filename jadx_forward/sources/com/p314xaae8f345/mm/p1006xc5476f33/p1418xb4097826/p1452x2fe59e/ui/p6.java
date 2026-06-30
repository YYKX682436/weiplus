package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class p6 implements fs2.c, tj5.w, tj5.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f191931d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 f191932e;

    /* renamed from: f, reason: collision with root package name */
    public final vb2.p f191933f;

    /* renamed from: g, reason: collision with root package name */
    public final int f191934g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f191935h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f191936i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f191937m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f191938n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f191939o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f191940p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 f191941q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f191942r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.c6 f191943s;

    /* renamed from: t, reason: collision with root package name */
    public final int f191944t;

    public p6(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.a6 presenter, vb2.p uiBinding, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiBinding, "uiBinding");
        this.f191931d = context;
        this.f191932e = presenter;
        this.f191933f = uiBinding;
        this.f191934g = i17;
        this.f191935h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.o6(this));
        this.f191936i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.m6(this));
        this.f191937m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.k6(this));
        this.f191938n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.j6(this));
        this.f191939o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.i6(this));
        this.f191940p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.n6(this));
        this.f191943s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.c6(this);
        this.f191944t = -1;
    }

    @Override // tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f191931d;
        if (L0) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f191941q;
            if (c22482x50bddb92 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            c22482x50bddb92.m80997xdc5215a6().m80989x764b0e09(activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572949d10));
        } else {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = this.f191941q;
            if (c22482x50bddb922 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            c22482x50bddb922.m80997xdc5215a6().m80989x764b0e09(activityC21401x6ce6f73f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572950d11));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            if (j()) {
                g().setVisibility(0);
            }
            ((android.widget.LinearLayout) ((jz5.n) this.f191939o).mo141623x754a37bb()).setVisibility(8);
            ((android.widget.TextView) ((jz5.n) this.f191938n).mo141623x754a37bb()).setVisibility(8);
            a().setVisibility(8);
        }
    }

    @Override // tj5.n
    public boolean G0() {
        this.f191931d.mo48674x36654fab();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f191941q;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        java.lang.String m80970x134c2d56 = c22482x50bddb92.m80997xdc5215a6().m80970x134c2d56();
        if (m80970x134c2d56 == null) {
            m80970x134c2d56 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m80970x134c2d56)) {
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb922 = this.f191941q;
            if (c22482x50bddb922 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
                throw null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c22482x50bddb922.m80997xdc5215a6().m80975xe175c322())) {
                return true;
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb923 = this.f191941q;
        if (c22482x50bddb923 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        java.util.List<tj5.x> m80975xe175c322 = c22482x50bddb923.m80997xdc5215a6().m80975xe175c322();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m80975xe175c322, "getTagList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m80975xe175c322, 10));
        for (tj5.x xVar : m80975xe175c322) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(xVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract.TagModel");
            arrayList.add((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b6) xVar);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String m75945x2fec8307 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.b6) it.next()).f191230d.f491863d.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            linkedList.add(m75945x2fec8307);
        }
        this.f191932e.h(m80970x134c2d56, linkedList);
        return true;
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f) ((jz5.n) this.f191936i).mo141623x754a37bb();
    }

    public final android.widget.LinearLayout g() {
        return (android.widget.LinearLayout) ((jz5.n) this.f191940p).mo141623x754a37bb();
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f191931d;
    }

    /* renamed from: getRecyclerView */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56636x4905e9fa() {
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) this.f191937m).mo141623x754a37bb();
    }

    public final boolean j() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f191932e.f191184e) && this.f191934g == 2;
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.w
    /* renamed from: onClickBackBtn */
    public void mo56568x81ab18cc(android.view.View view) {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f191931d;
        activityC21401x6ce6f73f.mo48674x36654fab();
        activityC21401x6ce6f73f.finish();
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22482x50bddb92 c22482x50bddb92 = this.f191941q;
        if (c22482x50bddb92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchView");
            throw null;
        }
        c22482x50bddb92.m80997xdc5215a6().m();
        this.f191931d.mo26063x7b383410();
    }
}
