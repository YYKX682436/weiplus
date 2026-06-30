package qs;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.uz uzVar = ((com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6190xfd5dd5c7) abstractC20979x809547d1).f136448g;
        int i17 = uzVar.f89680a;
        int i18 = uzVar.f89681b;
        if (i18 == 1) {
            c81.b wi6 = c81.b.wi();
            wi6.m134976x2690a4ac();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = wi6.f121189d.a();
            if (a17 == null) {
                return false;
            }
            a17.putInt("last_m7_step_count", i17);
            return false;
        }
        if (i18 != 2) {
            return false;
        }
        c81.b wi7 = c81.b.wi();
        wi7.m134976x2690a4ac();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a18 = wi7.f121189d.a();
        if (a18 == null) {
            return false;
        }
        a18.putInt("last_hk_step_count", i17);
        return false;
    }
}
