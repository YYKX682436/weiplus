package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class il extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489027dj5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        r45.vx0 vx0Var;
        qr2.a item = (qr2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar = (com.tencent.mm.plugin.finder.viewmodel.component.zl) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.zl.class);
        zlVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", "onBindViewHolder " + i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.qlr);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        r45.dm2 object_extend = zlVar.R6().getFeedObject().getFeedObject().getObject_extend();
        if (object_extend == null || (vx0Var = (r45.vx0) object_extend.getCustom(0)) == null || (str = vx0Var.getString(1)) == null) {
            str = "";
        }
        textView.setText(str);
        qr2.g gVar = qr2.h.f366071e;
        com.tencent.mm.plugin.finder.playlist.e2 e2Var = zlVar.f136691f;
        java.util.ArrayList arrayList = e2Var.f122296a;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = zlVar.f136700r;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        qr2.g.a(gVar, arrayList, wxRecyclerAdapter, zlVar.f136694i, false, 8, null);
        qr2.d dVar = qr2.e.f366070e;
        java.util.ArrayList arrayList2 = e2Var.f122296a;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = zlVar.f136700r;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        qr2.d.a(dVar, arrayList2, wxRecyclerAdapter2, zlVar.f136695m, false, 8, null);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = zlVar.f136700r;
        if (wxRecyclerAdapter3 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter3.notifyDataSetChanged();
        java.util.Iterator it = arrayList2.iterator();
        int i19 = 0;
        while (true) {
            if (!it.hasNext()) {
                i19 = -1;
                break;
            }
            long itemId = ((so2.j5) it.next()).getItemId();
            com.tencent.mm.plugin.finder.playlist.z1 z1Var = zlVar.f136698p;
            if (itemId == (z1Var != null ? z1Var.getItemId() : -1L)) {
                break;
            } else {
                i19++;
            }
        }
        zlVar.T6(i19);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        final com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar = (com.tencent.mm.plugin.finder.viewmodel.component.zl) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.zl.class);
        zlVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", "onCreateViewHolder");
        com.tencent.mm.plugin.finder.feed.tl tlVar = zlVar.f136690e;
        if (tlVar == null) {
            kotlin.jvm.internal.o.o("longVideoShareContract");
            throw null;
        }
        android.view.View findViewById = tlVar.g().f111072a.findViewById(com.tencent.mm.R.id.f483237mf1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC", "onCreateViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC", "onCreateViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.qks);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) p17;
        zlVar.f136699q = recyclerView2;
        recyclerView2.setHasFixedSize(true);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = zlVar.f136699q;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView3.setItemViewCacheSize(4);
        androidx.recyclerview.widget.RecyclerView recyclerView4 = zlVar.f136699q;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView4.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView5 = zlVar.f136699q;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView5.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(zlVar.getContext(), 0, false));
        androidx.recyclerview.widget.RecyclerView recyclerView6 = zlVar.f136699q;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalCollectionUIC$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == com.tencent.mm.plugin.finder.playlist.z1.class.getName().hashCode()) {
                    return new qr2.c(false, com.tencent.mm.plugin.finder.viewmodel.component.zl.this.f136698p, 1, null);
                }
                if (type == qr2.i.class.getName().hashCode()) {
                    return new qr2.h();
                }
                if (type == qr2.f.class.getName().hashCode()) {
                    return new qr2.e();
                }
                hc2.l.a("FinderHorizontalCollectionUIC", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, zlVar.f136691f.f122296a, false);
        zlVar.f136700r = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.viewmodel.component.rl(zlVar);
        recyclerView6.setAdapter(wxRecyclerAdapter);
        androidx.recyclerview.widget.RecyclerView recyclerView7 = zlVar.f136699q;
        if (recyclerView7 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        recyclerView7.N(new com.tencent.mm.plugin.finder.viewmodel.component.ul());
        com.tencent.mm.plugin.finder.viewmodel.component.ql qlVar = new com.tencent.mm.plugin.finder.viewmodel.component.ql(zlVar);
        androidx.recyclerview.widget.RecyclerView recyclerView8 = zlVar.f136699q;
        if (recyclerView8 != null) {
            recyclerView8.i(qlVar);
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.zl) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.zl.class)).getClass();
    }
}
