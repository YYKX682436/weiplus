package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public abstract class a extends android.content.MutableContextWrapper {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f166467d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f166468e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f166469f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f166470g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc f166471h;

    public a() {
        super(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f166467d = false;
        this.f166468e = false;
        this.f166469f = true;
        this.f166470g = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public final boolean c() {
        android.content.Context baseContext = getBaseContext();
        if (!(baseContext instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9 activityC12328x4aa1de9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9) baseContext;
        return (activityC12328x4aa1de9.isDestroyed() || activityC12328x4aa1de9.isFinishing()) ? false : true;
    }

    public final void d() {
        this.f166467d = true;
        ((java.util.concurrent.ConcurrentLinkedQueue) this.f166470g).clear();
        super.setBaseContext(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public void e(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        l81.b1 f17;
        l81.e1 e1Var;
        if (c11809xbc286be4 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.l0.a(f(), this.f166471h.f166454x, c11809xbc286be4, c12559xbdae8559);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "finish, after startAppOnInitConfigGot");
            ik1.h0.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "finish, dispatch onStartAppBrandUI");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12354xf2fbb9c8 c12354xf2fbb9c8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4.this.f158846z2;
                    if (c12354xf2fbb9c8 != null) {
                        l81.e1 e1Var2 = c12354xf2fbb9c8.f166013h;
                        if (e1Var2 != null) {
                            e1Var2.g();
                        }
                        c12354xf2fbb9c8.f166013h = null;
                    }
                }
            });
        } else {
            this.f166469f = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = this.f166471h;
            if (c12362x460991bc != null && (f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.g5.f166152a.f(c12362x460991bc.Q)) != null && (e1Var = f17.L) != null) {
                e1Var.b();
            }
        }
        if (this.f166469f) {
            j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.b(this), false);
        }
        this.f166468e = true;
    }

    public final android.content.Context f() {
        android.content.Context baseContext = getBaseContext();
        android.content.Context h17 = h();
        if (!(baseContext instanceof android.app.Activity) && h17 != null) {
            baseContext = h17;
        }
        android.app.Activity a17 = q75.a.a(baseContext);
        return (a17 == null || a17.isFinishing()) ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a : baseContext;
    }

    public final boolean g() {
        return c() && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9) getBaseContext()).isFinishing();
    }

    public android.content.Context h() {
        return null;
    }

    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "requireUiEnv is not supported");
    }

    public final void j(java.lang.Runnable runnable, boolean z17) {
        if (runnable == null) {
            return;
        }
        if (c()) {
            ((android.app.Activity) getBaseContext()).runOnUiThread(runnable);
            return;
        }
        if (this.f166467d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "runOnUiEnv but destroyed, clear mUiEnvQueue, call stack = %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            ((java.util.concurrent.ConcurrentLinkedQueue) this.f166470g).clear();
        } else {
            ((java.util.concurrent.ConcurrentLinkedQueue) this.f166470g).offer(runnable);
            if (z17) {
                i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        if (r0.contains(r12.f158811d) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 r12, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 r13) {
        /*
            r11 = this;
            boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d
            r1 = 1
            if (r0 == 0) goto L13
            boolean r0 = r12.k()
            if (r0 != 0) goto L13
            java.lang.String r12 = "MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess"
            java.lang.String r13 = "shouldCheckTbsBeforeAppLaunch inMonkeyEnv"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r12, r13)
            return r1
        L13:
            com.tencent.mm.plugin.appbrand.task.u0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C()
            java.lang.String r2 = r12.f158811d
            boolean r0 = r0.z(r2)
            r2 = 0
            if (r0 != 0) goto L29
            boolean r0 = r12.k()
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            boolean r13 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.h.a(r12, r13)
            r13 = r13 | r0
            boolean r0 = r12.f158825e2
            if (r0 == 0) goto Laf
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d0.f159090a
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r3 = e42.d0.clicfg_android_appbrand_fakenative_check_xweb_required
            h62.d r0 = (h62.d) r0
            java.lang.String r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d0.f159090a
            java.lang.String r5 = r0.Zi(r3, r4, r1)
            java.lang.String r0 = "getExpt(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            java.lang.String r0 = ","
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r0 = r26.n0.f0(r5, r6, r7, r8, r9, r10)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L63:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            if (r5 != 0) goto L78
            r5 = r1
            goto L79
        L78:
            r5 = r2
        L79:
            if (r5 != 0) goto L63
            r3.add(r4)
            goto L63
        L7f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 10
            int r4 = kz5.d0.q(r3, r4)
            r0.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L8e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La6
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = r26.n0.u0(r4)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            goto L8e
        La6:
            java.lang.String r3 = r12.f158811d
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Laf
            goto Lb0
        Laf:
            r2 = r13
        Lb0:
            boolean r12 = r12.k()
            if (r12 == 0) goto Lc5
            java.lang.Class<l30.h> r12 = l30.h.class
            i95.m r12 = i95.n0.c(r12)
            l30.h r12 = (l30.h) r12
            java.lang.String r13 = "appbrand"
            k30.a r12 = (k30.a) r12
            r12.Ai(r13)
        Lc5:
            r12 = r2 & 1
            r12 = r12 ^ r1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.a.k(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject):boolean");
    }

    /* renamed from: onDestroy */
    public void m51785xac79a11b() {
        d();
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(android.content.Context context) {
        super.setBaseContext(context);
        if (c()) {
            if (this.f166467d) {
                ((java.util.concurrent.ConcurrentLinkedQueue) this.f166470g).clear();
                return;
            }
            while (!((java.util.concurrent.ConcurrentLinkedQueue) this.f166470g).isEmpty()) {
                if (!c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "fileAllPendingUiTasks but !currentInUiEnv, return");
                    ((java.util.concurrent.ConcurrentLinkedQueue) this.f166470g).clear();
                    return;
                }
                try {
                    ((java.lang.Runnable) ((java.util.concurrent.ConcurrentLinkedQueue) this.f166470g).poll()).run();
                } catch (java.lang.ClassCastException e17) {
                    if (!e17.getMessage().endsWith("cannot be cast to com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI")) {
                        throw e17;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", e17, "mUiEnvQueue.poll().run()", new java.lang.Object[0]);
                    ((java.util.concurrent.ConcurrentLinkedQueue) this.f166470g).clear();
                    return;
                }
            }
        }
    }
}
