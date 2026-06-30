package a2;

/* loaded from: classes14.dex */
public abstract class p1 {
    public static final a2.o1 a(a2.o1 style, p2.s direction) {
        int i17;
        kotlin.jvm.internal.o.g(style, "style");
        kotlin.jvm.internal.o.g(direction, "direction");
        int i18 = a2.i1.f747e;
        a2.g1 style2 = style.f790a;
        kotlin.jvm.internal.o.g(style2, "style");
        l2.l b17 = style2.f723a.b(a2.h1.f740d);
        long j17 = style2.f724b;
        if (p2.u.c(j17)) {
            j17 = a2.i1.f743a;
        }
        long j18 = j17;
        f2.r rVar = style2.f725c;
        if (rVar == null) {
            rVar = f2.r.f258822i;
        }
        f2.r rVar2 = rVar;
        f2.p pVar = style2.f726d;
        f2.p pVar2 = new f2.p(pVar != null ? pVar.f258816a : 0);
        f2.q qVar = style2.f727e;
        f2.q qVar2 = new f2.q(qVar != null ? qVar.f258817a : 1);
        f2.h hVar = style2.f728f;
        if (hVar == null) {
            hVar = f2.h.f258803a;
        }
        f2.h hVar2 = hVar;
        java.lang.String str = style2.f729g;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        long j19 = style2.f730h;
        if (p2.u.c(j19)) {
            j19 = a2.i1.f744b;
        }
        long j27 = j19;
        l2.a aVar = style2.f731i;
        l2.a aVar2 = new l2.a(aVar != null ? aVar.f315106a : 0.0f);
        l2.m mVar = style2.f732j;
        if (mVar == null) {
            mVar = l2.m.f315125c;
        }
        l2.m mVar2 = mVar;
        h2.d dVar = style2.f733k;
        if (dVar == null) {
            dVar = h2.d.f278258f.a();
        }
        h2.d dVar2 = dVar;
        long j28 = e1.y.f246320k;
        long j29 = style2.f734l;
        if (!(j29 != j28)) {
            j29 = a2.i1.f745c;
        }
        long j37 = j29;
        l2.g gVar = style2.f735m;
        if (gVar == null) {
            gVar = l2.g.f315117b;
        }
        l2.g gVar2 = gVar;
        e1.z0 z0Var = style2.f736n;
        if (z0Var == null) {
            z0Var = e1.z0.f246326d;
        }
        a2.g1 g1Var = new a2.g1(b17, j18, rVar2, pVar2, qVar2, hVar2, str2, j27, aVar2, mVar2, dVar2, j37, gVar2, z0Var, style2.f737o, (kotlin.jvm.internal.i) null);
        int i19 = a2.q.f801b;
        a2.p style3 = style.f791b;
        kotlin.jvm.internal.o.g(style3, "style");
        l2.f fVar = style3.f793a;
        l2.f fVar2 = new l2.f(fVar != null ? fVar.f315116a : 5);
        l2.h hVar3 = style3.f794b;
        if (hVar3 != null && hVar3.f315121a == 3) {
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
            i17 = hVar3.f315121a;
        }
        l2.h hVar4 = new l2.h(i17);
        long j38 = style3.f795c;
        if (p2.u.c(j38)) {
            j38 = a2.q.f800a;
        }
        l2.n nVar = style3.f796d;
        if (nVar == null) {
            nVar = l2.n.f315128c;
        }
        return new a2.o1(g1Var, new a2.p(fVar2, hVar4, j38, nVar, style3.f797e, style3.f798f, null), style.f792c);
    }
}
