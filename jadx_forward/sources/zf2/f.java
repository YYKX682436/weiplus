package zf2;

/* loaded from: classes3.dex */
public final class f extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aov;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        lm2.m0 item = (lm2.m0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        se2.w wVar = se2.w.f488428a;
        if (wVar.j(holder, item, i17, i18, z17, list)) {
            return;
        }
        boolean A = zl2.r4.f555483a.A(item);
        android.content.Context context = holder.f374654e;
        if (A) {
            holder.p(com.p314xaae8f345.mm.R.id.awh).setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a08));
        } else {
            holder.p(com.p314xaae8f345.mm.R.id.awh).setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14369xe0f0e9a5 c14369xe0f0e9a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14369xe0f0e9a5) holder.p(com.p314xaae8f345.mm.R.id.awi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14369xe0f0e9a5);
        wVar.q(c14369xe0f0e9a5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.x.f197275a;
        java.lang.String a17 = item.a();
        java.lang.String c17 = item.c();
        java.lang.String b17 = item.b();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String e17 = xVar.e(a17, c17, b17, false);
        i95.m c18 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        c61.yb ybVar = (c61.yb) c18;
        android.text.TextPaint m84162x74f59ea8 = c14369xe0f0e9a5.m84162x74f59ea8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea8, "getPaint(...)");
        java.lang.String obj = c61.yb.nf(ybVar, context, m84162x74f59ea8, e17, 0, 8, null).toString();
        java.lang.String a18 = item.a();
        java.lang.String f17 = item.f();
        r45.xn1 xn1Var = (r45.xn1) item.f400905e.m75936x14adae67(0);
        java.lang.String m76184x8010e5e4 = (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4();
        if (m76184x8010e5e4 == null) {
            m76184x8010e5e4 = "";
        }
        java.lang.String e18 = xVar.e(a18, f17, m76184x8010e5e4, false);
        i95.m c19 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        c61.yb ybVar2 = (c61.yb) c19;
        android.text.TextPaint m84162x74f59ea82 = c14369xe0f0e9a5.m84162x74f59ea8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea82, "getPaint(...)");
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gc8, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efj, obj, c61.yb.nf(ybVar2, context, m84162x74f59ea82, e18, 0, 8, null).toString()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String str2 = item.f400959i;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("msgContent");
            throw null;
        }
        java.lang.String c27 = wVar.c(string, str2);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, c27, 0.0f));
        f0Var.c((android.text.style.ForegroundColorSpan) ((jz5.n) se2.w.f488432e).mo141623x754a37bb(), 1, string.length() + 1, 33);
        c14369xe0f0e9a5.b(f0Var);
        wVar.i(c14369xe0f0e9a5, item.c(), 0, 1, wVar.e(), f0Var);
        wVar.r(holder, item, null);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.awh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        wVar.o("ReplyCommentConvert", holder, false, item, p17);
        wVar.p("ReplyCommentConvert", holder, item);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
