package w72;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53 c5296x2dd9a53 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5296x2dd9a53) abstractC20979x809547d1;
        am.w3 w3Var = c5296x2dd9a53.f135617g;
        long j17 = w3Var.f89791a;
        int i17 = w3Var.f89792b;
        int i18 = w3Var.f89793c;
        java.lang.String str = w3Var.f89794d;
        o72.r2 r2Var = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.DelFavoriteItemListener", "do delete favitem, localId:%d sourceId:%s favId:%s delType:%s", java.lang.Long.valueOf(j17), null, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        am.x3 x3Var = c5296x2dd9a53.f135618h;
        if (j17 != 0) {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
            if (F == null) {
                F = new o72.r2();
                F.f67645x88be67a1 = j17;
            }
            F.f67656xf4031e77 = str;
            x3Var.f89876a = o72.x1.k(F, null, i18);
            r2Var = F;
        } else {
            if (!android.text.TextUtils.isEmpty(null)) {
                ((a82.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(null, str, null);
                throw null;
            }
            if (i17 != 0) {
                o72.r2 re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(i17);
                if (re6 == null) {
                    re6 = new o72.r2();
                    re6.f67643xc8a07680 = i17;
                }
                re6.f67656xf4031e77 = str;
                x3Var.f89876a = o72.x1.k(re6, null, i18);
                r2Var = re6;
            }
        }
        if (r2Var != null) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.DelFavoriteItemListener", "info is null, do nothing");
        return false;
    }
}
