package m06;

/* loaded from: classes16.dex */
public final class g {
    public g(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final m06.h a(m06.c functionClass, boolean z17) {
        java.lang.String lowerCase;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionClass, "functionClass");
        m06.h hVar = new m06.h(functionClass, null, o06.c.DECLARATION, z17);
        o06.r1 R = functionClass.R();
        kz5.p0 p0Var = kz5.p0.f395529d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = functionClass.f404133q;
        for (java.lang.Object obj : list) {
            if (!(((o06.e2) obj).q() == f26.d3.f340677g)) {
                break;
            }
            arrayList.add(obj);
        }
        java.lang.Iterable Z0 = kz5.n0.Z0(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(Z0, 10));
        java.util.Iterator it = ((kz5.v0) Z0).iterator();
        while (it.hasNext()) {
            kz5.u0 u0Var = (kz5.u0) it.next();
            int i17 = u0Var.f395548a;
            o06.e2 e2Var = (o06.e2) u0Var.f395549b;
            java.lang.String h17 = e2Var.mo132800xfb82e301().h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h17, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3)) {
                lowerCase = "instance";
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h17, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad)) {
                lowerCase = "receiver";
            } else {
                lowerCase = h17.toLowerCase(java.util.Locale.ROOT);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            }
            int i18 = p06.k.Z0;
            p06.k kVar = p06.i.f432298a;
            n16.g k17 = n16.g.k(lowerCase);
            f26.z0 k18 = e2Var.k();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(k18, "getDefaultType(...)");
            java.util.ArrayList arrayList3 = arrayList2;
            arrayList3.add(new r06.s1(hVar, null, i17, kVar, k17, k18, false, false, false, null, o06.x1.f423537a));
            arrayList2 = arrayList3;
        }
        hVar.x0(null, R, p0Var, p0Var, arrayList2, ((o06.e2) kz5.n0.i0(list)).k(), o06.t0.f423521h, o06.f0.f423478e);
        hVar.D = true;
        return hVar;
    }
}
