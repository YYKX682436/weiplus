package ss3;

/* loaded from: classes9.dex */
public class w extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public w() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5949x47dfece6 c5949x47dfece6 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5949x47dfece6) abstractC20979x809547d1;
        if (!(c5949x47dfece6 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5949x47dfece6)) {
            return false;
        }
        long j17 = c5949x47dfece6.f136248g.f88139a;
        ss3.d0.Bi(ss3.d0.Di().D0(j17, 20), 20);
        c01.ua Di = ss3.d0.Di();
        Di.getClass();
        java.lang.String str = "reserved2 = " + j17;
        Di.s0(str);
        if (Di.f119043d.A(Di.L0(20), "delete from " + Di.L0(20) + " where " + str)) {
            Di.W0(20);
            Di.m145262xf35bbb4();
        }
        return true;
    }
}
