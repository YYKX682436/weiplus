package aq1;

/* loaded from: classes12.dex */
public class d1 implements po.b {
    public d1(aq1.l1 l1Var) {
    }

    public java.lang.String a(com.tencent.mm.storage.f9 f9Var) {
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String Q0 = f9Var.Q0();
        ((qv.o) u2Var).getClass();
        return r01.z.g(Q0) ? s01.r.f(f9Var.G) : c01.ia.f(null);
    }

    public java.lang.String b(java.lang.String str, int i17) {
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        return r01.z.g(str) ? s01.r.f(pt0.f0.Li(str, i17).G) : c01.ia.f(null);
    }

    public java.lang.String c(oi3.g gVar) {
        if (gVar != null) {
            rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
            int i17 = gVar.f345617d;
            java.lang.String string = gVar.getString(i17 + 3);
            ((qv.o) u2Var).getClass();
            if (r01.z.g(string)) {
                return s01.r.f(gVar.getString(i17 + 12));
            }
        }
        return c01.ia.f(null);
    }

    public void d(com.tencent.mm.storage.f9 f9Var) {
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String Q0 = f9Var.Q0();
        ((qv.o) u2Var).getClass();
        if (r01.z.g(Q0)) {
            f9Var.u3(s01.r.i());
        } else {
            f9Var.u3(c01.ia.f(null));
        }
    }
}
