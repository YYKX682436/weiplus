package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ar extends in5.r {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.wq f102899f = new com.tencent.mm.plugin.finder.convert.wq(null);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f102900e = jz5.h.b(com.tencent.mm.plugin.finder.convert.zq.f105122d);

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489046ed0;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.convert.ar arVar;
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.plugin.finder.feed.model.d5 item = (com.tencent.mm.plugin.finder.feed.model.d5) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder pos=");
        sb6.append(i17);
        sb6.append(" dramaId=");
        sb6.append(pm0.v.u(item.f107793e));
        sb6.append(" dramaName=");
        java.lang.String str = item.f107794f;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderNativeDramaRecommendConvert", sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.uk6);
        if (imageView != null) {
            layoutParams = imageView.getLayoutParams();
            arVar = this;
        } else {
            arVar = this;
            layoutParams = null;
        }
        int intValue = (((java.lang.Number) ((jz5.n) arVar.f102900e).getValue()).intValue() - ((int) holder.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz))) / 2;
        int i19 = (intValue / 3) * 4;
        if (layoutParams != null) {
            layoutParams.width = intValue;
        }
        if (layoutParams != null) {
            layoutParams.height = i19;
        }
        imageView.setLayoutParams(layoutParams);
        boolean z18 = true;
        java.lang.String str2 = item.f107795g;
        if (str2 == null || str2.length() == 0) {
            imageView.setImageDrawable(null);
        } else {
            mn2.q3 q3Var = new mn2.q3(str2, com.tencent.mm.plugin.finder.storage.y90.f128356f);
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(q3Var, imageView, g1Var.h(mn2.f1.f329956g));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.uk7);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        com.tencent.mm.ui.fk.b(textView);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.uk8);
        java.lang.String str3 = item.f107798m;
        if (str3 == null || str3.length() == 0) {
            textView2.setVisibility(8);
        } else {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            textView2.setText(zy2.s6.l6((zy2.s6) c17, str3, (int) textView2.getTextSize(), false, null, 0, false, null, 124, null));
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.uk9);
        java.lang.String str4 = item.f107796h;
        if (str4 != null && str4.length() != 0) {
            z18 = false;
        }
        if (z18) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(str4);
            textView3.setVisibility(0);
        }
        java.util.Map a17 = f102899f.a(item);
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.view.View view = holder.itemView;
        com.tencent.mm.plugin.finder.convert.xq xqVar = new com.tencent.mm.plugin.finder.convert.xq(holder);
        kotlin.jvm.internal.o.d(view);
        d2Var.n(view, "drama_tab_series_card", (r20 & 4) != 0 ? 40 : 8, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : a17, (r20 & 128) != 0 ? null : xqVar);
        android.view.View view2 = holder.itemView;
        com.tencent.mm.plugin.finder.convert.yq yqVar = new com.tencent.mm.plugin.finder.convert.yq(holder);
        kotlin.jvm.internal.o.d(view2);
        d2Var.n(view2, "drama_tab_series_card", (r20 & 4) != 0 ? 40 : 32, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : true, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : a17, (r20 & 128) != 0 ? null : yqVar);
    }
}
