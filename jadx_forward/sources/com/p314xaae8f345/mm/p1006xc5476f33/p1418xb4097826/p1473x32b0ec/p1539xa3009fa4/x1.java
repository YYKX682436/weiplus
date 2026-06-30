package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes9.dex */
public final class x1 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f199054a = new java.util.HashSet();

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        cm2.k kVar;
        r45.b73 b73Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            bm2.d dVar = k3Var instanceof bm2.d ? (bm2.d) k3Var : null;
            if (dVar != null && (kVar = dVar.f103367h) != null) {
                r45.c73 c73Var = kVar.f124891d;
                r45.b73 b73Var2 = (r45.b73) c73Var.m75936x14adae67(1);
                if ((b73Var2 != null && b73Var2.m75939xb282bd08(10) == 1) && (b73Var = (r45.b73) c73Var.m75936x14adae67(1)) != null && (m75945x2fec8307 = b73Var.m75945x2fec8307(0)) != null) {
                    java.util.HashSet hashSet = this.f199054a;
                    if (!hashSet.contains(m75945x2fec8307)) {
                        hashSet.add(m75945x2fec8307);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.f(7, m75945x2fec8307);
                    }
                }
            }
        }
    }
}
