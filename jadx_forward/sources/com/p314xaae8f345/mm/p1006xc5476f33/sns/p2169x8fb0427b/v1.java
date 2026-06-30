package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class v1 extends dm.ma implements java.lang.Cloneable {
    public static final l75.e0 T = dm.ma.m125231x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1.class);
    public int S;

    /* renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object m70528x5a5dd5d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 t07 = t0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return t07;
    }

    @Override // dm.ma, l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsComment");
        try {
            super.mo9015xbf5d97fd(cursor);
            this.S = (int) this.f72763xa3c65b86;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsComment");
        } catch (java.lang.Exception e17) {
            java.lang.String message = e17.getMessage();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsComment", "error " + message);
            if (message != null && message.contains("Unable to convert")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w1 Aj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj();
                Aj.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
                Aj.f247689d.A("SnsComment", "DROP TABLE SnsComment");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("droptable", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
            }
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertFrom", "com.tencent.mm.plugin.sns.storage.SnsComment");
                throw e17;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsComment", e18, "", new java.lang.Object[0]);
            }
        }
    }

    /* renamed from: equals */
    public boolean m70529xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.storage.SnsComment");
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.storage.SnsComment");
            return false;
        }
        long j17 = this.f67458x3aefdbd0;
        if (j17 > 0) {
            boolean z17 = j17 == ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) obj).f67458x3aefdbd0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.storage.SnsComment");
            return z17;
        }
        boolean equals = super.equals(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return equals;
    }

    @Override // dm.ma, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsComment");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return T;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 t0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1 v1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        try {
            v1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.v1) super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsComment", "snscomment clone error");
            v1Var = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clone", "com.tencent.mm.plugin.sns.storage.SnsComment");
        return v1Var;
    }

    public void u0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
        this.f67459xe928fe86 |= 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentDelFlag", "com.tencent.mm.plugin.sns.storage.SnsComment");
    }
}
