package bv4;

/* loaded from: classes.dex */
public class y extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public y() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) abstractC20979x809547d1;
        if (c5255x5f3208fd != null) {
            am.r2 r2Var = c5255x5f3208fd.f135586g;
            int i17 = r2Var.f89292a;
            int i18 = 1;
            if (i17 == 27 && r2Var.f89293b == 1) {
                i18 = 0;
            } else if (i17 != 187 || r2Var.f89293b != 1) {
                if (i17 == 62 && r2Var.f89293b == 1) {
                    i18 = 2;
                } else if (i17 == 40 && r2Var.f89293b == 1) {
                    i18 = 3;
                } else if (i17 == 64 && r2Var.f89293b == 1) {
                    i18 = 4;
                } else if (i17 == 66 && r2Var.f89293b == 1) {
                    i18 = 5;
                } else if (i17 == 79 && r2Var.f89293b == 1) {
                    i18 = 6;
                } else if (i17 == 85 && r2Var.f89293b == 1) {
                    i18 = 7;
                } else if (i17 == 84 && r2Var.f89293b == 1) {
                    i18 = 8;
                } else if (i17 == 84 && r2Var.f89293b == 2) {
                    i18 = 11;
                } else if (i17 == 95 && r2Var.f89293b == 1) {
                    i18 = 9;
                } else if (i17 == 79 && r2Var.f89293b == 2) {
                    i18 = 10;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(i18).a(r2Var.f89294c);
            ((ku5.t0) ku5.t0.f394148d).h(new su4.i3(i18), "WebSearchThread");
        }
        return false;
    }
}
