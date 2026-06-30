package n0;

/* loaded from: classes14.dex */
public abstract class s4 {
    public static final n0.e5 a(yz5.a calculation) {
        n0.c5 c5Var = n0.t4.f415240a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(calculation, "calculation");
        return new n0.x1(calculation);
    }

    public static final n0.v2 b(java.lang.Object obj, n0.r4 policy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policy, "policy");
        int i17 = n0.c.f415001a;
        return new p012xc85e97e9.p064x38a77192.p068x5c71cfd8.C1057x79386292(obj, policy);
    }

    public static /* synthetic */ n0.v2 c(java.lang.Object obj, n0.r4 r4Var, int i17, java.lang.Object obj2) {
        if ((i17 & 2) != 0) {
            r4Var = n0.h5.f415062a;
        }
        return b(obj, r4Var);
    }

    public static final void d(yz5.l start, yz5.l done, yz5.a block) {
        n0.c5 c5Var = n0.t4.f415240a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(start, "start");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(done, "done");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        n0.c5 c5Var2 = n0.t4.f415240a;
        p0.e eVar = (p0.e) c5Var2.a();
        try {
            java.util.Collection collection = (p0.e) c5Var2.a();
            if (collection == null) {
                collection = q0.l.f440774f;
            }
            c5Var2.b(collection.add((java.lang.Object) new jz5.l(start, done)));
            block.mo152xb9724478();
        } finally {
            c5Var2.b(eVar);
        }
    }

    public static final n0.e5 e(java.lang.Object obj, n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1058319986);
        y0Var.U(-492369756);
        java.lang.Object y17 = y0Var.y();
        int i18 = n0.o.f415162a;
        if (y17 == n0.n.f415153a) {
            y17 = c(obj, null, 2, null);
            y0Var.g0(y17);
        }
        y0Var.o(false);
        n0.v2 v2Var = (n0.v2) y17;
        v2Var.mo148714x53d8522f(obj);
        y0Var.o(false);
        return v2Var;
    }

    public static final p3325xe03a0797.p3326xc267989b.p3328x30012e.j f(yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new n0.b5(block, null));
    }
}
