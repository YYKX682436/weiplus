package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class h5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154206d;

    public h5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154206d = activityC11351x975a7907;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154206d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC11351x975a7907.P1.getLayoutParams();
        layoutParams.height = 0;
        activityC11351x975a7907.P1.setLayoutParams(layoutParams);
        android.widget.ScrollView scrollView = activityC11351x975a7907.O1;
        if (scrollView != null) {
            scrollView.scrollTo(0, 0);
        }
        activityC11351x975a7907.P1.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.g5(this), 100L);
    }
}
