package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class y6 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y6() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6284x7d3d5b36 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6284x7d3d5b36) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile webPageProfile = null;
            am.b30 b30Var = event.f136533g;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.b5.b(b30Var != null ? b30Var.f87748b : null)) {
                int i17 = b30Var.f87747a;
                if (i17 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(368, 74);
                } else if (i17 == 2) {
                    com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar = b30Var.f87749c;
                    if (vVar == null || vVar.f271262g != 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var.A(368, 77);
                        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar2 = b30Var.f87749c;
                        if (vVar2 != null && (bundle = vVar2.f271265j) != null) {
                            webPageProfile = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile) bundle.getParcelable("RESPONSE_KEY_CRONET_PERFORMANCE");
                        }
                        if (webPageProfile != null && webPageProfile.f18139xfad511c3) {
                            g0Var.A(368, 78);
                        }
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                        g0Var2.A(368, 75);
                        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar3 = b30Var.f87749c;
                        if (vVar3 != null && (bundle2 = vVar3.f271265j) != null) {
                            webPageProfile = (com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.WebPageProfile) bundle2.getParcelable("RESPONSE_KEY_CRONET_PERFORMANCE");
                        }
                        if (webPageProfile != null && webPageProfile.f18139xfad511c3) {
                            g0Var2.A(368, 76);
                        }
                    }
                }
            }
        }
        return false;
    }
}
