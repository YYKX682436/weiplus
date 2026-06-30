package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020;

/* loaded from: classes7.dex */
public final class c1 extends l75.s0 {

    /* renamed from: m, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 f157930m;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f157934g;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329 f157931d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329();

    /* renamed from: e, reason: collision with root package name */
    public boolean f157932e = true;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f157933f = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f157935h = false;

    /* renamed from: i, reason: collision with root package name */
    public i11.c f157936i = null;

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 r16, int r17, int r18, int r19, long r20, boolean r22, android.os.Bundle r23, int r24, long r25, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1 r27, ft.i r28) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.m0(com.tencent.mm.plugin.appbrand.appusage.c1, int, int, int, long, boolean, android.os.Bundle, int, long, com.tencent.mm.plugin.appbrand.appusage.b1, ft.i):void");
    }

    public static boolean n0() {
        if (gm0.j1.a()) {
            return ((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_HISTORY_HAS_MORE_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue();
        }
        return false;
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1 z0() {
        if (f157930m == null) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1.class) {
                if (f157930m == null) {
                    f157930m = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.c1();
                }
            }
        }
        return f157930m;
    }

    public void s0(long j17, boolean z17, android.os.Bundle bundle, int i17, int i18) {
        u0(j17, z17, bundle, i17, i18, -1, -1L, null, null);
    }

    public void u0(long j17, boolean z17, android.os.Bundle bundle, int i17, int i18, int i19, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1 b1Var, ft.i iVar) {
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.v0(this, i17, i18, z17, j17, bundle, i19, j18, b1Var, iVar));
    }

    public final void y0(int i17, int i18, int i19, long j17, boolean z17, android.os.Bundle bundle, int i27, long j18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.b1 b1Var, ft.i iVar) {
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
        long longValue = z18 ? j18 : ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_APP_BRAND_HISTORY_LIST_PAGING_LAST_SERVER_MIN_UPDATE_TIME_LONG, -1L)).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (z17 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f()) {
            if (this.f157935h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "only sync common used list");
                i29 = 8;
            } else {
                i29 = i19 | 8;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandHistoryLogic[collection]", "sync all list");
            }
            if (android.text.TextUtils.isEmpty(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158003d)) {
                r45.a60 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.b();
                str3 = b17 != null ? b17.f451294i : "";
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158003d = str3;
            } else {
                str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158003d;
            }
            if (iVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "startLoading");
                java.lang.ref.WeakReference weakReference = ((com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.y1) iVar).f254292a;
                final com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3) weakReference.get() : null;
                if (c18557xc00aa3f3 != null) {
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).getClass();
                    long j27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158009j;
                    if (j27 >= 0) {
                        str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
                        min = j27;
                    } else {
                        r45.a60 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.b();
                        if (b18 != null) {
                            str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
                            j19 = b18.f451295m;
                        } else {
                            str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
                            j19 = 0;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158009j = j19;
                        min = java.lang.Math.min(j19, 5000L);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "ljd startLoading updateLoadingWaitMs:%d", java.lang.Long.valueOf(min));
                    if (min > 0) {
                        c18557xc00aa3f3.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.taskbar.ui.TaskBarView$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                rh4.m mVar = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.this.f254066m2;
                                if (mVar != null) {
                                    android.widget.ImageView imageView = mVar.f477297w;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                    }
                                    if (mVar.f477298x == null) {
                                        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f);
                                        ofFloat.setDuration(2000L);
                                        ofFloat.setRepeatCount(-1);
                                        ofFloat.setRepeatMode(1);
                                        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
                                        mVar.f477298x = ofFloat;
                                    }
                                    android.animation.ObjectAnimator objectAnimator = mVar.f477298x;
                                    if (objectAnimator != null) {
                                        objectAnimator.start();
                                    }
                                }
                            }
                        });
                        c18557xc00aa3f3.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.g1(c18557xc00aa3f3), min);
                    }
                } else {
                    str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TaskBarView", "startLoading view is recycle");
                }
            } else {
                str4 = "MicroMsg.AppBrandHistoryLogic[collection]";
            }
            int mo78086x7444f759 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.l0.class)).mo78086x7444f759();
            boolean e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.e();
            boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.d();
            str = str4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "commonAppCount:%d, reportSsid:%b, reportLocation:%b", java.lang.Integer.valueOf(mo78086x7444f759), java.lang.Boolean.valueOf(e17), java.lang.Boolean.valueOf(d17));
            r45.ut4 c17 = (mo78086x7444f759 <= 0 || !e17) ? null : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (mo78086x7444f759 <= 0 || !d17) {
                ut4Var2 = c17;
                fd4Var2 = null;
            } else {
                fd4Var2 = new r45.fd4();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329 c11711x54208329 = this.f157931d;
                fd4Var2.f455773e = c11711x54208329.f157880d;
                fd4Var2.f455772d = c11711x54208329.f157881e;
                fd4Var2.f455774f = c11711x54208329.f157884h;
                if (!this.f157932e || c11711x54208329.f157886m <= 0) {
                    ut4Var2 = c17;
                    i37 = 0;
                } else {
                    ut4Var2 = c17;
                    i37 = (int) (java.lang.System.currentTimeMillis() - c11711x54208329.f157886m);
                }
                fd4Var2.f455775g = i37;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "isUseCache:%b, cacheTime:%d", java.lang.Boolean.valueOf(this.f157932e), java.lang.Integer.valueOf(fd4Var2.f455775g));
            }
            i28 = i29;
            str2 = str3;
            ut4Var = ut4Var2;
            fd4Var = fd4Var2;
        } else {
            str = "MicroMsg.AppBrandHistoryLogic[collection]";
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "not support fetch CommonUsedWeApp");
            }
            i28 = i19;
            str2 = "";
            ut4Var = null;
            fd4Var = null;
        }
        java.lang.String string = bundle != null ? bundle.getString("session_id", "") : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "fetchNextPageFromServerImpl reason:%d, sessionId:%s", java.lang.Integer.valueOf(i17), string);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.x0(this, i17, i18, i28, (z17 || longValue <= 0) ? Integer.MAX_VALUE : (int) longValue, i27 > 0 ? i27 : 32, str2, ut4Var, fd4Var, string, b1Var, iVar, i19, i17, z18, bundle, j17, z17, currentTimeMillis).l();
    }
}
