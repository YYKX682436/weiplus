package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class z3 extends fc2.u {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f207020r;

    /* renamed from: s, reason: collision with root package name */
    public long f207021s;

    public z3(fc2.c cVar) {
        super(cVar);
        this.f207020r = "Finder.FinderSingleFeedFlowEventSubscriber";
        this.f207021s = -1L;
    }

    @Override // fc2.o
    public fc2.a c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        fc2.t tVar = (fc2.t) h(i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de != null) {
            tVar.f342519e = c1162x665295de.t();
            tVar.f342521g = c1162x665295de.x();
            tVar.f342520f = c1162x665295de.w();
            tVar.f342522h = c1162x665295de.y();
            tVar.f342523i = c1162x665295de.m8020x7e414b06();
            tVar.f342524j = i17;
            i95.m c17 = i95.n0.c(c61.yb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            int i19 = tVar.f342520f;
            int i27 = tVar.f342522h;
            java.util.Set otherCareType = hc2.o0.f361870b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(otherCareType, "otherCareType");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p0 g17 = hc2.f1.g(recyclerView, i19, i27, otherCareType);
            tVar.f342525k = g17.f183972b;
            tVar.f342526l = g17.f183973c;
            java.lang.String str = g17.f183974d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            tVar.f342528n = str;
            tVar.f342529o = g17.f183975e;
            so2.j5 j5Var = g17.f183979i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            if (abstractC14490x69736cb5 != null) {
                abstractC14490x69736cb5.n1(true);
            }
            tVar.f342527m = g17.f183977g;
        }
        fc2.w wVar = (fc2.w) tVar;
        wVar.f342533p = this.f207021s;
        wVar.f342534q = this.f342493e;
        wVar.f342535r = this.f342494f;
        android.graphics.Rect globalVisibleRect = this.f342492d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(globalVisibleRect, "globalVisibleRect");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = recyclerView.mo7946xf939df19();
        if ((mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) && (recyclerView.getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de)) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2).w();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager3, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int y17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager3).y();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207020r, "[getVisibleFeedListByAdapterPosRange] old=" + recyclerView.getChildCount() + " new=" + ((y17 - w17) + 1));
            if (w17 <= y17) {
                while (true) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = recyclerView.p0(w17);
                    if (p07 != null) {
                        android.view.View itemView = p07.f3639x46306858;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                        if (p07 instanceof in5.s0) {
                            in5.c cVar = (in5.c) ((in5.s0) p07).f374658i;
                            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19;
                            int a07 = w17 - c22848x6ddd90cf.a0();
                            if ((cVar instanceof so2.j5) && cVar.mo2128x1ed62e84() != 0) {
                                fc2.r rVar = new fc2.r((so2.j5) cVar, a07, null, 4, null);
                                boolean z17 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
                                android.util.LongSparseArray longSparseArray = c22848x6ddd90cf.f295254z;
                                if (z17) {
                                    in5.v0 v0Var = (in5.v0) longSparseArray.get(cVar.mo2128x1ed62e84());
                                    if (v0Var != null) {
                                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar).getFeedObject().m59244x27a0ce20() != null) {
                                            recyclerView.getChildVisibleRect(itemView, new android.graphics.Rect(), null);
                                        }
                                        rVar.f342512c = v0Var;
                                    }
                                } else {
                                    in5.v0 v0Var2 = (in5.v0) longSparseArray.get(cVar.mo2128x1ed62e84());
                                    if (v0Var2 != null) {
                                        rVar.f342512c = v0Var2;
                                    }
                                }
                                if (!(cVar instanceof so2.i1)) {
                                    linkedList.add(rVar);
                                }
                            }
                        }
                    }
                    if (w17 == y17) {
                        break;
                    }
                    w17++;
                }
            }
        }
        wVar.f342537t = linkedList;
        wVar.f342538u = linkedList2;
        int i28 = this.f342493e;
        int i29 = wVar.f342520f;
        if (i28 != i29 || this.f342494f != wVar.f342522h) {
            if (i28 == Integer.MAX_VALUE || (i18 = this.f342494f) == Integer.MAX_VALUE) {
                i18 = wVar.f342522h;
            } else {
                if (i29 < i28) {
                    i28 = i29;
                }
                int i37 = wVar.f342522h;
                if (i37 > i18) {
                    i18 = i37;
                }
                i29 = i28;
            }
            wVar.f342536s = hc2.f1.m(recyclerView, i29, i18);
        }
        this.f207021s = wVar.f342525k;
        this.f342493e = wVar.f342520f;
        this.f342494f = wVar.f342522h;
        return wVar;
    }

    @Override // fc2.o
    public void e() {
        super.e();
        this.f207021s = -1L;
    }

    public fc2.a h(int i17) {
        return new fc2.w(i17);
    }
}
