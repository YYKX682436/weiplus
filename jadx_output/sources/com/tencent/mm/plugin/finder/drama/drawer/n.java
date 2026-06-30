package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class n extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f105260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105261f;

    public n(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var, int i17) {
        this.f105261f = e0Var;
        this.f105260e = i17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ecv;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.d item = (zb2.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.fl5 fl5Var = item.f471260d;
        mn2.q3 q3Var = new mn2.q3(fl5Var != null ? fl5Var.getString(2) : null, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.t5a);
        android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        float f17 = this.f105260e;
        android.content.Context context = holder.f293121e;
        int dimension = (int) (((f17 + context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv)) - context.getResources().getDimension(com.tencent.mm.R.dimen.aia)) / 3);
        int i19 = (dimension / 3) * 4;
        if (layoutParams != null) {
            layoutParams.width = dimension;
            layoutParams.height = i19;
            imageView.setLayoutParams(layoutParams);
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        kotlin.jvm.internal.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.B));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.t5b);
        if (textView != null) {
            textView.setText(fl5Var != null ? fl5Var.getString(1) : null);
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.t5c);
        if (textView2 != null) {
            if ((fl5Var != null ? fl5Var.getLong(5) : 0L) > 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Long.valueOf(fl5Var != null ? fl5Var.getLong(5) : 0L);
                textView2.setText(context.getString(com.tencent.mm.R.string.obg, objArr));
                textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl), textView2.getTotalPaddingBottom());
            } else {
                textView2.setText((java.lang.CharSequence) null);
                textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), 0, textView2.getTotalPaddingBottom());
            }
        }
        if ((fl5Var != null ? fl5Var.getLong(3) : 0L) > 0) {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.t5_);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Long.valueOf(fl5Var != null ? fl5Var.getLong(3) : 0L);
            textView3.setText(context.getString(com.tencent.mm.R.string.nyd, objArr2));
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.t5_)).setVisibility(8);
        }
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        hc2.v0.e(itemView, "native_drama_halfscreen_card", 0, 0, false, false, null, new com.tencent.mm.plugin.finder.drama.drawer.m(this.f105261f, item), 62, null);
    }
}
