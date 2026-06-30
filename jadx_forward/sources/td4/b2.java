package td4;

/* loaded from: classes4.dex */
public final class b2 implements p94.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9 f499169d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9 activityC18377xa17a84b9) {
        this.f499169d = activityC18377xa17a84b9;
    }

    @Override // p94.m0
    public void B4(java.lang.String str, java.lang.String str2, boolean z17, int i17, p94.d0 d0Var, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 Tj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.I;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        java.lang.Runnable runnable = this.f499169d.E;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        Tj.mo50300x3fa464aa(runnable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
    }

    @Override // p94.m0
    public void O0(java.lang.String respMinSeq, boolean z17, int i17, p94.d0 pullSns) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFpSetSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respMinSeq, "respMinSeq");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pullSns, "pullSns");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.I;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9 activityC18377xa17a84b9 = this.f499169d;
        int i19 = activityC18377xa17a84b9.f251766o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        activityC18377xa17a84b9.f251766o = i19 + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).I(respMinSeq);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumPickerUI", "onFpSetSize , respMinSeq=" + respMinSeq + " , currentLimitSeq=" + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).x() + " pullSns.isDownAll = " + pullSns.h());
        td4.g0 a76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9);
        java.lang.String m17 = pullSns.m();
        if (m17 == null) {
            m17 = "";
        }
        a76.B(true, m17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).K(respMinSeq);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).S();
        if (z17 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pullSns.m())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).T(true);
        } else {
            if (pullSns.f() != 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, java.lang.Long.valueOf(pullSns.f()));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).E(pullSns.f());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.Y6(activityC18377xa17a84b9).postDelayed(new td4.z1(activityC18377xa17a84b9, pullSns), 1000L);
            boolean z18 = !pullSns.h();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            activityC18377xa17a84b9.f251768q = z18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.Z6(activityC18377xa17a84b9) && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.b7(activityC18377xa17a84b9)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.X6(activityC18377xa17a84b9);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFpSetSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
    }

    @Override // p94.m0
    public void S0(java.lang.String respMinSeq, boolean z17, int i17, p94.d0 pullSns) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onNpAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(respMinSeq, "respMinSeq");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pullSns, "pullSns");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 Tj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj();
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.I;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9 activityC18377xa17a84b9 = this.f499169d;
        java.lang.Runnable runnable = activityC18377xa17a84b9.E;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUpdateAdapterRunnable$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        Tj.mo50300x3fa464aa(runnable);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        activityC18377xa17a84b9.f251762h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        int i19 = activityC18377xa17a84b9.f251766o;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        activityC18377xa17a84b9.f251766o = i19 + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMLoadingLoop$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).I(respMinSeq);
        td4.g0 a76 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9);
        java.lang.String m17 = pullSns.m();
        if (m17 == null) {
            m17 = "";
        }
        a76.B(true, m17);
        java.lang.String x17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).x();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsAlbumPickerUI", "onNpAddSize , respMinSeq=" + respMinSeq + " , currentLimitSeq=" + x17 + " , isDownAll=" + pullSns.h());
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).T(true);
        } else {
            if (pullSns.f() != 0) {
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_RECENT_LIMITED_ID_LONG_SYNC, java.lang.Long.valueOf(pullSns.f()));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).E(pullSns.f());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.Y6(activityC18377xa17a84b9).postDelayed(new td4.a2(activityC18377xa17a84b9, pullSns), 1000L);
            boolean z18 = !pullSns.h();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            activityC18377xa17a84b9.f251768q = z18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMHasMore$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            if (!com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.Z6(activityC18377xa17a84b9) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(respMinSeq, x17)) {
                activityC18377xa17a84b9.m78563x4e0f6657(true);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                if (activityC18377xa17a84b9.f7().mo1894x7e414b06() > 0) {
                    activityC18377xa17a84b9.c7().setVisibility(0);
                    activityC18377xa17a84b9.g7().setVisibility(8);
                } else {
                    activityC18377xa17a84b9.c7().setVisibility(4);
                    activityC18377xa17a84b9.g7().setVisibility(0);
                    activityC18377xa17a84b9.g7().setText(activityC18377xa17a84b9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j96));
                    if (!activityC18377xa17a84b9.f251768q) {
                        activityC18377xa17a84b9.g7().setText(activityC18377xa17a84b9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j98));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateRvState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).K(respMinSeq);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.a7(activityC18377xa17a84b9).S();
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.b7(activityC18377xa17a84b9)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2215xc515088e.ActivityC18377xa17a84b9.X6(activityC18377xa17a84b9);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onNpAddSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
    }

    @Override // p94.m0
    public void e6(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onError", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1");
    }
}
