package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class jp implements si2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp f200301d;

    public jp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pp ppVar) {
        this.f200301d = ppVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // si2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r50, r45.xn1 r51) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jp.e(int, r45.xn1):void");
    }

    @Override // si2.a
    public void f(int i17, r45.xn1 xn1Var) {
        java.util.List list;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        gk2.e eVar = this.f200301d.f200928a;
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f410852p) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String str = ((km2.q) next).f390705c;
                    if (xn1Var != null && (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) != null) {
                        obj = c19782x23db1cfa.m76197x6c03c64c();
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, obj)) {
                        obj = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null) {
                qVar.f390714l = 6;
            }
        }
        this.f200301d.f200930c.a();
        this.f200301d.f200930c.f200618f.C1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c2 c2Var = this.f200301d.f200935h;
        if (c2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p7) c2Var).c(xn1Var);
        }
    }
}
