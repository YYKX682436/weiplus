package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class j extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95335e;

    public j(com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI) {
        this.f95335e = cardHomePageV3UI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488323q5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.card.ui.v3.a item = (com.tencent.mm.plugin.card.ui.v3.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.s(com.tencent.mm.R.id.bvx, item.a().f391344g);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.tencent.mm.R.id.bvx)).getPaint(), 0.8f);
        holder.s(com.tencent.mm.R.id.bvr, item.a().f391343f);
        java.lang.Object tag = holder.itemView.getTag();
        java.lang.String str = item.a().f391342e;
        if (str == null) {
            str = "";
        }
        if ((tag instanceof java.lang.String) && !android.text.TextUtils.isEmpty((java.lang.CharSequence) tag) && tag.equals(str)) {
            return;
        }
        holder.itemView.setTag(str);
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) holder.p(com.tencent.mm.R.id.bvs);
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95335e;
        roundCornerImageView.r(i65.a.b(cardHomePageV3UI.getContext(), 1), cardHomePageV3UI.getResources().getColor(com.tencent.mm.R.color.f478553an));
        roundCornerImageView.setImageDrawable(null);
        java.lang.String str2 = item.a().f391348n;
        if (str2 != null) {
            int dimensionPixelSize = cardHomePageV3UI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
            lu1.b0.b(roundCornerImageView, str2, 0.0f, true, com.tencent.mm.R.raw.card_default_merchant_icon, dimensionPixelSize, dimensionPixelSize);
        }
        if (item.a().f391347m == 3) {
            holder.v(com.tencent.mm.R.id.bvx, cardHomePageV3UI.getResources().getColor(com.tencent.mm.R.color.f_));
            holder.v(com.tencent.mm.R.id.bvr, cardHomePageV3UI.getResources().getColor(com.tencent.mm.R.color.f_));
            android.view.View p17 = holder.p(com.tencent.mm.R.id.bvx);
            kotlin.jvm.internal.o.f(p17, "getView(...)");
            ((android.widget.TextView) p17).setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            android.view.View p18 = holder.p(com.tencent.mm.R.id.bvr);
            kotlin.jvm.internal.o.f(p18, "getView(...)");
            ((android.widget.TextView) p18).setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            holder.w(com.tencent.mm.R.id.bvq, 8);
            holder.w(com.tencent.mm.R.id.bvu, 0);
            holder.w(com.tencent.mm.R.id.bvp, 8);
            return;
        }
        holder.v(com.tencent.mm.R.id.bvx, cardHomePageV3UI.getResources().getColor(com.tencent.mm.R.color.f478553an));
        holder.v(com.tencent.mm.R.id.bvr, cardHomePageV3UI.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        android.view.View p19 = holder.p(com.tencent.mm.R.id.bvx);
        kotlin.jvm.internal.o.f(p19, "getView(...)");
        ((android.widget.TextView) p19).setShadowLayer(i65.a.b(r13.getContext(), 4), 0.0f, 0.0f, cardHomePageV3UI.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_2));
        android.view.View p27 = holder.p(com.tencent.mm.R.id.bvr);
        kotlin.jvm.internal.o.f(p27, "getView(...)");
        ((android.widget.TextView) p27).setShadowLayer(i65.a.b(r13.getContext(), 4), 0.0f, 0.0f, cardHomePageV3UI.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_2));
        holder.w(com.tencent.mm.R.id.bvu, 8);
        android.view.View p28 = holder.p(com.tencent.mm.R.id.bvq);
        kotlin.jvm.internal.o.f(p28, "getView(...)");
        com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView = (com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView) p28;
        memberCardTopCropImageView.setImageDrawable(null);
        com.tencent.mm.plugin.card.ui.v3.c cVar2 = new com.tencent.mm.plugin.card.ui.v3.c(cardHomePageV3UI, holder, memberCardTopCropImageView, item);
        if (cardHomePageV3UI.f95250w <= 0 || cardHomePageV3UI.f95251x <= 0) {
            cardHomePageV3UI.f95250w = holder.itemView.getHeight();
            int width = holder.itemView.getWidth();
            cardHomePageV3UI.f95251x = width;
            if (cardHomePageV3UI.f95250w <= 0 || width <= 0) {
                holder.itemView.post(new com.tencent.mm.plugin.card.ui.v3.b(cardHomePageV3UI, holder, cVar2));
                return;
            }
        }
        cVar2.invoke();
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.bvw);
        com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI = this.f95335e;
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.card.ui.v3.d(holder, cardHomePageV3UI));
        viewGroup.setOnLongClickListener(new com.tencent.mm.plugin.card.ui.v3.g(holder, cardHomePageV3UI, this));
    }
}
