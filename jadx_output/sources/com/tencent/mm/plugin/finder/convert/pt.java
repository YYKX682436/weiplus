package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class pt extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f104293e = jz5.h.b(com.tencent.mm.plugin.finder.convert.ot.f104218d);

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aia;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.a item = (zb2.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.qj2 qj2Var = item.f471255d;
        mn2.q3 q3Var = new mn2.q3(qj2Var.getString(6), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f487295o70);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        e17.c(q3Var, (android.widget.ImageView) p17, g1Var.h(mn2.f1.B));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv)).setText(qj2Var.getString(1));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.l1s)).setVisibility(0);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l1s);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(qj2Var.getInteger(3))};
        android.content.Context context = holder.f293121e;
        textView.setText(context.getString(com.tencent.mm.R.string.nxs, objArr));
        android.view.View p18 = holder.p(com.tencent.mm.R.id.eig);
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p19 = holder.p(com.tencent.mm.R.id.fuv);
        if (p19 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p27 = holder.p(com.tencent.mm.R.id.e_e);
        if (p27 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p27, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p28 = holder.p(com.tencent.mm.R.id.f483299a85);
        if (p28 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p28, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p29 = holder.p(com.tencent.mm.R.id.f484950g12);
        if (p29 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p29, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p29.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderProfileNativeDramaConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/drama/NativeDramaData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int intValue = (((java.lang.Number) ((jz5.n) this.f104293e).getValue()).intValue() - ((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz))) / 2;
        layoutParams.width = intValue;
        layoutParams.height = (intValue / 3) * 4;
        imageView.setLayoutParams(layoutParams);
        java.util.Map k17 = kz5.c1.k(new jz5.l("native_drama_id", pm0.v.u(qj2Var.getLong(0))), new jz5.l("profile_tabid", 16));
        com.tencent.mm.plugin.finder.convert.nt ntVar = new com.tencent.mm.plugin.finder.convert.nt(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        hc2.v0.a(itemView, "native_drama_card", 0, 0, k17, ntVar, 6, null);
        android.view.View itemView2 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        hc2.v0.e(itemView2, "native_drama_card", 0, 0, false, false, k17, ntVar, 30, null);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.l1s);
        if (textView == null) {
            return;
        }
        com.tencent.mm.ui.kk.d(textView, (int) holder.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
    }
}
