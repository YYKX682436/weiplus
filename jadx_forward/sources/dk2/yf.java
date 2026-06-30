package dk2;

/* loaded from: classes3.dex */
public abstract class yf {
    public static final java.lang.String a(dk2.xf xfVar) {
        r45.nw1 nw1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xfVar, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nickname ");
        ya2.g gVar = ya2.h.f542017a;
        boolean z17 = xfVar instanceof dk2.r4;
        java.lang.Long l17 = null;
        dk2.r4 r4Var = z17 ? (dk2.r4) xfVar : null;
        ya2.b2 b17 = gVar.b(r4Var != null ? ((mm2.c1) r4Var.m(mm2.c1.class)).f410385o : null);
        sb6.append(b17 != null ? b17.w0() : null);
        sb6.append(", liveId ");
        dk2.r4 r4Var2 = z17 ? (dk2.r4) xfVar : null;
        if (r4Var2 != null && (nw1Var = ((mm2.e1) r4Var2.m(mm2.e1.class)).f410521r) != null) {
            l17 = java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0));
        }
        sb6.append(l17);
        return sb6.toString();
    }
}
