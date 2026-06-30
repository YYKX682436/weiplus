package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public abstract class hc {
    public static void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ya yaVar) {
        wl5.x xVar = yaVar.f287592j;
        if (xVar != null) {
            xVar.k();
            wl5.x xVar2 = yaVar.f287592j;
            xVar2.M = true;
            xVar2.N = true;
            xVar2.i();
        }
    }

    public static r15.f b(r15.g gVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context) {
        if (f9Var == null) {
            return null;
        }
        java.lang.String j17 = ti3.i.j(context, f9Var.mo78013xfb85f7b0(), f9Var.U1(), f9Var.A0() == 1);
        if (gVar != null) {
            return r15.h.b(j17, gVar);
        }
        return null;
    }

    public static ti3.l c(yb5.d dVar, float f17, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        boolean z17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).T;
        f21.a m07 = f21.r0.wi().m0(dVar.x());
        int intValue = ((java.lang.Integer) c01.d9.b().p().l(12311, -2)).intValue();
        if ((m07 == null || m07.f340366b == -2) && (m07 != null || intValue == -2)) {
            return ti3.i.f(dVar.g(), f17, f9Var, f9Var2, c16565x9bc03d4e);
        }
        int color = z17 ? dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560405ji) : dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0b);
        android.app.Activity g17 = dVar.g();
        int i17 = ti3.i.f501121a;
        if (f9Var2 == null) {
            return new ti3.l(false, "", 0);
        }
        ui3.b D0 = ((ri3.e) ((aa0.e) i95.n0.c(aa0.e.class))).Di().D0(f9Var2.Q0(), f9Var2.I0());
        if (f9Var2.m124847x74d37ac6() == 0 && c16565x9bc03d4e.f231015d == 0) {
            return new ti3.l(false, g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gzj), 0);
        }
        if ((D0 != null && D0.f66421x10a0fed7 == 1) || f9Var2.W2()) {
            return new ti3.l(false, g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574104h03), 0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = c16565x9bc03d4e.f231019h;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        java.lang.String d17 = ti3.i.d(f9Var2, str);
        ((ke0.e) xVar).getClass();
        sb6.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g17, d17, f17));
        sb6.append("：");
        int length = sb6.length();
        java.lang.String i18 = ti3.i.i(g17, f9Var2.mo78013xfb85f7b0(), f9Var2.mo78013xfb85f7b0() == 34 ? f9Var2.j() : f9Var2.U1(), f9Var2.A0() == 1);
        if (D0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.MsgQuoteHelp", "getShowSummaryWithColor() msgQute is null");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb6.toString())) {
                return new ti3.l(false, "", 0);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i18)) {
            android.graphics.drawable.Drawable h17 = ti3.i.h(g17, f9Var2);
            com.p314xaae8f345.mm.ui.uk.f(h17, color);
            if (h17 != null) {
                return new ti3.l(true, ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ai(g17, sb6, h17, true), length);
            }
        } else {
            android.graphics.drawable.Drawable h18 = ti3.i.h(g17, f9Var2);
            com.p314xaae8f345.mm.ui.uk.f(h18, color);
            if (h18 != null) {
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                android.text.SpannableString j17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g17, i18, f17);
                ((ke0.e) xVar2).getClass();
                return new ti3.l(true, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.b(g17, sb6, j17, h18, true, true), length);
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            sb6.append((java.lang.CharSequence) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g17, i18, f17));
        }
        return new ti3.l(true, sb6, length);
    }
}
