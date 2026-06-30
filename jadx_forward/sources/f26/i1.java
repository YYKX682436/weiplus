package f26;

/* loaded from: classes16.dex */
public abstract class i1 {
    public static final f26.o0 a(java.util.List list, java.util.List list2, l06.o oVar) {
        f26.o0 k17 = f26.v2.e(new f26.h1(list)).k((f26.o0) kz5.n0.X(list2), f26.d3.f340678h);
        if (k17 == null) {
            k17 = oVar.n();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        return k17;
    }

    public static final f26.o0 b(o06.e2 e2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e2Var, "<this>");
        o06.m e17 = e2Var.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getContainingDeclaration(...)");
        if (e17 instanceof o06.k) {
            java.util.List mo9613x99879e0 = ((o06.k) e17).g().mo9613x99879e0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e0, "getParameters(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mo9613x99879e0, 10));
            java.util.Iterator it = mo9613x99879e0.iterator();
            while (it.hasNext()) {
                f26.c2 g17 = ((o06.e2) it.next()).g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getTypeConstructor(...)");
                arrayList.add(g17);
            }
            java.util.List mo150356xa5be00c1 = e2Var.mo150356xa5be00c1();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo150356xa5be00c1, "getUpperBounds(...)");
            return a(arrayList, mo150356xa5be00c1, v16.f.e(e2Var));
        }
        if (!(e17 instanceof o06.n0)) {
            throw new java.lang.IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        java.util.List mo132803xb121b9ba = ((o06.n0) e17).mo132803xb121b9ba();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132803xb121b9ba, "getTypeParameters(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(mo132803xb121b9ba, 10));
        java.util.Iterator it6 = mo132803xb121b9ba.iterator();
        while (it6.hasNext()) {
            f26.c2 g18 = ((o06.e2) it6.next()).g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getTypeConstructor(...)");
            arrayList2.add(g18);
        }
        java.util.List mo150356xa5be00c12 = e2Var.mo150356xa5be00c1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo150356xa5be00c12, "getUpperBounds(...)");
        return a(arrayList2, mo150356xa5be00c12, v16.f.e(e2Var));
    }
}
