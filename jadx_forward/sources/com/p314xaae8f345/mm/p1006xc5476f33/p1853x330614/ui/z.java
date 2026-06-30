package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class z implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3 f230050a;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3 abstractActivityC16473xfb0d5c3) {
        this.f230050a = abstractActivityC16473xfb0d5c3;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3 abstractActivityC16473xfb0d5c3 = this.f230050a;
        if (i18 != 0) {
            if (i18 != 1) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11458, 3);
            h45.a0.k(abstractActivityC16473xfb0d5c3, 2);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11458, 2);
        if (c01.z1.I()) {
            com.p314xaae8f345.mm.p2802xd031a825.a.k(abstractActivityC16473xfb0d5c3.mo55332x76847179(), "wallet_payu", "PayURemittanceProcess", null, null);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.a.k(abstractActivityC16473xfb0d5c3.mo55332x76847179(), "remittance", "RemittanceProcess", null, null);
        }
    }
}
