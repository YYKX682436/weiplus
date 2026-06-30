package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ut extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186272e;

    public ut(java.lang.String reportSessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportSessionId, "reportSessionId");
        this.f186272e = reportSessionId;
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int i17 = ty2.y.f504655m;
        android.content.Context context = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ty2.y yVar = new ty2.y(context, ty2.u.f504649d, null);
        float b17 = i65.a.b(context, 8);
        yVar.m56019xba0484c9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f30(b17, b17, b17, b17));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i65.a.d(context, com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77666x8b2be3e1 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f30 cornerRadius = yVar.getCornerRadius();
        if (cornerRadius != null) {
            float f17 = cornerRadius.f188230a;
            float f18 = cornerRadius.f188231b;
            float f19 = cornerRadius.f188233d;
            float f27 = cornerRadius.f188232c;
            gradientDrawable.setCornerRadii(new float[]{f17, f17, f18, f18, f19, f19, f27, f27});
        }
        yVar.setBackground(gradientDrawable);
        return yVar;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.q1 item = (so2.q1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.view.View itemView = holder.f3639x46306858;
        if (itemView instanceof ty2.y) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(itemView, "product_tab_product_card");
            aVar.Ai(itemView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tt(itemView, this, i17, item));
            aVar.Tj(itemView, 40, 12, false);
            android.content.Context context = holder.f374654e;
            int B = i65.a.B(context) - (i65.a.a(context, 24.0f) / 2);
            android.view.View view = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.product.ProductCardView");
            ((ty2.y) view).d(item.f492078d, B);
        }
    }
}
