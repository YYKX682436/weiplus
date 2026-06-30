package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class c1 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95301e;

    public c1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI) {
        this.f95301e = vipCardListUI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488326q8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.card.ui.v3.t0 item = (com.tencent.mm.plugin.card.ui.v3.t0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.bwc);
        textView.setText(item.a().f386766e);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        holder.s(com.tencent.mm.R.id.f483733bw5, item.a().f386767f);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.bw7);
        java.lang.String str = item.a().f386779u;
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95301e;
        if (str != null) {
            int dimensionPixelSize = vipCardListUI.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
            kotlin.jvm.internal.o.d(imageView);
            java.lang.String card_icon_url = item.a().f386779u;
            kotlin.jvm.internal.o.f(card_icon_url, "card_icon_url");
            lu1.b0.c(imageView, card_icon_url, 0.0f, false, com.tencent.mm.R.raw.card_default_merchant_icon, dimensionPixelSize, dimensionPixelSize, 12, null);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.bw9);
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        if (item.a().f386771m.isEmpty()) {
            linearLayout.setVisibility(8);
        } else {
            java.util.LinkedList<r45.st> coupon_label = item.a().f386771m;
            kotlin.jvm.internal.o.f(coupon_label, "coupon_label");
            for (r45.st stVar : coupon_label) {
                com.tencent.mm.plugin.card.widget.CardTagTextView cardTagTextView = new com.tencent.mm.plugin.card.widget.CardTagTextView(vipCardListUI.getContext());
                androidx.appcompat.app.AppCompatActivity context = vipCardListUI.getContext();
                cardTagTextView.setMinHeight(i65.a.b(context, 18));
                cardTagTextView.setMinWidth(i65.a.b(context, 56));
                int b17 = i65.a.b(context, 8);
                int b18 = i65.a.b(context, 4);
                cardTagTextView.setPadding(b17, b18, b17, b18);
                cardTagTextView.setText(stVar.f385967d);
                cardTagTextView.setTextSize(1, 10.0f);
                if (com.tencent.mm.sdk.platformtools.t8.K0(stVar.f385968e)) {
                    cardTagTextView.setTextColor(-1);
                } else {
                    cardTagTextView.setTextColor(android.graphics.Color.parseColor(stVar.f385968e));
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(stVar.f385969f)) {
                    cardTagTextView.setFillColor(lu1.a0.a(-16777216, 26));
                } else {
                    cardTagTextView.setFillColor(lu1.a0.b(stVar.f385969f, stVar.f385972i));
                }
                linearLayout.addView(cardTagTextView);
            }
            linearLayout.setVisibility(0);
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f483731bw3);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView memberCardTopCropImageView = (com.tencent.mm.plugin.card.widget.MemberCardTopCropImageView) p17;
        java.lang.Object tag = memberCardTopCropImageView.getTag();
        java.lang.String str2 = item.a().f386765d;
        if (str2 == null) {
            str2 = "";
        }
        if ((tag instanceof java.lang.String) && !android.text.TextUtils.isEmpty((java.lang.CharSequence) tag) && tag.equals(str2)) {
            return;
        }
        memberCardTopCropImageView.setTag(str2);
        com.tencent.mm.plugin.card.ui.v3.v0 v0Var = new com.tencent.mm.plugin.card.ui.v3.v0(vipCardListUI, memberCardTopCropImageView, item);
        if (vipCardListUI.N <= 0 || vipCardListUI.P <= 0) {
            vipCardListUI.N = holder.itemView.getHeight();
            int width = holder.itemView.getWidth();
            vipCardListUI.P = width;
            if (vipCardListUI.N <= 0 || width <= 0) {
                holder.itemView.post(new com.tencent.mm.plugin.card.ui.v3.u0(vipCardListUI, holder, v0Var));
                return;
            }
        }
        v0Var.invoke();
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.widget.RoundCornerImageView roundCornerImageView = (com.tencent.mm.ui.widget.RoundCornerImageView) holder.p(com.tencent.mm.R.id.bw7);
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95301e;
        roundCornerImageView.r(i65.a.b(vipCardListUI.getContext(), 1), vipCardListUI.getResources().getColor(com.tencent.mm.R.color.f478553an));
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.card.ui.v3.w0(holder, vipCardListUI));
        holder.itemView.setOnLongClickListener(new com.tencent.mm.plugin.card.ui.v3.z0(holder, vipCardListUI, this));
    }
}
