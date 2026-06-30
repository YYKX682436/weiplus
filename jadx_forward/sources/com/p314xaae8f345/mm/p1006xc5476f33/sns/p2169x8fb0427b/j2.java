package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class j2 extends dm.wa {

    /* renamed from: w, reason: collision with root package name */
    public static final l75.e0 f247559w = dm.wa.m125667x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.j2.class);

    /* renamed from: v, reason: collision with root package name */
    public int f247560v;

    @Override // dm.wa, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        try {
            super.mo9015xbf5d97fd(cursor);
            this.f247560v = (int) this.f72763xa3c65b86;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        } catch (java.lang.Exception e17) {
            java.lang.String message = e17.getMessage();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsKvReport", "error " + message);
            if (message != null && message.contains("Unable to convert")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
                Aj.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                Aj.f247689d.A("SnsComment", "DROP TABLE SnsComment");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            }
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
                throw e17;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsKvReport", e18, "", new java.lang.Object[0]);
            }
        }
    }

    @Override // dm.wa, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsKvReport");
        return f247559w;
    }
}
