package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class g0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 f176855e;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8) {
        this.f176855e = activityC13072x745567c8;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569852q1;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w item = (com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.wt a17 = item.a();
        java.lang.String str = a17.f470961e;
        if (str == null || str.length() == 0) {
            ((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.bvk)).setImageResource(com.p314xaae8f345.mm.R.raw.f78750xb43c3b23);
        } else {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.bvk);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            java.lang.String card_element_mch_icon = a17.f470961e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_element_mch_icon, "card_element_mch_icon");
            lu1.b0.c((android.widget.ImageView) p17, card_element_mch_icon, 0.0f, true, com.p314xaae8f345.mm.R.raw.f78750xb43c3b23, 0, 0, 100, null);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.bvk);
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176855e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.b0(activityC13072x745567c8, holder);
        imageView.setOnClickListener(b0Var);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bvo);
        java.lang.String str2 = a17.f470962f;
        if (str2 == null || str2.length() == 0) {
            textView.setText("");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.v(activityC13072x745567c8, activityC13072x745567c8.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c), activityC13072x745567c8.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561047a61), new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.c0(b0Var));
            android.text.SpannableString spannableString = new android.text.SpannableString(a17.f470962f);
            spannableString.setSpan(vVar, 0, spannableString.length(), 18);
            textView.setClickable(true);
            textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC13072x745567c8.mo55332x76847179()));
            textView.setText(spannableString);
        }
        boolean z19 = !item.f176926f ? a17.f470974u == 1 : item.f176925e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.bvd);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.bvg);
        viewGroup.removeAllViews();
        java.util.LinkedList card_element_coupon_list = a17.f470969p;
        int i27 = 8;
        if (z19) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_element_coupon_list, "card_element_coupon_list");
            if (!card_element_coupon_list.isEmpty()) {
                o(-1, card_element_coupon_list.size(), holder, item, i17);
                viewGroup.setVisibility(0);
                item.f176925e = true;
                i27 = 8;
            } else {
                viewGroup.setVisibility(8);
            }
            java.lang.String str3 = a17.f470970q;
            if (!(str3 == null || str3.length() == 0)) {
                r(holder, item, i17);
                viewGroup2.setVisibility(0);
            } else if (a17.f470976w < card_element_coupon_list.size()) {
                p(holder, item, i17);
            } else {
                viewGroup2.setVisibility(i27);
            }
            z18 = true;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(card_element_coupon_list, "card_element_coupon_list");
            if (!card_element_coupon_list.isEmpty()) {
                i19 = 8;
                o(-1, a17.f470976w, holder, item, i17);
                viewGroup.setVisibility(0);
                item.f176925e = false;
            } else {
                i19 = 8;
                viewGroup.setVisibility(8);
            }
            if (a17.f470976w >= card_element_coupon_list.size()) {
                java.lang.String str4 = a17.f470970q;
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
        item.f176926f = z18;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
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
    public final void o(int r20, int r21, in5.s0 r22, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w r23, int r24) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.g0.o(int, int, in5.s0, com.tencent.mm.plugin.card.ui.v3.w, int):void");
    }

    public final void p(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w wVar, int i17) {
        wVar.a();
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.bvh);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.bvf);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.bvg);
        textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.asq));
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.d0(this, s0Var, wVar, i17));
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562660bz1);
        imageView.setVisibility(0);
    }

    public final void q(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w wVar, int i17) {
        r45.wt a17 = wVar.a();
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.bvh);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.bvf);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.bvg);
        textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ass, java.lang.Integer.valueOf(a17.f470975v - a17.f470976w)));
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.e0(this.f176855e, this, s0Var, wVar, i17));
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562659bz0);
        imageView.setVisibility(0);
    }

    public final void r(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.w wVar, int i17) {
        r45.wt a17 = wVar.a();
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.bvh);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.bvf);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.bvg);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f470970q)) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f470971r)) {
            textView.setTextColor(android.graphics.Color.parseColor(a17.f470971r));
        }
        textView.setText(a17.f470970q);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.byh);
        viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.f0(a17));
    }

    public final void s(java.util.List list, android.widget.LinearLayout linearLayout) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.st stVar = (r45.st) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13072x745567c8 activityC13072x745567c8 = this.f176855e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc c13079x2ba3d9dc = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc(activityC13072x745567c8.mo55332x76847179());
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13072x745567c8.mo55332x76847179();
            c13079x2ba3d9dc.setMinHeight(i65.a.b(mo55332x76847179, 18));
            c13079x2ba3d9dc.setMinWidth(i65.a.b(mo55332x76847179, 56));
            int b17 = i65.a.b(mo55332x76847179, 8);
            int b18 = i65.a.b(mo55332x76847179, 4);
            c13079x2ba3d9dc.setPadding(b17, b18, b17, b18);
            c13079x2ba3d9dc.setText(stVar.f467500d);
            c13079x2ba3d9dc.setTextSize(1, 10.0f);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stVar.f467501e)) {
                c13079x2ba3d9dc.setTextColor(-1);
            } else {
                c13079x2ba3d9dc.setTextColor(android.graphics.Color.parseColor(stVar.f467501e));
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stVar.f467502f)) {
                c13079x2ba3d9dc.m54468x17b1755e(lu1.a0.a(-16777216, 26));
            } else {
                c13079x2ba3d9dc.m54468x17b1755e(lu1.a0.b(stVar.f467502f, stVar.f467505i));
            }
            linearLayout.addView(c13079x2ba3d9dc);
        }
    }
}
