package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class t2 extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f247675f = {"CREATE INDEX IF NOT EXISTS snsWsFoldGroupIdIndex ON SnsWsFoldGroupDetail ( groupId )"};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f247676g = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2.f247666r, "SnsWsFoldGroupDetail")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f247677d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f247678e;

    public t2(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.q2.f247639t, "SnsWsFoldGroupDetail", f247675f);
        this.f247678e = new java.util.HashMap();
        this.f247677d = k0Var;
    }

    public boolean D0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        int mo70514xb06685ab = this.f247677d.mo70514xb06685ab("SnsWsFoldGroupDetail", "groupId=?", new java.lang.String[]{"" + j17});
        ((java.util.HashMap) this.f247678e).remove(java.lang.Long.valueOf(j17));
        boolean z17 = mo70514xb06685ab > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        return z17;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 y0(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWsFoldDetailByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 s2Var = null;
        android.database.Cursor f17 = this.f247677d.f("select *,rowid from SnsWsFoldGroupDetail  where SnsWsFoldGroupDetail.groupId=" + j17, null, 2);
        if (f17 != null) {
            if (f17.moveToNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 s2Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2();
                s2Var2.mo9015xbf5d97fd(f17);
                s2Var = s2Var2;
            }
            f17.close();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWsFoldDetailByGroupId", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        return s2Var;
    }

    public boolean z0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.s2 s2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("insertWsFoldDetail", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        boolean z17 = this.f247677d.m("SnsWsFoldGroupDetail", "groupId", s2Var.mo9763xeb27878e()) > 0;
        try {
            r45.qb6 qb6Var = new r45.qb6();
            java.util.LinkedList linkedList = qb6Var.f465343d;
            qb6Var.mo11468x92b714fd(s2Var.f69423x99016a0b);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                ((java.util.HashMap) this.f247678e).put(java.lang.Long.valueOf(s2Var.f69422x861009b5), linkedList);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsWsFoldDetailStorage", "parse SnsWsGroupStruct fail:%s", e17.getMessage());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertWsFoldDetail", "com.tencent.mm.plugin.sns.storage.SnsWsFoldDetailStorage");
        return z17;
    }
}
