package a2;

/* loaded from: classes14.dex */
public abstract class p1 {
    public static final a2.o1 a(a2.o1 style, p2.s direction) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(direction, "direction");
        int i18 = a2.i1.f82280e;
        a2.g1 style2 = style.f82323a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style2, "style");
        l2.l b17 = style2.f82256a.b(a2.h1.f82273d);
        long j17 = style2.f82257b;
        if (p2.u.c(j17)) {
            j17 = a2.i1.f82276a;
        }
        long j18 = j17;
        f2.r rVar = style2.f82258c;
        if (rVar == null) {
            rVar = f2.r.f340355i;
        }
        f2.r rVar2 = rVar;
        f2.p pVar = style2.f82259d;
        f2.p pVar2 = new f2.p(pVar != null ? pVar.f340349a : 0);
        f2.q qVar = style2.f82260e;
        f2.q qVar2 = new f2.q(qVar != null ? qVar.f340350a : 1);
        f2.h hVar = style2.f82261f;
        if (hVar == null) {
            hVar = f2.h.f340336a;
        }
        f2.h hVar2 = hVar;
        java.lang.String str = style2.f82262g;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        long j19 = style2.f82263h;
        if (p2.u.c(j19)) {
            j19 = a2.i1.f82277b;
        }
        long j27 = j19;
        l2.a aVar = style2.f82264i;
        l2.a aVar2 = new l2.a(aVar != null ? aVar.f396639a : 0.0f);
        l2.m mVar = style2.f82265j;
        if (mVar == null) {
            mVar = l2.m.f396658c;
        }
        l2.m mVar2 = mVar;
        h2.d dVar = style2.f82266k;
        if (dVar == null) {
            dVar = h2.d.f359791f.a();
        }
        h2.d dVar2 = dVar;
        long j28 = e1.y.f327853k;
        long j29 = style2.f82267l;
        if (!(j29 != j28)) {
            j29 = a2.i1.f82278c;
        }
        long j37 = j29;
        l2.g gVar = style2.f82268m;
        if (gVar == null) {
            gVar = l2.g.f396650b;
        }
        l2.g gVar2 = gVar;
        e1.z0 z0Var = style2.f82269n;
        if (z0Var == null) {
            z0Var = e1.z0.f327859d;
        }
        a2.g1 g1Var = new a2.g1(b17, j18, rVar2, pVar2, qVar2, hVar2, str2, j27, aVar2, mVar2, dVar2, j37, gVar2, z0Var, style2.f82270o, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null);
        int i19 = a2.q.f82334b;
        a2.p style3 = style.f82324b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style3, "style");
        l2.f fVar = style3.f82326a;
        l2.f fVar2 = new l2.f(fVar != null ? fVar.f396649a : 5);
        l2.h hVar3 = style3.f82327b;
        if (hVar3 != null && hVar3.f396654a == 3) {
            int ordinal = direction.ordinal();
            if (ordinal == 0) {
                i17 = 4;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                i17 = 5;
            }
        } else if (hVar3 == null) {
            int ordinal2 = direction.ordinal();
            if (ordinal2 == 0) {
                i17 = 1;
            } else {
                if (ordinal2 != 1) {
                    throw new jz5.j();
                }
                i17 = 2;
            }
        } else {
            i17 = hVar3.f396654a;
        }
        l2.h hVar4 = new l2.h(i17);
        long j38 = style3.f82328c;
        if (p2.u.c(j38)) {
            j38 = a2.q.f82333a;
        }
        l2.n nVar = style3.f82329d;
        if (nVar == null) {
            nVar = l2.n.f396661c;
        }
        return new a2.o1(g1Var, new a2.p(fVar2, hVar4, j38, nVar, style3.f82330e, style3.f82331f, null), style.f82325c);
    }
}
