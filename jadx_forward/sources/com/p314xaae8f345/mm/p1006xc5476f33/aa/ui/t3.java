package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes3.dex */
public class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154343d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154343d = activityC11351x975a7907;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154343d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC11351x975a7907.f154050u.getLayoutParams();
        android.view.View findViewById = activityC11351x975a7907.findViewById(com.p314xaae8f345.mm.R.id.hty);
        layoutParams.leftMargin = findViewById.getLeft() - 12;
        layoutParams.width = findViewById.getWidth() + 24;
        layoutParams.topMargin = findViewById.getTop() - 12;
        layoutParams.height = findViewById.getHeight() + 24;
        activityC11351x975a7907.f154050u.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.g7(activityC11351x975a7907);
    }
}
