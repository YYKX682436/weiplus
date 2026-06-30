package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

@j95.b
/* loaded from: classes10.dex */
public final class l3 extends i95.w implements zy2.c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f207654d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f207655e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f207656f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f207657g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f207659i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f207660m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f207661n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Boolean f207662o;

    /* renamed from: p, reason: collision with root package name */
    public long f207663p;

    /* renamed from: u, reason: collision with root package name */
    public volatile java.lang.ref.WeakReference f207668u;

    /* renamed from: x, reason: collision with root package name */
    public long f207671x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f207672y;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f207658h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.k3.f207640d);

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f207664q = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.i3.f207613d);

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Set f207665r = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Set f207666s = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Set f207667t = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f207669v = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Set f207670w = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    public l3() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.app.Application application = context instanceof android.app.Application ? (android.app.Application) context : null;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.a3(this));
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.b3(this));
    }

    public boolean Ai(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: acc not ready");
            return false;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.U0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: finder multi task is close");
            return false;
        }
        if (!this.f207655e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: failed needReenterFinder = " + this.f207655e);
            return false;
        }
        this.f207654d = false;
        this.f207655e = false;
        if (!Vi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "checkReenterFinderFromLauncherUI: failed is finder task forground");
            return false;
        }
        this.f207659i = true;
        activity.getIntent().putExtra("KEY_REENTER_FINDER", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_NEED_ANIM", true);
        i0Var.Yj(activity, intent);
        activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559421ec, com.p314xaae8f345.mm.R.C30854x2dc211.f559417e8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b2.f206498a.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y1.f206990q);
        return true;
    }

    public void Bi(android.content.Context context, int i17) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMultiTaskService", "checkShowMultiTaskDialog: acc not ready");
            return;
        }
        if (this.f207660m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (t70Var.U0()) {
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity != null && (intent = activity.getIntent()) != null && intent.getBooleanExtra("KEY_REENTER_FINDER", false)) {
                    intent.removeExtra("KEY_REENTER_FINDER");
                    return;
                }
                this.f207660m = false;
                if (this.f207661n == null) {
                    this.f207661n = java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MULTI_TASK_GUIDE_WITH_NAVI_BOOLEAN_SYNC, false));
                }
                if (this.f207662o == null) {
                    this.f207662o = java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MULTI_TASK_GUIDE_WITHOUT_NAVI_BOOLEAN_SYNC, false));
                }
                java.lang.Boolean bool = this.f207661n;
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207662o, bool2)) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "checkShowMultiTaskDialog: withNaviAnimShown = " + this.f207661n + ", withNaviAnimShown = " + this.f207661n);
                int g17 = com.p314xaae8f345.mm.ui.bl.g(context);
                boolean z17 = g17 > 0 && com.p314xaae8f345.mm.ui.bk.j(context) <= g17;
                if ((z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207661n, bool2)) || (!z17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f207662o, bool2))) {
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 0, true);
                z2Var.x(1);
                z2Var.y(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.g3(z2Var, this);
                z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570575b43);
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f566734gw0);
                if (c22789xd23e9a9b != null) {
                    c22789xd23e9a9b.o(((java.lang.Boolean) t70Var.Z0().r()).booleanValue());
                    if (c22789xd23e9a9b.getUseRfx()) {
                        c22789xd23e9a9b.mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(context.getAssets(), z17 ? "finder_multi_task_guide_with_navigation_bar.pag" : "finder_multi_task_guide_without_navigation_bar.pag"));
                    } else {
                        c22789xd23e9a9b.mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312.m154715x243906(context.getAssets(), z17 ? "finder_multi_task_guide_with_navigation_bar.pag" : "finder_multi_task_guide_without_navigation_bar.pag"));
                    }
                    c22789xd23e9a9b.m82583xcde73672(0);
                    c22789xd23e9a9b.g();
                }
                z2Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.h3(z2Var, this, i17));
                z2Var.C();
                bj(true, i17, 0);
                this.f207671x = c01.id.c();
                this.f207672y = false;
                if (z17) {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MULTI_TASK_GUIDE_WITH_NAVI_BOOLEAN_SYNC, bool2);
                    this.f207661n = bool2;
                } else {
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_MULTI_TASK_GUIDE_WITHOUT_NAVI_BOOLEAN_SYNC, bool2);
                    this.f207662o = bool2;
                }
            }
        }
    }

    public boolean Di(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return wi(activity.getTaskId());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[LOOP:0: B:4:0x000d->B:64:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ni(boolean r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3.Ni(boolean):void");
    }

    public final int Ri() {
        return ((java.lang.Number) ((jz5.n) this.f207664q).mo141623x754a37bb()).intValue();
    }

    public android.app.Activity Ui() {
        java.util.Set set = this.f207665r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(set);
        return (android.app.Activity) kz5.n0.j0(set);
    }

    public final boolean Vi() {
        if (this.f207665r.size() != 0) {
            return false;
        }
        java.util.Set enterFinderActivity = this.f207666s;
        if (enterFinderActivity.size() <= 0) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterFinderActivity, "enterFinderActivity");
        java.util.Iterator it = enterFinderActivity.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) it.next()).getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.class)) {
                return true;
            }
        }
        return false;
    }

    public boolean Zi(android.content.Context context) {
        boolean z17;
        java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks;
        android.app.ActivityManager.RunningTaskInfo runningTaskInfo;
        java.lang.String className;
        android.app.ActivityManager.RunningTaskInfo runningTaskInfo2;
        android.content.ComponentName componentName;
        java.lang.String className2;
        java.lang.String className3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMultiTaskService", "isFinderTaskForeground: acc not ready");
            return false;
        }
        if (this.f207665r.size() == 0) {
            return false;
        }
        java.util.Set enterFinderActivity = this.f207666s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterFinderActivity, "enterFinderActivity");
        boolean z18 = true;
        if (!enterFinderActivity.isEmpty()) {
            java.util.Iterator it = enterFinderActivity.iterator();
            while (it.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) it.next()).getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.class)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (z17) {
            return false;
        }
        try {
            java.lang.Object systemService = context.getSystemService(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
            if (activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || (runningTaskInfo = (android.app.ActivityManager.RunningTaskInfo) kz5.n0.Z(runningTasks)) == null) {
                return false;
            }
            android.content.ComponentName componentName2 = runningTaskInfo.baseActivity;
            if (componentName2 == null || (className3 = componentName2.getClassName()) == null || !className3.equals(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14109x83bd09.class).d())) {
                z18 = false;
            }
            if (!z18) {
                android.content.ComponentName componentName3 = runningTaskInfo.baseActivity;
                if (componentName3 == null || (className = componentName3.getClassName()) == null) {
                    return false;
                }
                return className.equals(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.class).d());
            }
            java.util.List<android.app.ActivityManager.RunningTaskInfo> runningTasks2 = activityManager.getRunningTasks(2);
            if (runningTasks2 == null || (runningTaskInfo2 = (android.app.ActivityManager.RunningTaskInfo) kz5.n0.k0(runningTasks2)) == null || (componentName = runningTaskInfo2.baseActivity) == null || (className2 = componentName.getClassName()) == null) {
                return false;
            }
            return className2.equals(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.class).d());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMultiTaskService", "isFinderTaskForeground: ams is dead", th6);
            return false;
        }
    }

    public void aj() {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMultiTaskService", "onLauncherUIStart: acc not ready");
            return;
        }
        java.util.Set set = this.f207665r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(set);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) kz5.n0.j0(set);
        jz5.f0 f0Var = null;
        if (activityC0065xcd7aa112 != null) {
            if (!(!activityC0065xcd7aa112.isFinishing())) {
                activityC0065xcd7aa112 = null;
            }
            if (activityC0065xcd7aa112 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "onLauncherUIStart: finder activity is still foreground");
                this.f207655e = true;
                f0Var = jz5.f0.f384359a;
            }
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMultiTaskService", "onLauncherUIStart: isHomeFromFinder = " + this.f207654d);
            this.f207655e = this.f207654d;
        }
    }

    public final void bj(boolean z17, int i17, int i18) {
        if (z17) {
            this.f207671x = c01.id.c();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6546x9d7e3976 c6546x9d7e3976 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6546x9d7e3976();
        c6546x9d7e3976.f138977d = i17;
        if (!z17) {
            if (this.f207671x == 0) {
                return;
            }
            c6546x9d7e3976.f138979f = c01.id.c() - this.f207671x;
            c6546x9d7e3976.f138978e = i18;
            this.f207671x = 0L;
        }
        c6546x9d7e3976.k();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6546x9d7e3976);
    }

    public void cj() {
        java.util.Set set = this.f207665r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(set);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) kz5.n0.j0(set);
        if (activityC0065xcd7aa112 != null) {
            kd2.o0 o0Var = kd2.p1.N;
            if (!((java.util.Set) ((jz5.n) kd2.p1.P).mo141623x754a37bb()).contains(activityC0065xcd7aa112.getClass())) {
                activityC0065xcd7aa112 = null;
            }
            if (activityC0065xcd7aa112 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "wechat_push_card", 0, null, false, null, 56, null);
            }
        }
    }

    public final boolean wi(int i17) {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMultiTaskService", "isFinderTaskForeground: acc not ready");
            return false;
        }
        java.util.Set enterFinderActivity = this.f207666s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterFinderActivity, "enterFinderActivity");
        java.util.Iterator it = enterFinderActivity.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) obj2).getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.class)) {
                break;
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(enterFinderActivity, "enterFinderActivity");
        java.util.Iterator it6 = enterFinderActivity.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) next).getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15074xeba4993.class)) {
                obj = next;
                break;
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa1122 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) obj;
        return (activityC0065xcd7aa112 != null && activityC0065xcd7aa112.getTaskId() == i17) || (activityC0065xcd7aa1122 != null && activityC0065xcd7aa1122.getTaskId() == i17);
    }
}
