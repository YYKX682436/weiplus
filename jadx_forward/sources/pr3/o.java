package pr3;

/* loaded from: classes.dex */
public final class o extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e3j;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        pr3.d item = (pr3.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.u6d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linearLayout);
        int dimensionPixelSize = linearLayout.getResources().getDimensionPixelSize(item.f439502f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPadding_top", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPadding_top", "com.tencent.mm.plugin.sns.ad.dsl.DSLLayoutAttributeKt");
        ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.cd6)).setText(i65.a.r(linearLayout.getContext(), item.f439501e));
        if (item.f439503g) {
            android.view.View view = holder.f3639x46306858;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/more_info/InfoLabelConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/profile/ui/more_info/ContactInfoItem$Label;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/more_info/InfoLabelConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/profile/ui/more_info/ContactInfoItem$Label;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
            layoutParams.height = -2;
            holder.f3639x46306858.setLayoutParams(layoutParams);
            return;
        }
        android.view.View view2 = holder.f3639x46306858;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/more_info/InfoLabelConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/profile/ui/more_info/ContactInfoItem$Label;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/more_info/InfoLabelConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/profile/ui/more_info/ContactInfoItem$Label;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup.LayoutParams layoutParams2 = holder.f3639x46306858.getLayoutParams();
        layoutParams2.height = 0;
        holder.f3639x46306858.setLayoutParams(layoutParams2);
    }
}
