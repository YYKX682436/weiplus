package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class o0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public final f54.j B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 C;
    public int D;
    public int E;
    public int F;

    public o0(android.content.Context context, f54.j jVar, android.view.ViewGroup viewGroup) {
        super(context, jVar, viewGroup);
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.B = jVar;
    }

    public static void h0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.o0 o0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        o0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillAppointmentStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAppointmentStatusResult, errCode is " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        d44.h.b(o0Var.f246582d, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showSubscribingResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        if (o0Var.W() == null || o0Var.B == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAppointmentStatusResult, button or mAdLandingFinderLivingNoticeBtnMutiInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAppointmentStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        } else {
            if (i17 == 0) {
                o0Var.F = 513;
                o0Var.j0(513);
            } else if (i17 == -200045 || i17 == -200023) {
                o0Var.E = 2;
                o0Var.l0();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAppointmentStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        boolean z17 = this.f246588m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "viewWillAppear, curComp is " + X().f84350d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doViewWillAppearReqLogic", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            if (this.E == 2) {
                l0();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "viewAppeared, mLivingStatus is FINDER_LIVE_STARTED");
            } else {
                f54.j jVar = this.B;
                int i17 = jVar.B1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isExpire", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                int m69888xb09a0e75 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69888xb09a0e75();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "isExpire, currentTime is " + m69888xb09a0e75 + ", finderLiveStartTime is " + i17);
                boolean z18 = i17 > 0 && m69888xb09a0e75 > i17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isExpire", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                if (z18) {
                    this.E = 2;
                    l0();
                } else {
                    this.E = 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    this.D = 1;
                    ab4.n0 u17 = u();
                    if (u17 != null) {
                        java.lang.String t07 = ca4.z0.t0(n0(u17.k()));
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("sns_id", t07);
                        java.lang.String str = jVar.C1;
                        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (str == null) {
                            str = "";
                        }
                        bundle.putString("finderUsername", str);
                        java.lang.String str2 = jVar.D1;
                        bundle.putString("finderLiveNoticeId", str2 != null ? str2 : "");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "acquireLivingNoticeStatus, snsId is " + t07 + ", finderUsername is " + jVar.C1 + ", finderLiveNoticeId is " + jVar.D1);
                        o64.a aVar = new o64.a();
                        aVar.d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.k0());
                        aVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.l0(this, true));
                        q64.a a17 = aVar.a();
                        if (a17 != null) {
                            ((r64.b) a17).c(bundle);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "the page data or info is null, it can't do anything!!!!!");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("acquireLivingNoticeStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doViewWillAppearReqLogic", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
        super.K();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void U() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        if (this.E == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mLivingStatus is FINDER_LIVE_STARTED, jumpToFinderProfileUI");
            m0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        } else {
            if (this.D != 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mRequestStatus not finish, the mRequestStatus is " + this.D);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                return;
            }
            if (this.F == 513) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mAppointmentStatus is FINDER_LIVING_NOTICE_SUBSCRIBED, jumpToFinderProfileUI");
                m0();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, mAppointmentStatus is FINDER_LIVING_NOTICE_NO_SUBSCRIBED, subscribe");
                o0();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
    }

    public void i0(int i17) {
        f54.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        try {
            ib4.h hVar = this.f246919t;
            if (hVar != null && (jVar = this.B) != null) {
                hVar.b("finderUsername", jVar.C1);
                this.f246919t.b("finderLiveNoticeId", jVar.D1);
                this.f246919t.a("opType", i17);
                this.f246919t.a("isSimpleFinderLiveNotice", jVar.E1);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendClickExtInfo", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    public final void j0(int i17) {
        f54.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillAcquireStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAcquireStatusResult, status is " + i17);
        this.F = i17;
        android.widget.Button W = W();
        if (W == null || (jVar = this.B) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillAcquireStatusResult, button or mAdLandingFinderLivingNoticeBtnMutiInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAcquireStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            return;
        }
        if (i17 == 513) {
            W.setText(jVar.f341257z1);
            a0();
        } else {
            b0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillAcquireStatusResult", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    public final void l0() {
        f54.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillLivingStartedText", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        android.widget.Button W = W();
        if (W == null || (jVar = this.B) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "fillLivingStartedText, button or mAdLandingFinderLivingNoticeBtnMutiInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingStartedText", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        } else {
            if (this.E == 2) {
                W.setText(jVar.A1);
                a0();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillLivingStartedText", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        }
    }

    public final void m0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        java.lang.String o17 = u().o();
        java.lang.String k17 = u().k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "doBtnClick, uxInfo = " + o17 + ", snsId = " + k17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69818x1e004a23(this.f246582d, this.B.C1, o17, k17, 5);
        i0(1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }

    public final long n0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        if (str != null) {
            try {
                long parseLong = java.lang.Long.parseLong(str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
                return parseLong;
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "string to long has something wrong!!");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stringToLong", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        return 0L;
    }

    public final void o0() {
        f54.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        ab4.n0 u17 = u();
        if (u17 == null || (jVar = this.B) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "the page data is null, it can't do anything!!!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
            return;
        }
        o64.a aVar = new o64.a();
        aVar.d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.n0());
        aVar.c(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.l0(this, false));
        q64.a a17 = aVar.a();
        if (a17 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String t07 = ca4.z0.t0(n0(u17.k()));
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            bundle.putString("sns_id", t07 == null ? "" : t07);
            java.lang.String n17 = u17.n();
            if (android.text.TextUtils.isEmpty(n17)) {
                n17 = u17.o();
            }
            if (n17 == null) {
                n17 = "";
            }
            bundle.putString("uxInfo", n17);
            java.lang.String a18 = u17.a();
            if (a18 == null) {
                a18 = "";
            }
            bundle.putString("adExtInfo", a18);
            java.lang.String str = jVar.C1;
            if (str == null) {
                str = "";
            }
            bundle.putString("finderUsername", str);
            java.lang.String str2 = jVar.D1;
            bundle.putString("finderLiveNoticeId", str2 != null ? str2 : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdLandingFinderLivingNoticeBtnMutiComp", "subscribe, snsId is " + t07 + ", finderUsername is " + jVar.C1 + ", finderLiveNoticeId is " + jVar.D1);
            ((r64.b) a17).c(bundle);
        }
        i0(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.C;
        if (u3Var == null) {
            u3Var = l54.a.h(this.f246582d, com.p314xaae8f345.mm.R.C30867xcad56011.gga, null);
            this.C = u3Var;
        }
        if (u3Var != null && !u3Var.isShowing()) {
            u3Var.show();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showProgressDialog", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("subscribe", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingFinderLivingNoticeBtnMutiComp");
    }
}
