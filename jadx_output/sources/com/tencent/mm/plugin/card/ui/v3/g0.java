package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class g0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CouponCardListUI f95322e;

    public g0(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI) {
        this.f95322e = couponCardListUI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488319q1;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        boolean z18;
        com.tencent.mm.plugin.card.ui.v3.w item = (com.tencent.mm.plugin.card.ui.v3.w) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.wt a17 = item.a();
        java.lang.String str = a17.f389428e;
        if (str == null || str.length() == 0) {
            ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.bvk)).setImageResource(com.tencent.mm.R.raw.card_default_merchant_icon);
        } else {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.bvk);
            kotlin.jvm.internal.o.f(p17, "getView(...)");
            java.lang.String card_element_mch_icon = a17.f389428e;
            kotlin.jvm.internal.o.f(card_element_mch_icon, "card_element_mch_icon");
            lu1.b0.c((android.widget.ImageView) p17, card_element_mch_icon, 0.0f, true, com.tencent.mm.R.raw.card_default_merchant_icon, 0, 0, 100, null);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.bvk);
        com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95322e;
        com.tencent.mm.plugin.card.ui.v3.b0 b0Var = new com.tencent.mm.plugin.card.ui.v3.b0(couponCardListUI, holder);
        imageView.setOnClickListener(b0Var);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.bvo);
        java.lang.String str2 = a17.f389429f;
        if (str2 == null || str2.length() == 0) {
            textView.setText("");
        } else {
            com.tencent.mm.plugin.card.ui.v3.v vVar = new com.tencent.mm.plugin.card.ui.v3.v(couponCardListUI, couponCardListUI.getContext().getResources().getColor(com.tencent.mm.R.color.a0c), couponCardListUI.getContext().getResources().getColor(com.tencent.mm.R.color.f479514a61), new com.tencent.mm.plugin.card.ui.v3.c0(b0Var));
            android.text.SpannableString spannableString = new android.text.SpannableString(a17.f389429f);
            spannableString.setSpan(vVar, 0, spannableString.length(), 18);
            textView.setClickable(true);
            textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(couponCardListUI.getContext()));
            textView.setText(spannableString);
        }
        boolean z19 = !item.f95393f ? a17.f389441u == 1 : item.f95392e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.bvd);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.tencent.mm.R.id.bvg);
        viewGroup.removeAllViews();
        java.util.LinkedList card_element_coupon_list = a17.f389436p;
        int i27 = 8;
        if (z19) {
            kotlin.jvm.internal.o.f(card_element_coupon_list, "card_element_coupon_list");
            if (!card_element_coupon_list.isEmpty()) {
                o(-1, card_element_coupon_list.size(), holder, item, i17);
                viewGroup.setVisibility(0);
                item.f95392e = true;
                i27 = 8;
            } else {
                viewGroup.setVisibility(8);
            }
            java.lang.String str3 = a17.f389437q;
            if (!(str3 == null || str3.length() == 0)) {
                r(holder, item, i17);
                viewGroup2.setVisibility(0);
            } else if (a17.f389443w < card_element_coupon_list.size()) {
                p(holder, item, i17);
            } else {
                viewGroup2.setVisibility(i27);
            }
            z18 = true;
        } else {
            kotlin.jvm.internal.o.f(card_element_coupon_list, "card_element_coupon_list");
            if (!card_element_coupon_list.isEmpty()) {
                i19 = 8;
                o(-1, a17.f389443w, holder, item, i17);
                viewGroup.setVisibility(0);
                item.f95392e = false;
            } else {
                i19 = 8;
                viewGroup.setVisibility(8);
            }
            if (a17.f389443w >= card_element_coupon_list.size()) {
                java.lang.String str4 = a17.f389437q;
                if (str4 == null || str4.length() == 0) {
                    viewGroup2.setVisibility(i19);
                } else {
                    r(holder, item, i17);
                    viewGroup2.setVisibility(0);
                }
            } else {
                q(holder, item, i17);
                viewGroup2.setVisibility(0);
            }
            z18 = true;
        }
        item.f95393f = z18;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void n(android.view.View view, android.view.ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view);
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, i65.a.b(viewGroup.getContext(), 84));
        marginLayoutParams.topMargin = i65.a.b(viewGroup.getContext(), 8);
        viewGroup.addView(view, new android.widget.LinearLayout.LayoutParams(marginLayoutParams));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x022d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0238 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r20, int r21, in5.s0 r22, com.tencent.mm.plugin.card.ui.v3.w r23, int r24) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.card.ui.v3.g0.o(int, int, in5.s0, com.tencent.mm.plugin.card.ui.v3.w, int):void");
    }

    public final void p(in5.s0 s0Var, com.tencent.mm.plugin.card.ui.v3.w wVar, int i17) {
        wVar.a();
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.bvh);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.bvf);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.bvg);
        textView.setText(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.asq));
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.card.ui.v3.d0(this, s0Var, wVar, i17));
        imageView.setImageResource(com.tencent.mm.R.drawable.f481127bz1);
        imageView.setVisibility(0);
    }

    public final void q(in5.s0 s0Var, com.tencent.mm.plugin.card.ui.v3.w wVar, int i17) {
        r45.wt a17 = wVar.a();
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.bvh);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.bvf);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.bvg);
        textView.setText(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.ass, java.lang.Integer.valueOf(a17.f389442v - a17.f389443w)));
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.card.ui.v3.e0(this.f95322e, this, s0Var, wVar, i17));
        imageView.setImageResource(com.tencent.mm.R.drawable.f481126bz0);
        imageView.setVisibility(0);
    }

    public final void r(in5.s0 s0Var, com.tencent.mm.plugin.card.ui.v3.w wVar, int i17) {
        r45.wt a17 = wVar.a();
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.bvh);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.bvf);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.bvg);
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17.f389437q)) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f389438r)) {
            textView.setTextColor(android.graphics.Color.parseColor(a17.f389438r));
        }
        textView.setText(a17.f389437q);
        imageView.setImageResource(com.tencent.mm.R.drawable.byh);
        viewGroup.setOnClickListener(new com.tencent.mm.plugin.card.ui.v3.f0(a17));
    }

    public final void s(java.util.List list, android.widget.LinearLayout linearLayout) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.st stVar = (r45.st) it.next();
            com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI = this.f95322e;
            com.tencent.mm.plugin.card.widget.CardTagTextView cardTagTextView = new com.tencent.mm.plugin.card.widget.CardTagTextView(couponCardListUI.getContext());
            androidx.appcompat.app.AppCompatActivity context = couponCardListUI.getContext();
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
    }
}
