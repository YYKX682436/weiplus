package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ie extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f194495d;

    public ie(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f194495d = mgVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.lang.String j17;
        int i19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f194495d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = mgVar.C1().getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).y();
        ((mm2.x4) mgVar.P0(mm2.x4.class)).f411069q = y17;
        mm2.x4 x4Var = (mm2.x4) mgVar.P0(mm2.x4.class);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = mgVar.C1().getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        x4Var.f411070r = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).w();
        if (y17 < dk2.ef.K - 1) {
            long j18 = y17 + 1;
            long j19 = mgVar.I;
            if (j18 < j19) {
                j18 = j19;
            }
            mgVar.I = j18;
        } else {
            mgVar.I = ((mm2.c1) mgVar.P0(mm2.c1.class)).f410308a2;
        }
        if (y17 == mgVar.D.mo1894x7e414b06() - 1) {
            mgVar.f195038r.setVisibility(8);
            if (!mgVar.B) {
                mgVar.M1(true);
            }
        }
        dk2.t5 N6 = ((we2.s) mgVar.S0().a(we2.s.class)).N6();
        gk2.e buContext = mgVar.S0();
        int i27 = ((mm2.x4) mgVar.P0(mm2.x4.class)).f411070r;
        N6.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - N6.f315636b;
        if (N6.f315640f) {
            N6.f315640f = java.lang.System.currentTimeMillis() - N6.f315636b < ((long) N6.a());
        }
        boolean z18 = N6.f315640f && i27 >= (i19 = N6.f315637c) && i19 > 0;
        int i28 = N6.f315637c;
        if (!z18) {
            if (N6.f315639e && !N6.f315641g && i27 < i28) {
                N6.f315639e = false;
                yz5.p pVar = N6.f315642h;
                if (pVar != null) {
                    pVar.mo149xb9724478(java.lang.Integer.valueOf(i28), java.lang.Boolean.TRUE);
                }
            }
            N6.f315641g = false;
        } else if (!N6.f315639e) {
            mm2.x4 x4Var2 = (mm2.x4) buContext.a(mm2.x4.class);
            int i29 = N6.f315637c;
            java.util.List list = x4Var2.f411061f;
            int mo124533xfb85f7b0 = (i29 < 0 || i29 >= list.size()) ? Integer.MIN_VALUE : ((dk2.zf) list.get(N6.f315637c)).mo124533xfb85f7b0();
            if (mo124533xfb85f7b0 == 20031) {
                long a17 = ((long) N6.a()) - currentTimeMillis >= 5000 ? N6.a() - currentTimeMillis : 5000L;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentStickyHelper", "checkSticky do sticky stickyTime:" + a17 + " needStickyTime:" + N6.a());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                dk2.zf zfVar = (dk2.zf) kz5.n0.a0(list, N6.f315637c);
                if (zfVar != null && (j17 = zfVar.j()) != null) {
                    N6.f315641g = true;
                    N6.f315639e = true;
                    yz5.p pVar2 = N6.f315643i;
                    if (pVar2 != null) {
                        pVar2.mo149xb9724478(j17, java.lang.Integer.valueOf(N6.f315637c));
                    }
                }
                pm0.v.V(a17, new dk2.r5(N6));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveCommentStickyHelper", "checkSticky unexpected else. targetStickyCommentMsgIndex:" + N6.f315637c + " targetMsgType:" + mo124533xfb85f7b0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$6", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
