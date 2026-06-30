package nx;

/* loaded from: classes12.dex */
public class d extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public d() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5197x39c61302 c5197x39c61302 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5197x39c61302) abstractC20979x809547d1;
        if (c5197x39c61302 != null) {
            am.v0 v0Var = c5197x39c61302.f135538g;
            if (v0Var.f89688e == 1) {
                android.content.Context context = v0Var.f89684a;
                java.lang.String str = v0Var.f89686c;
                java.lang.String str2 = v0Var.f89689f;
                int i17 = v0Var.f89685b;
                long j17 = v0Var.f89687d;
                if (context != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    gm0.j1.d().a(1071, new lr1.n(context, str, j17, 0, i17, str2, false, c5197x39c61302));
                    gm0.j1.d().g(new lr1.g0(str, j17, 0, i17, ""));
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BrandServiceLogic", "context(%s) or keyword(%s) is null or nil.", context, str);
            }
        }
        return false;
    }
}
