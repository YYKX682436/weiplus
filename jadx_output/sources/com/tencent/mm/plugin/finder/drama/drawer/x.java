package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f105283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f105284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105285g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var, r45.qj2 qj2Var, long j17, java.lang.String str) {
        super(1);
        this.f105282d = e0Var;
        this.f105283e = qj2Var;
        this.f105284f = j17;
        this.f105285g = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            int i18 = fVar.f70615a;
            final com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var = this.f105282d;
            if (i18 == 0 && fVar.f70616b == 0) {
                android.app.Activity context = e0Var.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.finder.drama.drawer.j) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.drama.drawer.j.class)).O6((r45.qj2) ((r45.v81) fVar.f70618d).getCustom(1), (r45.nj2) ((r45.v81) fVar.f70618d).getCustom(4));
                android.widget.FrameLayout frameLayout = e0Var.f105218e;
                if (frameLayout == null) {
                    kotlin.jvm.internal.o.o("loadingLayout");
                    throw null;
                }
                frameLayout.setVisibility(8);
                android.view.View view = e0Var.f105220g;
                if (view == null) {
                    kotlin.jvm.internal.o.o("retryView");
                    throw null;
                }
                view.setOnClickListener(null);
                r45.qj2 qj2Var = this.f105283e;
                com.tencent.mm.protobuf.f resp = fVar.f70618d;
                kotlin.jvm.internal.o.f(resp, "resp");
                long j17 = this.f105284f;
                java.lang.String str = this.f105285g;
                int intExtra = e0Var.getIntent().getIntExtra("native_drama_init_position", 0);
                int intExtra2 = e0Var.getIntent().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
                java.lang.String stringExtra = e0Var.getIntent().getStringExtra("native_drama_session_buffer");
                java.util.LinkedList list = ((r45.v81) resp).getList(2);
                java.util.ArrayList arrayList = e0Var.f105226p;
                java.util.ArrayList arrayList2 = e0Var.f105225o;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    int i19 = 0;
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        int i27 = i19 + 1;
                        if (i19 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.pj2 pj2Var = (r45.pj2) next;
                        java.util.Iterator it6 = it;
                        kotlin.jvm.internal.o.d(pj2Var);
                        arrayList2.add(new zb2.c(pj2Var));
                        java.util.LinkedList list2 = pj2Var.getList(1);
                        if (list2 != null) {
                            i17 = intExtra;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
                            for (java.util.Iterator it7 = list2.iterator(); it7.hasNext(); it7 = it7) {
                                r45.oj2 oj2Var = (r45.oj2) it7.next();
                                kotlin.jvm.internal.o.d(oj2Var);
                                arrayList3.add(new zb2.b(oj2Var));
                            }
                            arrayList.addAll(arrayList3);
                        } else {
                            i17 = intExtra;
                        }
                        it = it6;
                        i19 = i27;
                        intExtra = i17;
                    }
                }
                int i28 = intExtra;
                androidx.recyclerview.widget.RecyclerView recyclerView = e0Var.f105228r;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("rangeRv");
                    throw null;
                }
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(e0Var.getContext(), 0, false));
                androidx.recyclerview.widget.RecyclerView recyclerView2 = e0Var.f105228r;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("rangeRv");
                    throw null;
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$2
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        return new com.tencent.mm.plugin.finder.drama.drawer.l(com.tencent.mm.plugin.finder.drama.drawer.e0.this);
                    }
                }, arrayList2, false);
                wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.drama.drawer.q(e0Var, qj2Var);
                recyclerView2.setAdapter(wxRecyclerAdapter);
                if (arrayList2.isEmpty()) {
                    android.widget.FrameLayout frameLayout2 = e0Var.f105218e;
                    if (frameLayout2 == null) {
                        kotlin.jvm.internal.o.o("loadingLayout");
                        throw null;
                    }
                    frameLayout2.setVisibility(0);
                    android.view.View view2 = e0Var.f105219f;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("loadingView");
                        throw null;
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.View view3 = e0Var.f105220g;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("retryView");
                        throw null;
                    }
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                androidx.recyclerview.widget.RecyclerView recyclerView3 = e0Var.f105222i;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.o.o("episodeRv");
                    throw null;
                }
                recyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(e0Var.getContext(), 0, false));
                androidx.recyclerview.widget.RecyclerView recyclerView4 = e0Var.f105222i;
                if (recyclerView4 == null) {
                    kotlin.jvm.internal.o.o("episodeRv");
                    throw null;
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$4
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        return new com.tencent.mm.plugin.finder.drama.drawer.k(com.tencent.mm.plugin.finder.drama.drawer.e0.this);
                    }
                }, arrayList, false);
                wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.finder.drama.drawer.r(e0Var, qj2Var, j17, str, intExtra2, stringExtra);
                recyclerView4.setAdapter(wxRecyclerAdapter2);
                androidx.recyclerview.widget.RecyclerView recyclerView5 = e0Var.f105222i;
                if (recyclerView5 == null) {
                    kotlin.jvm.internal.o.o("episodeRv");
                    throw null;
                }
                recyclerView5.i(new com.tencent.mm.plugin.finder.drama.drawer.t(e0Var));
                e0Var.f105229s = i28;
                e0Var.P6(i28);
                androidx.recyclerview.widget.RecyclerView recyclerView6 = e0Var.f105222i;
                if (recyclerView6 == null) {
                    kotlin.jvm.internal.o.o("episodeRv");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter = recyclerView6.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                androidx.recyclerview.widget.RecyclerView recyclerView7 = e0Var.f105223m;
                if (recyclerView7 == null) {
                    kotlin.jvm.internal.o.o("recommendRv");
                    throw null;
                }
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(e0Var.getContext(), 3);
                gridLayoutManager.B = new com.tencent.mm.plugin.finder.drama.drawer.u(e0Var);
                recyclerView7.setLayoutManager(gridLayoutManager);
                androidx.recyclerview.widget.RecyclerView recyclerView8 = e0Var.f105223m;
                if (recyclerView8 == null) {
                    kotlin.jvm.internal.o.o("recommendRv");
                    throw null;
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$8
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        if (type != 1) {
                            return type != 2 ? new com.tencent.mm.plugin.finder.convert.z2() : new com.tencent.mm.plugin.finder.drama.drawer.o();
                        }
                        com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var2 = com.tencent.mm.plugin.finder.drama.drawer.e0.this;
                        return new com.tencent.mm.plugin.finder.drama.drawer.n(e0Var2, ((java.lang.Number) ((jz5.n) e0Var2.f105233w).getValue()).intValue());
                    }
                }, e0Var.f105227q, false);
                wxRecyclerAdapter3.f293105o = new com.tencent.mm.plugin.finder.drama.drawer.v(e0Var, intExtra2);
                recyclerView8.setAdapter(wxRecyclerAdapter3);
                android.view.ViewGroup viewGroup = e0Var.f105224n;
                if (viewGroup == null) {
                    kotlin.jvm.internal.o.o("episodeTitleLayout");
                    throw null;
                }
                viewGroup.setVisibility(0);
                android.widget.TextView textView = e0Var.f105221h;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("allEpisodeTv");
                    throw null;
                }
                textView.setText(e0Var.getContext().getString(com.tencent.mm.R.string.nyd, java.lang.Integer.valueOf(arrayList.size())));
                android.widget.TextView textView2 = e0Var.f105221h;
                if (textView2 == null) {
                    kotlin.jvm.internal.o.o("allEpisodeTv");
                    throw null;
                }
                textView2.setOnClickListener(new com.tencent.mm.plugin.finder.drama.drawer.p(e0Var, qj2Var, j17, str, intExtra2, stringExtra));
            } else {
                com.tencent.mm.plugin.finder.drama.drawer.w wVar = new com.tencent.mm.plugin.finder.drama.drawer.w(e0Var, this.f105283e);
                e0Var.getClass();
                android.widget.FrameLayout frameLayout3 = e0Var.f105218e;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.o.o("loadingLayout");
                    throw null;
                }
                frameLayout3.setVisibility(0);
                android.view.View view4 = e0Var.f105219f;
                if (view4 == null) {
                    kotlin.jvm.internal.o.o("loadingView");
                    throw null;
                }
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view4, arrayList6.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = e0Var.f105220g;
                if (view5 == null) {
                    kotlin.jvm.internal.o.o("retryView");
                    throw null;
                }
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view5, arrayList7.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showRetryView", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = e0Var.f105220g;
                if (view6 == null) {
                    kotlin.jvm.internal.o.o("retryView");
                    throw null;
                }
                view6.setOnClickListener(new com.tencent.mm.plugin.finder.drama.drawer.d0(wVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
