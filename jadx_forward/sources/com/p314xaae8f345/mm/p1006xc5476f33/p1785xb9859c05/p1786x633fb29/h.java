package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.C16118x4adcf3c7 c16118x4adcf3c7) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.i.f224002a;
        try {
            if (!gm0.j1.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAddressUpdater", "updateAddressStorage, acc not ready");
                return;
            }
            java.lang.System.currentTimeMillis();
            java.util.ArrayList z07 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().z0();
            if (z07 == null || z07.size() <= 0) {
                return;
            }
            s83.b.b();
            java.util.HashMap hashMap = s83.b.f486400b;
            if (hashMap != null && hashMap.size() >= 0) {
                s83.d wi6 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi();
                long id6 = java.lang.Thread.currentThread().getId();
                l75.k0 k0Var = wi6.f486405d;
                long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(id6)) : -1L;
                z07.size();
                java.util.Iterator it = z07.iterator();
                while (it.hasNext()) {
                    s83.c cVar = (s83.c) it.next();
                    if (!hashMap.containsKey(cVar.f67827x821cd056)) {
                        long j17 = cVar.f72763xa3c65b86;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().mo70496xb06685ab(j17);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.i.a(j17);
                    }
                }
                for (s83.c cVar2 : hashMap.values()) {
                    s83.c D0 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().D0(cVar2.f67827x821cd056);
                    if (D0 == null || D0.f72763xa3c65b86 == -1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().mo880xb970c2b9(cVar2);
                    } else if (!(D0.t0(D0.f67827x821cd056, cVar2.f67827x821cd056) && D0.t0(D0.f67829x5c31173f, cVar2.f67829x5c31173f) && D0.t0(D0.f67830xf13c6c01, cVar2.f67830xf13c6c01))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().mo11261xce0038c9(D0.f72763xa3c65b86, cVar2);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi().y0(F);
                java.lang.System.currentTimeMillis();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAddressUpdater", "updateAddressStorage error:" + e17.getMessage());
        }
    }
}
