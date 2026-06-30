package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class t2 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 f201393a;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var) {
        this.f201393a = h3Var;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var;
        java.lang.String str;
        r45.cw1 cw1Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String str2 = "";
            h3Var = this.f201393a;
            if (!hasNext) {
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v2 v2Var = k3Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v2 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v2) k3Var : null;
            if (v2Var != null) {
                java.util.LinkedHashSet linkedHashSet = h3Var.f200049e;
                r45.cw1 cw1Var2 = v2Var.f201559d;
                if (cw1Var2 != null && (m75945x2fec8307 = cw1Var2.m75945x2fec8307(0)) != null) {
                    str2 = m75945x2fec8307;
                }
                if (!linkedHashSet.contains(str2) && (cw1Var = v2Var.f201559d) != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h3Var.f200047c, "report expose nickname " + cw1Var.m75945x2fec8307(1));
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).pj(ml2.c4.f408866e, cw1Var.m75939xb282bd08(5), cw1Var.m75945x2fec8307(0));
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).pj(ml2.c4.f408868g, cw1Var.m75939xb282bd08(5), cw1Var.m75945x2fec8307(0));
                }
            }
        }
        if (h3Var.f200049e.size() > 0) {
            h3Var.f200049e.clear();
        }
        java.util.LinkedHashSet linkedHashSet2 = h3Var.f200049e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : exposedHolders) {
            if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v2) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            r45.cw1 cw1Var3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.v2) it6.next()).f201559d;
            if (cw1Var3 == null || (str = cw1Var3.m75945x2fec8307(0)) == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        linkedHashSet2.addAll(arrayList2);
    }
}
