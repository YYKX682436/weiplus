package zf2;

/* loaded from: classes3.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aov;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lm2.b item = (lm2.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        se2.w wVar = se2.w.f488428a;
        if (wVar.j(holder, item, i17, i18, z17, list)) {
            return;
        }
        if (zl2.r4.f555483a.y(item)) {
            holder.p(com.p314xaae8f345.mm.R.id.awh).setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a08));
        } else {
            holder.p(com.p314xaae8f345.mm.R.id.awh).setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14369xe0f0e9a5 c14369xe0f0e9a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14369xe0f0e9a5) holder.p(com.p314xaae8f345.mm.R.id.awi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14369xe0f0e9a5);
        wVar.q(c14369xe0f0e9a5);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.text.TextPaint m84162x74f59ea8 = c14369xe0f0e9a5.m84162x74f59ea8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea8, "getPaint(...)");
        java.lang.String f17 = wVar.f(context, m84162x74f59ea8, item);
        java.lang.String str = item.f400901m;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgContent");
            throw null;
        }
        java.lang.String c17 = wVar.c(f17, str);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, c17, 0.0f));
        f0Var.c((android.text.style.ForegroundColorSpan) ((jz5.n) se2.w.f488432e).mo141623x754a37bb(), 1, f17.length() + 1, 33);
        c14369xe0f0e9a5.b(f0Var);
        wVar.i(c14369xe0f0e9a5, item.c(), 0, 1, wVar.e(), f0Var);
        wVar.r(holder, item, null);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.awh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        wVar.o("AtCommentConvert", holder, false, item, p17);
        wVar.p("AtCommentConvert", holder, item);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
