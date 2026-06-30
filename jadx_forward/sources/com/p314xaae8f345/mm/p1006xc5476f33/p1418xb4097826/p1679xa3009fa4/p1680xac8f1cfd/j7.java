package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class j7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 f216355e;

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 o7Var) {
        this.f216355e = o7Var;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e6e;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String m76184x8010e5e4;
        so2.j0 item = (so2.j0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.o7 o7Var = this.f216355e;
        android.app.Activity m80379x76847179 = o7Var.m80379x76847179();
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.zx0 zx0Var = item.f491971d;
        r45.vx0 vx0Var = (r45.vx0) zx0Var.m75936x14adae67(0);
        objArr[0] = vx0Var != null ? vx0Var.m75945x2fec8307(1) : null;
        holder.s(com.p314xaae8f345.mm.R.id.svt, m80379x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lre, objArr));
        holder.s(com.p314xaae8f345.mm.R.id.svs, holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o1a, java.lang.Integer.valueOf(zx0Var.m75939xb282bd08(3)), java.lang.Integer.valueOf(zx0Var.m75939xb282bd08(4))));
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.svi);
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (imageView != null) {
            g1Var.e().c(new mn2.q3(zx0Var.m75945x2fec8307(2), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411496q));
        }
        if (i17 == 0) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.o1u);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.o1u);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderContinueWatchUIC$ContinueWatchConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderContinueWatchData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        vo0.d a17 = g1Var.a();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) zx0Var.m75936x14adae67(6);
        java.lang.String str2 = "";
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76175x6d346f39()) == null) {
            str = "";
        }
        mn2.n nVar = new mn2.n(str, null, 2, null);
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.svq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p19, g1Var.h(mn2.f1.f411490h));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity m80379x768471792 = o7Var.m80379x76847179();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) zx0Var.m75936x14adae67(6);
        if (c19782x23db1cfa2 != null && (m76184x8010e5e4 = c19782x23db1cfa2.m76184x8010e5e4()) != null) {
            str2 = m76184x8010e5e4;
        }
        ((ke0.e) xVar).getClass();
        holder.s(com.p314xaae8f345.mm.R.id.svr, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(m80379x768471792, str2));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f542044a;
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.svo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) p27;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) zx0Var.m75936x14adae67(6);
        zy2.tb.a(m1Var, imageView2, c19782x23db1cfa3 != null ? c19782x23db1cfa3.m76160xd133dfec() : null, 0, 4, null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = o7Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr[1] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        r45.vx0 vx0Var2 = (r45.vx0) zx0Var.m75936x14adae67(0);
        lVarArr[2] = new jz5.l("collection_id", pm0.v.u(vx0Var2 != null ? vx0Var2.m75942xfb822ef2(0) : 0L));
        lVarArr[3] = new jz5.l("collection_location_id", java.lang.Integer.valueOf(i17));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e7(holder, item, k17));
        holder.f3639x46306858.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.i7(k17, o7Var, holder, item));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.f3639x46306858, "continue_watch_collection_card");
        aVar.ik(holder.f3639x46306858, 32, 25496);
        aVar.gk(holder.f3639x46306858, k17);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.svh);
        if (p17 != null) {
            p17.setBackgroundColor(holder.f374654e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = 0;
            }
        }
    }
}
