package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes8.dex */
final class e3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private e3() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s H0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0();
        int i17 = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2) obj).f149937d;
        java.util.List list = H0.f174748a;
        if (qp1.w.a(list)) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
                if (c12886x91aa2b6d.f174579d == i17 && !c12886x91aa2b6d.f174578J) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z17);
    }
}
