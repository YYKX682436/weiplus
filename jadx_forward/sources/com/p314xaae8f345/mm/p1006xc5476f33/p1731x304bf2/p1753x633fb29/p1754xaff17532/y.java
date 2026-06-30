package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.z f222004d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.z zVar) {
        this.f222004d = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0063  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r11 = this;
            com.tencent.mm.plugin.game.model.silent_download.z r0 = r11.f222004d
            com.tencent.mm.plugin.game.model.silent_download.n r1 = r0.f222005d
            boolean r1 = r1.f68744xef4a2d61
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            java.lang.Class<m33.s1> r1 = m33.s1.class
            i95.m r1 = i95.n0.c(r1)
            m33.s1 r1 = (m33.s1) r1
            com.tencent.mm.plugin.game.s1 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) r1
            com.tencent.mm.plugin.game.model.silent_download.v r1 = r1.Zi()
            com.tencent.mm.plugin.game.model.silent_download.n r4 = r0.f222005d
            java.lang.String r4 = r4.f68737x28d45f97
            r1.getClass()
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            java.lang.String r6 = "MicroMsg.GameSilentDownloadStorage"
            if (r5 == 0) goto L2e
            java.lang.String r1 = "updateFirstFlag: appid is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
            goto L51
        L2e:
            java.lang.String r5 = "GameSilentDownload"
            java.lang.String r7 = "isFirst"
            java.lang.String r8 = "appId"
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r7, r8, r4}
            java.lang.String r7 = "update %s set %s=0 where %s='%s'"
            java.lang.String r4 = java.lang.String.format(r7, r4)
            boolean r1 = r1.m145253xb158737d(r5, r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "updateFirstFlag ret:%b"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r4, r1)
        L51:
            r1 = r2
            goto L61
        L53:
            long r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()
            com.tencent.mm.plugin.game.model.silent_download.n r1 = r0.f222005d
            long r6 = r1.f68748xa5c53bd
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L60
            goto L51
        L60:
            r1 = r3
        L61:
            if (r1 == 0) goto Lc6
            com.tencent.mm.plugin.game.model.silent_download.c0 r1 = r0.f222006e
            com.tencent.mm.plugin.game.model.silent_download.n r0 = r0.f222005d
            java.lang.String r0 = r0.f68737x28d45f97
            r1.getClass()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r0}
            java.lang.String r5 = "MicroMsg.GameSilentDownloader"
            java.lang.String r6 = "gamelog.download, push_download, query quota, source:%d, appid:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6, r4)
            com.tencent.mm.modelbase.l r4 = new com.tencent.mm.modelbase.l
            r4.<init>()
            r5 = 2819(0xb03, float:3.95E-42)
            r4.f152200d = r5
            r4.f152201e = r3
            r4.f152202f = r3
            java.lang.String r5 = "/cgi-bin/mmgame-bin/checkappdownloadquota"
            r4.f152199c = r5
            n33.a r5 = new n33.a
            r5.<init>()
            r5.f416010d = r2
            r5.f416012f = r0
            java.lang.Class<vz.q1> r2 = vz.q1.class
            i95.m r2 = i95.n0.c(r2)
            vz.q1 r2 = (vz.q1) r2
            uz.p1 r2 = (uz.p1) r2
            r2.getClass()
            h02.a r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(r0)
            if (r2 == 0) goto Lb0
            java.lang.String r6 = r2.f68411x238eb002
            r5.f416011e = r6
            long r6 = r2.f68413xf432b5ad
            r5.f416013g = r6
        Lb0:
            r4.f152197a = r5
            n33.b r2 = new n33.b
            r2.<init>()
            r4.f152198b = r2
            com.tencent.mm.modelbase.o r2 = r4.a()
            com.tencent.mm.plugin.game.model.silent_download.a0 r4 = new com.tencent.mm.plugin.game.model.silent_download.a0
            r4.<init>(r1, r0)
            com.p314xaae8f345.mm.p944x882e457a.z2.d(r2, r4, r3)
            goto Ld7
        Lc6:
            jj0.a r5 = jj0.a.a()
            r6 = 12
            com.tencent.mm.plugin.game.model.silent_download.n r0 = r0.f222005d
            java.lang.String r7 = r0.f68737x28d45f97
            java.lang.String r8 = "random_time"
            r9 = 0
            r5.b(r6, r7, r8, r9)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.p1754xaff17532.y.run():void");
    }
}
