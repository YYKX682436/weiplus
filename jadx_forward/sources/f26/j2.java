package f26;

/* loaded from: classes16.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f26.k2 f340714d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(f26.k2 k2Var) {
        super(1);
        this.f340714d = k2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o06.e2 e2Var;
        f26.l2 a17;
        f26.h2 h2Var = (f26.h2) obj;
        o06.e2 e2Var2 = h2Var.f340703a;
        f26.k2 k2Var = this.f340714d;
        k2Var.getClass();
        f26.c0 c0Var = h2Var.f340704b;
        c16.a aVar = (c16.a) c0Var;
        java.util.Set set = aVar.f119481e;
        if (set != null && set.contains(e2Var2.a())) {
            return k2Var.a(c0Var);
        }
        f26.z0 k17 = e2Var2.k();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k17, "getDefaultType(...)");
        java.util.LinkedHashSet<o06.e2> linkedHashSet = new java.util.LinkedHashSet();
        j26.c.d(k17, k17, linkedHashSet, set);
        int d17 = kz5.b1.d(kz5.d0.q(linkedHashSet, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (o06.e2 e2Var3 : linkedHashSet) {
            if (set == null || !set.contains(e2Var3)) {
                java.util.Set set2 = aVar.f119481e;
                e2Var = e2Var3;
                a17 = k2Var.f340717a.a(e2Var, c0Var, k2Var, k2Var.b(e2Var, c16.a.a(aVar, null, null, false, false, set2 != null ? kz5.q1.j(set2, e2Var2) : kz5.o1.c(e2Var2), null, 47, null)));
            } else {
                a17 = f26.z2.m(e2Var3, c0Var);
                e2Var = e2Var3;
            }
            linkedHashMap.put(e2Var.g(), a17);
        }
        f26.v2 e17 = f26.v2.e(f26.e2.c(f26.f2.f340694b, linkedHashMap, false, 2, null));
        java.util.List mo150356xa5be00c1 = e2Var2.mo150356xa5be00c1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo150356xa5be00c1, "getUpperBounds(...)");
        lz5.q qVar = (lz5.q) k2Var.c(e17, mo150356xa5be00c1, c0Var);
        if (!(!qVar.isEmpty())) {
            return k2Var.a(c0Var);
        }
        k2Var.f340718b.getClass();
        if (qVar.d() == 1) {
            return (f26.o0) kz5.n0.y0(qVar);
        }
        throw new java.lang.IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
    }
}
