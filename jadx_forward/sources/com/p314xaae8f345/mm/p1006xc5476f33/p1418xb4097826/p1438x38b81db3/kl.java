package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class kl extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jl f185376e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jl(null);

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ako;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Object obj;
        sc2.v8 item = (sc2.v8) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        xc2.p0 p0Var = item.f487850d;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).m75939xb282bd08(2) == 21) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.av avVar = wf6Var != null ? (r45.av) wf6Var.m75936x14adae67(29) : null;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = p0Var.f534767a;
        if (avVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CarouselCardConvert", "onBindViewHolder: carousel_card_style is null, jumpInfoId=" + c19786x6a1e2862.m76501xf2fd2296());
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565125bd3);
        d92.f fVar = d92.f.f309003a;
        if (textView != null) {
            textView.setText(avVar.m75945x2fec8307(1));
            fVar.l(textView, 14.0f, false);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565122bd0);
        if (textView2 != null) {
            textView2.setText(avVar.m75945x2fec8307(2));
            fVar.l(textView2, 12.0f, false);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bcz);
        if (textView3 != null) {
            textView3.setText(avVar.m75945x2fec8307(3));
            fVar.l(textView3, 12.0f, false);
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(avVar.m75945x2fec8307(0), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.B));
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f565124bd2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        b17.c((android.widget.ImageView) p17);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(avVar.m75945x2fec8307(4)) || item.f487851e != -1) {
            try {
                int i19 = item.f487851e;
                if (i19 == -1) {
                    i19 = android.graphics.Color.parseColor(avVar.m75945x2fec8307(4));
                }
                holder.p(com.p314xaae8f345.mm.R.id.f565123bd1).setBackgroundColor(i19);
                ((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.gtg)).setImageDrawable(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{i19, 0}));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CarouselCardConvert", th6, "parse color crash, carouselStyle.bg_color=" + avVar.m75945x2fec8307(4), new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CarouselCardConvert", "onBindViewHolder: pos=" + i17 + ", title=" + avVar.m75945x2fec8307(1) + ", desc=" + avVar.m75945x2fec8307(2) + ", btn_wording=" + avVar.m75945x2fec8307(3) + ", bg_color=" + avVar.m75945x2fec8307(4) + ", jumpId=" + c19786x6a1e2862.m76501xf2fd2296());
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jl jlVar = f185376e;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        layoutParams.width = jlVar.a(context);
    }
}
