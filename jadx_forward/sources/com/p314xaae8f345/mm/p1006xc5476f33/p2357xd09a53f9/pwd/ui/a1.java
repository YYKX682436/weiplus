package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f260505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19049x13c7e4b8 f260506e;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19049x13c7e4b8 activityC19049x13c7e4b8, boolean z17) {
        this.f260506e = activityC19049x13c7e4b8;
        this.f260505d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a32;
        boolean z17 = this.f260505d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19049x13c7e4b8 activityC19049x13c7e4b8 = this.f260506e;
        if (!z17) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) activityC19049x13c7e4b8.f260434g.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.addRule(12);
            layoutParams.bottomMargin = i65.a.b(activityC19049x13c7e4b8.mo55332x76847179(), 96);
            activityC19049x13c7e4b8.f260434g.setLayoutParams(layoutParams);
            return;
        }
        int height = ((activityC19049x13c7e4b8.f260435h.getHeight() - activityC19049x13c7e4b8.f260431d.getTop()) - activityC19049x13c7e4b8.f260431d.getHeight()) - i65.a.b(activityC19049x13c7e4b8.mo55332x76847179(), 32);
        int height2 = activityC19049x13c7e4b8.f260434g.getHeight() + i65.a.b(activityC19049x13c7e4b8.mo55332x76847179(), 32);
        c27990xda3033a3 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC19049x13c7e4b8).f39901x43041b74;
        if (height2 + c27990xda3033a3.getHeight() + i65.a.b(activityC19049x13c7e4b8.mo55332x76847179(), 30) <= height) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) activityC19049x13c7e4b8.f260434g.getLayoutParams();
            layoutParams2.removeRule(3);
            layoutParams2.addRule(12);
            int b17 = i65.a.b(activityC19049x13c7e4b8.mo55332x76847179(), 32);
            c27990xda3033a32 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC19049x13c7e4b8).f39901x43041b74;
            layoutParams2.bottomMargin = b17 + c27990xda3033a32.getHeight() + i65.a.b(activityC19049x13c7e4b8.mo55332x76847179(), 30);
            activityC19049x13c7e4b8.f260434g.setLayoutParams(layoutParams2);
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) activityC19049x13c7e4b8.f260433f.getLayoutParams();
        layoutParams3.topMargin = i65.a.b(activityC19049x13c7e4b8.mo55332x76847179(), 25);
        activityC19049x13c7e4b8.f260433f.setLayoutParams(layoutParams3);
        android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) activityC19049x13c7e4b8.f260434g.getLayoutParams();
        layoutParams4.removeRule(12);
        layoutParams4.addRule(3, com.p314xaae8f345.mm.R.id.f566836h83);
        layoutParams4.topMargin = i65.a.b(activityC19049x13c7e4b8.mo55332x76847179(), 32);
        activityC19049x13c7e4b8.f260434g.setLayoutParams(layoutParams4);
    }
}
