package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class ra extends ym5.m0 {
    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f374658i;
                so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
                if (j5Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShareStreamRedDotHelper", "feed " + pm0.v.u(j5Var.mo2128x1ed62e84()) + " exposed!");
                    java.util.HashSet hashSet = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.sa.f187397b;
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.sa.f187397b = hashSet;
                    hashSet.add(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()));
                }
            }
        }
    }
}
