package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class d implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f245662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e f245663e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e, long j17) {
        this.f245663e = binderC17870x451d307e;
        this.f245662d = j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "getBtnPersonalWxUserNameMM, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        long j17 = this.f245662d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e = this.f245663e;
        if (i17 == 0 && i18 == 0) {
            r45.tr3 tr3Var = (r45.tr3) ((com.p314xaae8f345.mm.p944x882e457a.o) m1Var.mo47948x7f0c4558()).f152244b.f152233a;
            if (tr3Var == null || android.text.TextUtils.isEmpty(tr3Var.f468277e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getBtnPersonalWxUserNameMM, rsp==null");
                binderC17870x451d307e.m142013x77b46a52("onSearchContact", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), null);
            } else {
                binderC17870x451d307e.m142013x77b46a52("onGetBtnPersonalWxUserName", java.lang.Long.valueOf(j17), tr3Var.f468276d, tr3Var.f468277e);
                binderC17870x451d307e.m69823x8d36e0ed(j17, tr3Var.f468277e);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "getBtnPersonalWxUserNameMM, failed");
            binderC17870x451d307e.m142013x77b46a52("onSearchContact", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), null);
        }
        gm0.j1.d().q(m1Var.mo808xfb85f7b0(), this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$2");
    }
}
