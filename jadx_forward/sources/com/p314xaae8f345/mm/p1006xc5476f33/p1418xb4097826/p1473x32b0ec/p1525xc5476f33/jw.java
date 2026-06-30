package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jw implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f194703d;

    public jw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar) {
        this.f194703d = owVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f194703d;
        java.util.Iterator it = ((java.util.LinkedHashMap) owVar.f195331x0).entrySet().iterator();
        while (it.hasNext()) {
            dk2.ga gaVar = (dk2.ga) ((java.util.Map.Entry) it.next()).getValue();
            long j17 = gaVar.f315047b;
            if (j17 > 0) {
                gaVar.f315047b = j17 - 1;
                gaVar.f315048c++;
                ae2.in inVar = ae2.in.f85221a;
                java.lang.Object r17 = ((lb2.j) ((jz5.n) ae2.in.f85444w5).mo141623x754a37bb()).r();
                if (!(((java.lang.Number) r17).intValue() > 0)) {
                    r17 = null;
                }
                if (gaVar.f315048c % (((java.lang.Integer) r17) != null ? r4.intValue() : 9) == 0) {
                    java.util.List list = gaVar.f315053h;
                    if (list.size() > 0) {
                        owVar.w1(gaVar, (java.lang.String) list.remove(0));
                        list.clear();
                    }
                } else if (!gaVar.f315052g) {
                    owVar.z1(gaVar, true);
                }
            }
        }
        return true;
    }
}
