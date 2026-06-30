package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class n extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f186793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186794f;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var, int i17) {
        this.f186794f = e0Var;
        this.f186793e = i17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ecv;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.d item = (zb2.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.fl5 fl5Var = item.f552793d;
        mn2.q3 q3Var = new mn2.q3(fl5Var != null ? fl5Var.m75945x2fec8307(2) : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.t5a);
        android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        float f17 = this.f186793e;
        android.content.Context context = holder.f374654e;
        int dimension = (int) (((f17 + context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)) - context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aia)) / 3);
        int i19 = (dimension / 3) * 4;
        if (layoutParams != null) {
            layoutParams.width = dimension;
            layoutParams.height = i19;
            imageView.setLayoutParams(layoutParams);
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.B));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.t5b);
        if (textView != null) {
            textView.setText(fl5Var != null ? fl5Var.m75945x2fec8307(1) : null);
            com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.t5c);
        if (textView2 != null) {
            if ((fl5Var != null ? fl5Var.m75942xfb822ef2(5) : 0L) > 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Long.valueOf(fl5Var != null ? fl5Var.m75942xfb822ef2(5) : 0L);
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.obg, objArr));
                textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), textView2.getTotalPaddingBottom());
            } else {
                textView2.setText((java.lang.CharSequence) null);
                textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), 0, textView2.getTotalPaddingBottom());
            }
        }
        if ((fl5Var != null ? fl5Var.m75942xfb822ef2(3) : 0L) > 0) {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.t5_);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Long.valueOf(fl5Var != null ? fl5Var.m75942xfb822ef2(3) : 0L);
            textView3.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nyd, objArr2));
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.t5_)).setVisibility(8);
        }
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        hc2.v0.e(itemView, "native_drama_halfscreen_card", 0, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.m(this.f186794f, item), 62, null);
    }
}
