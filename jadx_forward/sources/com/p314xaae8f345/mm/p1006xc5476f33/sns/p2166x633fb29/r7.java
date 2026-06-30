package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class r7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 f246186d;

    public r7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 o7Var) {
        this.f246186d = o7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean z17;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7 o7Var = this.f246186d;
        o7Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkTLE", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "checkTLE: ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        Fj.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAllUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        java.lang.String str2 = "select *,rowid from SnsInfo  where ";
        android.database.Cursor B = Fj.f247527d.B("select *,rowid from SnsInfo  where " + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247519s + " order by SnsInfo.rowid asc ", null);
        if (B.getCount() == 0) {
            B.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAllUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            B = null;
        } else {
            B.moveToFirst();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAllUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        if (B == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTLE", "com.tencent.mm.plugin.sns.model.UploadManager");
            str = "select *,rowid from SnsInfo  where ";
        } else {
            B.moveToFirst();
            while (true) {
                c17933xe8d1b226.mo9015xbf5d97fd(B);
                try {
                    r45.kj4 kj4Var = (r45.kj4) new r45.kj4().mo11468x92b714fd(c17933xe8d1b226.m70364x267b657d());
                    str = str2;
                    if (c17933xe8d1b226.m70416x475c02e4(kj4Var.f460281n, kj4Var.f460282o)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cleanUploadAndPost", "com.tencent.mm.plugin.sns.model.UploadManager");
                        java.util.Iterator it = kj4Var.f460278h.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().A(((r45.ec4) it.next()).f454799d);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cleanUploadAndPost", "com.tencent.mm.plugin.sns.model.UploadManager");
                        o7Var.m(c17933xe8d1b226, 6, "snsinfo is tle");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "checkTLE snsinfo localId it time limit " + c17933xe8d1b226.m70363x51f8f990() + " is die ");
                    }
                } catch (java.lang.Exception unused) {
                    str = str2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "startPost parseFrom MediaPostInfo Exception");
                    o7Var.m(c17933xe8d1b226, 2, "MediaPostInfo parser error");
                }
                if (!B.moveToNext()) {
                    break;
                } else {
                    str2 = str;
                }
            }
            B.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkTLE", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Xj()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UploadManager", "is invalid after checkTLE");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
        Fj2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLastUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        android.database.Cursor f17 = Fj2.f247527d.f(str + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2.f247519s + " order by SnsInfo.rowid asc ", null, 2);
        if (f17.moveToFirst()) {
            c17933xe8d1b2262.mo9015xbf5d97fd(f17);
            f17.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        } else {
            f17.close();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLastUpload", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            c17933xe8d1b2262 = null;
        }
        if (c17933xe8d1b2262 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "All has post");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().q(c17933xe8d1b2262.f38324x142bbdc6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "checking isPosting " + c17933xe8d1b2262.f38324x142bbdc6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b2262.m70371x485d7();
        java.util.LinkedList linkedList = (m70371x485d7 == null || (a90Var = m70371x485d7.f39014x86965dde) == null) ? null : a90Var.f451373h;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
            z17 = false;
        } else {
            z17 = ((r45.jj4) linkedList.get(0)).f459389e == 8;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkSnsInfoIsFakeVideo", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "checking startPost " + c17933xe8d1b2262.m70363x51f8f990());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.model.UploadManager");
            boolean z18 = o7Var.f246091c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.model.UploadManager");
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$202", "com.tencent.mm.plugin.sns.model.UploadManager");
                o7Var.f246091c = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$202", "com.tencent.mm.plugin.sns.model.UploadManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.model.UploadManager");
                o7Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sdkReportShare", "com.tencent.mm.plugin.sns.model.UploadManager");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a c6194x6522023a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6194x6522023a();
                long j17 = c17933xe8d1b2262.f38324x142bbdc6;
                am.xz xzVar = c6194x6522023a.f136451g;
                xzVar.f89942a = j17;
                xzVar.f89943b = 1;
                xzVar.f89944c = c17933xe8d1b2262.m70374x6bf53a6c();
                c6194x6522023a.e();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sdkReportShare", "com.tencent.mm.plugin.sns.model.UploadManager");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.model.UploadManager");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o7.a(o7Var, c17933xe8d1b2262);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UploadManager", "feed is fake video " + c17933xe8d1b2262.f38324x142bbdc6);
        int m70357x3fdd41df = c17933xe8d1b2262.m70357x3fdd41df();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.C17893x66003bc c17893x66003bc = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.C17893x66003bc(this, c17933xe8d1b2262);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkFakeVideoIsError", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        int i17 = c17933xe8d1b2262.f38324x142bbdc6;
        boolean z19 = c17933xe8d1b2262.m70371x485d7().f39043xa1529a15 != null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkFakeVideoIsError >> localId: ");
        sb6.append(i17);
        sb6.append(", isTemplateVideo:");
        sb6.append(z19);
        sb6.append(", templateId:");
        r45.ib6 ib6Var = c17933xe8d1b2262.m70371x485d7().f39043xa1529a15;
        sb6.append(ib6Var != null ? ib6Var.f458443e : null);
        sb6.append(", createTime: ");
        sb6.append(m70357x3fdd41df);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTimeLineFakeViewHandler", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o6 o6Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.o6(c17893x66003bc, i17, m70357x3fdd41df, z19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBackgroundVideoBasicInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        if (z19) {
            yy0.g8 g8Var = (yy0.g8) ((pp0.o0) i95.n0.c(pp0.o0.class));
            g8Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new yy0.a8(i17, m70357x3fdd41df, g8Var, o6Var, null), 2, null);
        } else {
            wp4.x xVar = (wp4.x) ((n55.f) i95.n0.c(n55.f.class));
            xVar.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new wp4.r(i17, m70357x3fdd41df, xVar, o6Var, null), 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBackgroundVideoBasicInfoBySnsLocalId", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFakeVideoIsError", "com.tencent.mm.plugin.sns.model.SnsTimeLineFakeViewHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.UploadManager$3");
    }
}
