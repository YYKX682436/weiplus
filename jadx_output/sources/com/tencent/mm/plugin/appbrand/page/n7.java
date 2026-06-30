package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class n7 extends com.tencent.luggage.sdk.jsapi.component.b {
    public com.tencent.mm.plugin.appbrand.o6 O1;
    public com.tencent.mm.plugin.appbrand.service.x6 P1;
    public com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView Q1;
    public al1.p0 R1;
    public com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView S1;
    public boolean T1;
    public int U1;
    public int V1;
    public int W1;
    public java.util.List X1;
    public final java.util.concurrent.atomic.AtomicBoolean Y1;
    public final java.util.concurrent.atomic.AtomicBoolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.h3 f86909a2;

    /* renamed from: b2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.h9 f86910b2;

    /* renamed from: c2, reason: collision with root package name */
    public al1.n f86911c2;

    /* renamed from: d2, reason: collision with root package name */
    public final java.lang.Object f86912d2;

    /* renamed from: e2, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.page.fe f86913e2;

    /* renamed from: f2, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.l0[] f86914f2;

    /* renamed from: g2, reason: collision with root package name */
    public int f86915g2;

    /* renamed from: h2, reason: collision with root package name */
    public java.lang.String f86916h2;

    /* renamed from: i2, reason: collision with root package name */
    public boolean f86917i2;

    /* renamed from: j2, reason: collision with root package name */
    public java.lang.Boolean f86918j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f86919k2;

    /* renamed from: l2, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.platform.window.activity.r0 f86920l2;

    static {
        com.tencent.mm.plugin.appbrand.page.b7 b7Var = com.tencent.mm.plugin.appbrand.page.b7.f86429a;
        com.tencent.mm.plugin.appbrand.page.b7.f86432d = new com.tencent.mm.plugin.appbrand.page.ab();
    }

    public n7() {
        this(com.tencent.mm.plugin.appbrand.page.e7.class);
    }

    public static void F3(com.tencent.mm.plugin.appbrand.page.n7 n7Var, android.view.View view, boolean z17, int i17) {
        java.lang.String str;
        android.app.Activity v17;
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView appBrandTaskView = n7Var.S1;
        if (appBrandTaskView == null || appBrandTaskView.getRecentCount() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "not show MultiTaskView");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "showMultiTaskView");
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView appBrandTaskView2 = n7Var.S1;
        java.lang.String appId = n7Var.getAppId();
        java.lang.String X1 = n7Var.X1();
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer = (com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer) appBrandTaskView2;
        appBrandTaskContainer.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "open appId:%s， openTaskType:%d", appId, java.lang.Integer.valueOf(i17));
        appBrandTaskContainer.f91900w = java.lang.System.currentTimeMillis();
        try {
            str = com.tencent.mm.plugin.appbrand.l.b(appId).u0().f47276v;
            if (str == null) {
                str = "";
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTask.AppBrandTaskContainer", "innerMenuClickReport, get runtime by %s, e = %s", appId, e17);
            str = null;
        }
        java.lang.String str2 = str + "_" + appId + "_" + java.lang.System.currentTimeMillis();
        appBrandTaskContainer.f91897t = str2;
        appBrandTaskContainer.f91898u = appId;
        appBrandTaskContainer.f91899v = X1;
        com.tencent.mm.plugin.appbrand.report.v0.e(appId, X1, i17 == 3 ? 66 : 62, str2, com.tencent.mm.sdk.platformtools.t8.i1(), 1, 0);
        com.tencent.mm.plugin.appbrand.widget.recent.e1.a(appId, appBrandTaskContainer.f91897t, 1, "" + appBrandTaskContainer.getRecentCount(), "" + i17, "");
        appBrandTaskContainer.f91887g.f91868r = appBrandTaskContainer.f91897t;
        if (appBrandTaskContainer.getSceneFactory() != null) {
            appBrandTaskContainer.f91887g.f91867q = appBrandTaskContainer.getSceneFactory().getScene();
        }
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView = appBrandTaskContainer.f91887g;
        appBrandCommonUsedTaskView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "startLoadData");
        if (appBrandCommonUsedTaskView.f91860g.isEmpty()) {
            com.tencent.mm.plugin.appbrand.widget.recent.o oVar = new com.tencent.mm.plugin.appbrand.widget.recent.o(appBrandCommonUsedTaskView);
            r45.rs3 rs3Var = com.tencent.mm.plugin.appbrand.widget.recent.k.f91994a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedCache", "getResponse");
            r45.rs3 rs3Var2 = com.tencent.mm.plugin.appbrand.widget.recent.k.f91994a;
            if (rs3Var2 != null) {
                appBrandCommonUsedTaskView.post(new com.tencent.mm.plugin.appbrand.widget.recent.o$$a(oVar, rs3Var2));
            }
            if (com.tencent.mm.plugin.appbrand.widget.recent.k.f91994a == null) {
                ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.widget.recent.i(oVar));
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "data is valid, show it");
            appBrandCommonUsedTaskView.f91861h.setVisibility(0);
            appBrandCommonUsedTaskView.f91862i.notifyDataSetChanged();
            appBrandCommonUsedTaskView.g();
            appBrandCommonUsedTaskView.d();
        }
        android.view.ViewPropertyAnimator animate = appBrandTaskContainer.f91885e.animate();
        appBrandTaskContainer.f91885e.setScaleX(0.8f);
        appBrandTaskContainer.f91885e.setScaleY(0.8f);
        android.view.View view2 = appBrandTaskContainer.f91885e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer", "enterAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/recent/AppBrandTaskContainer", "enterAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        animate.scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(250L).setListener(new com.tencent.mm.plugin.appbrand.widget.recent.s0(appBrandTaskContainer, animate)).start();
        android.view.ViewPropertyAnimator animate2 = appBrandTaskContainer.animate();
        appBrandTaskContainer.setAlpha(0.0f);
        animate2.alpha(1.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(250L).setListener(new com.tencent.mm.plugin.appbrand.widget.recent.t0(appBrandTaskContainer, animate2)).start();
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView appBrandRecentTaskView = appBrandTaskContainer.f91886f;
        java.util.Iterator it = appBrandRecentTaskView.f91877g.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.widget.recent.z0 z0Var = (com.tencent.mm.plugin.appbrand.widget.recent.z0) it.next();
            appBrandRecentTaskView.f91857e.e(3, z0Var.f92092a.f76361d, "" + i18, "");
            i18++;
        }
        if (z17) {
            n7Var.S1.b();
        }
        if (n7Var.R1 == null || (v17 = n7Var.v1()) == null || v17.getWindow() == null) {
            return;
        }
        int i19 = v17.getWindow().getAttributes().flags;
        n7Var.W1 = i19;
        if ((i19 & 1024) != 1024) {
            v17.getWindow().setFlags(1024, 1024);
        }
        android.view.View decorView = v17.getWindow().getDecorView();
        n7Var.V1 = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(3846);
        n7Var.R1.showAtLocation(decorView, 17, 0, 0);
        al1.p0 p0Var = n7Var.R1;
        android.view.View contentView = p0Var.getContentView();
        android.view.ViewPropertyAnimator animate3 = contentView.animate();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(contentView, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask", "enterAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        contentView.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/appbrand/widget/actionbar/MMPopupWindowWithMask", "enterAnimation", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        animate3.alpha(1.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(250L).setListener(new al1.n0(p0Var, contentView, animate3)).start();
        n7Var.T1 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean H3(com.tencent.mm.plugin.appbrand.o6 r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r1 = r8.u0()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r8 = r8.f74803n
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r8)
            java.lang.Class<e42.e0> r3 = e42.e0.class
            r4 = 1
            if (r2 == 0) goto L17
            goto L39
        L17:
            java.lang.String r2 = mj1.b.f327003c
            if (r2 != 0) goto L2d
            i95.m r2 = i95.n0.c(r3)
            e42.e0 r2 = (e42.e0) r2
            e42.d0 r5 = e42.d0.clicfg_android_wxa_skyline_texture_by_appid
            h62.d r2 = (h62.d) r2
            java.lang.String r6 = ""
            java.lang.String r2 = r2.Zi(r5, r6, r4)
            mj1.b.f327003c = r2
        L2d:
            java.lang.String r2 = mj1.b.f327003c
            if (r2 == 0) goto L39
            kotlin.jvm.internal.o.d(r8)
            boolean r8 = r26.n0.B(r2, r8, r0)
            goto L3a
        L39:
            r8 = r0
        L3a:
            if (r8 == 0) goto L3d
            return r4
        L3d:
            java.lang.Boolean r8 = mj1.b.f327002b
            if (r8 == 0) goto L47
            boolean r8 = r8.booleanValue()
            goto Lbe
        L47:
            if (r8 != 0) goto La0
            i95.m r8 = i95.n0.c(r3)
            e42.e0 r8 = (e42.e0) r8
            e42.d0 r2 = e42.d0.clicfg_android_wxa_skyline_texture_by_refresh_rate
            h62.d r8 = (h62.d) r8
            int r8 = r8.Ni(r2, r0)
            if (r4 != r8) goto L5b
            r8 = r4
            goto L5c
        L5b:
            r8 = r0
        L5c:
            if (r8 == 0) goto L9c
            android.content.Context r8 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.o.f(r8, r2)
            java.lang.String r2 = "window"
            java.lang.Object r8 = r8.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.o.e(r8, r2)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            android.view.Display r8 = r8.getDefaultDisplay()
            android.view.Display$Mode[] r8 = r8.getSupportedModes()
            kotlin.jvm.internal.o.d(r8)
            int r2 = r8.length
            r3 = r0
        L80:
            if (r3 >= r2) goto L96
            r5 = r8[r3]
            float r6 = r5.getRefreshRate()
            r7 = 1114636288(0x42700000, float:60.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L93
            r5.getRefreshRate()
            r8 = r4
            goto L97
        L93:
            int r3 = r3 + 1
            goto L80
        L96:
            r8 = r0
        L97:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L9e
        L9c:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        L9e:
            mj1.b.f327002b = r8
        La0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "sRefreshRateForTexture:"
            r8.<init>(r2)
            java.lang.Boolean r2 = mj1.b.f327002b
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "MicroMsg.SkylineABTest"
            com.tencent.mars.xlog.Log.i(r2, r8)
            java.lang.Boolean r8 = mj1.b.f327002b
            kotlin.jvm.internal.o.d(r8)
            boolean r8 = r8.booleanValue()
        Lbe:
            if (r8 == 0) goto Lc1
            return r4
        Lc1:
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r8 = r1.L1
            boolean r1 = r8.c()
            if (r1 == 0) goto Ld0
            k91.v2 r8 = r8.Q
            k91.v2 r1 = k91.v2.f305790d
            if (r8 != r1) goto Ld0
            r0 = r4
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.n7.H3(com.tencent.mm.plugin.appbrand.o6):boolean");
    }

    public static com.tencent.mm.plugin.appbrand.page.n7 I3(int[] iArr) {
        com.tencent.mars.xlog.Log.i("SkylinePreloader", "createForSkyline stack:%s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = new com.tencent.mm.plugin.appbrand.page.n7(com.tencent.mm.plugin.appbrand.page.m7.class, new com.tencent.mm.plugin.appbrand.page.z7());
        n7Var.i3(iArr[0], iArr[1]);
        return n7Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void B2(boolean z17, java.util.Map<java.lang.String, java.lang.Object> map, com.tencent.mm.plugin.appbrand.page.wd wdVar, org.json.JSONObject jSONObject) {
        boolean b17;
        super.B2(z17, map, wdVar, jSONObject);
        if (wdVar == com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK) {
            java.lang.String X1 = X1();
            j91.d dVar = (j91.d) getRuntime().K1(j91.d.class);
            if (dVar != null) {
                com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
                synchronized (tVar) {
                    java.lang.String chatToolMode = tVar.f80460h;
                    kotlin.jvm.internal.o.g(chatToolMode, "chatToolMode");
                    b17 = kotlin.jvm.internal.o.b(chatToolMode, "subpackage");
                }
                if (!b17 || j91.c.b(getRuntime().q2(), getRuntime().u0().N.F, X1)) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "refreshChatToolMode pagePath:%s isn't chat tool path.", X1);
                tVar.b();
            }
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b
    public void B3() {
        if (getRuntime().e3()) {
            Z3();
        } else {
            super.B3();
        }
        com.tencent.mm.plugin.appbrand.weishi.c.a(this.O1);
        if (com.tencent.mm.plugin.appbrand.kf.a(getRuntime())) {
            r1().m(true);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public final boolean E2(android.view.View view, java.lang.Runnable runnable) {
        if (!j2()) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(view) || getRuntime() == null || !getRuntime().a2()) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b
    public final void E3() {
        super.E3();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public final boolean F2(android.view.View view, java.lang.Runnable runnable, long j17) {
        if (!j2()) {
            return false;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.b(view) || getRuntime() == null || !getRuntime().a2()) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.u3.i(runnable, j17);
        return true;
    }

    public void G3(com.tencent.mm.plugin.appbrand.page.la laVar) {
        if (Q1() instanceof com.tencent.mm.plugin.appbrand.page.e7) {
            ((com.tencent.mm.plugin.appbrand.page.e7) Q1()).K.add(laVar);
            return;
        }
        if (Q1() instanceof gf.d0) {
            if ("wxca8d4b8e8feedc2a".equals(getRuntime().f74803n)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageViewWC", "addOverScrolledListener ignore, miniStore");
                return;
            }
            gf.d0 d0Var = (gf.d0) Q1();
            d0Var.getClass();
            com.tencent.mars.xlog.Log.i("Luggage.MPPageRendererSkylineImpl", "addOverScrolledListener l:%s", laVar);
            java.util.Set set = d0Var.H;
            set.add(laVar);
            if (set.size() == 1) {
                d0Var.g0().listenRootScrollViewChange(((com.tencent.luggage.sdk.jsapi.component.b) d0Var.F()).b2());
                com.tencent.skyline.SkylineRuntime g07 = d0Var.g0();
                if (g07 != null) {
                    int b27 = ((com.tencent.luggage.sdk.jsapi.component.b) d0Var.F()).b2();
                    com.tencent.mars.xlog.Log.i("Luggage.MPPageRendererSkylineImpl", "skylineRuntime:%s windowId:%d", g07, java.lang.Integer.valueOf(b27));
                    g07.addSkylineScrollViewChange(b27, d0Var.I);
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void I2(java.util.List list, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        Y3(list, runnable, runnable2, false);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b
    /* renamed from: J3, reason: merged with bridge method [inline-methods] */
    public of1.w1 s3() {
        try {
            android.view.View contentView = getContentView();
            java.util.Objects.requireNonNull(contentView);
            android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.f483180yt);
            if (findViewById instanceof of1.w1) {
                return (of1.w1) findViewById;
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return null;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5
    public void K2() {
        N0(null);
        super.K2();
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentView appBrandRecentView = this.Q1;
        if (appBrandRecentView != null) {
            com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView baseAppBrandRecentView = (com.tencent.mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView) appBrandRecentView;
            com.tencent.mm.plugin.appbrand.widget.recent.l0 l0Var = baseAppBrandRecentView.f91913k2;
            if (l0Var == com.tencent.mm.plugin.appbrand.widget.recent.l0.MY_APP_BRAND) {
                if (i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class) != null) {
                    ((com.tencent.mm.plugin.appbrand.appusage.z5) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.z5.class)).remove(baseAppBrandRecentView);
                }
            } else if (l0Var == com.tencent.mm.plugin.appbrand.widget.recent.l0.RECENT_APP_BRAND && i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.b6.class) != null) {
                ((com.tencent.mm.plugin.appbrand.appusage.b6) i95.n0.c(com.tencent.mm.plugin.appbrand.appusage.b6.class)).remove(baseAppBrandRecentView);
            }
            ((java.util.ArrayList) baseAppBrandRecentView.f91908f2).clear();
            com.tencent.mm.sdk.platformtools.n3 n3Var = baseAppBrandRecentView.f91916n2;
            if (n3Var != null) {
                n3Var.quit();
            }
        }
        al1.p0 p0Var = this.R1;
        if (p0Var != null) {
            p0Var.dismiss();
            android.widget.FrameLayout frameLayout = p0Var.f5804d;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                p0Var.f5804d = null;
            }
        }
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView appBrandTaskView = this.S1;
        if (appBrandTaskView != null) {
            com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer = (com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer) appBrandTaskView;
            appBrandTaskContainer.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "release");
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = appBrandTaskContainer.f91895r;
            if (n3Var2 != null) {
                n3Var2.quit();
            }
            appBrandTaskContainer.f91886f.getClass();
            appBrandTaskContainer.f91887g.getClass();
            appBrandTaskContainer.f91888h.getClass();
        }
        this.f86909a2 = null;
    }

    public int K3(android.view.View view) {
        int i17;
        if (this.f86919k2 > 0 && h2()) {
            return this.f86919k2;
        }
        com.tencent.mm.plugin.appbrand.o6 runtime = getRuntime();
        android.app.Activity a17 = q75.a.a(runtime.r0());
        if (a17 == null) {
            i17 = 0;
        } else {
            int i18 = com.tencent.mm.plugin.appbrand.platform.window.activity.r0.A(a17, true).heightPixels;
            if (!runtime.u0().L1.W && view != null) {
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.g3 a18 = n3.b1.a(view);
                if (a18 != null) {
                    i18 -= a18.f334338a.j().f247045b;
                }
            }
            i17 = i18;
        }
        this.f86919k2 = i17;
        return i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void L2() {
        al1.p0 p0Var = this.R1;
        if (p0Var != null) {
            this.U1 = 6;
            p0Var.dismiss();
        }
    }

    public java.lang.String L3() {
        return this.f86916h2;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void M2() {
        this.P = false;
        synchronized (com.tencent.mm.plugin.appbrand.page.je.f86803a) {
            if (com.tencent.mm.plugin.appbrand.page.je.f86804b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StatisticsPageView", "removePageView " + this);
                com.tencent.mm.plugin.appbrand.page.je.f86805c.remove(this);
            }
        }
        synchronized (this.f86912d2) {
            if (this.f86913e2 != null) {
                this.f86913e2.f86624b.removeCallbacksAndMessages(null);
            }
        }
    }

    public final com.tencent.mm.plugin.appbrand.service.x6 M3() {
        return this.P1;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.y
    public final void N0(xi1.g gVar) {
        if (gVar == null) {
            android.content.Context context = ((km0.c) gm0.j1.p().a()).f308989c;
            com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0Var = this.f86920l2;
            if (r0Var.f87645d == context && r0Var == getWindowAndroid()) {
                return;
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            r0Var.G(context);
            super.N0(r0Var);
            b4(context);
            c4();
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageViewWC", "setWindowAndroid, impl==null, appId:%s, url:%s, isRunning:%b, cost:%dms", getAppId(), X1(), java.lang.Boolean.valueOf(isRunning()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return;
        }
        if (gVar.compareTo(getWindowAndroid()) != 0) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            super.N0(gVar);
            if (getRuntime() != null && getRuntime().r0() != null) {
                b4(getRuntime().r0());
            }
            c4();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "setWindowAndroid changed, old:%s, new:%s, appId:%s, url:%s, cost:%dms, stack:%s", getWindowAndroid(), gVar, getAppId(), X1(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        if (!p2() || getRuntime() == null || getRuntime().r0() == null || a2() == null) {
            return;
        }
        a2().i(getRuntime().r0());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.tencent.mm.plugin.appbrand.page.v5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String N1() {
        /*
            r2 = this;
            com.tencent.mm.plugin.appbrand.o6 r0 = r2.getRuntime()
            java.lang.String r1 = "embedWxa"
            kotlin.jvm.internal.o.g(r0, r1)
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r0.u0()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.L1
            java.lang.String r1 = "halfScreenConfig"
            kotlin.jvm.internal.o.f(r0, r1)
            boolean r1 = r0.c()
            if (r1 == 0) goto L22
            k91.x2 r1 = k91.x2.f305817e
            k91.x2 r0 = r0.D
            if (r0 != r1) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 == 0) goto L28
            java.lang.String r0 = "portrait"
            return r0
        L28:
            java.lang.String r0 = super.N1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.n7.N1():java.lang.String");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void N2() {
        mi1.v vVar = getRuntime().f74821z;
        com.tencent.mm.plugin.appbrand.page.l8 l8Var = new com.tencent.mm.plugin.appbrand.page.l8(this);
        mi1.i iVar = vVar.f326704c;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("capsuleBarView");
            throw null;
        }
        iVar.getCapsuleHomeButton().setOnLongClickListener(l8Var);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_recent_use_new, 0);
        if (Ni == 2 || Ni == 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "setCapsuleOptionButtonLongClickListener for recent multi task view");
            mi1.v vVar2 = getRuntime().f74821z;
            com.tencent.mm.plugin.appbrand.page.m8 m8Var = new com.tencent.mm.plugin.appbrand.page.m8(this);
            mi1.i iVar2 = vVar2.f326704c;
            if (iVar2 != null) {
                iVar2.getOptionBtn().setOnLongClickListener(m8Var);
            } else {
                kotlin.jvm.internal.o.o("capsuleBarView");
                throw null;
            }
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b
    /* renamed from: N3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.o6 t3() {
        return (com.tencent.mm.plugin.appbrand.o6) super.t3();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void O2() {
        if (x().compareTo(getRuntime().S2(false)) != 0) {
            throw new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.ENGLISH, "onPageReady appId[%s] mismatch libReader, self[%s] runtime[%s]", getAppId(), x().W0(), getRuntime().S2(false).W0()));
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b
    /* renamed from: O3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.service.c0 v3() {
        return (com.tencent.mm.plugin.appbrand.service.c0) super.v3();
    }

    public al1.n P3() {
        return this.f86911c2;
    }

    public com.tencent.mm.plugin.appbrand.page.h9 Q3() {
        return this.f86910b2;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public android.graphics.Bitmap R1() {
        ce.g gVar = (ce.g) B1(ce.g.class);
        if (gVar == null) {
            return super.R1();
        }
        try {
            android.graphics.Bitmap d17 = ((ce.o) gVar).f40686g.getMagicBrush().f48591o.d();
            if (d17 != null) {
                android.widget.FrameLayout pageArea = getPageArea();
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (n3.x0.c(pageArea) && (d17.getWidth() < getPageArea().getWidth() || d17.getHeight() < getPageArea().getHeight())) {
                    try {
                        return android.graphics.Bitmap.createScaledBitmap(d17, getPageArea().getWidth(), getPageArea().getHeight(), false);
                    } finally {
                        d17.recycle();
                    }
                }
            }
            return d17;
        } catch (java.lang.NullPointerException | java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPageViewWC", e17, "hy: exception in get snapshot", new java.lang.Object[0]);
            return null;
        }
    }

    public final com.tencent.mm.plugin.appbrand.page.fe R3() {
        if (this.f86913e2 == null) {
            if (getRuntime() == null) {
                return null;
            }
            synchronized (this.f86912d2) {
                if (this.f86913e2 == null) {
                    this.f86913e2 = new com.tencent.mm.plugin.appbrand.page.fe(this);
                }
            }
        }
        return this.f86913e2;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void S2() {
        super.S2();
        P(new com.tencent.mm.plugin.appbrand.page.d8(this));
    }

    public com.tencent.mm.plugin.appbrand.page.w9 S3() {
        if (Q1() instanceof com.tencent.mm.plugin.appbrand.page.e7) {
            return ((com.tencent.mm.plugin.appbrand.page.e7) Q1()).h0();
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public int T1() {
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_appbrand_number_kb_send_height_event, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "getSendNumKeyboardChangeEventValue: %b", java.lang.Integer.valueOf(Ni));
        return Ni;
    }

    public final com.tencent.mm.plugin.appbrand.report.quality.l0 T3() {
        com.tencent.mm.plugin.appbrand.report.quality.l0 U3 = U3(true);
        java.util.Objects.requireNonNull(U3);
        return U3;
    }

    public final com.tencent.mm.plugin.appbrand.report.quality.l0 U3(boolean z17) {
        com.tencent.mm.plugin.appbrand.report.quality.l0[] l0VarArr = this.f86914f2;
        if (l0VarArr[0] == null) {
            synchronized (l0VarArr) {
                com.tencent.mm.plugin.appbrand.report.quality.l0[] l0VarArr2 = this.f86914f2;
                if (l0VarArr2[0] == null) {
                    if (!z17) {
                        return null;
                    }
                    l0VarArr2[0] = new com.tencent.mm.plugin.appbrand.report.quality.l0(this);
                }
            }
        }
        return this.f86914f2[0];
    }

    public final void V3() {
        com.tencent.mm.plugin.appbrand.page.h3 h3Var = this.f86909a2;
        if (h3Var != null) {
            h3Var.d();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void W2() {
        gf.a2 f07;
        df.w1 t17;
        df.a0 a0Var;
        com.tencent.mm.plugin.appbrand.page.d7 Q1 = Q1();
        if (!(Q1 instanceof gf.d0) || (f07 = ((gf.d0) Q1).f0()) == null || (t17 = f07.t()) == null || (a0Var = t17.f229585i) == null) {
            return;
        }
        a0Var.e();
    }

    public void W3() {
        if (!p2()) {
            if (Q1() instanceof com.tencent.mm.plugin.appbrand.page.wc) {
                com.tencent.mm.plugin.appbrand.page.wc wcVar = (com.tencent.mm.plugin.appbrand.page.wc) Q1();
                if (wcVar.F) {
                    return;
                }
                wcVar.P("WARemoteDebug.js", ((com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader) ((com.tencent.luggage.sdk.jsapi.component.b) wcVar.F()).q(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.class)).M("WARemoteDebug.js"));
                wcVar.F = true;
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.service.c0 U1 = U1();
        if (U1 == null || !(U1.A1() instanceof com.tencent.luggage.sdk.jsapi.component.service.n)) {
            return;
        }
        com.tencent.luggage.sdk.jsapi.component.service.n nVar = (com.tencent.luggage.sdk.jsapi.component.service.n) U1.A1();
        if (nVar.f47484w) {
            return;
        }
        if (nVar.F() == null || ((com.tencent.luggage.sdk.jsapi.component.service.y) nVar.F()).getF147808e() == null) {
            com.tencent.mars.xlog.Log.w("Luggage.AppBrandMiniProgramServiceLogicImp", "injectRemoteDebugScriptToServiceIfNeeded: component or jsRuntime is null");
            return;
        }
        java.lang.String M = ((com.tencent.luggage.sdk.jsapi.component.service.y) nVar.F()).x().M("WAServiceRemoteDebug.js");
        if (android.text.TextUtils.isEmpty(M)) {
            com.tencent.mars.xlog.Log.w("Luggage.AppBrandMiniProgramServiceLogicImp", "injectRemoteDebugScriptToServiceIfNeeded: WAServiceRemoteDebug.js is null or empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandMiniProgramServiceLogicImp", "injectRemoteDebugScriptToServiceIfNeeded: injecting WAServiceRemoteDebug.js, length: %d", java.lang.Integer.valueOf(M.length()));
        ((com.tencent.luggage.sdk.jsapi.component.service.y) nVar.F()).getF147808e().evaluateJavascript(M, null);
        nVar.f47484w = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void X0(io.flutter.embedding.android.RenderMode renderMode, java.lang.Runnable runnable, long j17) {
        gf.o1 a17;
        df.a0 a0Var;
        if (p2()) {
            com.tencent.mm.plugin.appbrand.page.e8 e8Var = new com.tencent.mm.plugin.appbrand.page.e8(this, renderMode, runnable);
            com.tencent.mm.plugin.appbrand.o6 runtime = getRuntime();
            gf.m1 m1Var = gf.o1.f271155b;
            synchronized (gf.o1.class) {
                a17 = gf.o1.f271155b.a(runtime);
            }
            int b27 = b2();
            kotlin.jvm.internal.o.g(renderMode, "renderMode");
            df.w1 w1Var = (df.w1) a17.f271157a.get(b27);
            if (w1Var != null && (a0Var = w1Var.f229585i) != null) {
                a0Var.d(renderMode, e8Var);
            }
            R0(e8Var, j17);
        }
    }

    public boolean X3() {
        return this.f86917i2;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void Y0() {
        super.Y0();
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.O1;
        com.tencent.mm.plugin.appbrand.report.v0.g(o6Var == null ? "" : o6Var.f74803n, X1(), 1);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void Y2(boolean z17) {
        gf.a2 f07;
        df.w1 t17;
        if (!p2() || (f07 = ((gf.d0) Q1()).f0()) == null || (t17 = f07.t()) == null) {
            return;
        }
        t17.u(z17);
    }

    public final void Y3(java.util.List list, java.lang.Runnable runnable, final java.lang.Runnable runnable2, boolean z17) {
        com.tencent.mm.plugin.appbrand.page.h3 h3Var = this.f86909a2;
        if (h3Var != null) {
            h3Var.d();
        }
        this.f86917i2 = z17;
        com.tencent.mm.plugin.appbrand.page.h3 h3Var2 = new com.tencent.mm.plugin.appbrand.page.h3(this, list);
        this.f86909a2 = h3Var2;
        if (runnable != null) {
            ((java.util.HashSet) h3Var2.f86516i).add(runnable);
        }
        com.tencent.mm.plugin.appbrand.page.h3 h3Var3 = this.f86909a2;
        ((java.util.HashSet) h3Var3.f86517m).add(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.n7$$c
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.page.n7 n7Var = com.tencent.mm.plugin.appbrand.page.n7.this;
                java.lang.Runnable runnable3 = runnable2;
                if (runnable3 != null) {
                    n7Var.getClass();
                    runnable3.run();
                }
                n7Var.f86909a2 = null;
            }
        });
        this.f86909a2.g();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void Z0(com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        super.Z0(wdVar);
        k91.f M1 = M1();
        boolean a17 = getRuntime().X1.a(this, com.tencent.luggage.sdk.jsapi.component.k.class);
        super.b3((M1.f305717f && a17) ? false : true, al1.h0.PageConfig);
        if (a17 && M1.f305717f && getRuntime().u0().f47284z == 7 && !r1().f5746w) {
            zl1.v vVar = new zl1.v(M1.f305716e, new com.tencent.mm.plugin.appbrand.page.u7(this));
            vVar.f473631f = new com.tencent.mm.plugin.appbrand.page.w7(this);
            vVar.b();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "hasPermission:" + a17 + " navigationBarRightButtonHide:" + M1.f305717f + " appServiceType:" + getRuntime().u0().f47284z + " isFullscreenMode:" + r1().f5746w);
        }
        if (com.tencent.mm.plugin.appbrand.kf.a(getRuntime())) {
            T0(new com.tencent.mm.plugin.appbrand.page.x7(this));
        } else {
            com.tencent.mm.plugin.appbrand.weishi.c.a(getRuntime());
            if (getRuntime() != null && getRuntime().e3()) {
                Z3();
            }
        }
        getRuntime().H2.v(this, wdVar);
    }

    public final void Z3() {
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = getRuntime().u0().L1;
        if (halfScreenConfig.c() && !halfScreenConfig.B && getRuntime().x0().getPageCount() == 1) {
            r1().setNavHidden(true);
        } else {
            r1().setNavHidden(false);
        }
    }

    public void a4(com.tencent.mm.plugin.appbrand.page.la laVar) {
        if (Q1() instanceof com.tencent.mm.plugin.appbrand.page.e7) {
            ((com.tencent.mm.plugin.appbrand.page.e7) Q1()).K.remove(laVar);
            return;
        }
        if (Q1() instanceof gf.d0) {
            if ("wxca8d4b8e8feedc2a".equals(getRuntime().f74803n)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageViewWC", "removeOverScrolledListener ignore, miniStore");
                return;
            }
            gf.d0 d0Var = (gf.d0) Q1();
            d0Var.getClass();
            com.tencent.mars.xlog.Log.i("Luggage.MPPageRendererSkylineImpl", "removeOverScrolledListener l:%s", laVar);
            java.util.Set set = d0Var.H;
            set.remove(laVar);
            if (set.isEmpty()) {
                d0Var.g0().listenRootScrollViewChange(((com.tencent.luggage.sdk.jsapi.component.b) d0Var.F()).b2());
                com.tencent.skyline.SkylineRuntime g07 = d0Var.g0();
                if (g07 != null) {
                    int b27 = ((com.tencent.luggage.sdk.jsapi.component.b) d0Var.F()).b2();
                    com.tencent.mars.xlog.Log.i("Luggage.MPPageRendererSkylineImpl", "skylineRuntime:%s windowId:%d", g07, java.lang.Integer.valueOf(b27));
                    g07.removeSkylineScrollViewChange(b27, d0Var.I);
                }
            }
        }
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5
    public void b3(boolean z17, al1.h0 h0Var) {
        if (!k01.j.f303039a.b(null, getAppId())) {
            super.b3(z17, h0Var);
        } else {
            m(new com.tencent.mm.plugin.appbrand.page.c8(this, z17));
            super.b3(false, al1.h0.LiteGame);
        }
    }

    public final void b4(android.content.Context context) {
        com.tencent.mm.plugin.appbrand.page.l lVar;
        al1.l lVar2 = this.G;
        if (lVar2 != null) {
            lVar2.D(context);
        }
        al1.b bVar = this.H;
        if (bVar != null && (bVar.getContext() instanceof android.content.MutableContextWrapper)) {
            ((android.content.MutableContextWrapper) this.H.getContext()).setBaseContext(context);
        }
        java.util.Iterator it = this.f87166x1.iterator();
        while (it.hasNext()) {
            pf1.q qVar = (pf1.q) ((pf1.c) it.next());
            if (context == null) {
                qVar.getClass();
            } else {
                qVar.getContext().setBaseContext(context);
            }
        }
        if ((Q1() instanceof com.tencent.mm.plugin.appbrand.page.a) && (lVar = ((com.tencent.mm.plugin.appbrand.page.a) Q1()).f86381s) != null) {
            lVar.setBaseContext(context);
        }
        if (Q1() instanceof ce.o) {
            ce.o oVar = (ce.o) Q1();
            if (oVar.f40685f != null) {
                android.app.Activity a17 = q75.a.a(context);
                if (a17 != null) {
                    oVar.f40685f.f47260e = a17;
                } else {
                    oVar.f40685f.f47260e = null;
                }
                ce.y yVar = oVar.f40697u;
                if (yVar != null) {
                    kotlin.jvm.internal.o.g(context, "context");
                    pa1.t b17 = ((com.tencent.mm.minigame.f0) yVar).b();
                    if (b17 == null) {
                        com.tencent.mars.xlog.Log.w("WVA.WVAActivityDelegate", "resetContext, getRenderer is null");
                    } else {
                        if (b17.f40685f.f47260e != null) {
                            com.tencent.mars.xlog.Log.i("WVA.WVAActivityDelegate", "WVA.resetContext: activity attached");
                            android.app.Activity a18 = q75.a.a(context);
                            if (a18 == null) {
                                throw new java.lang.IllegalStateException("WVA.resetContext: Renderer said attached, but activity is null");
                            }
                            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.tencent.mm.minigame.d0(a18));
                        } else {
                            com.tencent.mars.xlog.Log.w("WVA.WVAActivityDelegate", "WVA.resetContext: activity removed");
                        }
                    }
                }
            }
        }
        if (a2() != null) {
            a2().i(context);
        }
        of1.w1 s37 = s3();
        if (s37 != null) {
            s37.i(context);
        }
    }

    public final void c4() {
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer;
        com.tencent.mm.plugin.appbrand.page.d7 Q1 = Q1();
        if (Q1 != null && (customViewContainer = Q1.getCustomViewContainer()) != null) {
            xi1.m C1 = C1();
            customViewContainer.f86764h = C1;
            C1.d(new com.tencent.mm.plugin.appbrand.page.z9(customViewContainer));
        }
        if (a2() != null) {
            a2().setFullscreenImpl(C1());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void d2() {
        super.d2();
        if (a2() == null || this.N == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.O1;
        com.tencent.mm.plugin.appbrand.report.v0.g(o6Var == null ? "" : o6Var.f74803n, X1(), 2);
    }

    public void d4() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "restoreSkylineViewOnPause");
        if (l2()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageViewWC", "restoreSkylineViewOnPause ignore");
            return;
        }
        if (Q1() instanceof gf.d0) {
            gf.d0 d0Var = (gf.d0) Q1();
            if (d0Var.f0() != null) {
                gf.a2 f07 = d0Var.f0();
                f07.f271020o = false;
                df.w1 t17 = f07.t();
                if (t17 != null) {
                    t17.t(f07.f271016h);
                }
            }
        }
    }

    public void e4(boolean z17) {
        f4(z17, qi1.a.f363479d);
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5
    public void f2(android.content.Context context, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandPageViewProfile| init start");
        com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime;
        this.O1 = o6Var;
        if (x() == null) {
            L0(o6Var.S2(false));
        }
        super.f2(context, appBrandRuntime);
        if (rh1.b.f395624a && !p2()) {
            G3(new com.tencent.mm.plugin.appbrand.page.g8(this));
        }
        r1().setCloseButtonClickListener(new com.tencent.mm.plugin.appbrand.page.h8(this));
        if (appBrandRuntime.I1 && ((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).e3()) {
            r1().setNavButtonLongClickListener(new com.tencent.mm.plugin.appbrand.page.i8(this));
        }
        if (appBrandRuntime.N0()) {
            setInterceptor(new com.tencent.mm.plugin.appbrand.wxassistant.b((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime, this));
        } else {
            setInterceptor(new si1.a((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime, this));
        }
        R(new com.tencent.mm.plugin.appbrand.jsapi.v() { // from class: com.tencent.mm.plugin.appbrand.page.n7$$a
            @Override // com.tencent.mm.plugin.appbrand.jsapi.v
            public final void c() {
                com.tencent.mm.plugin.appbrand.page.n7 n7Var = com.tencent.mm.plugin.appbrand.page.n7.this;
                com.tencent.mm.plugin.appbrand.report.quality.l0 U3 = n7Var.U3(false);
                if (U3 != null) {
                    if ((U3.f88218b || U3.f88219c) && !U3.f88220d) {
                        com.tencent.mm.plugin.appbrand.report.quality.h1 h1Var = n7Var.getRuntime().R2;
                        com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var = h1Var == null ? null : h1Var.f88202d;
                        if (d1Var != null) {
                            try {
                                if (d1Var.f88163b && !d1Var.c(n7Var)) {
                                    d1Var.b(n7Var, com.tencent.mm.plugin.appbrand.report.quality.j0.f88212g, 0L);
                                }
                            } finally {
                                U3.f88220d = true;
                            }
                        }
                    }
                }
            }
        });
        P(new com.tencent.mm.plugin.appbrand.jsapi.a0() { // from class: com.tencent.mm.plugin.appbrand.page.n7$$b
            @Override // com.tencent.mm.plugin.appbrand.jsapi.a0
            public final void onReady() {
                com.tencent.mm.plugin.appbrand.page.n7 n7Var = com.tencent.mm.plugin.appbrand.page.n7.this;
                com.tencent.mm.plugin.appbrand.report.quality.h1 h1Var = n7Var.getRuntime().R2;
                com.tencent.mm.plugin.appbrand.report.quality.d1 d1Var = h1Var == null ? null : h1Var.f88202d;
                if (d1Var == null || !d1Var.f88163b || d1Var.c(n7Var)) {
                    return;
                }
                d1Var.b(n7Var, com.tencent.mm.plugin.appbrand.report.quality.j0.f88210e, n7Var.s3() != null ? d1Var.f88166e : d1Var.f88165d);
            }
        });
        com.tencent.mm.plugin.appbrand.page.o1.a(getAppId());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandPageViewProfile| init end");
    }

    public void f4(boolean z17, qi1.a fixedSizeMode) {
        boolean booleanValue;
        gf.a2 f07;
        com.tencent.mm.plugin.appbrand.page.w9 S3 = S3();
        if (S3 instanceof com.tencent.mm.plugin.appbrand.page.x) {
            com.tencent.mm.plugin.appbrand.page.x xVar = (com.tencent.mm.plugin.appbrand.page.x) S3;
            xVar.getClass();
            kotlin.jvm.internal.o.g(fixedSizeMode, "fixedSizeMode");
            if (xVar.T()) {
                qi1.d dVar = xVar.f87239J;
                dVar.setEnableFixSize(z17);
                dVar.setFixedSizeMode(fixedSizeMode);
            }
        }
        java.lang.Boolean bool = mj1.b.f327008h;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            mj1.b.f327008h = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_disable_skyline_drag_opt, 0) == 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.SkylineABTest", "disableSkylineDragOpt: " + mj1.b.f327008h);
            java.lang.Boolean bool2 = mj1.b.f327008h;
            kotlin.jvm.internal.o.d(bool2);
            booleanValue = bool2.booleanValue();
        }
        if (booleanValue || !(Q1() instanceof gf.d0) || (f07 = ((gf.d0) Q1()).f0()) == null) {
            return;
        }
        if (!z17 || fixedSizeMode != qi1.a.f363480e) {
            f07.y(false, 0);
            return;
        }
        int K3 = K3(getContentView());
        if (K3 > 0) {
            f07.y(true, K3);
        }
    }

    public void g4(java.lang.String str) {
        this.f86916h2 = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public com.tencent.mm.plugin.appbrand.page.m h1() {
        return new com.tencent.mm.plugin.appbrand.page.n(this);
    }

    public void h4(java.lang.String str) {
        if (r1() != null && str != null) {
            this.f86911c2.setMainTitle(str);
        }
        this.f86911c2.f5793f.f352870f.setVisibility(4);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public boolean i2() {
        int i17 = this.f86915g2;
        if (i17 == 0) {
            return false;
        }
        if (i17 == 1) {
            return true;
        }
        boolean H3 = H3(getRuntime());
        this.f86915g2 = H3 ? 1 : 0;
        return H3;
    }

    public final void i4(com.tencent.mm.plugin.appbrand.service.x6 x6Var) {
        this.P1 = x6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public final java.util.List<com.tencent.mm.plugin.appbrand.menu.u0> j1() {
        r45.fe0 fe0Var;
        r45.fe0 fe0Var2 = null;
        if (k01.j.f303039a.b(null, getAppId())) {
            java.lang.String appId = getAppId();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 3, true, true);
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 4, true, true);
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 23, false, false);
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 24, false, false);
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 27, false, false);
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 25, false, false);
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 35, false, false);
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 36, false, false);
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 26, false, false);
            java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.page.o1.f86938g;
            synchronized (hashMap) {
                if (hashMap.containsKey(appId)) {
                    fe0Var2 = (r45.fe0) hashMap.get(appId);
                } else {
                    com.tencent.mm.plugin.appbrand.page.o1.a(appId);
                }
            }
            if (fe0Var2 != null && fe0Var2.f374250d) {
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList, 40, false, false);
            }
            this.X1 = linkedList;
            return linkedList;
        }
        if (com.tencent.mm.plugin.appbrand.kf.a(getRuntime())) {
            int i17 = getRuntime().u0().f47284z;
            int i18 = getRuntime().u0().N1;
            getAppId();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (i18 != 0) {
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 13, true, false);
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 24, true, false);
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 34, true, false);
            } else {
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 3, true, true);
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 4, true, true);
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 28, true, false);
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 31, true, true);
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 13, false, false);
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 24, false, false);
                com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 34, false, false);
                if (i17 == 4) {
                    com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList2, 25, false, false);
                }
            }
            this.X1 = linkedList2;
            return linkedList2;
        }
        java.lang.String appId2 = getAppId();
        boolean Di = ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).Di();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 3, true, true);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 4, true, true);
        if (Di) {
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 39, true, false);
        }
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 28, true, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 29, true, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 12, true, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 32, true, false);
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC e17 = com.tencent.mm.plugin.appbrand.l.e(appId2);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 11, true, !z65.c.a() && (e17 == null || e17.f305852r.f75399d == 1));
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 31, true, true);
        if (((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Di()) {
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 22, false, false);
        }
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 33, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 0, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 2, false, false);
        if (!Di) {
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 39, false, false);
        }
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 23, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 24, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 34, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 27, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 30, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 37, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 38, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 25, false, false);
        com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 26, false, false);
        java.util.HashMap hashMap2 = com.tencent.mm.plugin.appbrand.page.o1.f86938g;
        synchronized (hashMap2) {
            if (hashMap2.containsKey(appId2)) {
                fe0Var = (r45.fe0) hashMap2.get(appId2);
            } else {
                com.tencent.mm.plugin.appbrand.page.o1.a(appId2);
                fe0Var = null;
            }
        }
        if (fe0Var != null && fe0Var.f374250d) {
            com.tencent.mm.plugin.appbrand.menu.l1.a(linkedList3, 40, false, false);
        }
        this.X1 = linkedList3;
        return linkedList3;
    }

    public final void j4(boolean z17) {
        G1();
        java.util.List list = this.X1;
        if (list == null || ((java.util.LinkedList) list).size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPageViewWC", "showPageActionSheet appId[%s], url[%s], empty list skip", getAppId(), X1());
        } else {
            Y3(this.X1, null, null, z17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public android.view.View k1(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.O1;
        if (o6Var == null || !com.tencent.mm.plugin.appbrand.kf.a(o6Var) || !(viewGroup instanceof android.widget.RelativeLayout) || this.O1.u0().N1 != 0) {
            return null;
        }
        if (this.f86910b2 == null) {
            this.f86910b2 = new com.tencent.mm.plugin.appbrand.page.h9(this.O1.f74795d);
        }
        this.f86910b2.setJumpBtnOnClickListener(new com.tencent.mm.plugin.appbrand.page.j8(this));
        this.f86910b2.c(this.O1.u0().f77280f, this.O1.u0().f77279e, com.tencent.mm.plugin.appbrand.appcache.p.a(this.O1.E0().f305852r.f75399d), this.O1.u0());
        if (k01.j.f303039a.b(this.O1.n0(), this.O1.f74803n) && this.O1.u0().C1 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "set single litegame info");
            this.f86910b2.setLiteGameInfo(this.O1.u0().C1.f77204e);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.topMargin = -getF147807d().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480087nu);
        viewGroup.addView(this.f86910b2, layoutParams);
        return this.f86910b2;
    }

    public void k4() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "skipSkylineViewOnPauseOnce");
        if (Q1() instanceof gf.d0) {
            gf.d0 d0Var = (gf.d0) Q1();
            if (d0Var.f0() != null) {
                d0Var.f0().f271020o = true;
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void l3() {
        com.tencent.mm.plugin.appbrand.page.d7 Q1 = Q1();
        if (Q1 instanceof gf.d0) {
            ((gf.d0) Q1).f0().f271019n = true;
        }
    }

    public void l4() {
        boolean z17;
        java.lang.String str;
        boolean z18 = true;
        if (r1() != null) {
            r1().setVisibility(4);
            r1().l(false, al1.h0.PageConfig);
            r1().m(false);
            if (r1().f5746w) {
                str = getRuntime().m0().c(X1()).f305726o.f305652a;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = getRuntime().m0().a().f305726o.f305652a;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = "float";
                }
            } else {
                str = "squeezed";
            }
            p1(!"squeezed".equals(str));
            r1().setFullscreenMode(false);
        }
        if (this.f86911c2 == null) {
            java.lang.String str2 = getRuntime().m0().c(X1()).f305726o.f305655d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                if (this.f86918j2 == null) {
                    this.f86918j2 = java.lang.Boolean.valueOf(com.tencent.mm.ui.bk.C());
                }
                z17 = this.f86918j2.booleanValue();
            } else {
                z17 = !"BLACK".equalsIgnoreCase(str2);
            }
            if (!z17 && !getRuntime().r2()) {
                z18 = false;
            }
            this.f86911c2 = (al1.n) A1().a(getF147807d(), al1.n.class);
            s1().removeAllViews();
            s1().addView(this.f86911c2, new android.view.ViewGroup.LayoutParams(-1, -1));
            s1().setStatusBarForegroundStyle(!z18);
            al1.n nVar = this.f86911c2;
            nVar.setBackgroundColor(z18 ? nVar.getContext().getResources().getColor(com.tencent.mm.R.color.f11do) : nVar.getContext().getResources().getColor(com.tencent.mm.R.color.f478670dp));
            nVar.setForegroundColor(z18 ? -1 : -16777216);
            p91.a aVar = nVar.f5793f;
            aVar.f352866b.setImageDrawable(m95.a.e(nVar.getContext().getResources(), z18 ? com.tencent.mm.R.raw.actionbar_icon_light_close : com.tencent.mm.R.raw.actionbar_icon_dark_close, 0.0f));
            aVar.f352870f.setImageDrawable(m95.a.e(nVar.getContext().getResources(), z18 ? com.tencent.mm.R.raw.actionbar_icon_light_more : com.tencent.mm.R.raw.actionbar_icon_dark_more, 0.0f));
            aVar.f352873i.setTextColor(z18 ? -1 : -16777216);
            this.f86911c2.setOptionButtonClickListener(new com.tencent.mm.plugin.appbrand.page.y7(this));
            this.f86911c2.setCloseButtonClickListener(new com.tencent.mm.plugin.appbrand.page.a8(this));
            if (r1() != null) {
                this.f86911c2.setMainTitle(r1().getMainTitle());
            }
            if (getRuntime().u0().N1 == 0) {
                k91.k kVar = getRuntime().m0().c(X1()).f305726o;
                java.lang.String str3 = kVar.f305653b;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    try {
                        this.f86911c2.setBackgroundColor(ik1.w.l(str3));
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPageViewWC", "decorateSinglePageModeNavigationBarFromPageConfig color parse error");
                    }
                }
                double d17 = kVar.f305654c;
                if (d17 >= 0.0d) {
                    this.f86911c2.setBackgroundAlpha(d17);
                }
                java.lang.String str4 = kVar.f305656e;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    return;
                }
                this.f86911c2.setMainTitle(str4);
                return;
            }
            if (getRuntime().E0() != null) {
                java.lang.String str5 = getRuntime().E0().D;
                l75.e0 e0Var = com.tencent.mm.plugin.appbrand.launching.k9.K;
                java.lang.String str6 = null;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    try {
                        str6 = new org.json.JSONObject(str5).getJSONObject("op_info").getString("singlepage_tips");
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.LaunchWxaAppInfo", "parseActionBarSecurityTipsWording e:%s", e17);
                    }
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                    this.f86911c2.setSecurityTipsTitle(str6);
                }
            }
            if ((getRuntime().u0().N1 & 2) == 2) {
                al1.n nVar2 = this.f86911c2;
                p91.a aVar2 = nVar2.f5793f;
                aVar2.f352874j.setVisibility(8);
                aVar2.f352872h.setVisibility(0);
                aVar2.f352867c.setVisibility(0);
                aVar2.f352871g.getLayoutParams().height = nVar2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480023lw);
            } else {
                al1.n nVar3 = this.f86911c2;
                p91.a aVar3 = nVar3.f5793f;
                aVar3.f352874j.setVisibility(8);
                aVar3.f352872h.setVisibility(0);
                aVar3.f352867c.setVisibility(8);
                aVar3.f352871g.getLayoutParams().height = nVar3.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480022lv);
            }
            this.f86911c2.setForwardOnClickListener(new com.tencent.mm.plugin.appbrand.page.b8(this));
            java.lang.String str7 = this.O1.E0().f47295v;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                str7 = this.O1.n0();
                if (str7.length() > 5) {
                    str7 = java.lang.String.format("%s...", str7.substring(0, 4));
                }
            }
            this.f86911c2.setForwardText(getF147807d().getString(com.tencent.mm.R.string.f490666a55, str7));
        }
    }

    public void m4(android.view.View view, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "tryEnableMultiTaskView");
        if (!com.tencent.mm.plugin.appbrand.widget.recent.y0.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandTaskView is disable");
            return;
        }
        if (getRuntime().e3() || v1() == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "can enable MultiTaskView");
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer appBrandTaskContainer = new com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskContainer(v1());
        this.S1 = appBrandTaskContainer;
        appBrandTaskContainer.setSceneFactory(new com.tencent.mm.plugin.appbrand.page.r7(this));
        al1.p0 p0Var = new al1.p0(getF147807d());
        this.R1 = p0Var;
        p0Var.setWidth(-1);
        this.R1.setHeight(-1);
        android.graphics.Bitmap H2 = getRuntime().H2(false);
        if (H2 == null || H2.isRecycled()) {
            this.R1.setBackgroundDrawable(i65.a.i(getF147807d(), com.tencent.mm.R.drawable.btm));
        } else {
            android.graphics.Bitmap X = com.tencent.mm.sdk.platformtools.x.X(H2, 200);
            if (X != null && !X.isRecycled()) {
                this.R1.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(getF147807d().getResources(), X));
            }
        }
        this.R1.setOnDismissListener(new com.tencent.mm.plugin.appbrand.page.s7(this));
        this.S1.b();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.R1.b(this.S1, layoutParams);
        this.S1.setTaskViewListener(new com.tencent.mm.plugin.appbrand.page.t7(this, view, i17));
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.m, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getF147807d();
    }

    public void n4() {
        ((com.tencent.mm.plugin.appbrand.widget.recent.d2) i95.n0.c(com.tencent.mm.plugin.appbrand.widget.recent.d2.class)).getClass();
        if (getRuntime().e3()) {
            return;
        }
        try {
            com.tencent.mm.plugin.appbrand.widget.recent.d2 d2Var = (com.tencent.mm.plugin.appbrand.widget.recent.d2) i95.n0.c(com.tencent.mm.plugin.appbrand.widget.recent.d2.class);
            android.content.Context f147807d = getF147807d();
            com.tencent.mm.plugin.appbrand.page.o7 o7Var = new com.tencent.mm.plugin.appbrand.page.o7(this);
            ((com.tencent.mm.plugin.appbrand.widget.recent.m0) d2Var).getClass();
            com.tencent.mm.plugin.appbrand.widget.recent.MenuAppBrandRecentView menuAppBrandRecentView = new com.tencent.mm.plugin.appbrand.widget.recent.MenuAppBrandRecentView(f147807d);
            menuAppBrandRecentView.setSceneFactory(o7Var);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, (int) f147807d.getResources().getDimension(com.tencent.mm.R.dimen.f480082ni));
            menuAppBrandRecentView.setPadding(0, (int) f147807d.getResources().getDimension(com.tencent.mm.R.dimen.f480083nj), 0, 0);
            menuAppBrandRecentView.setLayoutParams(layoutParams);
            this.Q1 = menuAppBrandRecentView;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPageViewWC", e17, "appId[%s]", getAppId());
        }
        if (this.Q1 == null) {
            return;
        }
        al1.p0 p0Var = new al1.p0(getF147807d());
        this.R1 = p0Var;
        p0Var.setWidth(-1);
        this.R1.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable());
        this.Q1.g1();
        this.R1.setHeight(this.Q1.getLayoutParams().height);
        this.Q1.setBackground(i65.a.i(getF147807d(), com.tencent.mm.R.drawable.f480789cn));
        this.R1.setContentView(this.Q1);
        this.Q1.setOnItemClickListener(new com.tencent.mm.plugin.appbrand.page.q7(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public boolean o2() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = t3();
        if (t37 != null) {
            return (t37 instanceof com.tencent.mm.plugin.appbrand.o6) && com.tencent.mm.plugin.appbrand.kf.a((com.tencent.mm.plugin.appbrand.o6) t37);
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void o3() {
        gf.o1 a17;
        df.a0 a0Var;
        if (p2()) {
            com.tencent.mm.plugin.appbrand.o6 runtime = getRuntime();
            gf.m1 m1Var = gf.o1.f271155b;
            synchronized (gf.o1.class) {
                a17 = gf.o1.f271155b.a(runtime);
            }
            df.w1 w1Var = (df.w1) a17.f271157a.get(b2());
            if (w1Var == null || (a0Var = w1Var.f229585i) == null) {
                return;
            }
            a0Var.h(false);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public final boolean p2() {
        return Q1() instanceof gf.d0;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public java.lang.String q0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, int i18) {
        si1.a aVar = getInterceptor() instanceof si1.a ? (si1.a) getInterceptor() : null;
        boolean z18 = aVar != null && aVar.h(str, i17);
        try {
            return super.q0(str, str2, str3, i17, z17, c0Var, i18);
        } finally {
            if (z18) {
                aVar.g(str, i17);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public boolean q2() {
        com.tencent.mm.plugin.appbrand.service.c0 U1;
        com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl;
        if (!p2() || (U1 = U1()) == null || (appServiceSkylineExtensionImpl = (com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl) U1.z1(com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl.class)) == null) {
            return false;
        }
        int b27 = b2();
        int componentId = getComponentId();
        java.util.LinkedList linkedList = (java.util.LinkedList) appServiceSkylineExtensionImpl.f47709e.get(b27);
        return linkedList != null && linkedList.indexOf(java.lang.Integer.valueOf(componentId)) > 0;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5
    public final boolean r2(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandPageViewProfile| loadURL appId:%s, url:%s, stack:%s", getAppId(), str, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        N0(getRuntime().getWindowAndroid());
        return super.r2(j17, str, wdVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public boolean u2() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.O1;
        if (o6Var == null || !com.tencent.mm.plugin.appbrand.kf.a(o6Var)) {
            return super.u2();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "SinglePageModeLogic onBackPressed");
        com.tencent.mm.plugin.appbrand.x0.g(getAppId(), com.tencent.mm.plugin.appbrand.w0.BACK);
        this.O1.S();
        return true;
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b, com.tencent.mm.plugin.appbrand.page.v5, com.tencent.mm.plugin.appbrand.page.r, com.tencent.mm.plugin.appbrand.y, com.tencent.mm.plugin.appbrand.jsapi.e0, com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.m
    public void v0() {
        if (com.tencent.mm.plugin.appbrand.jsruntime.m1.e(this) && !p2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "page initNativeTransLogic");
            if (hm1.n.f282218a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.XWebNativeTransInitLogic", "bind already");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.XWebNativeTransInitLogic", "bind");
                cl.x.a();
                java.lang.String[] strArr = {java.lang.String.valueOf(com.eclipsesource.mmv8.V8.getNativeTransManager())};
                try {
                    tx5.h b17 = tx5.j.b(com.tencent.xweb.WebView.getCurrentModuleWebCoreType());
                    if (b17 == null) {
                        by5.c4.c("XWebViewProviderWrapper", "Invoke current runtime native failed, core is null.");
                    } else {
                        b17.invokeNativeChannel(30003, strArr);
                    }
                } catch (java.lang.Throwable unused) {
                    by5.c4.c("XWebViewProviderWrapper", "Invoke current runtime native failed. [cmd:30003][params:" + java.util.Arrays.toString(strArr) + "]");
                }
                hm1.n.f282218a = true;
            }
            com.tencent.mm.plugin.appbrand.jsruntime.t f147808e = getF147808e();
            final int componentId = getComponentId();
            final java.lang.String appId = getAppId();
            com.tencent.mars.xlog.Log.i("Luggage.NativeTransLogic", "enableXwebNativeTrans componentId:%s ,appId:%s , stack:%s", java.lang.Integer.valueOf(componentId), appId, android.util.Log.getStackTraceString(new java.lang.Throwable()));
            f147808e.evaluateJavascript("xweb.enableNativeTrans()", null);
            f147808e.evaluateJavascript(";(function(){ return typeof ntrans })();", new android.webkit.ValueCallback() { // from class: com.tencent.mm.plugin.appbrand.jsruntime.m1$$b
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    com.tencent.mars.xlog.Log.i("Luggage.NativeTransLogic", "enableXwebNativeTrans componentId:%s, appId:%s, typeof ntrans:%s", java.lang.Integer.valueOf(componentId), appId, (java.lang.String) obj);
                }
            });
            com.tencent.mm.plugin.appbrand.jsruntime.m1.a(getF147808e(), getComponentId(), getAppId());
        }
        com.tencent.mm.plugin.appbrand.wxassistant.c3 c3Var = com.tencent.mm.plugin.appbrand.wxassistant.c3.f92150a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            getF147808e().addJavascriptInterface(new com.tencent.mm.plugin.appbrand.wxassistant.cdp.f3(), "__AndroidPromiseBridge");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void w2(int i17) {
        super.w2(i17);
        com.tencent.mm.plugin.appbrand.page.w9 S3 = S3();
        if (S3 == null || android.os.Build.VERSION.SDK_INT != 27) {
            return;
        }
        S3.setBackgroundColor(i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public void x2(android.content.res.Configuration configuration) {
        super.x2(configuration);
        com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskView appBrandTaskView = this.S1;
        if (appBrandTaskView != null) {
            appBrandTaskView.dispatchConfigurationChanged(configuration);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.e0
    public void y0(org.json.JSONObject jSONObject) {
        super.y0(jSONObject);
        K0(jSONObject, "clientVersion", java.lang.Integer.valueOf(o45.wf.f343029g));
        hm1.m mVar = hm1.m.f282203a;
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebVideo", java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "XWebVideoMinVersion", 300);
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "supportXWebTouch", java.lang.Boolean.valueOf(com.tencent.xweb.a3.m()));
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebMap", java.lang.Boolean.valueOf(hm1.m.d()));
        boolean m17 = com.tencent.xweb.a3.m();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.XWebABTests", "openXWebSameLayerRendering for Live:%b", java.lang.Boolean.valueOf(m17));
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebLive", java.lang.Boolean.valueOf(m17));
        hm1.m mVar2 = hm1.m.f282203a;
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "abtestXWebCameraEnable", java.lang.Boolean.valueOf(mVar2.a()));
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebCamera", java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) hm1.m.f282212j).getValue()).booleanValue()));
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebTextarea", java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) hm1.m.f282208f).getValue()).booleanValue()));
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "supportXWebTextarea", java.lang.Boolean.valueOf(mVar2.c()));
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebInput", java.lang.Boolean.valueOf(((java.lang.Boolean) ((jz5.n) hm1.m.f282210h).getValue()).booleanValue()));
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "supportXWebInput", java.lang.Boolean.valueOf(mVar2.b()));
        com.tencent.mm.plugin.appbrand.extendplugin.a.a(jSONObject, "useXWebVoipRoom", java.lang.Boolean.valueOf(hm1.m.e()));
        K0(jSONObject, "useXWebWebGLCanvas", java.lang.Boolean.valueOf(hm1.m.f()));
        K0(jSONObject, "useSkiaCanvasRaf", java.lang.Boolean.valueOf(hm1.m.h()));
        K0(jSONObject, "useNewXWebCanvasToTFP", java.lang.Boolean.valueOf(hm1.m.g()));
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public final android.view.View y2() {
        return z2(getF147807d());
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.b
    public final void y3() {
        super.y3();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.v5
    public android.view.View z2(android.content.Context context) {
        if (com.tencent.mm.plugin.appbrand.kf.a(getRuntime()) || k01.j.f303039a.b(null, getAppId())) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader appBrandMenuHeader = new com.tencent.mm.plugin.appbrand.page.AppBrandMenuHeader(context);
        appBrandMenuHeader.setPage(this);
        return appBrandMenuHeader;
    }

    public n7(java.lang.Class<? extends com.tencent.mm.plugin.appbrand.page.d7> cls) {
        this(cls, new com.tencent.mm.plugin.appbrand.page.f8());
    }

    public n7(java.lang.Class<? extends com.tencent.mm.plugin.appbrand.page.d7> cls, com.tencent.luggage.sdk.jsapi.component.m mVar) {
        super(cls, mVar);
        this.T1 = false;
        this.U1 = 0;
        this.V1 = -1;
        this.W1 = 0;
        this.Y1 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.Z1 = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f86911c2 = null;
        this.f86912d2 = new byte[0];
        this.f86914f2 = new com.tencent.mm.plugin.appbrand.report.quality.l0[]{null};
        this.f86915g2 = -1;
        this.f86916h2 = "";
        this.f86917i2 = false;
        this.f86919k2 = 0;
        this.f86920l2 = new xi1.h();
        synchronized (com.tencent.mm.plugin.appbrand.page.je.f86803a) {
            if (com.tencent.mm.plugin.appbrand.page.je.f86804b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StatisticsPageView", "addPageView " + this);
                com.tencent.mm.plugin.appbrand.page.je.f86805c.add(this);
            }
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f81584q = z65.c.a();
    }
}
