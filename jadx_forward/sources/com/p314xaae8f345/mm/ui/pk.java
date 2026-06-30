package com.p314xaae8f345.mm.ui;

/* loaded from: classes7.dex */
public class pk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f291050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.qk f291051e;

    public pk(com.p314xaae8f345.mm.ui.qk qkVar, android.app.Activity activity) {
        this.f291051e = qkVar;
        this.f291050d = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = this.f291050d;
        android.view.View decorView = activity.getWindow().getDecorView();
        if (decorView == null) {
            return;
        }
        decorView.setOnApplyWindowInsetsListener(new com.p314xaae8f345.mm.ui.nk(this));
        android.app.Application application = activity.getApplication();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new com.p314xaae8f345.mm.ui.ok(this, activity, decorView, application));
    }
}
