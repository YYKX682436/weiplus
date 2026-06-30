package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class k extends com.tencent.mm.plugin.finder.convert.eh {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.gallery.m f111388r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.gallery.m mVar) {
        super(0, null, null, null, 15, null);
        this.f111388r = mVar;
    }

    @Override // com.tencent.mm.plugin.finder.convert.eh, in5.r
    /* renamed from: q */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.finder.gallery.m mVar = this.f111388r;
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
            com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView imageIndicatorView = (com.tencent.mm.plugin.sns.ui.view.ImageIndicatorView) holder.p(com.tencent.mm.R.id.h9l);
            if (imageIndicatorView != null) {
                imageIndicatorView.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478514w));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e_e);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fuv);
        imageView.setClickable(false);
        imageView.setEnabled(false);
        textView3.setClickable(false);
        textView3.setEnabled(false);
        pd2.d dVar = pd2.d.f353545a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        dVar.a(itemView, item, true, mVar.d());
    }
}
