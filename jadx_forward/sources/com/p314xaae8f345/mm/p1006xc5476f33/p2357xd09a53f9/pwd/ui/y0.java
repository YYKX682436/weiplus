package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Toast f260652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19049x13c7e4b8 f260653e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19049x13c7e4b8 activityC19049x13c7e4b8, android.widget.Toast toast) {
        this.f260653e = activityC19049x13c7e4b8;
        this.f260652d = toast;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f260652d.cancel();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ActivityC19049x13c7e4b8 activityC19049x13c7e4b8 = this.f260653e;
        activityC19049x13c7e4b8.setResult(-1);
        activityC19049x13c7e4b8.finish();
    }
}
