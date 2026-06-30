package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes15.dex */
public class dd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b f249713d;

    public dd(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b activityC18008xe14e452b) {
        this.f249713d = activityC18008xe14e452b;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$6");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b activityC18008xe14e452b = this.f249713d;
        if (activityC18008xe14e452b.mo55332x76847179() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activityC18008xe14e452b.mo55332x76847179()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b.T6(activityC18008xe14e452b).mo69274xd5e29286(displayMetrics.widthPixels);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b.T6(activityC18008xe14e452b).requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18008xe14e452b.T6(activityC18008xe14e452b).postInvalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI$6");
    }
}
