package com.tencent.mm.plugin.appbrand.ui;

@db5.a(1)
/* loaded from: classes7.dex */
public class AppBrandPluginUI extends com.tencent.mm.plugin.appbrand.ui.AppBrandUI {

    /* renamed from: p0, reason: collision with root package name */
    public int f89377p0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    public int f89378x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f89379y0;

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI
    public boolean F7() {
        return false;
    }

    public final com.tencent.mm.plugin.appbrand.o6 J7() {
        if (q7() == null) {
            return null;
        }
        return (com.tencent.mm.plugin.appbrand.o6) q7().getActiveRuntime();
    }

    public final boolean K7() {
        com.tencent.mm.plugin.appbrand.weishi.c.a(J7());
        return false;
    }

    public final boolean L7() {
        android.content.ComponentName componentName;
        android.content.ComponentName componentName2;
        K7();
        com.tencent.mm.plugin.appbrand.o6 J7 = J7();
        if (J7 instanceof com.tencent.mm.plugin.appbrand.o6) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = J7.u0();
            if (u07.r() == k91.z3.OPAQUE) {
                return true;
            }
            if (u07.r() == k91.z3.TRANSPARENT) {
                return false;
            }
        }
        try {
            android.app.ActivityManager.RunningTaskInfo z17 = com.tencent.mm.sdk.platformtools.t8.z(this, getTaskId());
            if (z17 != null && (componentName2 = z17.baseActivity) != null) {
                if (componentName2.equals(getComponentName())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUI", "shouldKeepPluginUIOpaque return true, task.baseActivity=self, keep PluginUI opaque");
                    return true;
                }
                java.lang.String[] strArr = {"WXBizEntryActivity", "AppBrandLaunchProxyUI"};
                for (int i17 = 0; i17 < 2; i17++) {
                    java.lang.String str = strArr[i17];
                    if (z17.baseActivity.getShortClassName().endsWith(str)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUI", "shouldKeepPluginUIOpaque return true, task.baseActivity=[%s], keep PluginUI opaque", str);
                        return true;
                    }
                }
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = (z17 == null || (componentName = z17.baseActivity) == null) ? "null" : componentName.getShortClassName();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUI", "shouldKeepPluginUIOpaque return false, task.baseActivity=[%s]", objArr);
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPluginUI", "shouldKeepPluginUIOpaque return false, get e=%s", e17);
            return false;
        }
    }

    public final boolean M7() {
        com.tencent.mm.plugin.appbrand.o6 J7 = J7();
        if (J7 == null) {
            return false;
        }
        return J7.H2.q();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.appbrand.o6 J7 = J7();
        if (!M7() || J7 == null) {
            super.finish();
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.h6 h6Var = new com.tencent.mm.plugin.appbrand.ui.h6(this);
        com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var = J7.H2;
        l0Var.getClass();
        com.tencent.mm.plugin.appbrand.widget.halfscreen.t tVar = new com.tencent.mm.plugin.appbrand.widget.halfscreen.t(h6Var, l0Var);
        com.tencent.mm.plugin.appbrand.widget.f0 f0Var = l0Var.f91198d;
        if (f0Var != null) {
            com.tencent.mm.plugin.appbrand.widget.f0.e0(f0Var, com.tencent.mm.plugin.appbrand.widget.c0.f91068h, tVar, false, 4, null);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI, com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Object obj;
        super.onCreate(bundle);
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.1
            {
                this.__eventId = -858972213;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent appBrandHalfScreenCloseAnimationSettingEvent) {
                com.tencent.mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent appBrandHalfScreenCloseAnimationSettingEvent2 = appBrandHalfScreenCloseAnimationSettingEvent;
                int i17 = appBrandHalfScreenCloseAnimationSettingEvent2.f53980g.f7950a;
                com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI appBrandPluginUI = com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.this;
                if (i17 != appBrandPluginUI.hashCode()) {
                    return false;
                }
                appBrandPluginUI.f89377p0 = appBrandHalfScreenCloseAnimationSettingEvent2.f53980g.f7951b;
                appBrandPluginUI.f89378x0 = 0;
                return true;
            }
        };
        this.f89379y0 = iListener;
        iListener.alive();
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AppBrandLauncherUI)).Rj(this, iy1.a.MiniProgramList);
        java.util.Iterator it = com.tencent.mm.plugin.appbrand.app.d.f75046b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b((android.app.Activity) ((cf.a) obj).f40816b.get(), this)) {
                    break;
                }
            }
        }
        cf.a aVar = (cf.a) obj;
        if (aVar != null) {
            aVar.f40818d = true;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI, com.tencent.mm.plugin.appbrand.ui.wxa_container.AppBrandContainerFragmentActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f89379y0.dead();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        if (!L7()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUI", "onEnterAnimationComplete convert PluginUI to translucent");
            db5.f.c(this, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUI", "onEnter convertActivityToTranslucent");
        } else {
            com.tencent.mm.plugin.appbrand.o6 J7 = J7();
            if (J7 != null) {
                J7.M1(false);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mars.xlog.Log.i("platformViewDebug", "appbrand on pause");
        super.onPause();
        K7();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        K7();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("platformViewDebug", "appbrand on resume");
        super.onResume();
        K7();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mars.xlog.Log.i("platformViewDebug", "appbrand on stop");
        super.onStop();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI
    public void s7(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        int i17;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = appBrandInitConfigWC == null ? null : appBrandInitConfigWC.L1;
        if (halfScreenConfig != null && halfScreenConfig.c()) {
            int i18 = this.f89377p0;
            if (i18 != -1 && (i17 = this.f89378x0) != -1) {
                overridePendingTransition(i17, i18);
                this.f89377p0 = -1;
                this.f89378x0 = -1;
                return;
            } else {
                if (halfScreenConfig.a(this) == k91.s2.f305760d) {
                    if (M7()) {
                        overridePendingTransition(0, 0);
                        return;
                    } else {
                        overridePendingTransition(0, com.tencent.mm.R.anim.f477746a7);
                        return;
                    }
                }
                if (M7()) {
                    super.overridePendingTransition(0, 0);
                    return;
                } else {
                    super.overridePendingTransition(0, com.tencent.mm.ui.uc.f211081d);
                    return;
                }
            }
        }
        if (appBrandInitConfigWC == null || k91.y3.DISABLED == appBrandInitConfigWC.q()) {
            super.overridePendingTransition(0, 0);
            return;
        }
        if (appBrandInitConfigWC.M1) {
            overridePendingTransition(com.tencent.mm.R.anim.f477745a6, com.tencent.mm.R.anim.f477746a7);
            return;
        }
        if (appBrandInitConfigWC.A2 && !appBrandInitConfigWC.f77292e2) {
            overridePendingTransition(com.tencent.mm.R.anim.f477745a6, com.tencent.mm.R.anim.f477746a7);
            return;
        }
        k91.y3 y3Var = k91.y3.DEFAULT;
        k91.y3 q17 = appBrandInitConfigWC.q();
        com.tencent.mm.plugin.appbrand.ui.u8 u8Var = com.tencent.mm.plugin.appbrand.ui.u8.INSTANCE;
        if (y3Var != q17) {
            u8Var.j(this, appBrandInitConfigWC);
        } else if (com.tencent.mm.plugin.appbrand.ui.t7.b()) {
            super.overridePendingTransition(com.tencent.mm.ui.uc.f211080c, com.tencent.mm.ui.uc.f211081d);
        } else {
            u8Var.j(this, appBrandInitConfigWC);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI
    public void t7(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        if (com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.u.a(this, appBrandInitConfigWC, appBrandStatObject)) {
            db5.f.c(this, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUI", "init convertActivityToTranslucent");
            return;
        }
        if (k91.y3.DISABLED == appBrandInitConfigWC.o()) {
            super.overridePendingTransition(0, 0);
            return;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC o76 = o7();
        if (com.tencent.mm.plugin.appbrand.utils.t.b(appBrandInitConfigWC.f77295h2)) {
            super.overridePendingTransition(0, 0);
            return;
        }
        K7();
        if (appBrandInitConfigWC.L1.c()) {
            if (appBrandInitConfigWC.L1.a(this) == k91.s2.f305760d) {
                if (M7()) {
                    overridePendingTransition(0, 0);
                    return;
                } else {
                    overridePendingTransition(com.tencent.mm.R.anim.f477747a8, 0);
                    return;
                }
            }
            if (M7()) {
                super.overridePendingTransition(0, 0);
                return;
            } else {
                super.overridePendingTransition(com.tencent.mm.ui.uc.f211078a, 0);
                return;
            }
        }
        if (o76 != null && o76.M1) {
            super.t7(appBrandInitConfigWC, appBrandStatObject);
            return;
        }
        if (o76.A2 && !o76.f77292e2) {
            super.t7(appBrandInitConfigWC, appBrandStatObject);
            return;
        }
        k91.y3 y3Var = k91.y3.DEFAULT;
        k91.y3 o17 = o76.o();
        com.tencent.mm.plugin.appbrand.ui.u8 u8Var = com.tencent.mm.plugin.appbrand.ui.u8.INSTANCE;
        if (y3Var != o17) {
            u8Var.k(this, o76);
        } else if (com.tencent.mm.plugin.appbrand.ui.t7.b()) {
            super.overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        } else {
            u8Var.k(this, o76);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI
    public boolean v7() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI
    public boolean w7(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        return super.w7(appBrandRuntime) && !L7();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI
    public android.view.LayoutInflater y7() {
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) b3.l.getSystemService(getApplicationContext(), android.view.LayoutInflater.class);
        java.util.Objects.requireNonNull(layoutInflater);
        return com.tencent.mm.ui.id.a(layoutInflater, new android.view.ContextThemeWrapper(getApplicationContext(), getTheme()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (((r5 instanceof com.tencent.mm.plugin.appbrand.o6) && com.tencent.mm.plugin.appbrand.kf.a((com.tencent.mm.plugin.appbrand.o6) r5)) != false) goto L19;
     */
    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z7(com.tencent.mm.plugin.appbrand.AppBrandRuntime r5) {
        /*
            r4 = this;
            boolean r0 = rh1.b.f395624a
            if (r0 == 0) goto L8
            super.z7(r5)
            return
        L8:
            r0 = 0
            if (r5 == 0) goto L4d
            boolean r1 = com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible.e(r5)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L33
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r5.u0()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) r1
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r1 = r1.L1
            boolean r1 = r1.c()
            if (r1 != 0) goto L33
            boolean r1 = r5 instanceof com.tencent.mm.plugin.appbrand.o6
            if (r1 == 0) goto L30
            r1 = r5
            com.tencent.mm.plugin.appbrand.o6 r1 = (com.tencent.mm.plugin.appbrand.o6) r1
            boolean r1 = com.tencent.mm.plugin.appbrand.kf.a(r1)
            if (r1 == 0) goto L30
            r1 = r3
            goto L31
        L30:
            r1 = r2
        L31:
            if (r1 == 0) goto L4d
        L33:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig r1 = r5.u0()
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) r1
            boolean r1 = r1.Z
            if (r1 == 0) goto L43
            r5.M1(r2)
            r5.f74801l1 = r0
            goto L4d
        L43:
            r5.M1(r3)
            com.tencent.mm.plugin.appbrand.ui.g6 r1 = new com.tencent.mm.plugin.appbrand.ui.g6
            r1.<init>(r4)
            r5.f74801l1 = r1
        L4d:
            boolean r1 = r5 instanceof com.tencent.mm.plugin.appbrand.o6
            if (r1 == 0) goto L75
            com.tencent.mm.plugin.appbrand.o6 r5 = (com.tencent.mm.plugin.appbrand.o6) r5
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r5 = r5.u0()
            k91.y3 r1 = k91.y3.DISABLED
            k91.y3 r2 = r5.o()
            if (r1 != r2) goto L75
            boolean r1 = r4.L7()
            if (r1 != 0) goto L75
            java.lang.String r5 = r5.f77278d
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r1 = "MicroMsg.AppBrandPluginUI"
            java.lang.String r2 = "onRuntimeLoaded, appId:%s, disableEnterAnimation && !keepOpaque, convertActivityToTranslucent"
            com.tencent.mars.xlog.Log.i(r1, r2, r5)
            db5.f.c(r4, r0)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI.z7(com.tencent.mm.plugin.appbrand.AppBrandRuntime):void");
    }
}
