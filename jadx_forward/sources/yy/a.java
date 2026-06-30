package yy;

@j95.b
/* loaded from: classes12.dex */
public class a extends i95.w implements zy.r {
    public java.util.List Ai(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "%s.%%.data", java.lang.Integer.valueOf(i17));
        if (!l0Var.f271219e) {
            return null;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            return l0Var.f271215a.D0(format);
        } finally {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloaderCore", "queryForKeyLike %s, cost:%d", format, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public java.lang.String Bi(int i17, int i18) {
        return com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().b(i17, i18);
    }

    public int Di(int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.e(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(i17, i18));
        if (e17 == null) {
            return 0;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(e17.f68780xf1e133f7, 0);
    }

    public java.lang.String Ni(int i17, int i18) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a.e(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.c0.c(i17, i18));
        if (e17 != null) {
            return e17.f68788xd2f45e28;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.CheckResUpdateHelper", "getOriginalMd5, %d.%d, get null info, return", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return null;
    }

    public void Ri(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().d(i17, i18, i19, true);
    }

    public void Ui(int i17, int i18, int i19, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c().d(i17, i18, i19, z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi(int r6) {
        /*
            r5 = this;
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.p r0 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2478x89f63d61.p.c()
            r0.getClass()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "doCheck, resType = %d"
            java.lang.String r2 = "MicroMsg.ResDownloader.CheckResUpdateHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1, r0)
            java.lang.Class<ob0.n2> r0 = ob0.n2.class
            i95.m r0 = i95.n0.c(r0)
            ob0.n2 r0 = (ob0.n2) r0
            com.tencent.mm.feature.performance.q r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) r0
            r0.getClass()
            r0 = 84
            boolean r1 = gi.d.h(r0)
            if (r1 == 0) goto L84
            ph.t r1 = ph.t.k()
            ph.c r1 = r1.c()
            java.lang.Class<ob0.r2> r3 = ob0.r2.class
            i95.m r4 = i95.n0.c(r3)
            ob0.r2 r4 = (ob0.r2) r4
            com.tencent.mm.feature.performance.q r4 = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) r4
            r4.Zi(r6, r1)
            java.lang.Class<ob0.q2> r4 = ob0.q2.class
            i95.m r4 = i95.n0.c(r4)
            ob0.q2 r4 = (ob0.q2) r4
            com.tencent.mm.feature.performance.q r4 = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) r4
            r4.getClass()
            boolean r4 = gi.i0.f353588b
            if (r4 == 0) goto L58
            java.lang.String r1 = "skip doCheck for low energy: doze mode on!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r1)
            goto L70
        L58:
            boolean r4 = ph.t.o()
            if (r4 == 0) goto L72
            boolean r4 = r1.e()
            if (r4 != 0) goto L72
            boolean r1 = r1.d()
            if (r1 != 0) goto L72
            java.lang.String r1 = "skip doCheck for low energy: bg & non-charging!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r2, r1)
        L70:
            r1 = 1
            goto L73
        L72:
            r1 = 0
        L73:
            if (r1 == 0) goto L84
            i95.m r1 = i95.n0.c(r3)
            ob0.r2 r1 = (ob0.r2) r1
            com.tencent.mm.feature.performance.q r1 = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) r1
            r1.getClass()
            long r0 = (long) r0
            ri.o.a(r0)
        L84:
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.n()
            c01.b9 r1 = c01.b9.f118602c
            java.lang.String r3 = "login_user_name"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.a(r3, r4)
            boolean r1 = r1.equals(r4)
            if (r0 != 0) goto La4
            if (r1 == 0) goto La4
            java.lang.String r6 = "doCheck, not login, skip"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            goto Lb2
        La4:
            com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k0 r0 = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.k0
            r0.<init>(r6)
            gm0.y r6 = gm0.j1.n()
            com.tencent.mm.modelbase.r1 r6 = r6.f354821b
            r6.g(r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yy.a.wi(int):void");
    }
}
