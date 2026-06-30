package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class e0 extends com.tencent.mm.plugin.appbrand.launching.a {
    public static void e(android.content.Intent intent, android.app.Activity activity) {
        try {
            intent.putExtra("extra_from_activity_status_bar_color", activity.getWindow().getStatusBarColor());
            intent.putExtra("extra_from_activity_navigation_bar_color", activity.getWindow().getNavigationBarColor());
            intent.putExtra("extra_from_activity_window_attributes", activity.getWindow().getAttributes());
        } catch (java.lang.NullPointerException unused) {
        }
    }

    public static java.lang.String f(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        return (java.lang.String) cf.i.a(java.lang.String.format(java.util.Locale.ENGLISH, "tryGetAppId(%s, %s)", launchParcel.f84901d, launchParcel.f84902e), new com.tencent.mm.plugin.appbrand.launching.precondition.g0(launchParcel));
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.a
    public boolean d(android.content.Context context, final com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel) {
        boolean z17;
        com.tencent.luggage.sdk.processes.s c17;
        final java.lang.String f17 = f(launchParcel);
        final java.lang.String f18 = com.tencent.mm.plugin.appbrand.report.quality.u.f(launchParcel, f17, false);
        sj1.l.d(f17, false);
        com.tencent.mm.plugin.appbrand.report.quality.u.g(launchParcel, f18, f17);
        com.tencent.mm.plugin.appbrand.report.b3 b3Var = com.tencent.mm.plugin.appbrand.report.b3.f87812a;
        b3Var.d(launchParcel, f18);
        if (com.tencent.mm.plugin.appbrand.report.quality.w1.a()) {
            com.tencent.mm.plugin.appbrand.report.quality.w1.f88373a.g(f17, f18);
            com.tencent.mm.plugin.appbrand.keylogger.w.j(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, f17);
            com.tencent.mm.plugin.appbrand.keylogger.w.a(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, f17, java.lang.String.format("Network:%s", com.tencent.mars.comm.NetStatusUtil.getNetTypeString(context)));
        }
        int i17 = launchParcel.f84904g;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            if (i17 == 0 || i17 == 1) {
                z17 = true;
            } else {
                if (i17 != 2) {
                    iz5.a.h("Invalid versionType");
                    throw null;
                }
                z17 = com.tencent.mm.plugin.appbrand.launching.g5.f84619a.c();
            }
            if (z17 && (c17 = com.tencent.mm.plugin.appbrand.task.u0.C().c(f17, i17)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app without ProxyUI with username(%s) and appId(%s) and statObj(%s)", launchParcel.f84901d, f17, launchParcel.f84910o);
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) c17.f47687d;
                if (appBrandInitConfigWC.f77281g == i17) {
                    launchParcel.b(appBrandInitConfigWC);
                    com.tencent.mm.plugin.appbrand.launching.od.c(appBrandInitConfigWC, launchParcel);
                    appBrandInitConfigWC.S = launchParcel.f84918u;
                    appBrandInitConfigWC.V = launchParcel.f84920w;
                    appBrandInitConfigWC.K1 = launchParcel.F;
                    com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = launchParcel.f84914q;
                    appBrandInitConfigWC.N1 = launchParamsOptional == null ? 0 : launchParamsOptional.f70419h;
                    appBrandInitConfigWC.D1 = launchParcel.D;
                    appBrandInitConfigWC.F1 = launchParcel.E;
                    appBrandInitConfigWC.f77298k2 = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession(f18, appBrandInitConfigWC, launchParcel.f84910o, com.tencent.mm.plugin.appbrand.report.quality.u.d());
                    appBrandInitConfigWC.i(f18);
                    appBrandInitConfigWC.f77298k2.f88141n = false;
                    appBrandInitConfigWC.f77303p2 = launchParcel.G;
                    android.os.Parcelable parcelable = launchParcel.L;
                    if (parcelable != null) {
                        appBrandInitConfigWC.f77312y2 = (com.tencent.mm.plugin.appbrand.api.WeAppOpenDeclarePromptBundle) parcelable;
                    } else {
                        appBrandInitConfigWC.f77312y2 = null;
                    }
                    appBrandInitConfigWC.S1 = false;
                    appBrandInitConfigWC.L1 = launchParcel.H;
                    appBrandInitConfigWC.E1 = launchParcel.R;
                    appBrandInitConfigWC.C2 = launchParcel.S;
                    appBrandInitConfigWC.D2 = launchParcel.U;
                    appBrandInitConfigWC.E2 = launchParcel.T;
                    appBrandInitConfigWC.H1 = j65.e.b();
                    appBrandInitConfigWC.I1 = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
                    appBrandInitConfigWC.J1 = c01.e2.a0();
                    com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional2 = launchParcel.f84914q;
                    appBrandInitConfigWC.H = launchParamsOptional2 == null ? "" : launchParamsOptional2.f70421m;
                    appBrandInitConfigWC.f47270c2 = launchParcel.f84907l1;
                    int i18 = launchParcel.f84903f;
                    if (i18 > 0) {
                        appBrandInitConfigWC.G2 = i18;
                    }
                    appBrandInitConfigWC.f47271d2 = launchParcel.f84913p1;
                    try {
                        com.tencent.mm.plugin.appbrand.launching.precondition.l0.a(context, launchParcel.f84921x, appBrandInitConfigWC, launchParcel.f84910o);
                        b3Var.e(appBrandInitConfigWC);
                        return true;
                    } finally {
                        launchParcel.c();
                    }
                }
            }
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = launchParcel.f84911p;
        boolean z18 = appBrandLaunchReferrer != null && 4 == appBrandLaunchReferrer.f77322d;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = launchParcel.f84910o;
        boolean z19 = appBrandStatObject != null && 1225 == appBrandStatObject.f87790f;
        boolean z27 = appBrandStatObject != null && 1023 == appBrandStatObject.f87790f;
        oe1.b2.a(f17);
        java.lang.String str = "Token@" + com.tencent.mm.plugin.appbrand.launching.precondition.e0.class.hashCode() + "#" + java.lang.System.nanoTime();
        final com.tencent.mm.plugin.appbrand.launching.precondition.s sVar = new com.tencent.mm.plugin.appbrand.launching.precondition.s(context, str, (z18 || z19 || z27) ? false : true);
        sVar.f84938h = launchParcel;
        com.tencent.mm.plugin.appbrand.utils.d5.b(new com.tencent.mm.plugin.appbrand.launching.precondition.e(sVar, launchParcel, f18));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app show ProxyUI with username(%s) and appId(%s) and statObj(%s)", launchParcel.f84901d, f17, launchParcel.f84910o);
        final android.app.Activity a17 = q75.a.a(context);
        final android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI.class);
        if (a17 == null) {
            intent.addFlags(268435456);
        } else {
            e(intent, a17);
        }
        intent.putExtra("extra_from_mm", true);
        intent.putExtra("extra_entry_token", str);
        intent.putExtra("extra_add_wmpf_voip_window_flags", z19);
        if (a17 != null && !a17.isFinishing() && launchParcel.f84921x == null) {
            final int i19 = launchParcel.A;
            if (i19 < 0) {
                i19 = -1;
            }
            if (i19 >= 0) {
                a17.startActivityForResult(intent, i19, null);
            } else {
                final long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_android_appbrand_launch_proxy_ui_start_delay, com.tencent.mm.sdk.platformtools.z.f193112h <= 671097855 ? 250L : 0L);
                final int andIncrement = sj1.f.f408365b.getAndIncrement();
                java.lang.reflect.Method method = j3.v.f297343b;
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    j3.u.a("MMLaunchEntry-CountDownLatch", andIncrement);
                } else {
                    try {
                        j3.v.f297343b.invoke(null, java.lang.Long.valueOf(j3.v.f297342a), "MMLaunchEntry-CountDownLatch", java.lang.Integer.valueOf(andIncrement));
                    } catch (java.lang.Exception unused) {
                    }
                }
                final u65.a aVar = new u65.a(1, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f408364a;
                        java.lang.reflect.Method method2 = j3.v.f297343b;
                        int i27 = android.os.Build.VERSION.SDK_INT;
                        int i28 = andIncrement;
                        if (i27 >= 29) {
                            j3.u.b("MMLaunchEntry-CountDownLatch", i28);
                        } else {
                            try {
                                j3.v.f297344c.invoke(null, java.lang.Long.valueOf(j3.v.f297342a), "MMLaunchEntry-CountDownLatch", java.lang.Integer.valueOf(i28));
                            } catch (java.lang.Exception unused2) {
                            }
                        }
                        final android.app.Activity activity = a17;
                        boolean isFinishing = activity.isFinishing();
                        final android.content.Intent intent2 = intent;
                        if (!isFinishing) {
                            final int i29 = i19;
                            activity.runOnUiThread(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$e
                                @Override // java.lang.Runnable
                                public final void run() {
                                    activity.startActivityForResult(intent2, i29, null);
                                }
                            });
                            return;
                        }
                        intent2.addFlags(268435456);
                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent2);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "lambda$startWithParcel$2", "(ILandroid/app/Activity;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context2.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "lambda$startWithParcel$2", "(ILandroid/app/Activity;Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                });
                if (Ui <= 0 || z19) {
                    aVar.b();
                } else if (z27) {
                    intent.putExtra("extra_launch_use_default_color_as_background", true);
                    aVar.b();
                } else {
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (u65.a.this.b()) {
                                java.lang.Object[] objArr = new java.lang.Object[3];
                                com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel2 = launchParcel;
                                java.lang.String str2 = launchParcel2.f84901d;
                                boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                objArr[0] = str2;
                                java.lang.String str3 = launchParcel2.f84902e;
                                objArr[1] = str3 != null ? str3 : "";
                                objArr[2] = f18;
                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "LaunchProxyUIDelegate.timeoutRunnable.run() username:%s, appId:%s, instanceId:%s", objArr);
                                final com.tencent.mm.plugin.appbrand.launching.precondition.s sVar2 = sVar;
                                final long j17 = Ui;
                                sVar2.j(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$d
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        android.view.View findViewById;
                                        final android.content.Context baseContext = com.tencent.mm.plugin.appbrand.launching.precondition.s.this.getBaseContext();
                                        if (!(baseContext instanceof com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) || (findViewById = ((com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) baseContext).findViewById(android.R.id.content)) == null) {
                                            return;
                                        }
                                        findViewById.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$f
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ((com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) baseContext).d7();
                                            }
                                        }, java.lang.Math.max(0L, 500 - j17));
                                    }
                                }, false);
                            }
                        }
                    };
                    sVar.f85024n = new com.tencent.mm.plugin.appbrand.launching.precondition.f0(this, aVar, launchParcel, f18, runnable);
                    com.tencent.mm.sdk.platformtools.u3.i(runnable, Ui);
                }
            }
        } else if (launchParcel.f84921x != null) {
            int flags = intent.getFlags();
            try {
                intent.setFlags((-268435457) & flags);
                com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate activityStarterIpcDelegate = launchParcel.f84921x;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activityStarterIpcDelegate, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityStarterIpcDelegate.b((android.content.Intent) arrayList.get(0));
                yj0.a.f(activityStarterIpcDelegate, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception unused2) {
                intent.setFlags(flags);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (!z18 || !com.tencent.matrix.lifecycle.owners.ProcessExplicitBackgroundOwner.INSTANCE.isBackground() || android.os.Build.VERSION.SDK_INT < 29 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_opensdk_launch_wxa_use_pending_intent_when_bg, 1) <= 0) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, -1, intent, 201326592);
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s), start proxyUI using PendingIntent", launchParcel.f84901d, f17, launchParcel.f84910o);
                activity.send(cf.b.a(this), new android.app.PendingIntent.OnFinished() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$c
                    @Override // android.app.PendingIntent.OnFinished
                    public final void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent2, int i27, java.lang.String str2, android.os.Bundle bundle) {
                        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel2 = com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel.this;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s), send PendingIntent finished", launchParcel2.f84901d, f17, launchParcel2.f84910o);
                    }
                }, (android.os.Handler) null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s), send PendingIntent failed by %s", launchParcel.f84901d, f17, launchParcel.f84910o, e17);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        if (!z18 || !(a17 instanceof com.tencent.mm.ui.MMActivity)) {
            return true;
        }
        ((com.tencent.mm.ui.MMActivity) context).hideAllManagedDialogs();
        return true;
    }
}
