package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class x7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f192574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f192575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f192576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f192577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.r f192578e;

    public x7(yz5.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var, boolean z17, long j17, fp0.r rVar) {
        this.f192574a = lVar;
        this.f192575b = f8Var;
        this.f192576c = z17;
        this.f192577d = j17;
        this.f192578e = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        yw2.f fVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m7 m7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m7) obj;
        yz5.l lVar = this.f192574a;
        if (lVar == null || (linkedList = (java.util.LinkedList) lVar.mo146xb9724478(m7Var.f188892b)) == null) {
            linkedList = m7Var.f188892b;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var = this.f192575b;
        yw2.f fVar2 = f8Var.f188253q;
        if (fVar2 != null) {
            android.widget.FrameLayout frameLayout = fVar2.f548170i;
            if (frameLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                throw null;
            }
            frameLayout.setVisibility(8);
            fVar2.l().setOnClickListener(null);
        }
        boolean z17 = this.f192576c;
        if (!z17) {
            yw2.f fVar3 = f8Var.f188253q;
            if (fVar3 != null) {
                fVar3.n().P(linkedList != null ? linkedList.size() : 0);
            }
        } else if (!f8Var.f188258v && (fVar = f8Var.f188253q) != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(fVar.n(), null, 1, null);
        }
        if (z17 && !f8Var.f188257u) {
            yw2.f fVar4 = f8Var.f188253q;
            if (fVar4 != null) {
                fVar4.g(false);
            }
            yw2.f fVar5 = f8Var.f188253q;
            if (fVar5 != null) {
                fVar5.h().l(true);
            }
        }
        r45.a31 a31Var = m7Var.f188894d;
        r45.t11 t11Var = a31Var != null ? (r45.t11) a31Var.m75936x14adae67(0) : null;
        f8Var.f188256t = t11Var != null ? (r45.ri0) t11Var.m75936x14adae67(1) : null;
        java.util.ArrayList arrayList = f8Var.f188252p;
        if (t11Var != null) {
            so2.c1 c1Var = new so2.c1(new r45.s21(), f8Var.a().m59298x5bcf3ee6());
            c1Var.f491824g = t11Var;
            arrayList.add(c1Var);
        }
        r45.tl6 tl6Var = m7Var.f188893c;
        if (tl6Var != null && tl6Var.m75939xb282bd08(0) != 0) {
            so2.c1 c1Var2 = new so2.c1(new r45.s21(), f8Var.a().m59298x5bcf3ee6());
            c1Var2.f491823f = tl6Var;
            arrayList.add(c1Var2);
        }
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", "refresh header title...");
            if (z17) {
                if (t11Var == null) {
                    arrayList.clear();
                }
                yw2.f fVar6 = f8Var.f188253q;
                if (fVar6 != null && (m82555x4905e9fa = fVar6.n().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
                if (m7Var.f188891a) {
                    yw2.f fVar7 = f8Var.f188253q;
                    if (fVar7 != null) {
                        android.widget.FrameLayout frameLayout2 = fVar7.f548170i;
                        if (frameLayout2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                            throw null;
                        }
                        frameLayout2.setVisibility(0);
                        android.view.View view = fVar7.f548171m;
                        if (view == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        fVar7.k().setVisibility(0);
                        android.view.View l17 = fVar7.l();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(l17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        l17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(l17, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    yw2.f fVar8 = f8Var.f188253q;
                    if (fVar8 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w7 w7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.w7(f8Var);
                        android.widget.FrameLayout frameLayout3 = fVar8.f548170i;
                        if (frameLayout3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
                            throw null;
                        }
                        frameLayout3.setVisibility(0);
                        android.view.View view2 = fVar8.f548171m;
                        if (view2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        fVar8.k().setVisibility(8);
                        android.view.View l18 = fVar8.l();
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(l18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        l18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(l18, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        fVar8.l().setOnClickListener(new yw2.e(w7Var));
                    }
                }
            }
            f8Var.g();
        } else {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new so2.c1((r45.s21) it.next(), f8Var.a().m59298x5bcf3ee6()));
            }
            yw2.f fVar9 = f8Var.f188253q;
            if (fVar9 != null && (m82555x4905e9fa2 = fVar9.n().m82555x4905e9fa()) != null && (mo7946xf939df192 = m82555x4905e9fa2.mo7946xf939df19()) != null) {
                mo7946xf939df192.m8146xced61ae5();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshData] Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f192577d);
        sb6.append("ms, succ:");
        sb6.append(linkedList != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        this.f192578e.b(fp0.u.f346823f);
        return jz5.f0.f384359a;
    }
}
