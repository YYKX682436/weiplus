package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class zg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh f186648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5466x6fd95d5c f186649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh bhVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5466x6fd95d5c c5466x6fd95d5c) {
        super(0);
        this.f186648d = bhVar;
        this.f186649e = c5466x6fd95d5c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f186648d.f185890J;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5466x6fd95d5c c5466x6fd95d5c = this.f186649e;
        in5.s0 s0Var = c22848x6ddd90cf != null ? (in5.s0) in5.n0.Y(c22848x6ddd90cf, c5466x6fd95d5c.f135804g.f87761a, false, 2, null) : null;
        if (s0Var != null) {
            java.lang.Object obj = s0Var.f374658i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh.f184506y1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.U6).mo141623x754a37bb()).r()).intValue() == 1 && (textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.o2w)) != null) {
                int i18 = c5466x6fd95d5c.f135804g.f87762b;
                if (i18 == -100) {
                    textView.setText("disable");
                    textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5s);
                } else if (i18 == 4) {
                    textView.setText("preload...");
                } else if (i18 == 6) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18);
                    am.bb bbVar = c5466x6fd95d5c.f135804g;
                    sb6.append(bbVar.f87763c);
                    sb6.append("ms\ncgi");
                    sb6.append(bbVar.f87764d);
                    sb6.append("ms\npld");
                    sb6.append(bbVar.f87765e);
                    sb6.append("ms\ncnt");
                    sb6.append(bbVar.f87766f);
                    textView.setText(sb6.toString());
                } else if (i18 == -3 || i18 == -2 || i18 == -1) {
                    textView.setText(java.lang.String.valueOf(i18));
                    textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5t);
                } else if (i18 == 1) {
                    textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b5r);
                    textView.animate().cancel();
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    textView.animate().setDuration(500L).setListener(null).alpha(1.0f).start();
                    textView.setText("...");
                } else if (i18 == 2) {
                    textView.setText("cgi...");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
