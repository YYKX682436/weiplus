package g06;

/* loaded from: classes15.dex */
public abstract class h {
    public static final f06.w a(f06.e eVar, java.util.List arguments, boolean z17, java.util.List annotations) {
        o06.j h17;
        f26.r1 r1Var;
        f26.m2 g1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        i06.l1 l1Var = eVar instanceof i06.l1 ? (i06.l1) eVar : null;
        if (l1Var == null || (h17 = l1Var.h()) == null) {
            throw new i06.a4("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
        }
        f26.c2 g17 = h17.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getTypeConstructor(...)");
        java.util.List mo9613x99879e0 = g17.mo9613x99879e0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e0, "getParameters(...)");
        if (mo9613x99879e0.size() != arguments.size()) {
            throw new java.lang.IllegalArgumentException("Class declares " + mo9613x99879e0.size() + " type parameters, but " + arguments.size() + " were provided.");
        }
        if (annotations.isEmpty()) {
            f26.r1.f340747e.getClass();
            r1Var = f26.r1.f340748f;
        } else {
            f26.r1.f340747e.getClass();
            r1Var = f26.r1.f340748f;
        }
        java.util.List mo9613x99879e02 = g17.mo9613x99879e0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9613x99879e02, "getParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(arguments, 10));
        int i17 = 0;
        for (java.lang.Object obj : arguments) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            f06.z zVar = (f06.z) obj;
            i06.w3 w3Var = (i06.w3) zVar.f339994b;
            f26.o0 o0Var = w3Var != null ? w3Var.f368313d : null;
            f06.a0 a0Var = zVar.f339993a;
            int i19 = a0Var == null ? -1 : g06.g.f349032a[a0Var.ordinal()];
            if (i19 == -1) {
                java.lang.Object obj2 = mo9613x99879e02.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                g1Var = new f26.g1((o06.e2) obj2);
            } else if (i19 == 1) {
                f26.d3 d3Var = f26.d3.f340676f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var);
                g1Var = new f26.n2(d3Var, o0Var);
            } else if (i19 == 2) {
                f26.d3 d3Var2 = f26.d3.f340677g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var);
                g1Var = new f26.n2(d3Var2, o0Var);
            } else {
                if (i19 != 3) {
                    throw new jz5.j();
                }
                f26.d3 d3Var3 = f26.d3.f340678h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o0Var);
                g1Var = new f26.n2(d3Var3, o0Var);
            }
            arrayList.add(g1Var);
            i17 = i18;
        }
        return new i06.w3(f26.r0.d(r1Var, g17, arrayList, z17, null), null);
    }
}
