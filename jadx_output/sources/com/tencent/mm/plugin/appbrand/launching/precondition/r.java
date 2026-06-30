package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class r extends com.tencent.mm.plugin.appbrand.launching.precondition.a implements com.tencent.mm.plugin.appbrand.launching.precondition.y {

    /* renamed from: i, reason: collision with root package name */
    public android.content.Intent f85018i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f85019m;

    /* renamed from: n, reason: collision with root package name */
    public int f85020n = 0;

    public r(com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI appBrandLaunchProxyUI, boolean z17) {
        setBaseContext(appBrandLaunchProxyUI);
        this.f84936f = z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.y
    public void a(android.content.Intent intent, android.os.Bundle bundle) {
        if (getBaseContext() != null && (getBaseContext() instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) getBaseContext();
            com.tencent.mm.ui.v9.e(activity.getWindow());
            com.tencent.mm.ui.v9.c(activity.getWindow(), true);
        }
        this.f85018i = intent;
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = (com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel) intent.getParcelableExtra("extra_launch_parcel");
        if (launchParcel == null) {
            e(null, null);
            return;
        }
        ((android.app.Activity) getBaseContext()).overridePendingTransition(0, 0);
        this.f85019m = launchParcel;
        java.lang.String str = launchParcel.f84902e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.plugin.appbrand.launching.precondition.e0.f(launchParcel);
        }
        java.lang.String f17 = com.tencent.mm.plugin.appbrand.report.quality.u.f(launchParcel, str, false);
        com.tencent.mm.plugin.appbrand.report.quality.u.g(launchParcel, f17, str);
        com.tencent.mm.plugin.appbrand.report.b3.f87812a.d(launchParcel, f17);
        if (com.tencent.mm.plugin.appbrand.report.quality.w1.a()) {
            com.tencent.mm.plugin.appbrand.report.quality.w1.f88373a.g(str, f17);
            com.tencent.mm.plugin.appbrand.keylogger.w.j(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, str);
            com.tencent.mm.plugin.appbrand.keylogger.w.a(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, str, java.lang.String.format("Network:%s", com.tencent.mars.comm.NetStatusUtil.getNetTypeString(this)));
        }
        this.f84938h = launchParcel;
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.appbrand.launching.precondition.e(this, launchParcel, f17));
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.y
    public boolean b() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.a
    public void e(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        try {
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = this.f85019m;
            if (launchParcel != null && launchParcel.B != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("KEY_PRECONDITION_RESULT", appBrandInitConfigWC);
                this.f85019m.B.a(bundle);
            }
            if (appBrandInitConfigWC != null) {
                appBrandInitConfigWC.f77294g2 = this.f85018i.getStringExtra("extra_launch_source_process_name");
            }
            super.e(appBrandInitConfigWC, appBrandStatObject);
        } finally {
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel2 = this.f85019m;
            if (launchParcel2 != null) {
                com.tencent.luggage.sdk.launching.k.b(launchParcel2.B);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.a
    public boolean k(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        java.lang.Class<?> cls;
        try {
            java.lang.String stringExtra = this.f85018i.getStringExtra("extra_launch_source_context");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            cls = java.lang.Class.forName(stringExtra);
        } catch (java.lang.Exception unused) {
            cls = null;
        }
        if (cls == null || !com.tencent.mm.plugin.appbrand.ui.AppBrandUI.class.isAssignableFrom(cls)) {
            return super.k(appBrandInitConfigWC, appBrandStatObject);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.y
    public void onPause() {
        if (g()) {
            return;
        }
        if (c() && ((com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) getBaseContext()).isDestroyed()) {
            return;
        }
        j(new com.tencent.mm.plugin.appbrand.launching.precondition.b(this), false);
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.y
    public void onResume() {
        int i17 = this.f85020n + 1;
        this.f85020n = i17;
        if (i17 <= 1 || g()) {
            return;
        }
        if (c() && ((com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) getBaseContext()).isDestroyed()) {
            return;
        }
        j(new com.tencent.mm.plugin.appbrand.launching.precondition.b(this), false);
    }
}
