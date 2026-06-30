package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class dq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a f249738d;

    public dq(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a) {
        this.f249738d = activityC18109x7a461b7a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$9");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a = this.f249738d;
        activityC18109x7a461b7a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.e7(activityC18109x7a461b7a) instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.e7(activityC18109x7a461b7a)).mo69274xd5e29286(displayMetrics.widthPixels);
        }
        ((android.view.View) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.e7(activityC18109x7a461b7a)).requestLayout();
        ((android.view.View) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.e7(activityC18109x7a461b7a)).postInvalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$9");
    }
}
