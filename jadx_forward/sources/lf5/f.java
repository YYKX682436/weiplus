package lf5;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final lf5.f f400067a = new lf5.f();

    public final void a(yb5.d ui6, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 holder, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 chattingItem, wd5.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1879xb47f1f9b.p1880x633fb29.C16565x9bc03d4e c16565x9bc03d4e) {
        int color;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingItem, "chattingItem");
        if (bVar == null || c16565x9bc03d4e == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillingReferMsgWithHolder failed because ");
            sb6.append(bVar == null ? "viewmodel is null" : "");
            sb6.append(',');
            sb6.append(c16565x9bc03d4e == null ? "quoteItem is null" : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemQuoteHelper", sb6.toString());
            return;
        }
        if (bVar.j() != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 a17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dc.b(ui6.D(), ui6.x(), msg.m124847x74d37ac6(), msg.Q0(), c16565x9bc03d4e, bVar.f526627r.f526616d), c16565x9bc03d4e);
            ti3.l c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hc.c(ui6, i65.a.h(ui6.g(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561161b3), msg, a17, c16565x9bc03d4e);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = ui6.g();
            ((ke0.e) xVar).getClass();
            java.lang.CharSequence charSequence = c17.f501160b;
            android.text.SpannableString i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, charSequence);
            r15.f b17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.hc.b(c16565x9bc03d4e.f231026r, a17, ui6.g());
            if (b17 != null) {
                bVar.f526618f = pl5.c.a(new android.text.SpannableStringBuilder(i18), c17.f501161c, b17.f450177a, b17.f450178b, new lf5.d(i18));
            } else {
                bVar.f526618f = i18;
            }
            bVar.f526617e = a17;
            bVar.f526619g = c16565x9bc03d4e;
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                i18.length();
                java.util.Objects.toString(charSequence);
            }
            f21.a m07 = f21.r0.wi().m0(ui6.x());
            java.lang.Object l17 = c01.d9.b().p().l(12311, -2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) l17).intValue();
            ((sb5.z) ui6.f542241c.a(sb5.z.class)).getClass();
            if ((m07 == null || m07.f340366b == -2) && (m07 != null || intValue == -2)) {
                color = ui6.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560405ji);
                i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.apt;
            } else {
                i17 = !com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30861xcebc809e.czh : com.p314xaae8f345.mm.R.C30861xcebc809e.czg;
                color = ui6.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adg);
            }
            bVar.f526620h = java.lang.Integer.valueOf(color);
            bVar.f526621i = java.lang.Integer.valueOf(i17);
            bVar.f526622m = c17.f501159a;
            bVar.f526623n = charSequence;
            bVar.f526626q = ti3.i.m(a17);
            bVar.f526624o = new lf5.b(msg, ui6, chattingItem, c16565x9bc03d4e);
            bVar.f526625p = new lf5.c(msg, c16565x9bc03d4e, ui6, holder, chattingItem);
        }
        holder.m80052xa709c08b().b(bVar);
    }
}
