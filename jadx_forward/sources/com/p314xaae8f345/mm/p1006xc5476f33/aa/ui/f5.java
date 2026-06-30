package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes3.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f154173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f154174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154175f;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, android.view.View view, android.view.View view2) {
        this.f154175f = activityC11351x975a7907;
        this.f154173d = view;
        this.f154174e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154175f;
        int b17 = i65.a.b(activityC11351x975a7907.mo55332x76847179(), 32);
        int b18 = i65.a.b(activityC11351x975a7907.mo55332x76847179(), 64);
        int b19 = i65.a.b(activityC11351x975a7907.mo55332x76847179(), 96);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.S1;
        int i18 = com.p314xaae8f345.mm.ui.bl.b(activityC11351x975a7907.mo55332x76847179()).y;
        int[] iArr = new int[2];
        android.view.View view = this.f154173d;
        view.getLocationOnScreen(iArr);
        boolean z17 = iArr[1] + view.getHeight() > (i18 * 2) / 3;
        android.view.View view2 = this.f154174e;
        if (z17) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.removeRule(12);
            layoutParams.addRule(3, com.p314xaae8f345.mm.R.id.ofz);
            layoutParams.topMargin = b17;
            view2.setLayoutParams(layoutParams);
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
        layoutParams2.removeRule(3);
        layoutParams2.addRule(12);
        layoutParams2.bottomMargin = b19;
        view2.setLayoutParams(layoutParams2);
        if (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.j7(activityC11351x975a7907, view2, view, b19) >= b17) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
        layoutParams2.removeRule(3);
        layoutParams3.addRule(12);
        layoutParams3.bottomMargin = b18;
        view2.setLayoutParams(layoutParams3);
        if (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.j7(activityC11351x975a7907, view2, view, b18) >= b17) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) view2.getLayoutParams();
        layoutParams4.removeRule(12);
        layoutParams4.addRule(3, com.p314xaae8f345.mm.R.id.ofz);
        layoutParams4.topMargin = b17;
        view2.setLayoutParams(layoutParams4);
    }
}
