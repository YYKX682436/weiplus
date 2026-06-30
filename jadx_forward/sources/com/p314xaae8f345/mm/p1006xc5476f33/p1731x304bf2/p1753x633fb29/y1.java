package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes5.dex */
public class y1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final m53.k2 f222059a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f222060b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f222061c;

    /* renamed from: d, reason: collision with root package name */
    public final int f222062d;

    public y1(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, boolean z17, boolean z18, int i17) {
        this.f222062d = 0;
        if (fVar == null) {
            this.f222059a = new m53.k2();
            return;
        }
        this.f222059a = (m53.k2) fVar;
        this.f222062d = i17;
        java.util.LinkedList c17 = c();
        this.f222060b = c17;
        java.util.LinkedList b17 = b();
        this.f222061c = b17;
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ri().J0("pb_library", fVar);
        }
        if (z18) {
            r53.n.c(c17);
            r53.n.c(b17);
        }
    }

    public final java.util.LinkedList b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b a17;
        m53.d dVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f222059a.f405371e;
        if (linkedList2 == null) {
            return linkedList;
        }
        int i17 = this.f222062d;
        int i18 = i17 + 1;
        int i19 = (i17 / 15) + 901;
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            m53.f fVar = (m53.f) it.next();
            int i27 = fVar.f405197d;
            if (i27 == 1) {
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1.a(fVar.f405198e);
                if (a17 != null) {
                    a17.f221747q2 = i18;
                    i18++;
                }
            } else if (i27 == 2 && (dVar = fVar.f405199f) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1.a(dVar.f405142d);
                if (a18 != null) {
                    a18.f221738h2 = 1;
                    m53.d dVar2 = fVar.f405199f;
                    a18.f221741k2 = dVar2.f405144f;
                    a18.f221742l2 = dVar2.f405143e;
                    a18.f221747q2 = i19;
                    i19++;
                }
                a17 = a18;
            } else {
                a17 = null;
            }
            if (a17 != null) {
                a17.f221745o2 = 11;
                a17.f221746p2 = 1111;
                linkedList.add(a17);
            }
        }
        return linkedList;
    }

    public final java.util.LinkedList c() {
        m53.i4 i4Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        m53.u3 u3Var = this.f222059a.f405370d;
        if (u3Var != null && (i4Var = u3Var.f405633e) != null && (linkedList = i4Var.f405325d) != null) {
            java.util.Iterator it = linkedList.iterator();
            int i17 = 1;
            while (it.hasNext()) {
                m53.j4 j4Var = (m53.j4) it.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1.a(j4Var.f405354d);
                if (a17 != null) {
                    a17.f221750t2 = j4Var.f405354d.f405263t;
                    a17.f221745o2 = 11;
                    a17.f221746p2 = 1110;
                    a17.f221747q2 = i17;
                    linkedList2.add(a17);
                    i17++;
                }
            }
        }
        return linkedList2;
    }

    public y1(byte[] bArr) {
        this.f222062d = 0;
        m53.k2 k2Var = new m53.k2();
        this.f222059a = k2Var;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            k2Var.mo11468x92b714fd(bArr);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePBDataLibrary", "Parsing Failed: %s", e17.getMessage());
        }
        java.util.LinkedList c17 = c();
        this.f222060b = c17;
        java.util.LinkedList b17 = b();
        this.f222061c = b17;
        r53.n.c(c17);
        r53.n.c(b17);
    }
}
