package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.account.component.l f101708d;

    public j(com.tencent.mm.plugin.finder.account.component.l lVar) {
        this.f101708d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        final com.tencent.mm.plugin.finder.account.component.l lVar = this.f101708d;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderAccountSwitchUIC", "[onClickSwitch]");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = lVar.f101711f;
        if (list != null) {
            for (m92.b bVar : kz5.n0.F0(list, new com.tencent.mm.plugin.finder.account.component.k())) {
                arrayList2.add(new j92.a(bVar, kotlin.jvm.internal.o.b(bVar.field_username, lVar.f101716n)));
            }
        }
        if (lVar.f101718p) {
            j92.a aVar = new j92.a(new m92.b(), false);
            aVar.f298354f = lVar.f101715m;
            arrayList2.add(aVar);
        }
        lVar.f101712g = arrayList2;
        if (lVar.f101710e == null) {
            h92.b bVar2 = com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer.f101699y;
            android.app.Activity context = lVar.getContext();
            android.view.Window window = lVar.getContext().getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer a17 = bVar2.a(context, window, new h92.d());
            lVar.f101710e = a17;
            androidx.recyclerview.widget.RecyclerView recyclerView = a17.getRecyclerView();
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(lVar.getContext()));
            java.util.ArrayList arrayList3 = lVar.f101712g;
            if (arrayList3 != null) {
                lVar.f101713h = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.account.component.FinderAccountSwitchUIC$buildConvert$1
                    @Override // in5.s
                    public in5.r getItemConvert(int type) {
                        com.tencent.mm.plugin.finder.account.component.l lVar2 = com.tencent.mm.plugin.finder.account.component.l.this;
                        i92.b bVar3 = new i92.b(new com.tencent.mm.plugin.finder.account.component.h(lVar2), true);
                        java.util.ArrayList arrayList4 = lVar2.f101712g;
                        bVar3.f289717u = arrayList4 != null ? arrayList4.size() : 0;
                        return bVar3;
                    }
                }, arrayList3, false);
            }
            recyclerView.setAdapter(lVar.f101713h);
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = lVar.f101713h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.account.component.i(lVar, null);
            }
            com.tencent.mm.plugin.finder.report.d2.m(com.tencent.mm.plugin.finder.report.d2.f124994a, recyclerView, "account_panel", 32, 0, null, null, 56, null);
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = lVar.f101713h;
            if (wxRecyclerAdapter2 != null) {
                java.util.List data = wxRecyclerAdapter2.getData();
                data.clear();
                java.util.ArrayList arrayList4 = lVar.f101712g;
                if (arrayList4 != null) {
                    java.util.Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        data.add((j92.a) it.next());
                    }
                }
                wxRecyclerAdapter2.notifyDataSetChanged();
            }
        }
        java.util.ArrayList arrayList5 = lVar.f101712g;
        int size = arrayList5 != null ? arrayList5.size() : 0;
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer = lVar.f101710e;
        if (finderAccountSwitchDrawer != null) {
            finderAccountSwitchDrawer.setTopPadding(size);
        }
        com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer finderAccountSwitchDrawer2 = lVar.f101710e;
        if (finderAccountSwitchDrawer2 != null) {
            com.tencent.mm.view.drawer.RecyclerViewDrawer.s(finderAccountSwitchDrawer2, false, false, 0, 7, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/account/component/FinderAccountSwitchUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
