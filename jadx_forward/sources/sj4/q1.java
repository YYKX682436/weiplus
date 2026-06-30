package sj4;

/* loaded from: classes8.dex */
public final class q1 extends bi4.o0 {
    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.j0 j0Var = this.f102607b;
        if (j0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "9")) {
            return false;
        }
        su4.j2 j2Var = new su4.j2();
        j2Var.f494471a = context;
        j2Var.f494472b = 92;
        try {
            byte[] decode = android.util.Base64.decode(j0Var.f436675g, 0);
            pj4.y1 y1Var = new pj4.y1();
            y1Var.mo11468x92b714fd(decode);
            j2Var.f494474d = y1Var.f436877d;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("WebSearchStatusService", th6, "doJumpSource err", new java.lang.Object[0]);
        }
        u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
        int i17 = j2Var.f494472b;
        ((s50.g0) vVar).getClass();
        j2Var.f494475e = o13.n.l(i17);
        j2Var.f494476f = true;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        return true;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void n() {
    }
}
