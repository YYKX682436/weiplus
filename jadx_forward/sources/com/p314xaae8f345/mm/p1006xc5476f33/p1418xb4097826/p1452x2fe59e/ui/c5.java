package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class c5 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f191275a = new java.util.HashSet();

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        r45.z53 z53Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f374658i;
                cm2.m mVar = obj instanceof cm2.m ? (cm2.m) obj : null;
                if (mVar != null) {
                    r45.n73 n73Var = mVar.f124898d;
                    r45.z53 z53Var2 = (r45.z53) n73Var.m75936x14adae67(1);
                    if ((z53Var2 != null && z53Var2.m75939xb282bd08(13) == 1) && (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) != null && (m75945x2fec8307 = z53Var.m75945x2fec8307(0)) != null) {
                        java.util.HashSet hashSet = this.f191275a;
                        if (!hashSet.contains(m75945x2fec8307)) {
                            hashSet.add(m75945x2fec8307);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.f(1, m75945x2fec8307);
                        }
                    }
                }
            }
        }
    }
}
