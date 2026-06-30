package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes11.dex */
public class e1 implements om4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18742xd11d8404 f256495a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18742xd11d8404 activityC18742xd11d8404) {
        this.f256495a = activityC18742xd11d8404;
    }

    @Override // om4.v
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSafeDialogCheck, onFail, lastRecommendSwithIsChecked = ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18742xd11d8404 activityC18742xd11d8404 = this.f256495a;
        sb6.append(activityC18742xd11d8404.f256431n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", sb6.toString());
        activityC18742xd11d8404.f256427g.S(activityC18742xd11d8404.f256431n);
    }

    @Override // om4.v
    public void b(r45.wv6 wv6Var) {
        int i17 = wv6Var.f471075d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18742xd11d8404 activityC18742xd11d8404 = this.f256495a;
        if (i17 != 1 && i17 != 2) {
            activityC18742xd11d8404.f256427g.S(activityC18742xd11d8404.f256431n);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", "error happen, unkonw state.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStorySettingUI", "showSafeDialogCheck, onSuccess, response.state = " + wv6Var.f471075d);
        activityC18742xd11d8404.f256427g.S(wv6Var.f471075d == 2);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean("TopStorySettingUI_settings_top_story_recommend", activityC18742xd11d8404.f256427g.N());
    }
}
