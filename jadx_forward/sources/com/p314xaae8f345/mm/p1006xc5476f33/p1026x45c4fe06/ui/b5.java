package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public enum b5 implements android.app.Application.ActivityLifecycleCallbacks, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.w {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public int f171104d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f171105e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f171106f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f171107g;

    b5() {
    }

    public final void h() {
        this.f171104d = Integer.MAX_VALUE;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa) {
            h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        android.content.ComponentName componentName;
        if ((activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa) || (activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da)) {
            h();
        }
        if (gm0.j1.a()) {
            boolean z17 = true;
            if (this.f171104d == Integer.MAX_VALUE) {
                return;
            }
            android.app.ActivityManager.RunningTaskInfo z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z(activity, activity.getTaskId());
            if (z18 == null || (componentName = z18.baseActivity) == null || (!componentName.getClassName().endsWith(".LauncherUI") && z18.baseActivity.getClassName().contains(".AppBrandUI"))) {
                z17 = false;
            }
            if (z17) {
                android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa.class);
                intent.putExtra("extras_key_type", this.f171104d);
                intent.putExtra("extras_key_appid", this.f171106f);
                intent.putExtra("extras_key_app_icon", this.f171107g);
                h();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$AppBrandGuideController", "onActivityResumed", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/tencent/mm/plugin/appbrand/ui/AppBrandGuideUI$AppBrandGuideController", "onActivityResumed", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }
}
