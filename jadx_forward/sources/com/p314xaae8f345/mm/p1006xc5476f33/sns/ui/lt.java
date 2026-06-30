package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class lt implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342 f251409a;

    public lt(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342 c18127xe071a342) {
        this.f251409a = c18127xe071a342;
    }

    public boolean a(long j17, boolean z17) {
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLike", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342 c18127xe071a342 = this.f251409a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsActivity", "friend like %s, %s, %s", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(c18127xe071a342), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17));
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(c18127xe071a342))) {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2 J0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().J0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(c18127xe071a342));
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(c18127xe071a342), J0));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                J0.f67950x6d5f825 |= 2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLike", "com.tencent.mm.plugin.sns.storage.SnsExt");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Ej().u1(J0);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsActivity", "openIM friend like %s", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(c18127xe071a342));
        } else {
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                c17933xe8d1b2262.f68891x29d1292e = j17;
                c17933xe8d1b2262.f68896xdde069b = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(c18127xe071a342);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 i17 = m21.y.i();
                i17.f39018xf3f56116 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(c18127xe071a342);
                c17933xe8d1b2262.m70466xfabce6e3(i17);
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(c18127xe071a342);
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getInfoByName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
                Fj.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                android.database.Cursor K1 = Fj.K1(true, d17, 1, false, "", 0, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
                if (K1.getCount() == 0) {
                    K1.close();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfoByName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                    c17933xe8d1b226 = null;
                } else {
                    K1.moveToFirst();
                    c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                    c17933xe8d1b226.mo9015xbf5d97fd(K1);
                    if (!K1.isClosed()) {
                        K1.close();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getInfoByName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                }
                if (c17933xe8d1b226 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.n(c17933xe8d1b2262, 1, null, 0);
                } else if (c17933xe8d1b226.m70391x8f904ca3()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.n(c17933xe8d1b2262, 1, null, 0);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6.n(c17933xe8d1b2262, 5, null, 0);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj().L0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18127xe071a342.d(c18127xe071a342));
            if (L0.f67726xfa287b93 == j17) {
                L0.f67721xff78bac6 = z17;
                z18 = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj().W0(L0, false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.y().f142311k = 1L;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLike", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
                return z18;
            }
        }
        z18 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.y().f142311k = 1L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLike", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
        return z18;
    }
}
