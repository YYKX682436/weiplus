package fk2;

/* loaded from: classes3.dex */
public final class h {
    public h(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.CharSequence content, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 contentTv, int i17, int i18, boolean z17, bm2.h1 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentTv, "contentTv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        fk2.h hVar = fk2.k.f344946m;
        yz5.s sVar = i17 > 0 ? fk2.e.f344886d : fk2.g.f344922d;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.view.ViewParent parent = contentTv.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        h0Var.f391656d = (android.view.ViewGroup) parent;
        contentTv.m84185x3abfd950(i18);
        contentTv.setVisibility(0);
        sVar.v(contentTv, content, 1, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new fk2.c(contentTv, content, h0Var, sVar, i17, z17, null), 2, null);
        }
    }

    public final java.lang.String b() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
