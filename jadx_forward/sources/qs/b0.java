package qs;

/* loaded from: classes8.dex */
public class b0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public b0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        am.f20 f20Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6260x34462d0 c6260x34462d0 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6260x34462d0) abstractC20979x809547d1;
        z71.m wi6 = z71.m.wi();
        wi6.getClass();
        if (c6260x34462d0 != null && (f20Var = c6260x34462d0.f136511g) != null) {
            wi6.f552067e = false;
            if (f20Var.f88163a == 7) {
                long j17 = wi6.f552066d;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (java.lang.System.currentTimeMillis() - j17 <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                    wi6.f552067e = true;
                }
                wi6.f552066d = 0L;
            }
            if (f20Var.f88163a == 7) {
                long j18 = f20Var.f88164b;
                c81.b wi7 = c81.b.wi();
                wi7.m134976x2690a4ac();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = wi7.f121189d.a();
                long j19 = a17 == null ? 0L : a17.getLong("calendar_first_enter_app_time", 0L);
                int a18 = a81.a.a(j19);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (a18 != a81.a.a(java.lang.System.currentTimeMillis())) {
                    j19 = 0;
                }
                if (j19 <= 0) {
                    c81.b wi8 = c81.b.wi();
                    wi8.m134976x2690a4ac();
                    wi8.f121189d.c("calendar_first_enter_app_time", j18);
                }
            }
        }
        return false;
    }
}
