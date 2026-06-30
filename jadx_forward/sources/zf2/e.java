package zf2;

/* loaded from: classes3.dex */
public final class e extends in5.r {
    public static final void n(zf2.e eVar, android.content.Context context, r45.ze2 ze2Var) {
        eVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        r45.f96 f96Var = new r45.f96();
        f96Var.set(1, java.lang.Float.valueOf(ze2Var.m75938x746dc8a6(1)));
        f96Var.set(0, java.lang.Float.valueOf(ze2Var.m75938x746dc8a6(0)));
        intent.putExtra("key_location", f96Var.mo14344x5f01b1f6());
        intent.putExtra("key_from_type", zy2.o9.f559050e);
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context);
        if (Sj != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj;
            intent.putExtra("key_from_scene", nyVar.f216913n);
            intent.putExtra("key_context_id", nyVar.f216915p);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        g0Var.B(1663L, 8L);
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a c20298x46d4560a = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a();
        if (j62.e.g().c(c20298x46d4560a) == 1 || bm5.o1.f104252a.h(c20298x46d4560a) == 1) {
            java.lang.String m75945x2fec8307 = ze2Var.m75945x2fec8307(5);
            if (!(m75945x2fec8307 != null && r26.i0.y(m75945x2fec8307, "foursquare_", false)) && ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.b1().r()).intValue() != 0) {
                i95.m c17 = i95.n0.c(c61.ub.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.ub.w2((c61.ub) c17, context, intent, f96Var, 0, 8, null);
                return;
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Uk(context, intent);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aov;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int L;
        lm2.l0 item = (lm2.l0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        se2.w wVar = se2.w.f488428a;
        if (wVar.j(holder, item, i17, i18, z17, list)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14369xe0f0e9a5 c14369xe0f0e9a5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14369xe0f0e9a5) holder.p(com.p314xaae8f345.mm.R.id.awi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14369xe0f0e9a5);
        wVar.q(c14369xe0f0e9a5);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.text.TextPaint m84162x74f59ea8 = c14369xe0f0e9a5.m84162x74f59ea8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m84162x74f59ea8, "getPaint(...)");
        java.lang.String f17 = wVar.f(context, m84162x74f59ea8, item);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573033da0, item.i().m75945x2fec8307(2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String j17 = !(item.j().length() == 0) ? item.j() : string;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j17, string);
        java.lang.String c17 = wVar.c(f17, j17);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.n(context, c17, 0.0f));
        f0Var.c((android.text.style.ForegroundColorSpan) ((jz5.n) se2.w.f488432e).mo141623x754a37bb(), 1, f17.length() + 1, 33);
        r45.ze2 i19 = item.i();
        java.lang.String m75945x2fec8307 = i19.m75945x2fec8307(2);
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && (L = r26.n0.L(f0Var, m75945x2fec8307, 0, false, 6, null)) >= 0 && m75945x2fec8307.length() + L <= f0Var.length()) {
            f0Var.c(new zf2.c(this, context, i19), L, m75945x2fec8307.length() + L, 33);
        }
        if (b17) {
            r45.ze2 i27 = item.i();
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79787x448e46cd);
            com.p314xaae8f345.mm.ui.uk.f(drawable, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560584of));
            drawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) se2.w.f488435h).mo141623x754a37bb()).intValue(), se2.w.f488436i);
            f0Var.c(new al5.w(drawable, 1), f0Var.length() - 1, f0Var.length(), 33);
            f0Var.c(new zf2.d(this, context, i27), f0Var.length() - 1, f0Var.length(), 33);
        }
        c14369xe0f0e9a5.b(f0Var);
        wVar.i(c14369xe0f0e9a5, item.c(), 0, 1, wVar.e(), f0Var);
        wVar.r(holder, item, null);
        holder.p(com.p314xaae8f345.mm.R.id.awh).setBackground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.awh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        wVar.o("LocationCommentConvert", holder, false, item, p17);
        wVar.p("LocationCommentConvert", holder, item);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
