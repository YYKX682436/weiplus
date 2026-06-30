package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a {
    public static void e(android.content.Intent intent, android.app.Activity activity) {
        try {
            intent.putExtra("extra_from_activity_status_bar_color", activity.getWindow().getStatusBarColor());
            intent.putExtra("extra_from_activity_navigation_bar_color", activity.getWindow().getNavigationBarColor());
            intent.putExtra("extra_from_activity_window_attributes", activity.getWindow().getAttributes());
        } catch (java.lang.NullPointerException unused) {
        }
    }

    public static java.lang.String f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc) {
        return (java.lang.String) cf.i.a(java.lang.String.format(java.util.Locale.ENGLISH, "tryGetAppId(%s, %s)", c12362x460991bc.f166434d, c12362x460991bc.f166435e), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.g0(c12362x460991bc));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a
    public boolean d(android.content.Context context, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc) {
        boolean z17;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s c17;
        final java.lang.String f17 = f(c12362x460991bc);
        final java.lang.String f18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.f(c12362x460991bc, f17, false);
        sj1.l.d(f17, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.g(c12362x460991bc, f18, f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.b3.f169345a;
        b3Var.d(c12362x460991bc, f18);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.a()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w1.f169906a.g(f17, f18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, f17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, f17, java.lang.String.format("Network:%s", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(context)));
        }
        int i17 = c12362x460991bc.f166437g;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
            if (i17 == 0 || i17 == 1) {
                z17 = true;
            } else {
                if (i17 != 2) {
                    iz5.a.h("Invalid versionType");
                    throw null;
                }
                z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a.c();
            }
            if (z17 && (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().c(f17, i17)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app without ProxyUI with username(%s) and appId(%s) and statObj(%s)", c12362x460991bc.f166434d, f17, c12362x460991bc.f166443o);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) c17.f129220d;
                if (c11809xbc286be4.f158814g == i17) {
                    c12362x460991bc.b(c11809xbc286be4);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od.c(c11809xbc286be4, c12362x460991bc);
                    c11809xbc286be4.S = c12362x460991bc.f166451u;
                    c11809xbc286be4.V = c12362x460991bc.f166453w;
                    c11809xbc286be4.K1 = c12362x460991bc.F;
                    com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b9 = c12362x460991bc.f166447q;
                    c11809xbc286be4.N1 = c11105x57aff1b9 == null ? 0 : c11105x57aff1b9.f151952h;
                    c11809xbc286be4.D1 = c12362x460991bc.D;
                    c11809xbc286be4.F1 = c12362x460991bc.E;
                    c11809xbc286be4.f158831k2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7(f18, c11809xbc286be4, c12362x460991bc.f166443o, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.d());
                    c11809xbc286be4.i(f18);
                    c11809xbc286be4.f158831k2.f169674n = false;
                    c11809xbc286be4.f158836p2 = c12362x460991bc.G;
                    android.os.Parcelable parcelable = c12362x460991bc.L;
                    if (parcelable != null) {
                        c11809xbc286be4.f158845y2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113) parcelable;
                    } else {
                        c11809xbc286be4.f158845y2 = null;
                    }
                    c11809xbc286be4.S1 = false;
                    c11809xbc286be4.L1 = c12362x460991bc.H;
                    c11809xbc286be4.E1 = c12362x460991bc.R;
                    c11809xbc286be4.C2 = c12362x460991bc.S;
                    c11809xbc286be4.D2 = c12362x460991bc.U;
                    c11809xbc286be4.E2 = c12362x460991bc.T;
                    c11809xbc286be4.H1 = j65.e.b();
                    c11809xbc286be4.I1 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
                    c11809xbc286be4.J1 = c01.e2.a0();
                    com.p314xaae8f345.mm.p942x40c3c02f.C11105x57aff1b9 c11105x57aff1b92 = c12362x460991bc.f166447q;
                    c11809xbc286be4.H = c11105x57aff1b92 == null ? "" : c11105x57aff1b92.f151954m;
                    c11809xbc286be4.f128803c2 = c12362x460991bc.f166440l1;
                    int i18 = c12362x460991bc.f166436f;
                    if (i18 > 0) {
                        c11809xbc286be4.G2 = i18;
                    }
                    c11809xbc286be4.f128804d2 = c12362x460991bc.f166446p1;
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.l0.a(context, c12362x460991bc.f166454x, c11809xbc286be4, c12362x460991bc.f166443o);
                        b3Var.e(c11809xbc286be4);
                        return true;
                    } finally {
                        c12362x460991bc.c();
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = c12362x460991bc.f166444p;
        boolean z18 = c11812xa040dc98 != null && 4 == c11812xa040dc98.f158855d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = c12362x460991bc.f166443o;
        boolean z19 = c12559xbdae8559 != null && 1225 == c12559xbdae8559.f169323f;
        boolean z27 = c12559xbdae8559 != null && 1023 == c12559xbdae8559.f169323f;
        oe1.b2.a(f17);
        java.lang.String str = "Token@" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e0.class.hashCode() + "#" + java.lang.System.nanoTime();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s(context, str, (z18 || z19 || z27) ? false : true);
        sVar.f166471h = c12362x460991bc;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e(sVar, c12362x460991bc, f18));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app show ProxyUI with username(%s) and appId(%s) and statObj(%s)", c12362x460991bc.f166434d, f17, c12362x460991bc.f166443o);
        final android.app.Activity a17 = q75.a.a(context);
        final android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9.class);
        if (a17 == null) {
            intent.addFlags(268435456);
        } else {
            e(intent, a17);
        }
        intent.putExtra("extra_from_mm", true);
        intent.putExtra("extra_entry_token", str);
        intent.putExtra("extra_add_wmpf_voip_window_flags", z19);
        if (a17 != null && !a17.isFinishing() && c12362x460991bc.f166454x == null) {
            final int i19 = c12362x460991bc.A;
            if (i19 < 0) {
                i19 = -1;
            }
            if (i19 >= 0) {
                a17.startActivityForResult(intent, i19, null);
            } else {
                final long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_android_appbrand_launch_proxy_ui_start_delay, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h <= 671097855 ? 250L : 0L);
                final int andIncrement = sj1.f.f489898b.getAndIncrement();
                java.lang.reflect.Method method = j3.v.f378876b;
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    j3.u.a("MMLaunchEntry-CountDownLatch", andIncrement);
                } else {
                    try {
                        j3.v.f378876b.invoke(null, java.lang.Long.valueOf(j3.v.f378875a), "MMLaunchEntry-CountDownLatch", java.lang.Integer.valueOf(andIncrement));
                    } catch (java.lang.Exception unused) {
                    }
                }
                final u65.a aVar = new u65.a(1, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = sj1.f.f489897a;
                        java.lang.reflect.Method method2 = j3.v.f378876b;
                        int i27 = android.os.Build.VERSION.SDK_INT;
                        int i28 = andIncrement;
                        if (i27 >= 29) {
                            j3.u.b("MMLaunchEntry-CountDownLatch", i28);
                        } else {
                            try {
                                j3.v.f378877c.invoke(null, java.lang.Long.valueOf(j3.v.f378875a), "MMLaunchEntry-CountDownLatch", java.lang.Integer.valueOf(i28));
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
                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
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
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc2 = c12362x460991bc;
                                java.lang.String str2 = c12362x460991bc2.f166434d;
                                boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                objArr[0] = str2;
                                java.lang.String str3 = c12362x460991bc2.f166435e;
                                objArr[1] = str3 != null ? str3 : "";
                                objArr[2] = f18;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "LaunchProxyUIDelegate.timeoutRunnable.run() username:%s, appId:%s, instanceId:%s", objArr);
                                final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s sVar2 = sVar;
                                final long j17 = Ui;
                                sVar2.j(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$d
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        android.view.View findViewById;
                                        final android.content.Context baseContext = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.s.this.getBaseContext();
                                        if (!(baseContext instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9) || (findViewById = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9) baseContext).findViewById(android.R.id.content)) == null) {
                                            return;
                                        }
                                        findViewById.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$f
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9) baseContext).d7();
                                            }
                                        }, java.lang.Math.max(0L, 500 - j17));
                                    }
                                }, false);
                            }
                        }
                    };
                    sVar.f166557n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.f0(this, aVar, c12362x460991bc, f18, runnable);
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, Ui);
                }
            }
        } else if (c12362x460991bc.f166454x != null) {
            int flags = intent.getFlags();
            try {
                intent.setFlags((-268435457) & flags);
                com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3933x11320b41 c3933x11320b41 = c12362x460991bc.f166454x;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c3933x11320b41, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                c3933x11320b41.b((android.content.Intent) arrayList.get(0));
                yj0.a.f(c3933x11320b41, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception unused2) {
                intent.setFlags(flags);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (!z18 || !com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4673x87f0d602.f19955x4fbc8495.mo40965x320351f8() || android.os.Build.VERSION.SDK_INT < 29 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_opensdk_launch_wxa_use_pending_intent_when_bg, 1) <= 0) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.app.PendingIntent activity = android.app.PendingIntent.getActivity(context, -1, intent, 201326592);
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s), start proxyUI using PendingIntent", c12362x460991bc.f166434d, f17, c12362x460991bc.f166443o);
                activity.send(cf.b.a(this), new android.app.PendingIntent.OnFinished() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.e0$$c
                    @Override // android.app.PendingIntent.OnFinished
                    public final void onSendFinished(android.app.PendingIntent pendingIntent, android.content.Intent intent2, int i27, java.lang.String str2, android.os.Bundle bundle) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc.this;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s), send PendingIntent finished", c12362x460991bc2.f166434d, f17, c12362x460991bc2.f166443o);
                    }
                }, (android.os.Handler) null);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s), send PendingIntent failed by %s", c12362x460991bc.f166434d, f17, c12362x460991bc.f166443o, e17);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/appbrand/launching/precondition/MMLaunchEntry", "startWithParcel", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/launching/params/LaunchParcel;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        if (!z18 || !(a17 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            return true;
        }
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo54210xbb94da6b();
        return true;
    }
}
