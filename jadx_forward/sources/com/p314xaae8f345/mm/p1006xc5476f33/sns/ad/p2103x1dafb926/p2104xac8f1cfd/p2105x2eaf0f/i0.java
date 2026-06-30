package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class i0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public final f54.i B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 C;

    public i0(android.content.Context context, f54.i iVar, android.view.ViewGroup viewGroup) {
        super(context, iVar, viewGroup);
        this.B = iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        try {
            ib4.h hVar = this.f246919t;
            if (hVar != null && iVar != null) {
                hVar.b("finderUsername", iVar.f341256z1);
                this.f246919t.b("finderLiveNoticeId", iVar.A1);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void U() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        try {
            j0();
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h0() {
        /*
            r8 = this;
            java.lang.String r0 = "acquireLivingNoticeStatus"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            ab4.n0 r2 = r8.u()
            r3 = 257(0x101, float:3.6E-43)
            if (r2 == 0) goto L82
            f54.i r4 = r8.B
            if (r4 != 0) goto L14
            goto L82
        L14:
            java.lang.String r2 = r2.k()
            java.lang.String r5 = "stringToLong"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r1)
            if (r2 == 0) goto L28
            long r6 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Throwable -> L28
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r1)
            goto L2d
        L28:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r1)
            r6 = 0
        L2d:
            java.lang.String r2 = ca4.z0.t0(r6)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "sns_id"
            r5.putString(r6, r2)
            java.lang.String r2 = r4.f341256z1
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r6 = ""
            if (r2 != 0) goto L45
            r2 = r6
        L45:
            java.lang.String r7 = "finderUsername"
            r5.putString(r7, r2)
            java.lang.String r2 = r4.A1
            if (r2 != 0) goto L4f
            goto L50
        L4f:
            r6 = r2
        L50:
            java.lang.String r2 = "finderLiveNoticeId"
            r5.putString(r2, r6)
            o64.a r2 = new o64.a
            r2.<init>()
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e0 r4 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.e0
            r4.<init>()
            r2.d(r4)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f0 r4 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f0
            r6 = 1
            r4.<init>(r8, r6)
            r2.c(r4)
            q64.a r2 = r2.a()
            if (r2 == 0) goto L7e
            r64.b r2 = (r64.b) r2
            android.os.Bundle r2 = r2.c(r5)
            java.lang.String r4 = "status"
            int r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.f(r2, r4, r3)
        L7e:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        L82:
            java.lang.String r2 = "SnsAd.FinderLivingNoticeComp"
            java.lang.String r4 = "the page data or info is null, it can't do anything!!!!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r4)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.i0.h0():int");
    }

    public void i0(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLivingStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        android.widget.Button W = W();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtnLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = this.f247391u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtnLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
        if (W == null || c22646x1e9ca55 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLivingStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
            return;
        }
        if (i17 == 513) {
            W.setText(this.f246582d.getText(com.p314xaae8f345.mm.R.C30867xcad56011.j7_));
            W.setEnabled(false);
            W.setAlpha(0.6f);
            c22646x1e9ca55.setAlpha(0.6f);
        } else {
            f54.i iVar = this.B;
            if (iVar != null) {
                W.setText(iVar.F);
            }
            W.setEnabled(true);
            W.setAlpha(1.0f);
            c22646x1e9ca55.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLivingStatusChanged", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() {
        /*
            r10 = this;
            java.lang.String r0 = "subscribe"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            ab4.n0 r2 = r10.u()
            if (r2 == 0) goto Lc4
            f54.i r3 = r10.B
            if (r3 != 0) goto L14
            goto Lc4
        L14:
            o64.a r4 = new o64.a
            r4.<init>()
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h0 r5 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h0
            r5.<init>()
            r4.d(r5)
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f0 r5 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.f0
            r6 = 0
            r5.<init>(r10, r6)
            r4.c(r5)
            q64.a r4 = r4.a()
            if (r4 == 0) goto Lc0
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = r2.k()
            java.lang.String r7 = "stringToLong"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r7, r1)
            if (r6 == 0) goto L49
            long r8 = java.lang.Long.parseLong(r6)     // Catch: java.lang.Throwable -> L49
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r1)
            goto L4e
        L49:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r7, r1)
            r8 = 0
        L4e:
            java.lang.String r6 = ca4.z0.t0(r8)
            java.lang.String r7 = r2.n()
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L60
            java.lang.String r7 = r2.o()
        L60:
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r8 = ""
            if (r6 != 0) goto L67
            r6 = r8
        L67:
            java.lang.String r9 = "sns_id"
            r5.putString(r9, r6)
            if (r7 != 0) goto L70
            r7 = r8
        L70:
            java.lang.String r6 = "uxInfo"
            r5.putString(r6, r7)
            java.lang.String r2 = r2.a()
            if (r2 != 0) goto L7d
            r2 = r8
        L7d:
            java.lang.String r6 = "adExtInfo"
            r5.putString(r6, r2)
            java.lang.String r2 = r3.f341256z1
            if (r2 != 0) goto L87
            r2 = r8
        L87:
            java.lang.String r6 = "finderUsername"
            r5.putString(r6, r2)
            java.lang.String r2 = r3.A1
            if (r2 != 0) goto L91
            goto L92
        L91:
            r8 = r2
        L92:
            java.lang.String r2 = "finderLiveNoticeId"
            r5.putString(r2, r8)
            r64.b r4 = (r64.b) r4
            r4.c(r5)
            java.lang.String r2 = "showProgressDialog"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            com.tencent.mm.ui.widget.dialog.u3 r3 = r10.C
            if (r3 != 0) goto Lb2
            android.content.Context r3 = r10.f246582d
            r4 = 2131770604(0x7f103cec, float:1.9172516E38)
            r5 = 0
            com.tencent.mm.ui.widget.dialog.u3 r3 = l54.a.h(r3, r4, r5)
            r10.C = r3
        Lb2:
            if (r3 == 0) goto Lbd
            boolean r4 = r3.isShowing()
            if (r4 != 0) goto Lbd
            r3.show()
        Lbd:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
        Lc0:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        Lc4:
            java.lang.String r2 = "SnsAd.FinderLivingNoticeComp"
            java.lang.String r3 = "the page data is null, it can't do anything!!!!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.i0.j0():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
        try {
            super.k();
            i0(h0());
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnComp");
    }
}
