package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public class l0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public l0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5853x49a21022 c5853x49a21022 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5853x49a21022) abstractC20979x809547d1;
        am.to toVar = c5853x49a21022.f136159g;
        if (toVar.f89558a == 0) {
            e04.n3 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k0.b(toVar.f89560c, 0);
            am.to toVar2 = c5853x49a21022.f136159g;
            am.uo uoVar = c5853x49a21022.f136160h;
            if (b17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProductOperationListener", "error, xml[%s] can not parse", toVar2.f89560c);
                uoVar.f89651a = false;
            } else {
                uoVar.f89652b = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k0.c(toVar2.f89559b, b17);
                uoVar.f89653c = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.m1.Ai().Di(b17.f69643x7b28c57e, "@S");
                uoVar.f89651a = true;
            }
        }
        return false;
    }
}
