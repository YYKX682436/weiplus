package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class j extends com.tencent.mm.plugin.finder.convert.zk {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.m f111385r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.finder.gallery.m mVar) {
        super(0, null, null, null, 15, null);
        this.f111385r = mVar;
    }

    @Override // com.tencent.mm.plugin.finder.convert.zk, in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.finder.gallery.m mVar = this.f111385r;
        if (mVar.d()) {
            android.content.Context context = holder.f293121e;
            int color = context.getResources().getColor(com.tencent.mm.R.color.f478514w);
            int color2 = context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8);
            int color3 = context.getResources().getColor(com.tencent.mm.R.color.f478553an);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.f484870fs4);
            if (p17 != null) {
                p17.setBackgroundColor(color);
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
            if (textView != null) {
                textView.setTextColor(color2);
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
            if (textView2 != null) {
                textView2.setTextColor(color3);
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ebv);
        if (textView3 != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(item.getFeedObject().getDescription())) {
                textView3.setVisibility(8);
                textView3.setText("");
            } else {
                textView3.setVisibility(0);
                com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
                int i19 = com.tencent.mm.plugin.finder.search.l4.f125762b;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                java.lang.String description = item.getFeedObject().getDescription();
                android.text.TextPaint paint = textView3.getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                android.text.Spanned b17 = l4Var.b(description, paint, i19, "", true);
                ((ke0.e) xVar).getClass();
                textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.n(context2, b17, 0.0f));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e_e);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
        imageView.setClickable(false);
        imageView.setEnabled(false);
        textView4.setClickable(false);
        textView4.setEnabled(false);
        pd2.d dVar = pd2.d.f353545a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        dVar.a(itemView, item, true, mVar.d());
    }
}
