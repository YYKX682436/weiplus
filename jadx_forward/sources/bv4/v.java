package bv4;

/* loaded from: classes8.dex */
public class v extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public v() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8 c5688x8d5069c8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5688x8d5069c8) abstractC20979x809547d1;
        am.dj djVar = c5688x8d5069c8.f136013g;
        int i17 = djVar.f88004a;
        int i18 = 1;
        if (i17 == 27 && djVar.f88005b == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf c5300x3b5972cf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5300x3b5972cf();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            am.b4 b4Var = c5300x3b5972cf.f135622g;
            b4Var.f87750a = currentTimeMillis;
            b4Var.f87751b = true;
            c5300x3b5972cf.e();
            i18 = 0;
        } else if (i17 != 27 || djVar.f88005b != 2) {
            if (i17 == 62 && djVar.f88005b == 1) {
                i18 = 2;
            } else if (i17 == 40 && djVar.f88005b == 1) {
                i18 = 3;
            } else if (i17 == 64 && djVar.f88005b == 1) {
                i18 = 4;
            } else if (i17 == 66 && djVar.f88005b == 1) {
                i18 = 5;
            } else if (i17 == 79 && djVar.f88005b == 1) {
                i18 = 6;
            } else if (i17 == 85 && djVar.f88005b == 1) {
                i18 = 7;
            } else if (i17 == 84 && djVar.f88005b == 1) {
                i18 = 8;
            } else if (i17 == 84 && djVar.f88005b == 2) {
                i18 = 11;
            } else {
                if (i17 != 95 || djVar.f88005b != 1) {
                    if (i17 == 79 && djVar.f88005b == 2) {
                        i18 = 10;
                    }
                    return false;
                }
                i18 = 9;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(i18).d(c5688x8d5069c8.f136013g.f88006c);
        return false;
    }
}
