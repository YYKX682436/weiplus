package k84;

/* loaded from: classes4.dex */
public final class r1 {
    public r1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("disablePagPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_ad_disable_adfirework_pag_play_android, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFireworkCheerComponent", "disablePagPlayInOs14:android os >= 34, shouldDisablePlay " + z17);
        if (android.os.Build.VERSION.SDK_INT < 34) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFireworkCheerComponent", "disablePagPlayInOs14:android os < 34, not disable play");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("disablePagPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
            return false;
        }
        if (z17) {
            c(9);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("disablePagPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "getFireworkGoldColor"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.adsocial.ColorEntity"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo"
            java.lang.String r4 = "getLikedColor"
            r5 = 0
            if (r10 == 0) goto L33
            com.tencent.mm.plugin.sns.storage.ADXml r6 = r10.m70354x74235b3e()
            if (r6 == 0) goto L33
            mb4.c r6 = r6.f38211x1b3eca3e
            if (r6 == 0) goto L33
            mb4.r r6 = r6.f406921m
            if (r6 == 0) goto L33
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r3)
            mb4.o r6 = r6.f406987a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r3)
            if (r6 == 0) goto L33
            java.lang.String r7 = "getColor"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r2)
            java.lang.String r6 = r6.f406980a
            goto L34
        L33:
            r6 = r5
        L34:
            s74.u3 r7 = s74.u3.f486095a
            boolean r8 = com.p314xaae8f345.mm.ui.bk.C()
            if (r8 != 0) goto L3d
            goto L71
        L3d:
            if (r10 == 0) goto L61
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r10.m70354x74235b3e()
            if (r10 == 0) goto L61
            mb4.c r10 = r10.f38211x1b3eca3e
            if (r10 == 0) goto L61
            mb4.r r10 = r10.f406921m
            if (r10 == 0) goto L61
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r4, r3)
            mb4.o r10 = r10.f406987a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r4, r3)
            if (r10 == 0) goto L61
            java.lang.String r3 = "getColorDark"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r2)
            java.lang.String r5 = r10.f406981b
        L61:
            if (r5 == 0) goto L6c
            boolean r10 = r26.n0.N(r5)
            if (r10 == 0) goto L6a
            goto L6c
        L6a:
            r10 = 0
            goto L6d
        L6c:
            r10 = 1
        L6d:
            if (r10 == 0) goto L70
            goto L71
        L70:
            r6 = r5
        L71:
            if (r6 != 0) goto L75
            java.lang.String r6 = ""
        L75:
            android.content.Context r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            r2 = 2131102266(0x7f060a3a, float:1.7816965E38)
            int r10 = r10.getColor(r2)
            int r10 = r7.w(r6, r10)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.r1.b(com.tencent.mm.plugin.sns.storage.SnsInfo):int");
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("idKeyReport", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdFireworkCheerComponent", "adIdKeyReport:" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(2037, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("idKeyReport", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$Companion");
    }
}
