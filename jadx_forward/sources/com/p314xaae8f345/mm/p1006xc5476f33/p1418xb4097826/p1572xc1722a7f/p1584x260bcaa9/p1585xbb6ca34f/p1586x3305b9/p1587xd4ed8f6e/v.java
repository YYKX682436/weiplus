package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class v extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f203510e;

    /* renamed from: f, reason: collision with root package name */
    public final int f203511f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f203512g;

    public v(java.lang.String themeId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        this.f203510e = themeId;
        this.f203511f = i17;
        this.f203512g = "AggregationCardProductItemConvert";
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dvk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vp2.g item = (vp2.g) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.le1 le1Var = item.f520455e;
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.qnr);
        android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.qns);
        android.view.View findViewById3 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.qnt);
        android.view.View findViewById4 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.s19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        r45.ue1 ue1Var = item.f520454d;
        n(findViewById, ue1Var, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
        n(findViewById2, ue1Var, 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        n(findViewById3, ue1Var, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById4);
        n(findViewById4, ue1Var, 3);
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.u(this, le1Var, ue1Var, holder, item));
    }

    public final void n(android.view.View view, r45.ue1 ue1Var, int i17) {
        int a17 = (this.f203511f - i65.a.a(view.getContext(), 40.0f)) / 2;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = a17;
        layoutParams.height = a17;
        java.util.LinkedList product_item = ue1Var.f468826f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(product_item, "product_item");
        r45.te1 te1Var = (r45.te1) kz5.n0.a0(product_item, i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind product ");
        sb6.append(te1Var != null ? te1Var.f467878e : null);
        sb6.append(" at index ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f203512g, sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567974l74);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.l7g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        if (te1Var == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert", "bindProductItemV2", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCardProductGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert", "bindProductItemV2", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCardProductGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert", "bindProductItemV2", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCardProductGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert", "bindProductItemV2", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCardProductGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
        java.lang.String str = te1Var.f467877d;
        if (str == null) {
            str = "";
        }
        wo0.c a18 = d1Var.a(((c61.i8) i5Var).Ai(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a18.c(imageView);
        textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eef, ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ui(te1Var.f467880g)));
    }
}
