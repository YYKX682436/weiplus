package z06;

/* loaded from: classes16.dex */
public abstract class k {
    public static final java.util.List a(java.util.Collection newValueParameterTypes, java.util.Collection oldValueParameters, o06.b newOwner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newValueParameterTypes, "newValueParameterTypes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldValueParameters, "oldValueParameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        java.util.List a17 = kz5.n0.a1(newValueParameterTypes, oldValueParameters);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (java.util.Iterator it = a17.iterator(); it.hasNext(); it = it) {
            jz5.l lVar = (jz5.l) it.next();
            f26.o0 o0Var = (f26.o0) lVar.f384366d;
            p06.a aVar = (o06.l2) lVar.f384367e;
            int i17 = ((r06.s1) aVar).f450055i;
            p06.k mo9601xa083c1ee = ((p06.b) aVar).mo9601xa083c1ee();
            n16.g mo132800xfb82e301 = ((r06.v) aVar).mo132800xfb82e301();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo132800xfb82e301, "getName(...)");
            r06.s1 s1Var = (r06.s1) aVar;
            boolean s07 = s1Var.s0();
            boolean z17 = s1Var.f450057n;
            boolean z18 = s1Var.f450058o;
            f26.o0 g17 = s1Var.f450059p != null ? v16.f.j(newOwner).h().g(o0Var) : null;
            o06.x1 mo9602x2fa78b11 = ((r06.w) aVar).mo9602x2fa78b11();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo9602x2fa78b11, "getSource(...)");
            arrayList.add(new r06.s1(newOwner, null, i17, mo9601xa083c1ee, mo132800xfb82e301, o0Var, s07, z17, z18, g17, mo9602x2fa78b11));
        }
        return arrayList;
    }

    public static final b16.m1 b(o06.g gVar) {
        o06.g gVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gVar, "<this>");
        int i17 = v16.f.f514134a;
        java.util.Iterator it = gVar.k().w0().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar2 = null;
                break;
            }
            f26.o0 o0Var = (f26.o0) it.next();
            if (!l06.o.y(o0Var)) {
                o06.j i18 = o0Var.w0().i();
                int i19 = r16.i.f450191a;
                if (r16.i.o(i18, o06.h.f423493d) || r16.i.o(i18, o06.h.f423495f)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i18, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    gVar2 = (o06.g) i18;
                    break;
                }
            }
        }
        if (gVar2 == null) {
            return null;
        }
        y16.s m07 = gVar2.m0();
        b16.m1 m1Var = m07 instanceof b16.m1 ? (b16.m1) m07 : null;
        return m1Var == null ? b(gVar2) : m1Var;
    }
}
