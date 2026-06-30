package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.component.s f101725d;

    public q(com.tencent.mm.plugin.finder.account.component.s sVar) {
        this.f101725d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.tencent.mm.plugin.finder.account.component.s sVar = this.f101725d;
        sVar.getClass();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = sVar.f101729f;
        if (list != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (kotlin.jvm.internal.o.b(((m92.b) obj).field_username, sVar.f101734n)) {
                    arrayList3.add(obj);
                }
            }
            java.util.Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(new j92.a((m92.b) it.next(), false));
            }
        }
        if (arrayList2.size() == 0) {
            j92.a aVar = new j92.a(new m92.b(), false);
            aVar.f298354f = sVar.f101733m;
            arrayList2.add(aVar);
        }
        sVar.f101730g = arrayList2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", "[doAccountSwitch] curUserName:" + sVar.f101734n);
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer = sVar.f101728e;
        if (finderAccountSwitchDrawer == null) {
            h92.b bVar = com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer.f101699y;
            android.app.Activity context = sVar.getContext();
            android.view.Window window = sVar.getContext().getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            java.lang.String str = sVar.f101734n;
            finderAccountSwitchDrawer = bVar.a(context, window, new com.tencent.mm.plugin.finder.account.component.e(str == null || r26.n0.N(str)));
            sVar.f101728e = finderAccountSwitchDrawer;
            androidx.recyclerview.widget.RecyclerView recyclerView = finderAccountSwitchDrawer.getRecyclerView();
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(sVar.getContext()));
            java.util.ArrayList arrayList4 = sVar.f101730g;
            if (arrayList4 != null) {
                sVar.f101731h = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.account.component.FinderAccountSwitchUICForNewLife$buildConvert$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        o92.a aVar2 = new o92.a(com.tencent.mm.plugin.finder.account.component.s.this.f101737q);
                        java.util.ArrayList arrayList5 = com.tencent.mm.plugin.finder.account.component.s.this.f101730g;
                        if (arrayList5 != null) {
                            arrayList5.size();
                        }
                        return aVar2;
                    }
                }, arrayList4, false);
            }
            recyclerView.setAdapter(sVar.f101731h);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = sVar.f101731h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.account.component.p(sVar);
            }
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            }
        } else {
            android.view.ViewParent parent = finderAccountSwitchDrawer.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null && viewGroup.indexOfChild(finderAccountSwitchDrawer) != viewGroup.getChildCount() - 1) {
                viewGroup.removeView(finderAccountSwitchDrawer);
                viewGroup.addView(finderAccountSwitchDrawer);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = sVar.f101731h;
            if (wxRecyclerAdapter2 != null) {
                java.util.List data = wxRecyclerAdapter2.getData();
                data.clear();
                java.util.ArrayList arrayList5 = sVar.f101730g;
                if (arrayList5 != null) {
                    java.util.Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        data.add((j92.a) it6.next());
                    }
                }
                wxRecyclerAdapter2.notifyDataSetChanged();
            }
        }
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer2 = finderAccountSwitchDrawer;
        finderAccountSwitchDrawer2.h(new com.tencent.mm.plugin.finder.account.component.m(finderAccountSwitchDrawer2, sVar));
        java.lang.String str2 = sVar.f101734n;
        boolean z17 = str2 == null || r26.n0.N(str2);
        android.view.View findViewById = finderAccountSwitchDrawer2.getFooterLayout().findViewById(com.tencent.mm.R.id.b0n);
        android.view.View findViewById2 = finderAccountSwitchDrawer2.getFooterLayout().findViewById(com.tencent.mm.R.id.f483441av3);
        android.view.View findViewById3 = finderAccountSwitchDrawer2.getFooterLayout().findViewById(com.tencent.mm.R.id.b5u);
        java.lang.String str3 = sVar.f101734n;
        if (str3 == null || r26.n0.N(str3)) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById, arrayList7.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById2, arrayList8.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById, arrayList9.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initBottomLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar2.Tj(findViewById, 40, 3, false);
        aVar2.pk(findViewById, "newlife_select_profile_hint");
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("enter_source", java.lang.Integer.valueOf(sVar.f101737q.getInteger(0)));
        lVarArr[1] = new jz5.l("source_feedid", pm0.v.u(sVar.f101737q.getLong(1)));
        java.lang.String str4 = sVar.f101734n;
        if (str4 == null) {
            str4 = "";
        }
        lVarArr[2] = new jz5.l("my_finder_username", str4);
        aVar2.gk(findViewById, kz5.c1.k(lVarArr));
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.account.component.n(sVar));
        findViewById3.setOnClickListener(new com.tencent.mm.plugin.finder.account.component.o(sVar));
        android.view.View findViewById4 = finderAccountSwitchDrawer2.getHeaderLayout().findViewById(com.tencent.mm.R.id.f485220gy5);
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(findViewById4, arrayList10.toArray(), "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initHeaderLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife", "initHeaderLayout", "(Lcom/tencent/mm/plugin/finder/account/api/component/FinderAccountSwitchDrawer;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList11 = sVar.f101730g;
        int size = arrayList11 != null ? arrayList11.size() : 0;
        com.tencent.mm.plugin.finder.account.component.f fVar = finderAccountSwitchDrawer2 instanceof com.tencent.mm.plugin.finder.account.component.f ? (com.tencent.mm.plugin.finder.account.component.f) finderAccountSwitchDrawer2 : null;
        if (fVar != null) {
            fVar.setNeedCreateAccount(z17);
        }
        finderAccountSwitchDrawer2.setTopPadding(size);
        com.tencent.mm.view.drawer.RecyclerViewDrawer.s(finderAccountSwitchDrawer2, false, false, 0, 7, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUICForNewLife$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
