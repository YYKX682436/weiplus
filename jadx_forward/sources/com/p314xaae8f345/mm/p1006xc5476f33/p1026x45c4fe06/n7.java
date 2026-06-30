package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class n7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1 {

    /* renamed from: d, reason: collision with root package name */
    public volatile android.os.CancellationSignal f167567d;

    /* renamed from: e, reason: collision with root package name */
    public volatile android.os.CancellationSignal f167568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r1 f167569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u8 f167570g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f167571h;

    public n7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r1 r1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.u8 u8Var) {
        this.f167571h = o6Var;
        this.f167569f = r1Var;
        this.f167570g = u8Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1
    public void A() {
        boolean z17 = this.f167571h.L0() || this.f167569f.f166626b;
        this.f167571h.K("onSyncLaunchStart task[%d] interrupted[%b]", java.lang.Integer.valueOf(this.f167569f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f167571h.f156336n, true).K = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "onSyncLaunchStart get QualitySession with appId[%s], e=%s", this.f167571h.f156336n, e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var = this.f167571h.f167721t2;
        if (j3Var != null) {
            j3Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p4.SYNC_LAUNCH);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1
    public void C() {
        boolean z17 = this.f167571h.L0() || this.f167569f.f166626b;
        this.f167571h.K("notifyAppRestartOnLaunchRequestedLatestVersion, task[%d], interrupted[%b]", java.lang.Integer.valueOf(this.f167569f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        this.f167568e = a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.n7$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7.this.f167571h;
                wg1.b bVar = wg1.b.f527244d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "restartAppImplOnLaunchRequestedLatestVersion appId:%s", o6Var.f156336n);
                new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.RunnableC12821x6d79155(o6Var, bVar).run();
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.y4
    public void E(int i17) {
        this.f167571h.E(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1
    public void F() {
        boolean z17 = this.f167571h.L0() || this.f167569f.f166626b;
        boolean z18 = this.f167571h.u0().f158842v2;
        this.f167571h.K("onLaunchTimeoutFallbackReloadRequested, task[%d], interrupted[%b], isBackupWxaAttrsAlreadyUsed[%b]", java.lang.Integer.valueOf(this.f167569f.hashCode()), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (z17 || z18) {
            return;
        }
        this.f167567d = a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.t7(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1
    public void G(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 c3899xf952a052, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.AbstractC12323x626e3745 abstractC12323x626e3745, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a c12340xb447464a) {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a195 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195) c3899xf952a052;
        boolean z17 = this.f167569f.f166626b;
        boolean z18 = this.f167571h.S;
        boolean L0 = this.f167571h.L0();
        boolean z19 = this.f167567d != null;
        sj1.l.e(this.f167571h.f156336n, "internal:prepare", "AppBrandPrepareTask.onPrepareDone");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167571h;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(this.f167569f.hashCode());
        objArr[1] = java.lang.Boolean.valueOf(c11813xf952a195 == null);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Boolean.valueOf(z18);
        objArr[4] = java.lang.Boolean.valueOf(L0);
        objArr[5] = java.lang.Boolean.valueOf(z19);
        o6Var.K("AppBrandPrepareTask.onPrepareDone task[%d] null==config?[%b], isInterruptedBeforePrepareDone[%b], runtimeFinishing[%b %b], isFallbackReloadRequested[%b]", objArr);
        if (z17 || z18 || L0) {
            this.f167571h.H.a("destroyed");
            return;
        }
        if (c11813xf952a195 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.b(this.f167571h.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35247x9808c908);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.b(this.f167571h.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35208xbfcbd1c0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.class, this.f167571h.f156336n);
            this.f167571h.H.a(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
            if (this.f167567d != null) {
                return;
            }
            this.f167571h.L2(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o7(this, abstractC12323x626e3745));
            if (abstractC12323x626e3745 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.z.d(this.f167571h, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1088x8e6693ac.h0.LaunchFailed);
            }
            java.lang.String str = this.f167571h.f156336n;
            java.lang.String t07 = this.f167571h.t0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l27 = this.f167571h.l2();
            if (l27 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l27.f169327m)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.k0.b(4, str, t07, l27.f169327m, 0L);
            }
            if (this.f167571h.u0().h()) {
                if (abstractC12323x626e3745 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class))).Ui(this.f167571h.u0().f(), this.f167571h.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o0.f170264p);
                    return;
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class))).Ui(this.f167571h.u0().f(), this.f167571h.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o0.f170265r);
                    return;
                }
            }
            return;
        }
        this.f167571h.K("AppBrandPrepareTask.onPrepareDone task[%d] pkg[%s]", java.lang.Integer.valueOf(this.f167569f.hashCode()), c11813xf952a195.f387385r);
        if (this.f167567d != null) {
            this.f167567d.cancel();
            this.f167567d = null;
        }
        if (this.f167568e != null) {
            this.f167568e.cancel();
            this.f167568e = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(this.f167571h.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35247x9808c908);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(this.f167571h.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35240x3a573e36);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.g(this.f167571h.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35252xab9b446b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = this.f167571h.S2(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "onPrepareDone runtimeLibReader[%s] of runtime[%s], relyCommLibUpdate[%b], updatedCommLibVersionInLaunch[%d]", S2, this.f167571h.mo48804x9616526c(), java.lang.Boolean.valueOf(c11813xf952a195.A.f128837g), java.lang.Integer.valueOf(c11813xf952a195.A.f128841n));
        if (S2 == null) {
            this.f167571h.H.a("FATAL");
            return;
        }
        boolean z27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y7.f157598a.d() && (S2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3);
        if (z27 && c11813xf952a195.A.f128841n > 0) {
            this.f167571h.H.a("reload");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p7(this));
            return;
        }
        this.f167571h.p3(S2);
        if (z27 && ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_local_common_lib_safe_reload, true)) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.r5.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r7(this));
            return;
        }
        this.f167571h.H.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[AfterLaunchTiming] afterLaunchAdvanceEnabled=%b, appId=%s", java.lang.Boolean.valueOf(this.f167571h.Y2.a()), this.f167571h.f156336n);
        if (this.f167571h.Y2.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeWC", "[AfterLaunchTiming] cold_start EARLY: onResourcePrepareComplete, calling afterlaunch, appId=%s", this.f167571h.f156336n);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.l.a(this.f167571h);
        }
        boolean z28 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f167571h.f156338p.f158814g) && this.f167571h.u0().L != c11813xf952a195.f387385r.f33456x1c82a56c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "onPrepareDone, InitConfig.appVersion(%d) != SysConfig.appVersion(%d), appId:%s", java.lang.Integer.valueOf(this.f167571h.u0().L), java.lang.Integer.valueOf(c11813xf952a195.f387385r.f33456x1c82a56c), this.f167571h.f156336n);
            if (this.f167571h.I1) {
                iz5.a.h("InitConfig.appVersion != SysConfig.appVersion @smoothieli");
                throw null;
            }
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m2) this.f167571h.E).add(c11813xf952a195);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m2) this.f167571h.E).add(c12340xb447464a);
        final long currentTimeMillis = java.lang.System.currentTimeMillis();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var = this.f167571h.f167721t2;
        if (j3Var != null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.j3$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3.this;
                    km5.q qVar = j3Var2.f159995n;
                    if (qVar == null) {
                        j3Var2.j();
                        return;
                    }
                    lm5.j jVar = lm5.d.f401134b;
                    ((km5.q) qVar.b(jVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.a4(j3Var2))).t(jVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z3(j3Var2));
                }
            };
            synchronized (j3Var.f159993l) {
                if (j3Var.f159992k.get()) {
                    runnable.run();
                } else {
                    j3Var.f159993l.addLast(runnable);
                }
            }
        }
        java.lang.String str2 = this.f167571h.f156336n;
        java.util.List list = (java.util.List) ((java.util.HashMap) pj1.b.f436464a.f436465a).get(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35205x24728b);
        if (list != null && list.size() > 0) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(list.get(0));
            throw null;
        }
        if (this.f167571h.f167723v2 != null) {
            this.f167571h.f167723v2.b();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m2) this.f167571h.E).add(c11813xf952a195.A.f128834d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m2) this.f167571h.E).add(new si1.n(c11813xf952a195.B));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m2) this.f167571h.E).add(new ti1.b(c11813xf952a195.C));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = this.f167571h;
        o6Var2.getClass();
        o6Var2.X1 = new si1.a1(o6Var2);
        try {
            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "AppBrandRuntimeWC(%s)#resetAppConfig", this.f167571h.f156336n);
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var3 = this.f167571h;
            cf.i.b(format, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.n7$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this.w2();
                }
            });
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var2 = this.f167571h.f167721t2;
            if (j3Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var4 = j3Var2.f159983b;
                if (!o6Var4.q2() && ((o6Var4.g2() != 1030 || !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d) && gf.y0.b(o6Var4, o6Var4.t0(), false))) {
                    km5.q qVar = j3Var2.f159995n;
                    if (qVar != null) {
                        qVar.B();
                    }
                    j3Var2.j();
                }
            }
            final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b6 b6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b6) this.f167570g.f170808b;
            final java.lang.String str3 = b6Var.f158297b.f156336n;
            ((ku5.t0) ku5.t0.f394148d).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.b6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b6 b6Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b6.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12340xb447464a c12340xb447464a2 = c12340xb447464a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 c11813xf952a1952 = c11813xf952a195;
                    long j17 = currentTimeMillis;
                    java.lang.String str4 = str3;
                    b6Var2.getClass();
                    try {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(b6Var2.f158297b);
                        if (a17 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.m(b6Var2.f158297b, a17, c12340xb447464a2);
                            if (c11813xf952a1952 != null) {
                                try {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.c(c11813xf952a1952, a17, c12340xb447464a2, b6Var2.f158297b, j17);
                                    int i17 = c11813xf952a1952.Y.I * 1000;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t0.f169845l;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QualitySampleHelper", "updateSampleInterval :%d", java.lang.Integer.valueOf(i17));
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.k1.f169748a.f169777a = i17;
                                } catch (java.lang.Throwable th6) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimePrepareProcessResultReporterBlockingProcess", "onPrepareDone [%s] reportResourceReady e = %s", str4, th6);
                                }
                            }
                        }
                    } finally {
                        b6Var2.d();
                    }
                }
            });
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(this.f167571h.f156336n, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35252xab9b446b);
            this.f167571h.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.j.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var5 = this.f167571h;
            jVar.getClass();
            o6Var5.N.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1131x97eed868.f(jVar, o6Var5));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKeepAliveManager", "setUp process:%s", bm5.f1.a());
            this.f167571h.f167711l2 = null;
            this.f167571h.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s7(this));
            if (this.f167571h.f167724w2 != null) {
                if (this.f167569f.f166626b || !u46.a.a(c11813xf952a195.N, 2)) {
                    this.f167571h.f167724w2.a();
                } else {
                    this.f167571h.f167724w2.b();
                }
            }
            if (!this.f167569f.f166626b) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j2(this.f167571h, this.f167570g);
                java.util.LinkedList linkedList = j2Var.f166222c;
                if (linkedList.size() <= 0) {
                    j2Var.f166221b.d();
                } else {
                    cf.d dVar = new cf.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i2(j2Var), linkedList.size());
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((yz5.l) it.next()).mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.h2(dVar));
                    }
                }
            }
            i81.b0 b0Var = this.f167571h.A2;
            if (b0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onResourceReadyReceived");
                b0Var.f371068l = true;
                b0Var.b();
            }
            this.f167571h.K("onPrepareDone stuffs task[%d] cost[%dms] interrupted[%b]", java.lang.Integer.valueOf(this.f167569f.hashCode()), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Boolean.valueOf(this.f167569f.f166626b));
            sj1.l.g(this.f167571h.f156336n);
        } catch (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.r1 unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "onPrepareDone [%s] commLib not ready", this.f167571h.f156336n);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1
    public void H(final int i17) {
        boolean z17 = this.f167571h.L0() || this.f167569f.f166626b;
        this.f167571h.K("onDownloadProgress(%d), task[%d] hasDownload[%b]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f167569f.hashCode()), java.lang.Boolean.valueOf(this.f167571h.f167713m2));
        if (z17) {
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167571h;
        o6Var.getClass();
        o6Var.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$g
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc vcVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2.this.f156344t;
                if (vcVar != null) {
                    vcVar.mo52970x3ae760af(i17);
                }
            }
        });
        o6Var.H.getClass();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1
    public void J() {
        boolean z17 = this.f167571h.L0() || this.f167569f.f166626b;
        this.f167571h.K("onSyncJsApiInfoStart task[%d] interrupted[%b]", java.lang.Integer.valueOf(this.f167569f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f167571h.f156336n, true).M = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "onSyncJsApiInfoStart get QualitySession with appId[%s], e=%s", this.f167571h.f156336n, e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var = this.f167571h.f167721t2;
        if (j3Var != null) {
            j3Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p4.SYNC_JSAPIINFO);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "AppBrandRuntimeBoostStrategy boost null!");
        }
    }

    public final android.os.CancellationSignal a(final java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167571h;
        if (o6Var.f156329e == null) {
            o6Var.K2();
            return null;
        }
        final android.app.Activity r07 = o6Var.r0();
        if (r07 == null) {
            o6Var.K2();
            return null;
        }
        if (o6Var.Y != null) {
            final android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
            o6Var.m(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.n7$$b
                @Override // java.lang.Runnable
                public final void run() {
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7.this;
                    android.os.CancellationSignal cancellationSignal2 = cancellationSignal;
                    final java.lang.Runnable runnable2 = runnable;
                    final android.app.Activity activity = r07;
                    n7Var.getClass();
                    if (cancellationSignal2.isCanceled()) {
                        if (runnable2 instanceof wu5.b) {
                            ((wu5.b) runnable2).b();
                        }
                    } else {
                        final p012xc85e97e9.p093xedfae76a.v vVar = new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.appbrand.n7$$e
                            @Override // p012xc85e97e9.p093xedfae76a.v
                            /* renamed from: onStateChanged */
                            public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7 n7Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7.this;
                                n7Var2.getClass();
                                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i8.f159869a[mVar.ordinal()];
                                if (i17 == 1) {
                                    n7Var2.f167571h.K2();
                                } else {
                                    if (i17 != 2) {
                                        return;
                                    }
                                    runnable2.run();
                                }
                            }
                        };
                        ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) activity).mo273xed6858b4().a(vVar);
                        final p012xc85e97e9.p093xedfae76a.v vVar2 = new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.appbrand.n7$$f
                            @Override // p012xc85e97e9.p093xedfae76a.v
                            /* renamed from: onStateChanged */
                            public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
                                if (mVar == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                                    ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) activity).mo273xed6858b4().c(vVar);
                                }
                            }
                        };
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x2) n7Var.f167571h.P).f173904d.a(vVar2);
                        cancellationSignal2.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: com.tencent.mm.plugin.appbrand.n7$$g
                            @Override // android.os.CancellationSignal.OnCancelListener
                            public final void onCancel() {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7 n7Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n7.this;
                                android.app.Activity activity2 = activity;
                                p012xc85e97e9.p093xedfae76a.x xVar = vVar;
                                p012xc85e97e9.p093xedfae76a.v vVar3 = vVar2;
                                java.lang.Runnable runnable3 = runnable2;
                                n7Var2.getClass();
                                ((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) activity2).mo273xed6858b4().c(xVar);
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x2) n7Var2.f167571h.P).f173904d.c(vVar3);
                                if (runnable3 instanceof wu5.b) {
                                    ((wu5.b) runnable3).b();
                                }
                            }
                        });
                    }
                }
            });
            return cancellationSignal;
        }
        runnable.run();
        if (!(runnable instanceof wu5.b)) {
            return null;
        }
        android.os.CancellationSignal cancellationSignal2 = new android.os.CancellationSignal();
        cancellationSignal2.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: com.tencent.mm.plugin.appbrand.n7$$c
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                ((wu5.b) runnable).b();
            }
        });
        return cancellationSignal2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1
    public void w(long j17) {
        boolean z17 = this.f167571h.L0() || this.f167569f.f166626b;
        this.f167571h.K("onDownloadStarted(%s) task[%d] interrupted[%b]", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.v(j17), java.lang.Integer.valueOf(this.f167569f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f167571h;
        o6Var.f167713m2 = true;
        if (o6Var.f167711l2 != null) {
            this.f167571h.f167711l2.f169581b = true;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f167571h.f156336n, true).L = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "onSyncLaunchStart get QualitySession with appId[%s], e=%s", this.f167571h.f156336n, e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var2 = this.f167571h;
        boolean z18 = o6Var2.f167713m2;
        if (o6Var2.q2() && o6Var2.P2() != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1054x304bf2.p1056xed046e09.j.a().f159764h = z18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var = this.f167571h.f167721t2;
        if (j3Var != null) {
            j3Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p4.SYNC_GET_CODE);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1
    public void y() {
        boolean z17 = this.f167571h.L0() || this.f167569f.f166626b;
        this.f167571h.K("onSyncAppidABTestStart task[%d] interrupted[%b]", java.lang.Integer.valueOf(this.f167569f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f167571h.f156336n, true).N = true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "onSyncAppidABTestStart get QualitySession with appId[%s], e=%s", this.f167571h.f156336n, e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var = this.f167571h.f167721t2;
        if (j3Var != null) {
            j3Var.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p4.SYNC_APPID_ABTEST_INFO);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeWC", "AppBrandRuntimeBoostStrategy boost null!");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n1
    public void z(java.lang.String str) {
        boolean z17 = this.f167571h.L0() || this.f167569f.f166626b;
        this.f167571h.K("notifyStartMigrateTargetApp, task[%d], interrupted[%b]", java.lang.Integer.valueOf(this.f167569f.hashCode()), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        this.f167571h.a3(str);
    }
}
