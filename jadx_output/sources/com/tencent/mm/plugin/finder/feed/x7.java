package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class x7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f111041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f111042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f111043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f111044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.r f111045e;

    public x7(yz5.l lVar, com.tencent.mm.plugin.finder.feed.f8 f8Var, boolean z17, long j17, fp0.r rVar) {
        this.f111041a = lVar;
        this.f111042b = f8Var;
        this.f111043c = z17;
        this.f111044d = j17;
        this.f111045e = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        yw2.f fVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView2;
        androidx.recyclerview.widget.f2 adapter2;
        com.tencent.mm.plugin.finder.feed.m7 m7Var = (com.tencent.mm.plugin.finder.feed.m7) obj;
        yz5.l lVar = this.f111041a;
        if (lVar == null || (linkedList = (java.util.LinkedList) lVar.invoke(m7Var.f107359b)) == null) {
            linkedList = m7Var.f107359b;
        }
        com.tencent.mm.plugin.finder.feed.f8 f8Var = this.f111042b;
        yw2.f fVar2 = f8Var.f106720q;
        if (fVar2 != null) {
            android.widget.FrameLayout frameLayout = fVar2.f466637i;
            if (frameLayout == null) {
                kotlin.jvm.internal.o.o("loadingLayout");
                throw null;
            }
            frameLayout.setVisibility(8);
            fVar2.l().setOnClickListener(null);
        }
        boolean z17 = this.f111043c;
        if (!z17) {
            yw2.f fVar3 = f8Var.f106720q;
            if (fVar3 != null) {
                fVar3.n().P(linkedList != null ? linkedList.size() : 0);
            }
        } else if (!f8Var.f106725v && (fVar = f8Var.f106720q) != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.I(fVar.n(), null, 1, null);
        }
        if (z17 && !f8Var.f106724u) {
            yw2.f fVar4 = f8Var.f106720q;
            if (fVar4 != null) {
                fVar4.g(false);
            }
            yw2.f fVar5 = f8Var.f106720q;
            if (fVar5 != null) {
                fVar5.h().l(true);
            }
        }
        r45.a31 a31Var = m7Var.f107361d;
        r45.t11 t11Var = a31Var != null ? (r45.t11) a31Var.getCustom(0) : null;
        f8Var.f106723t = t11Var != null ? (r45.ri0) t11Var.getCustom(1) : null;
        java.util.ArrayList arrayList = f8Var.f106719p;
        if (t11Var != null) {
            so2.c1 c1Var = new so2.c1(new r45.s21(), f8Var.a().getUnsignedId());
            c1Var.f410291g = t11Var;
            arrayList.add(c1Var);
        }
        r45.tl6 tl6Var = m7Var.f107360c;
        if (tl6Var != null && tl6Var.getInteger(0) != 0) {
            so2.c1 c1Var2 = new so2.c1(new r45.s21(), f8Var.a().getUnsignedId());
            c1Var2.f410290f = tl6Var;
            arrayList.add(c1Var2);
        }
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", "refresh header title...");
            if (z17) {
                if (t11Var == null) {
                    arrayList.clear();
                }
                yw2.f fVar6 = f8Var.f106720q;
                if (fVar6 != null && (recyclerView = fVar6.n().getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
                if (m7Var.f107358a) {
                    yw2.f fVar7 = f8Var.f106720q;
                    if (fVar7 != null) {
                        android.widget.FrameLayout frameLayout2 = fVar7.f466637i;
                        if (frameLayout2 == null) {
                            kotlin.jvm.internal.o.o("loadingLayout");
                            throw null;
                        }
                        frameLayout2.setVisibility(0);
                        android.view.View view = fVar7.f466638m;
                        if (view == null) {
                            kotlin.jvm.internal.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
                    yw2.f fVar8 = f8Var.f106720q;
                    if (fVar8 != null) {
                        com.tencent.mm.plugin.finder.feed.w7 w7Var = new com.tencent.mm.plugin.finder.feed.w7(f8Var);
                        android.widget.FrameLayout frameLayout3 = fVar8.f466637i;
                        if (frameLayout3 == null) {
                            kotlin.jvm.internal.o.o("loadingLayout");
                            throw null;
                        }
                        frameLayout3.setVisibility(0);
                        android.view.View view2 = fVar8.f466638m;
                        if (view2 == null) {
                            kotlin.jvm.internal.o.o("loadingView");
                            throw null;
                        }
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
                arrayList.add(new so2.c1((r45.s21) it.next(), f8Var.a().getUnsignedId()));
            }
            yw2.f fVar9 = f8Var.f106720q;
            if (fVar9 != null && (recyclerView2 = fVar9.n().getRecyclerView()) != null && (adapter2 = recyclerView2.getAdapter()) != null) {
                adapter2.notifyDataSetChanged();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refreshData] Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - this.f111044d);
        sb6.append("ms, succ:");
        sb6.append(linkedList != null);
        com.tencent.mars.xlog.Log.i("Finder.FavListDrawerPresenter", sb6.toString());
        this.f111045e.b(fp0.u.f265290f);
        return jz5.f0.f302826a;
    }
}
