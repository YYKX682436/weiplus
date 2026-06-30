package ti2;

/* loaded from: classes3.dex */
public final class s extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ds6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vi2.l item = (vi2.l) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.kb_);
        android.widget.TextView textView2 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.rtq);
        android.widget.TextView textView3 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.s0x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        hc2.o.a(textView3, false);
        ((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hc6)).setText(java.lang.String.valueOf(i17 + 1));
        r45.if5 if5Var = item.f519086d;
        r45.xn1 xn1Var = (r45.xn1) if5Var.m75936x14adae67(1);
        if (xn1Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
            if (c19782x23db1cfa != null) {
                c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                android.content.Context context = textView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                android.text.TextPaint paint = textView.getPaint();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
                zl2.q4 q4Var = zl2.q4.f555466a;
                java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
                if (m76197x6c03c64c == null) {
                    m76197x6c03c64c = "";
                }
                java.lang.String m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
                textView.setText(new android.text.SpannableString(((c61.p2) ybVar).cj(context, paint, q4Var.p(m76197x6c03c64c, m76184x8010e5e4 != null ? m76184x8010e5e4 : "", false), 20)));
            }
            gm2.c1 c1Var = gm2.c1.f354853a;
            android.content.Context context2 = textView2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            textView2.setText((java.lang.CharSequence) gm2.c1.d(c1Var, textView2, context2, " ", xn1Var.m75941xfb821914(11), new int[]{2, 4, 18, 12}, gm2.c2.f354883i, null, 0, null, null, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, null).f384366d);
        }
        textView3.setText(java.lang.String.valueOf(if5Var.m75939xb282bd08(2)));
    }
}
