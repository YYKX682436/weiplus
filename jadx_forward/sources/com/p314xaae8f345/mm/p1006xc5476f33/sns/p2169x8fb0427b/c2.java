package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public class c2 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f247484e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2.f247473t, "snsDraft")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f247485f = " (snsDraft.extFlag & 2 != 0 ) ";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f247486g = " order by snsDraft.timestamp desc";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f247487d;

    public c2(l75.k0 k0Var) {
        super(k0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2.f247473t, "snsDraft", null);
        this.f247487d = k0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDraftStorage", "createDraftStorage " + k0Var + "  " + java.lang.Thread.currentThread().getId());
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2 D0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2();
        android.database.Cursor f17 = this.f247487d.f("select *,rowid from snsDraft  where snsDraft.key='" + str + "' limit 1", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
            return null;
        }
        b2Var.mo9015xbf5d97fd(f17);
        f17.close();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        byte[] bArr = b2Var.f67847x28ff5a1c;
        objArr[1] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDraftStorage", "readDraft: %s, %s", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        return b2Var;
    }

    public void J0(java.lang.String str, byte[] bArr, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("writeDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = bArr == null ? null : java.lang.Integer.valueOf(bArr.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDraftStorage", "writeDraft: %s, %s", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2();
        b2Var.f67849x4b6e619a = str;
        b2Var.f67850x9de75411 = java.lang.System.currentTimeMillis();
        b2Var.f67847x28ff5a1c = bArr;
        b2Var.f67848x26b1b2e8 = i17;
        super.mo11260x413cb2b4(b2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("writeDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
    }

    public void y0(boolean z17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkOldDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        if (z17) {
            gm0.j1.i();
            str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_OPEN_UPLOAD_NEWTEXT_DRAFT_STRING_SYNC, null);
        } else {
            gm0.j1.i();
            str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_MEDIA_STRING_SYNC, null);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            byte[] c17 = ot5.e.c(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c17)) {
                if (z17) {
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_OPEN_UPLOAD_NEWTEXT_DRAFT_STRING_SYNC, "");
                    J0("draft_text", c17, 0);
                } else {
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_MEDIA_STRING_SYNC, "");
                    J0("draft_normal", c17, 0);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkOldDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
    }

    public void z0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2 b2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("genSentDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        android.database.Cursor f17 = this.f247487d.f("select *,rowid from snsDraft  where " + f247485f + f247486g + " limit 1", null, 2);
        try {
            if (f17.moveToFirst()) {
                b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2();
                b2Var.mo9015xbf5d97fd(f17);
            } else {
                b2Var = null;
            }
            f17.close();
            if (b2Var != null) {
                J0("draft_sent_" + i17, b2Var.f67847x28ff5a1c, 0);
                J0(b2Var.f67849x4b6e619a, null, 0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genSentDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        } catch (java.lang.Throwable th6) {
            f17.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("genSentDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
            throw th6;
        }
    }
}
