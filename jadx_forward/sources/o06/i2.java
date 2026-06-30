package o06;

/* loaded from: classes15.dex */
public abstract class i2 {
    public static final o06.m1 a(f26.o0 o0Var, o06.k kVar, int i17) {
        if (kVar == null || h26.m.f(kVar)) {
            return null;
        }
        int size = kVar.m().size() + i17;
        if (kVar.p()) {
            java.util.List subList = o0Var.u0().subList(i17, size);
            o06.m e17 = kVar.e();
            return new o06.m1(kVar, subList, a(o0Var, e17 instanceof o06.k ? (o06.k) e17 : null, size));
        }
        if (size != o0Var.u0().size()) {
            r16.i.p(kVar);
        }
        return new o06.m1(kVar, o0Var.u0().subList(i17, o0Var.u0().size()), null);
    }

    public static final java.util.List b(o06.k kVar) {
        java.util.List list;
        java.lang.Object obj;
        f26.c2 g17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        java.util.List m17 = kVar.m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getDeclaredTypeParameters(...)");
        if (!kVar.p() && !(kVar.e() instanceof o06.b)) {
            return m17;
        }
        q26.n k17 = v16.f.k(kVar);
        o06.f2 f2Var = o06.f2.f423490d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k17, "<this>");
        java.util.List y17 = q26.h0.y(q26.h0.m(q26.h0.i(new q26.n0(k17, f2Var), o06.g2.f423492d), o06.h2.f423502d));
        java.util.Iterator mo144672x467c086e = v16.f.k(kVar).mo144672x467c086e();
        while (true) {
            list = null;
            if (!mo144672x467c086e.hasNext()) {
                obj = null;
                break;
            }
            obj = mo144672x467c086e.next();
            if (obj instanceof o06.g) {
                break;
            }
        }
        o06.g gVar = (o06.g) obj;
        if (gVar != null && (g17 = gVar.g()) != null) {
            list = g17.mo9613x99879e0();
        }
        if (list == null) {
            list = kz5.p0.f395529d;
        }
        if (y17.isEmpty() && list.isEmpty()) {
            java.util.List m18 = kVar.m();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m18, "getDeclaredTypeParameters(...)");
            return m18;
        }
        java.util.List<o06.e2> t07 = kz5.n0.t0(y17, list);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(t07, 10));
        for (o06.e2 e2Var : t07) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e2Var);
            arrayList.add(new o06.e(e2Var, kVar, m17.size()));
        }
        return kz5.n0.t0(m17, arrayList);
    }
}
