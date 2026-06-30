package bh0;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean z17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf c5300x3b5972cf = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf) abstractC20979x809547d1;
        qx4.l0 l0Var = qx4.l0.f448955a;
        synchronized (qx4.l0.class) {
            pm0.v.X(qx4.h0.f448942d);
        }
        boolean z18 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4671xf410f8ca.f19953x4fbc8495.mo40965x320351f8() || com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4680xc54adbd8.f19968x4fbc8495.mo40965x320351f8();
        boolean z19 = c5300x3b5972cf.f135622g.f87751b;
        if (z18 || !z19) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265736c;
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) ((java.lang.ref.SoftReference) entry.getValue()).get();
                if (e3Var != null && (z17 = e3Var.L) && z17) {
                    e3Var.y1();
                }
            }
            concurrentHashMap.clear();
        }
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2437x36f002.C19498xba974aee.f269264a.b();
        }
        return false;
    }
}
