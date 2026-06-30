package aq1;

/* loaded from: classes11.dex */
public class j1 implements c01.g2 {
    public j1(aq1.l1 l1Var) {
    }

    public boolean a(java.lang.String str, java.lang.String str2, com.tencent.mm.pointers.PInt pInt) {
        if (!c01.e2.G(str)) {
            return false;
        }
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        if (r01.z.g(str)) {
            if (s01.r.o(str2)) {
                pInt.value = 5;
                return true;
            }
            pInt.value = 4;
            return true;
        }
        if (r01.z.h(str)) {
            pInt.value = 3;
            return true;
        }
        ((qv.o) ((rv.u2) i95.n0.c(rv.u2.class))).getClass();
        if (r01.z.j(str)) {
            pInt.value = 0;
            return true;
        }
        if (r01.z.n(str)) {
            pInt.value = 6;
            return true;
        }
        pInt.value = 7;
        return true;
    }
}
