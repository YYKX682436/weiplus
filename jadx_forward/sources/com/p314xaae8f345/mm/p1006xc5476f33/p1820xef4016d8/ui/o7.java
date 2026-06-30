package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class o7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d f228797e;

    public o7(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d) {
        this.f228797e = activityC16371xf216ae6d;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bv7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.k7 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.k7) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.h5 h5Var = item.f228631d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = this.f228797e;
        if (activityC16371xf216ae6d.Q2 == 7) {
            holder.w(com.p314xaae8f345.mm.R.id.j6l, 8);
        } else {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.j6l);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.b(p17 instanceof android.widget.ImageView ? (android.widget.ImageView) p17 : null, h5Var != null ? h5Var.f226846e : null, h5Var != null ? h5Var.f226852n : null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var != null ? h5Var.f226849h : null)) {
            holder.w(com.p314xaae8f345.mm.R.id.j6k, 8);
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16371xf216ae6d.mo55332x76847179();
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.j6k);
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x76847179, p18 instanceof android.widget.TextView ? (android.widget.TextView) p18 : null, h5Var != null ? h5Var.f226849h : null);
            holder.w(com.p314xaae8f345.mm.R.id.j6k, 0);
        }
        holder.s(com.p314xaae8f345.mm.R.id.j6q, com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.f(activityC16371xf216ae6d.mo55332x76847179(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(h5Var != null ? h5Var.f226848g : null, 0L) * 1000));
        holder.w(com.p314xaae8f345.mm.R.id.j6q, 0);
        holder.w(com.p314xaae8f345.mm.R.id.j6r, 8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var != null ? h5Var.f226854p : null)) {
            if (h5Var != null && h5Var.f226855q) {
                holder.s(com.p314xaae8f345.mm.R.id.j6p, "");
                android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.j6p);
                android.widget.TextView textView = p19 instanceof android.widget.TextView ? (android.widget.TextView) p19 : null;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = h5Var != null ? h5Var.f226852n : null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[tryGetReceiveName] username: %s", objArr);
                if (textView != null) {
                    textView.setTag(h5Var != null ? h5Var.f226852n : null);
                }
                ((java.util.HashSet) activityC16371xf216ae6d.f227752r2).add(h5Var != null ? h5Var.f226852n : null);
                ((c01.k7) c01.n8.a()).b(h5Var != null ? h5Var.f226852n : null, 4, new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.n7(h5Var, activityC16371xf216ae6d, textView));
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC16371xf216ae6d.mo55332x76847179();
                android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.j6p);
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.E(mo55332x768471792, p27 instanceof android.widget.TextView ? (android.widget.TextView) p27 : null, h5Var != null ? h5Var.f226845d : null);
            }
        } else {
            android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.j6p);
            android.widget.TextView textView2 = p28 instanceof android.widget.TextView ? (android.widget.TextView) p28 : null;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471793 = activityC16371xf216ae6d.mo55332x76847179();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(h5Var != null ? h5Var.f226845d : null);
            sb6.append(h5Var != null ? h5Var.f226854p : null);
            java.lang.String sb7 = sb6.toString();
            float textSize = textView2 != null ? textView2.getTextSize() : 0.0f;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471793, sb7, textSize);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471794 = activityC16371xf216ae6d.mo55332x76847179();
            java.lang.String str = h5Var != null ? h5Var.f226845d : null;
            float textSize2 = textView2 != null ? textView2.getTextSize() : 0.0f;
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString j18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(mo55332x768471794, str, textSize2);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(j17);
            spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.d7("#FA9D3B", com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.l7.f228662a), j18.length(), j17.length(), 18);
            if (textView2 != null) {
                textView2.setText(spannableStringBuilder);
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471795 = activityC16371xf216ae6d.mo55332x76847179();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o((h5Var != null ? h5Var.f226847f : 0L) / 100.0d);
        java.lang.String string = mo55332x768471795.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gna, objArr2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        holder.s(com.p314xaae8f345.mm.R.id.j6j, string);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var != null ? h5Var.f226853o : null)) {
            holder.w(com.p314xaae8f345.mm.R.id.j6o, 8);
        } else {
            holder.s(com.p314xaae8f345.mm.R.id.j6o, h5Var != null ? h5Var.f226853o : null);
            holder.w(com.p314xaae8f345.mm.R.id.j6o, 0);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h5Var != null ? h5Var.f226851m : null)) {
            holder.w(com.p314xaae8f345.mm.R.id.j6m, 8);
            holder.w(com.p314xaae8f345.mm.R.id.j6n, 8);
        } else {
            holder.s(com.p314xaae8f345.mm.R.id.j6n, h5Var != null ? h5Var.f226851m : null);
            if (activityC16371xf216ae6d.Q2 == 2) {
                android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.j6m);
                android.widget.ImageView imageView = p29 instanceof android.widget.ImageView ? (android.widget.ImageView) p29 : null;
                if (imageView != null) {
                    imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_a);
                }
            } else {
                android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.j6m);
                android.widget.ImageView imageView2 = p37 instanceof android.widget.ImageView ? (android.widget.ImageView) p37 : null;
                if (imageView2 != null) {
                    imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c99);
                }
            }
            holder.w(com.p314xaae8f345.mm.R.id.j6m, 0);
            holder.w(com.p314xaae8f345.mm.R.id.j6n, 0);
        }
        java.util.ArrayList arrayList = activityC16371xf216ae6d.T1;
        if (!arrayList.isEmpty()) {
            android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.uef);
            if (!(p38 instanceof android.view.View)) {
                p38 = null;
            }
            if (p38 != null) {
                android.view.ViewGroup.LayoutParams layoutParams = p38.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (i17 == arrayList.size() - 1) {
                    if (layoutParams2 != null) {
                        layoutParams2.leftMargin = i65.a.b(activityC16371xf216ae6d.mo55332x76847179(), 0);
                    }
                } else if (layoutParams2 != null) {
                    layoutParams2.leftMargin = i65.a.b(activityC16371xf216ae6d.mo55332x76847179(), 76);
                }
                p38.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
