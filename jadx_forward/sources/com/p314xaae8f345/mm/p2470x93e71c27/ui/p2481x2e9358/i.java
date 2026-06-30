package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class i implements db5.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 f271917a;

    public i(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083) {
        this.f271917a = c19664x489a3083;
    }

    @Override // db5.z1
    public void a(int i17, int i18, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083 = this.f271917a;
        c19664x489a3083.f271474s.m78922x7d600aec(i18);
        if (c19664x489a3083.getVisibility() != 0 || i17 == -1 || i17 == i18 || !z17) {
            return;
        }
        if (i18 >= 0 && i18 < ((java.util.ArrayList) c19664x489a3083.f271472q).size()) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19663x33e018e7) ((java.util.ArrayList) c19664x489a3083.f271472q).get(i18)).c();
        }
        int size = c19664x489a3083.C.f271685j.f272299a ? c19664x489a3083.f271478w + c19664x489a3083.T.size() : c19664x489a3083.f271478w;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6809xf5052428 c6809xf5052428 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6809xf5052428();
        c6809xf5052428.f141365d = 1L;
        c6809xf5052428.f141366e = 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < c19664x489a3083.m75407xd8c278af().size(); i19++) {
            int i27 = c19664x489a3083.B + size + 1;
            int i28 = c19664x489a3083.f271481z;
            int i29 = i27 / i28;
            if (i27 % i28 <= 0) {
                i29--;
            }
            if (i29 < 0) {
                i29 = 0;
            }
            if (i17 == i29) {
                sb6.append(c19664x489a3083.m75407xd8c278af().get(i19).f272246g2);
                sb6.append("|");
            }
        }
        c6809xf5052428.f141367f = c6809xf5052428.b("AppList", sb6.toString(), true);
        c6809xf5052428.k();
        int s17 = c19664x489a3083.s(14);
        if (s17 != -1 && s17 == c19664x489a3083.m75408xf19ef016()) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19664x489a3083.f271469o;
            java.lang.String c17 = y4Var == null ? "" : y4Var.c();
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6810x8178771f c6810x8178771f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6810x8178771f();
            c6810x8178771f.f141368d = c6810x8178771f.b("RoomName", c17, true);
            c6810x8178771f.f141369e = 0L;
            c6810x8178771f.f141370f = c6810x8178771f.b("AppList", "19", true);
            c6810x8178771f.f141371g = s17 + 1;
            c6810x8178771f.k();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppPanel", "scroll to show page %s", java.lang.Integer.valueOf(i18));
        int s18 = c19664x489a3083.s(15);
        if (i18 == s18 && c19664x489a3083.C.A.f272299a) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Di(s18 + 1);
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ui(1, c19664x489a3083.f271464g, c19664x489a3083.f271465h, null);
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0 c21489xc8bb7d0 = c19664x489a3083.f271473r;
        if (c21489xc8bb7d0 != null) {
            c21489xc8bb7d0.announceForAccessibility(c19664x489a3083.f271470p.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bmd, java.lang.String.valueOf(i18 + 1)));
        }
    }
}
