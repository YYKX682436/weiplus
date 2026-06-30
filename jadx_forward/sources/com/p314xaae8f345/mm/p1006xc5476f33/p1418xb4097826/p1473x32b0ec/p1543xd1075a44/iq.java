package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class iq extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f200224a = new java.util.HashSet();

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f374658i;
                r45.z53 z53Var = obj instanceof r45.z53 ? (r45.z53) obj : null;
                if (z53Var != null && z53Var.m75939xb282bd08(13) == 1 && (m75945x2fec8307 = z53Var.m75945x2fec8307(0)) != null) {
                    java.util.HashSet hashSet = this.f200224a;
                    if (!hashSet.contains(m75945x2fec8307)) {
                        hashSet.add(m75945x2fec8307);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.f(1, m75945x2fec8307);
                    }
                }
            }
        }
    }
}
