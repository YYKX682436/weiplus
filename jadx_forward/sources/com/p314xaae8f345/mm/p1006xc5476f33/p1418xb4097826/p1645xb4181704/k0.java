package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class k0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f211813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f211814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.r f211815d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, boolean z17, long j17, fp0.r rVar) {
        this.f211812a = o0Var;
        this.f211813b = z17;
        this.f211814c = j17;
        this.f211815d = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 g17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2;
        int i17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa3;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193;
        jz5.l lVar = (jz5.l) obj;
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        java.util.List list = (java.util.List) lVar.f384367e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211812a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var2 = o0Var.f211863o;
        if (a2Var2 != null) {
            a2Var2.h().setVisibility(8);
            android.view.ViewGroup viewGroup = a2Var2.f211703g;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            a2Var2.j().setOnClickListener(null);
        }
        boolean z17 = this.f211813b;
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var3 = o0Var.f211863o;
            if (a2Var3 != null) {
                a2Var3.k().P(list != null ? list.size() : 0);
            }
        } else if (!o0Var.f211868t && (a2Var = o0Var.f211863o) != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(a2Var.k(), null, 1, null);
        }
        if (z17 && !o0Var.f211867s) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var4 = o0Var.f211863o;
            if (a2Var4 != null) {
                a2Var4.d(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var5 = o0Var.f211863o;
            if (a2Var5 != null) {
                a2Var5.e().f295084h.m82860xad1bd797(true);
            }
        }
        android.content.Context context = o0Var.f211855d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o1 o1Var = o0Var.f211859h;
        if (list == null || list.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "refresh header title...");
            if (z17) {
                o1Var.f211875a.clear();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var6 = o0Var.f211863o;
                if (a2Var6 != null && (m82555x4905e9fa = a2Var6.k().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
                if (booleanValue) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var7 = o0Var.f211863o;
                    if (a2Var7 != null) {
                        a2Var7.h().setVisibility(0);
                        android.view.View view = a2Var7.f211711r;
                        if (view == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (a2Var7.e().getCloseComment()) {
                            android.view.View i18 = a2Var7.i();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(i18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(i18, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            android.view.ViewGroup viewGroup2 = a2Var7.f211703g;
                            if (viewGroup2 != null) {
                                viewGroup2.setVisibility(0);
                            }
                        } else {
                            android.view.View i19 = a2Var7.i();
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(i19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(i19, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View j17 = a2Var7.j();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(j17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        j17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(j17, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15144x165092d1 c15144x165092d1 = o0Var.C;
                    if (c15144x165092d1 != null && c15144x165092d1.getShowFooter()) {
                        iv2.a aVar = o0Var.f211861m;
                        if (aVar == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                            throw null;
                        }
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f376652b, en1.a.a())) {
                            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
                            if (abstractActivityC21394xb3d2c0cf != null) {
                                abstractActivityC21394xb3d2c0cf.mo26063x7b383410();
                            }
                        }
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var8 = o0Var.f211863o;
                    if (a2Var8 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.j0 j0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.j0(o0Var);
                        a2Var8.h().setVisibility(0);
                        android.view.View view2 = a2Var8.f211711r;
                        if (view2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList5.add(8);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View i27 = a2Var8.i();
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(i27, arrayList6.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        i27.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(i27, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View j18 = a2Var8.j();
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(0);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(j18, arrayList7.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        j18.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(j18, "com/tencent/mm/plugin/finder/uniComments/TextStatusTimelineDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        a2Var8.j().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.z1(j0Var));
                    }
                }
            }
        } else if (o0Var.f211871w == 0) {
            o1Var.f211875a.clear();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                o1Var.a((jv2.d) it.next(), false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var9 = o0Var.f211863o;
            if (a2Var9 != null && (m82555x4905e9fa4 = a2Var9.k().m82555x4905e9fa()) != null && (mo7946xf939df193 = m82555x4905e9fa4.mo7946xf939df19()) != null) {
                mo7946xf939df193.m8146xced61ae5();
            }
        } else {
            int e17 = o1Var.e();
            o1Var.b(list, true, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var10 = o0Var.f211863o;
            if (a2Var10 != null && (m82555x4905e9fa3 = a2Var10.k().m82555x4905e9fa()) != null && (mo7946xf939df192 = m82555x4905e9fa3.mo7946xf939df19()) != null) {
                mo7946xf939df192.m8153xd399a4d9(0, o1Var.e() - e17);
            }
            if (z17) {
                java.util.ArrayList arrayList8 = o1Var.f211875a;
                java.util.Iterator it6 = arrayList8.iterator();
                int i28 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i28 = -1;
                        break;
                    }
                    if (((jv2.d) it6.next()).mo2128x1ed62e84() == o0Var.f211871w) {
                        break;
                    }
                    i28++;
                }
                if (i28 >= 0) {
                    jv2.d dVar = (jv2.d) arrayList8.get(i28);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var11 = o0Var.f211863o;
                    if (a2Var11 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f17 = a2Var11.f();
                        java.lang.String b17 = hc2.t.b(context, o0Var.f211862n);
                        i95.m c17 = i95.n0.c(c61.yb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        f17.g(b17, c61.yb.md((c61.yb) c17, dVar.f383740d.D0(), dVar.f383740d.y0(), false, 4, null), dVar.f383740d);
                    }
                    if (dVar.f383740d.A0() != 0) {
                        long A0 = dVar.f383740d.A0();
                        if (A0 != 0) {
                            java.util.Iterator it7 = arrayList8.iterator();
                            int i29 = 0;
                            while (it7.hasNext()) {
                                if (((jv2.d) it7.next()).f383740d.t0() == A0) {
                                    i17 = i29;
                                    break;
                                }
                                i29++;
                            }
                        }
                        i17 = -1;
                        if (i17 >= 0) {
                            i28 = i17;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.a2 a2Var12 = o0Var.f211863o;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = (a2Var12 == null || (m82555x4905e9fa2 = a2Var12.k().m82555x4905e9fa()) == null) ? null : m82555x4905e9fa2.getLayoutManager();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
                    if (c1162x665295de != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList9.add(0);
                        arrayList9.add(java.lang.Integer.valueOf(i28));
                        java.util.Collections.reverse(arrayList9);
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c1162x665295de;
                        yj0.a.d(c1162x665295de2, arrayList9.toArray(), "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        c1162x665295de.P(((java.lang.Integer) arrayList9.get(0)).intValue(), ((java.lang.Integer) arrayList9.get(1)).intValue());
                        yj0.a.f(c1162x665295de2, "com/tencent/mm/plugin/finder/uniComments/TextStatusCommentDrawerPresenter$refreshData$1$4", "call", "(Lkotlin/Pair;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    }
                }
            }
        }
        iv2.a aVar2 = o0Var.f211861m;
        if (aVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
            throw null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar2.f376652b, en1.a.a()) && (g17 = o0Var.g()) != null) {
            g17.clearFocus();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshData] Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f211814c);
        sb6.append("ms, succ:");
        sb6.append(list != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", sb6.toString());
        this.f211815d.b(fp0.u.f346823f);
        return jz5.f0.f384359a;
    }
}
