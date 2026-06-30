package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class c1 extends l75.s0 {

    /* renamed from: m, reason: collision with root package name */
    public static volatile com.tencent.mm.plugin.appbrand.appusage.c1 f76397m;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f76401g;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo f76398d = new com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo();

    /* renamed from: e, reason: collision with root package name */
    public boolean f76399e = true;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f76400f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f76402h = false;

    /* renamed from: i, reason: collision with root package name */
    public i11.c f76403i = null;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m0(com.tencent.mm.plugin.appbrand.appusage.c1 r16, int r17, int r18, int r19, long r20, boolean r22, android.os.Bundle r23, int r24, long r25, com.tencent.mm.plugin.appbrand.appusage.b1 r27, ft.i r28) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appusage.c1.m0(com.tencent.mm.plugin.appbrand.appusage.c1, int, int, int, long, boolean, android.os.Bundle, int, long, com.tencent.mm.plugin.appbrand.appusage.b1, ft.i):void");
    }

    public static boolean n0() {
        if (gm0.j1.a()) {
            return ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_HISTORY_HAS_MORE_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    public static com.tencent.mm.plugin.appbrand.appusage.c1 z0() {
        if (f76397m == null) {
            synchronized (com.tencent.mm.plugin.appbrand.appusage.c1.class) {
                if (f76397m == null) {
                    f76397m = new com.tencent.mm.plugin.appbrand.appusage.c1();
                }
            }
        }
        return f76397m;
    }

    public void s0(long j17, boolean z17, android.os.Bundle bundle, int i17, int i18) {
        u0(j17, z17, bundle, i17, i18, -1, -1L, null, null);
    }

    public void u0(long j17, boolean z17, android.os.Bundle bundle, int i17, int i18, int i19, long j18, com.tencent.mm.plugin.appbrand.appusage.b1 b1Var, ft.i iVar) {
        ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.appusage.v0(this, i17, i18, z17, j17, bundle, i19, j18, b1Var, iVar));
    }

    public final void y0(int i17, int i18, int i19, long j17, boolean z17, android.os.Bundle bundle, int i27, long j18, com.tencent.mm.plugin.appbrand.appusage.b1 b1Var, ft.i iVar) {
        java.lang.String str;
        int i28;
        java.lang.String str2;
        r45.ut4 ut4Var;
        r45.fd4 fd4Var;
        int i29;
        java.lang.String str3;
        java.lang.String str4;
        r45.ut4 ut4Var2;
        r45.fd4 fd4Var2;
        int i37;
        long j19;
        long min;
        boolean z18 = j18 != -1;
        long longValue = z18 ? j18 : ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_HISTORY_LIST_PAGING_LAST_SERVER_MIN_UPDATE_TIME_LONG, -1L)).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (z17 && com.tencent.mm.plugin.appbrand.appusage.j0.f()) {
            if (this.f76402h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "only sync common used list");
                i29 = 8;
            } else {
                i29 = i19 | 8;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "sync all list");
            }
            if (android.text.TextUtils.isEmpty(com.tencent.mm.plugin.appbrand.appusage.j0.f76470d)) {
                r45.a60 b17 = com.tencent.mm.plugin.appbrand.appusage.j0.b();
                str3 = b17 != null ? b17.f369761i : "";
                com.tencent.mm.plugin.appbrand.appusage.j0.f76470d = str3;
            } else {
                str3 = com.tencent.mm.plugin.appbrand.appusage.j0.f76470d;
            }
            if (iVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "startLoading");
                java.lang.ref.WeakReference weakReference = ((com.tencent.mm.plugin.taskbar.ui.y1) iVar).f172759a;
                final com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = weakReference != null ? (com.tencent.mm.plugin.taskbar.ui.TaskBarView) weakReference.get() : null;
                if (taskBarView != null) {
                    ((com.tencent.mm.feature.appbrand.support.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
                    long j27 = com.tencent.mm.plugin.appbrand.appusage.j0.f76476j;
                    if (j27 >= 0) {
                        str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
                        min = j27;
                    } else {
                        r45.a60 b18 = com.tencent.mm.plugin.appbrand.appusage.j0.b();
                        if (b18 != null) {
                            str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
                            j19 = b18.f369762m;
                        } else {
                            str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
                            j19 = 0;
                        }
                        com.tencent.mm.plugin.appbrand.appusage.j0.f76476j = j19;
                        min = java.lang.Math.min(j19, 5000L);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "ljd startLoading updateLoadingWaitMs:%d", java.lang.Long.valueOf(min));
                    if (min > 0) {
                        taskBarView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarView$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                rh4.m mVar = com.tencent.mm.plugin.taskbar.ui.TaskBarView.this.f172533m2;
                                if (mVar != null) {
                                    android.widget.ImageView imageView = mVar.f395764w;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                    }
                                    if (mVar.f395765x == null) {
                                        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
                                        ofFloat.setDuration(2000L);
                                        ofFloat.setRepeatCount(-1);
                                        ofFloat.setRepeatMode(1);
                                        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
                                        mVar.f395765x = ofFloat;
                                    }
                                    android.animation.ObjectAnimator objectAnimator = mVar.f395765x;
                                    if (objectAnimator != null) {
                                        objectAnimator.start();
                                    }
                                }
                            }
                        });
                        taskBarView.postDelayed(new com.tencent.mm.plugin.taskbar.ui.g1(taskBarView), min);
                    }
                } else {
                    str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
                    com.tencent.mars.xlog.Log.e("MicroMsg.TaskBarView", "startLoading view is recycle");
                }
            } else {
                str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
            }
            int count = ((com.tencent.mm.plugin.appbrand.appusage.l0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class)).getCount();
            boolean e17 = com.tencent.mm.plugin.appbrand.appusage.j0.e();
            boolean d17 = com.tencent.mm.plugin.appbrand.appusage.j0.d();
            str = str4;
            com.tencent.mars.xlog.Log.i(str, "commonAppCount:%d, reportSsid:%b, reportLocation:%b", java.lang.Integer.valueOf(count), java.lang.Boolean.valueOf(e17), java.lang.Boolean.valueOf(d17));
            r45.ut4 c17 = (count <= 0 || !e17) ? null : com.tencent.mm.plugin.appbrand.appusage.j0.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (count <= 0 || !d17) {
                ut4Var2 = c17;
                fd4Var2 = null;
            } else {
                fd4Var2 = new r45.fd4();
                com.tencent.mm.plugin.appbrand.appusage.AppBrandLocationInfo appBrandLocationInfo = this.f76398d;
                fd4Var2.f374240e = appBrandLocationInfo.f76347d;
                fd4Var2.f374239d = appBrandLocationInfo.f76348e;
                fd4Var2.f374241f = appBrandLocationInfo.f76351h;
                if (!this.f76399e || appBrandLocationInfo.f76353m <= 0) {
                    ut4Var2 = c17;
                    i37 = 0;
                } else {
                    ut4Var2 = c17;
                    i37 = (int) (java.lang.System.currentTimeMillis() - appBrandLocationInfo.f76353m);
                }
                fd4Var2.f374242g = i37;
                com.tencent.mars.xlog.Log.i(str, "isUseCache:%b, cacheTime:%d", java.lang.Boolean.valueOf(this.f76399e), java.lang.Integer.valueOf(fd4Var2.f374242g));
            }
            i28 = i29;
            str2 = str3;
            ut4Var = ut4Var2;
            fd4Var = fd4Var2;
        } else {
            str = "MicroMsg.AppBrandHistoryLogic[collection]";
            if (z17) {
                com.tencent.mars.xlog.Log.i(str, "not support fetch CommonUsedWeApp");
            }
            i28 = i19;
            str2 = "";
            ut4Var = null;
            fd4Var = null;
        }
        java.lang.String string = bundle != null ? bundle.getString("session_id", "") : "";
        com.tencent.mars.xlog.Log.i(str, "fetchNextPageFromServerImpl reason:%d, sessionId:%s", java.lang.Integer.valueOf(i17), string);
        new com.tencent.mm.plugin.appbrand.appusage.x0(this, i17, i18, i28, (z17 || longValue <= 0) ? Integer.MAX_VALUE : (int) longValue, i27 > 0 ? i27 : 32, str2, ut4Var, fd4Var, string, b1Var, iVar, i19, i17, z18, bundle, j17, z17, currentTimeMillis).l();
    }
}
