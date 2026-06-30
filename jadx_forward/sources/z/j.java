package z;

/* loaded from: classes14.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final z.p1 f550236a;

    static {
        java.util.Map map = z.f4.f550197a;
        f550236a = z.q.c(0.0f, 0.0f, new p2.h(0.1f), 3, null);
        int i17 = d1.k.f307176d;
        d1.l.a(0.5f, 0.5f);
        int i18 = d1.e.f307159e;
        d1.f.a(0.5f, 0.5f);
        int i19 = p2.m.f432922c;
        p2.n.a(1, 1);
        z.f4.a(p2.q.f432928b);
    }

    public static final n0.e5 a(float f17, z.p pVar, yz5.l lVar, n0.o oVar, int i17, int i18) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(704104481);
        if ((i18 & 2) != 0) {
            pVar = f550236a;
        }
        z.p pVar2 = pVar;
        if ((i18 & 4) != 0) {
            lVar = null;
        }
        p2.h hVar = new p2.h(f17);
        z.w2 w2Var = z.q3.f550334a;
        n0.e5 b17 = b(hVar, z.q3.f550336c, pVar2, null, lVar, y0Var, (i17 & 14) | ((i17 << 3) & ce1.h.f4368x366c91de) | ((i17 << 6) & 57344), 8);
        y0Var.o(false);
        return b17;
    }

    public static final n0.e5 b(java.lang.Object obj, z.w2 typeConverter, z.p pVar, java.lang.Object obj2, yz5.l lVar, n0.o oVar, int i17, int i18) {
        z.p pVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeConverter, "typeConverter");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-846382129);
        int i19 = i18 & 4;
        java.lang.Object obj3 = n0.n.f415153a;
        if (i19 != 0) {
            y0Var.U(-492369756);
            java.lang.Object y17 = y0Var.y();
            int i27 = n0.o.f415162a;
            if (y17 == obj3) {
                y17 = z.q.c(0.0f, 0.0f, obj2, 3, null);
                y0Var.g0(y17);
            }
            y0Var.o(false);
            pVar2 = (z.p) y17;
        } else {
            pVar2 = pVar;
        }
        yz5.l lVar2 = (i18 & 16) != 0 ? null : lVar;
        y0Var.U(-492369756);
        java.lang.Object y18 = y0Var.y();
        int i28 = n0.o.f415162a;
        if (y18 == obj3) {
            y18 = new z.e(obj, typeConverter, null);
            y0Var.g0(y18);
        }
        y0Var.o(false);
        z.e eVar = (z.e) y18;
        n0.e5 e17 = n0.s4.e(lVar2, y0Var, (i17 >> 12) & 14);
        n0.e5 e18 = n0.s4.e(pVar2, y0Var, (i17 >> 6) & 14);
        y0Var.U(-492369756);
        java.lang.Object y19 = y0Var.y();
        if (y19 == obj3) {
            y19 = u26.z.a(-1, null, null, 6, null);
            y0Var.g0(y19);
        }
        y0Var.o(false);
        u26.w wVar = (u26.w) y19;
        n0.d2.h(new z.g(wVar, obj), y0Var, 0);
        n0.d2.f(wVar, new z.i(wVar, eVar, e18, e17, null), y0Var, 8);
        z.r rVar = eVar.f550165c;
        y0Var.o(false);
        return rVar;
    }
}
