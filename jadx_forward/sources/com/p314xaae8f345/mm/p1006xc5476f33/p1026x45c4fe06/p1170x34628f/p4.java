package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class p4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f168521a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f168522b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f168523c = false;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd f168525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f168526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f168527g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 f168528h;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, long j17, org.json.JSONObject jSONObject) {
        this.f168528h = i3Var;
        this.f168524d = str;
        this.f168525e = wdVar;
        this.f168526f = j17;
        this.f168527g = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    public void a() {
        int size;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var;
        int i17;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var;
        li1.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var2;
        int i18;
        org.json.JSONObject jSONObject;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar;
        long j17;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var3;
        boolean z19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var4;
        final java.lang.String str2;
        u65.a aVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c37;
        if (this.f168522b) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var2 = this.f168528h;
        if (i3Var2.f168235e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPageContainer", "attempt to proceed but destroyed, url[%s], type[%s]", this.f168524d, this.f168525e);
            return;
        }
        if (this.f168521a) {
            return;
        }
        long j18 = this.f168526f;
        java.lang.String str3 = this.f168524d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar2 = this.f168525e;
        boolean z27 = this.f168523c;
        org.json.JSONObject jSONObject2 = this.f168527g;
        synchronized (i3Var2.f168242o) {
            size = i3Var2.f168244q.size();
        }
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Long.valueOf(j18);
        objArr[1] = str3;
        objArr[2] = wdVar2;
        objArr[3] = java.lang.Integer.valueOf(size);
        objArr[4] = java.lang.Boolean.valueOf(z27);
        int i19 = -1;
        objArr[5] = java.lang.Integer.valueOf(jSONObject2 == null ? -1 : jSONObject2.length());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext: routeId:%d, url:%s, type:%s), Staging Count: %d, disableAnimation %b, customArgs.size:%d", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) cf.i.a("AppBrandPageContainerProfile| createPage", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p3(i3Var2, str3, wdVar2));
        java.util.Objects.requireNonNull(w2Var5);
        synchronized (i3Var2.f168242o) {
            w2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) i3Var2.f168243p.peekFirst();
        }
        if (w2Var5.m52224xc2a54588() == null) {
            w2Var5.mo14685x5050858d(str3);
            w2Var5.A();
        }
        if (w2Var != null) {
            int mo52213x2838138e = w2Var.mo52213x2838138e();
            i17 = w2Var.m52225xaa0531b5();
            z17 = w2Var.B();
            i19 = mo52213x2838138e;
        } else {
            i17 = -1;
            z17 = false;
        }
        int mo52213x2838138e2 = w2Var5.mo52213x2838138e();
        int m52225xaa0531b5 = w2Var5.m52225xaa0531b5();
        boolean B = w2Var5.B();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 w2Var6 = null;
        final li1.a aVar3 = (z17 && B && i19 == mo52213x2838138e2) != false ? new li1.a() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.jb jbVar = i3Var2.f168249v;
        if (jbVar != null) {
            aVar = aVar3;
            w2Var2 = w2Var5;
            boolean z28 = z17;
            i3Var = i3Var2;
            i18 = 1;
            int i27 = i17;
            jSONObject = jSONObject2;
            z18 = z27;
            wdVar = wdVar2;
            j17 = j18;
            ((com.p314xaae8f345.p425x1ea3c036.p447x80def495.wxa.C3955x2d990bfe) jbVar).f(j18, str3, z28, i19, i27, B, mo52213x2838138e2, m52225xaa0531b5, wdVar2, jSONObject, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$e
                @Override // java.lang.Runnable
                public final void run() {
                    li1.a aVar4 = li1.a.this;
                    if (aVar4 != null) {
                        aVar4.a();
                    }
                }
            });
        } else {
            i3Var = i3Var2;
            aVar = aVar3;
            w2Var2 = w2Var5;
            i18 = 1;
            jSONObject = jSONObject2;
            z18 = z27;
            wdVar = wdVar2;
            j17 = j18;
        }
        boolean[] zArr = new boolean[i18];
        zArr[0] = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.APP_LAUNCH;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar4 = wdVar;
        if (wdVar3 == wdVar4) {
            w2Var2.mo14682x9dee9c37().s2();
        }
        boolean z29 = z18 | ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.xd.a(wdVar4) ? 1 : 0) ^ i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.NAVIGATE_TO;
        boolean z37 = (wdVar4 == wdVar5 && w2Var == null) ? i18 : z29 ? 1 : 0;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var3 = i3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a5 G = i3Var3.G(w2Var, w2Var2, wdVar4, str3, !z37);
        if (i3Var3.e0(wdVar4)) {
            str = str3;
            w2Var2.t(j17, "onAppRoute", wdVar4, G, jSONObject, null);
            zArr[0] = i18;
        } else {
            str = str3;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) w2Var2.getParent();
        if (viewGroup != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPageContainer", new java.lang.Throwable(), "page already has a parent", new java.lang.Object[0]);
            w2Var3 = w2Var2;
            viewGroup.removeView(w2Var3);
        } else {
            w2Var3 = w2Var2;
        }
        i3Var3.addView(w2Var3, 0);
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q3 q3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q3(i3Var3, wdVar4, w2Var, w2Var3, aVar, j17);
        q3Var.f168556e = z37;
        synchronized (i3Var3.f168242o) {
            try {
                i3Var3.f168244q.push(w2Var3);
                i3Var3.f168245r.push(q3Var);
                if (i3Var3.f168243p.size() == 0) {
                    i3Var3.postDelayed(q3Var, 5000L);
                } else if (wdVar4 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH) {
                    i3Var3.postOnAnimation(q3Var);
                } else {
                    i3Var3.postDelayed(q3Var, i3Var3.f168253z);
                }
                if (i3Var3.mo52154x9a3f0ba2().f156330f.size() >= 2 && i3Var3.f168243p.isEmpty() && wdVar4 == wdVar5) {
                    i3Var3.postOnAnimation(q3Var);
                }
                if (wdVar4 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REDIRECT_TO && wdVar4 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.REWRITE_ROUTE && wdVar4 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB && wdVar4 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.RE_LAUNCH && wdVar4 != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH) {
                    z19 = false;
                    if ((!z19 || yo.a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd[]{com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.SWITCH_TAB, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.RE_LAUNCH, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.AUTO_RE_LAUNCH}, wdVar4)) && (w2Var4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2) i3Var3.f168243p.peekFirst()) != null && w2Var4 != w2Var3) {
                        w2Var6 = w2Var4;
                    }
                    str2 = str;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext mStagingStack push done, appId[%s] url[%s] type[%s]", i3Var3.m52168x74292566(), str2, wdVar4);
                }
                z19 = true;
                if (!z19) {
                }
                w2Var6 = w2Var4;
                str2 = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageContainer", "navigateToNext mStagingStack push done, appId[%s] url[%s] type[%s]", i3Var3.m52168x74292566(), str2, wdVar4);
            } catch (java.lang.Throwable th6) {
                th = th6;
                while (true) {
                    try {
                        break;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                throw th;
            }
        }
        if (w2Var6 != null && (mo14682x9dee9c37 = w2Var6.mo14682x9dee9c37()) != null) {
            mo14682x9dee9c37.z();
        }
        boolean z38 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 mo14682x9dee9c372 = w2Var3.mo14682x9dee9c37();
        final u65.a aVar4 = new u65.a(mo14682x9dee9c372.p2() ? 2 : 1, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$f
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3.this;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t4 t4Var = q3Var;
                i3Var4.removeCallbacks(t4Var);
                i3Var4.post(t4Var);
            }
        });
        if (mo14682x9dee9c372.p2()) {
            aVar2 = aVar4;
            mo14682x9dee9c372.X0(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079.texture, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.i3$$g
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3.this;
                    i3Var4.getClass();
                    boolean z39 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("MicroMsg.AppBrandPageContainer", "navigateToNext, switchToImage cost[%dms], appId[%s] type[%s], url[%s]", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), i3Var4.m52168x74292566(), wdVar4, str2);
                    aVar4.b();
                }
            }, 500L);
            mo14682x9dee9c372.o3();
        } else {
            aVar2 = aVar4;
        }
        mo14682x9dee9c372.P(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r3(i3Var3, elapsedRealtime, wdVar4, str2, mo14682x9dee9c372, aVar2));
        long j19 = j17;
        w2Var3.C(j19, str2, wdVar4);
        i3Var3.H(w2Var3, wdVar4);
        if (!zArr[0]) {
            w2Var3.t(j19, "onAppRoute", wdVar4, G, jSONObject, null);
        }
        this.f168521a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var4 = this.f168528h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y4 y4Var = i3Var4.A;
        if (y4Var != null) {
            java.util.Objects.requireNonNull(i3Var4.m52169xfdaa7672());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar6 = this.f168525e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d2 d2Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11840x59874d4) y4Var).f159093a;
            if (wdVar3 == wdVar6) {
                d2Var.f159091d.R1.b();
            } else {
                d2Var.getClass();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    public void c(java.lang.String str, java.lang.Object obj) {
        this.f168528h.f168252y.b(this.f168526f, str, obj, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    /* renamed from: cancel */
    public void mo52131xae7a2e7a() {
        this.f168522b = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u4
    /* renamed from: setAnimationEnabled */
    public void mo52132x15e8c79f(boolean z17) {
        this.f168523c = !z17;
    }
}
