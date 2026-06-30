package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final x.n f296105a = new x.n();

    /* renamed from: b, reason: collision with root package name */
    public final x.f f296106b = new x.f();

    public void a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a1 a1Var) {
        x.n nVar = this.f296105a;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2 j2Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2) nVar.m174751x4aabfc28(y1Var, null);
        if (j2Var == null) {
            j2Var = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2.a();
            nVar.put(y1Var, j2Var);
        }
        j2Var.f296086c = a1Var;
        j2Var.f296084a |= 8;
    }

    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a1 b(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var, int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2 j2Var;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.a1 a1Var;
        x.n nVar = this.f296105a;
        int e17 = nVar.e(y1Var);
        if (e17 >= 0 && (j2Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2) nVar.l(e17)) != null) {
            int i18 = j2Var.f296084a;
            if ((i18 & i17) != 0) {
                int i19 = i18 & (~i17);
                j2Var.f296084a = i19;
                if (i17 == 4) {
                    a1Var = j2Var.f296085b;
                } else {
                    if (i17 != 8) {
                        throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    a1Var = j2Var.f296086c;
                }
                if ((i19 & 12) == 0) {
                    nVar.j(e17);
                    j2Var.f296084a = 0;
                    j2Var.f296085b = null;
                    j2Var.f296086c = null;
                    ((m3.f) com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2.f296083d).b(j2Var);
                }
                return a1Var;
            }
        }
        return null;
    }

    public void c(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2 j2Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2) this.f296105a.m174751x4aabfc28(y1Var, null);
        if (j2Var == null) {
            return;
        }
        j2Var.f296084a &= -2;
    }

    public void d(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 y1Var) {
        x.f fVar = this.f296106b;
        int e17 = fVar.e();
        while (true) {
            e17--;
            if (e17 < 0) {
                break;
            }
            if (y1Var == fVar.f(e17)) {
                java.lang.Object[] objArr = fVar.f532356f;
                java.lang.Object obj = objArr[e17];
                java.lang.Object obj2 = x.f.f532353h;
                if (obj != obj2) {
                    objArr[e17] = obj2;
                    fVar.f532354d = true;
                }
            }
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2 j2Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2) this.f296105a.m174754xc84af884(y1Var);
        if (j2Var != null) {
            j2Var.f296084a = 0;
            j2Var.f296085b = null;
            j2Var.f296086c = null;
            ((m3.f) com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j2.f296083d).b(j2Var);
        }
    }
}
