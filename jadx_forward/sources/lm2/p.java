package lm2;

/* loaded from: classes3.dex */
public final class p {
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static lm2.j0 a(lm2.p pVar, r45.qn qnVar, java.lang.String str, int i17, java.lang.Object obj) {
        java.util.List list;
        java.lang.String str2;
        java.lang.String str3 = (i17 & 1) != 0 ? null : str;
        pVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qnVar, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<r45.wn> linkedList = qnVar.f465637g;
        if (linkedList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.wn wnVar : linkedList) {
                lm2.p pVar2 = lm2.h0.f400925i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wnVar);
                r45.ch1 ch1Var = wnVar.f470835d;
                lm2.c b17 = ch1Var != null ? pVar2.b(ch1Var) : null;
                if (b17 != null) {
                    b17.f400904d = wnVar.f470836e;
                }
                if (b17 != null) {
                    b17.f400906f = wnVar.f470837f;
                }
                if (b17 != null) {
                    b17.f400907g = wnVar.f470838g;
                }
                if (b17 != null) {
                    b17.f400908h = wnVar.f470839h;
                }
                arrayList2.add(b17);
            }
            list = kz5.n0.V(arrayList2);
        } else {
            list = kz5.p0.f395529d;
        }
        arrayList.addAll(list);
        r45.qm1 qm1Var = qnVar.f465634d;
        if (qm1Var == null || (str2 = qm1Var.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        return new lm2.j0(str2, arrayList, qnVar.f465638h, qnVar, str3);
    }

    public final lm2.c b(r45.ch1 ch1Var) {
        lm2.c m0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ch1Var, "<this>");
        int m75939xb282bd08 = ch1Var.m75939xb282bd08(1);
        if (m75939xb282bd08 != 20002) {
            if (m75939xb282bd08 != 20032) {
                if (m75939xb282bd08 == 20057) {
                    m0Var = new lm2.o0(false, ch1Var);
                } else if (m75939xb282bd08 != 20034) {
                    if (m75939xb282bd08 != 20035) {
                        return null;
                    }
                    m0Var = new lm2.l0(false, ch1Var);
                }
            }
            m0Var = new lm2.b(false, ch1Var);
        } else {
            m0Var = new lm2.m0(false, ch1Var);
        }
        return m0Var;
    }
}
