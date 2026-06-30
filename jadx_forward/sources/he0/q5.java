package he0;

/* loaded from: classes4.dex */
public class q5 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public q5() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        if (gm0.j1.a()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("printAllDbFeedsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            Fj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247514n + " from SnsInfo where ";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.C1();
            sb6.append(" (sourceType & 2 != 0 ) ");
            java.lang.String sb7 = sb6.toString();
            if (Fj.b3("")) {
                sb7 = sb7 + " AND " + Fj.p1("");
            }
            if (Fj.b3("")) {
                sb7 = sb7 + " AND " + Fj.z1("");
            }
            java.lang.String str2 = sb7 + " AND createTime >= 0";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAdLowTimeLimitZero", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAdLowTimeLimitZero", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            i64.u1.a(25, 1);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 28);
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoStorage", "getAdCursorForTimeLine: downTime=0, upTime=0, downSeq=, upSeq=");
            android.database.Cursor B = Fj.f247527d.B(str2 + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247515o, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdCursorForTimeLine", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            if (B != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId begin");
                while (B.moveToNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                    c17933xe8d1b226.mo9015xbf5d97fd(B);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", c17933xe8d1b226.m70367x7525eefd());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoStorageLogic", "all timeline snsId end");
                B.close();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("printAllDbFeedsId", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            Fj2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            Fj2.f247527d.A(dm.va.f68838xc4fe047c, "delete from SnsInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearInfo", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().z0("@__weixintimtline");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsClearDbListener", "SnsClearDBEvent arrived before account was ready, ignore it.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.feature.sns.listener.SnsClearDbListener");
        return false;
    }
}
