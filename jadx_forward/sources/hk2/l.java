package hk2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final hk2.l f363440a = new hk2.l();

    public final jz5.l a(android.content.Context context, dk2.zf msg, boolean z17, android.text.TextPaint paint) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        zl2.r4 r4Var = zl2.r4.f555483a;
        java.lang.String D0 = zl2.r4.D0(r4Var, msg.a(), msg.k(), false, 4, null);
        if (z17) {
            r45.xn1 r17 = msg.r();
            D0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.s((r17 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) r17.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76197x6c03c64c(), D0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D0, "makeAnonymousNameIfIsMySelf(...)");
        }
        java.lang.String str2 = D0;
        i95.m c17 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.CharSequence nf6 = c61.yb.nf((c61.yb) c17, context, paint, str2, 0, 8, null);
        r45.xn1 r18 = msg.r();
        if (!(r18 != null && r18.m75939xb282bd08(7) == 3) || z17) {
            str = "";
        } else {
            we2.i iVar = we2.o.f526769i;
            str = "\u2005";
        }
        java.lang.String str3 = ((java.lang.Object) nf6) + str + (we2.o.f526769i.c(context, msg) ? "\u2005" : "");
        i95.m c18 = i95.n0.c(c61.yb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        c61.yb ybVar = (c61.yb) c18;
        r45.xn1 C = msg.C();
        java.lang.CharSequence nf7 = c61.yb.nf(ybVar, context, paint, zl2.r4.D0(r4Var, (C == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) C.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76197x6c03c64c(), r4Var.X(msg), false, 4, null), 0, 8, null);
        java.lang.Object D = msg.D();
        r45.xj1 xj1Var = D instanceof r45.xj1 ? (r45.xj1) D : null;
        java.lang.String string = (xj1Var != null ? xj1Var.m75939xb282bd08(8) : 0) == 2 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ouk, str3, nf7) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.efj, str3, nf7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return new jz5.l(nf6, string);
    }
}
