package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class u4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154367d;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        this.f154367d = activityC11351x975a7907;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154367d;
        android.graphics.Bitmap L = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L(activityC11351x975a7907.f154055x1, activityC11351x975a7907.A.getWidth(), activityC11351x975a7907.A.getHeight());
        int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(activityC11351x975a7907.f154055x1).m43592x7a249f0b();
        android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(L, m43592x7a249f0b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "exifPath : %s degree : %d", activityC11351x975a7907.f154055x1, java.lang.Integer.valueOf(m43592x7a249f0b));
        activityC11351x975a7907.A.setImageBitmap(w07);
        activityC11351x975a7907.A.sendAccessibilityEvent(128);
    }
}
