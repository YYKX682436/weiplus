package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ut extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f104739e;

    public ut(java.lang.String reportSessionId) {
        kotlin.jvm.internal.o.g(reportSessionId, "reportSessionId");
        this.f104739e = reportSessionId;
    }

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i17 = ty2.y.f423122m;
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ty2.y yVar = new ty2.y(context, ty2.u.f423116d, null);
        float b17 = i65.a.b(context, 8);
        yVar.setCornerRadius(new com.tencent.mm.plugin.finder.feed.f30(b17, b17, b17, b17));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i65.a.d(context, com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.BW_100_Alpha_0_0_8 : com.tencent.mm.R.color.f478553an));
        com.tencent.mm.plugin.finder.feed.f30 cornerRadius = yVar.getCornerRadius();
        if (cornerRadius != null) {
            float f17 = cornerRadius.f106697a;
            float f18 = cornerRadius.f106698b;
            float f19 = cornerRadius.f106700d;
            float f27 = cornerRadius.f106699c;
            gradientDrawable.setCornerRadii(new float[]{f17, f17, f18, f18, f19, f19, f27, f27});
        }
        yVar.setBackground(gradientDrawable);
        return yVar;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.q1 item = (so2.q1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        android.view.View itemView = holder.itemView;
        if (itemView instanceof ty2.y) {
            kotlin.jvm.internal.o.f(itemView, "itemView");
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(itemView, "product_tab_product_card");
            aVar.Ai(itemView, new com.tencent.mm.plugin.finder.convert.tt(itemView, this, i17, item));
            aVar.Tj(itemView, 40, 12, false);
            android.content.Context context = holder.f293121e;
            int B = i65.a.B(context) - (i65.a.a(context, 24.0f) / 2);
            android.view.View view = holder.itemView;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.product.ProductCardView");
            ((ty2.y) view).d(item.f410545d, B);
        }
    }
}
