package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class d2 extends dm.pa {

    /* renamed from: p1, reason: collision with root package name */
    public static final l75.e0 f247498p1 = dm.pa.m125402x3593deb(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.d2.class);

    @Override // dm.pa, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDBInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        return f247498p1;
    }

    public r45.cp0 t0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFault", "com.tencent.mm.plugin.sns.storage.SnsExt");
        new r45.k53();
        r45.cp0 cp0Var = new r45.cp0();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f67940xf96f3956)) {
            try {
                r45.k53 k53Var = (r45.k53) new r45.k53().mo11468x92b714fd(this.f67940xf96f3956);
                if (k53Var.f459914d.size() > 0) {
                    cp0Var = (r45.cp0) k53Var.f459914d.getFirst();
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFault", "com.tencent.mm.plugin.sns.storage.SnsExt");
        return cp0Var;
    }

    public r45.cb6 u0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
        try {
            r45.cb6 cb6Var = (r45.cb6) new r45.cb6().mo11468x92b714fd(this.f67956xfa3fdafe);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
            return cb6Var;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsExt", "getSnsUser error, return fallback userinfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
            return null;
        }
    }

    public r45.bb6 v0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        r45.bb6 bb6Var = new r45.bb6();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(this.f67955x5c28f19e)) {
            try {
                bb6Var.mo11468x92b714fd(this.f67955x5c28f19e);
            } catch (java.lang.Exception unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsUserDateInfo", "com.tencent.mm.plugin.sns.storage.SnsExt");
        return bb6Var;
    }

    public void w0(r45.cb6 cb6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f67957xdde069b;
        objArr[1] = java.lang.Boolean.valueOf(cb6Var == null);
        objArr[2] = java.lang.Boolean.valueOf(this.f67956xfa3fdafe == null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsExt", "setSnsUser, username:%s, userInfo==null:%s, this.field_snsuser==null:%s", objArr);
        if (cb6Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
            return;
        }
        try {
            this.f67956xfa3fdafe = cb6Var.mo14344x5f01b1f6();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsExt", "setSnsUser error:%s", e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsUser", "com.tencent.mm.plugin.sns.storage.SnsExt");
    }

    public void y0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsExt");
        this.f67950x6d5f825 &= -3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unLikeFlag", "com.tencent.mm.plugin.sns.storage.SnsExt");
    }
}
