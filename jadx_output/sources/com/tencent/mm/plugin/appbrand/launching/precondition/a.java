package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public abstract class a extends android.content.MutableContextWrapper {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f84934d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f84935e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84936f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Queue f84937g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f84938h;

    public a() {
        super(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f84934d = false;
        this.f84935e = false;
        this.f84936f = true;
        this.f84937g = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public final boolean c() {
        android.content.Context baseContext = getBaseContext();
        if (!(baseContext instanceof com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI appBrandLaunchProxyUI = (com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) baseContext;
        return (appBrandLaunchProxyUI.isDestroyed() || appBrandLaunchProxyUI.isFinishing()) ? false : true;
    }

    public final void d() {
        this.f84934d = true;
        ((java.util.concurrent.ConcurrentLinkedQueue) this.f84937g).clear();
        super.setBaseContext(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public void e(final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        l81.b1 f17;
        l81.e1 e1Var;
        if (appBrandInitConfigWC != null) {
            com.tencent.mm.plugin.appbrand.launching.precondition.l0.a(f(), this.f84938h.f84921x, appBrandInitConfigWC, appBrandStatObject);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "finish, after startAppOnInitConfigGot");
            ik1.h0.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "finish, dispatch onStartAppBrandUI");
                    com.tencent.mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC.this.f77313z2;
                    if (weAppOpenUICallbackIPCProxy != null) {
                        l81.e1 e1Var2 = weAppOpenUICallbackIPCProxy.f84480h;
                        if (e1Var2 != null) {
                            e1Var2.g();
                        }
                        weAppOpenUICallbackIPCProxy.f84480h = null;
                    }
                }
            });
        } else {
            this.f84936f = true;
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = this.f84938h;
            if (launchParcel != null && (f17 = com.tencent.mm.plugin.appbrand.launching.g5.f84619a.f(launchParcel.Q)) != null && (e1Var = f17.L) != null) {
                e1Var.b();
            }
        }
        if (this.f84936f) {
            j(new com.tencent.mm.plugin.appbrand.launching.precondition.b(this), false);
        }
        this.f84935e = true;
    }

    public final android.content.Context f() {
        android.content.Context baseContext = getBaseContext();
        android.content.Context h17 = h();
        if (!(baseContext instanceof android.app.Activity) && h17 != null) {
            baseContext = h17;
        }
        android.app.Activity a17 = q75.a.a(baseContext);
        return (a17 == null || a17.isFinishing()) ? com.tencent.mm.sdk.platformtools.x2.f193071a : baseContext;
    }

    public final boolean g() {
        return c() && ((com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) getBaseContext()).isFinishing();
    }

    public android.content.Context h() {
        return null;
    }

    public void i() {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "requireUiEnv is not supported");
    }

    public final void j(java.lang.Runnable runnable, boolean z17) {
        if (runnable == null) {
            return;
        }
        if (c()) {
            ((android.app.Activity) getBaseContext()).runOnUiThread(runnable);
            return;
        }
        if (this.f84934d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "runOnUiEnv but destroyed, clear mUiEnvQueue, call stack = %s", android.util.Log.getStackTraceString(new java.lang.Throwable()));
            ((java.util.concurrent.ConcurrentLinkedQueue) this.f84937g).clear();
        } else {
            ((java.util.concurrent.ConcurrentLinkedQueue) this.f84937g).offer(runnable);
            if (z17) {
                i();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
    
        if (r0.contains(r12.f77278d) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r12, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r13) {
        /*
            r11 = this;
            boolean r0 = com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d
            r1 = 1
            if (r0 == 0) goto L13
            boolean r0 = r12.k()
            if (r0 != 0) goto L13
            java.lang.String r12 = "MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess"
            java.lang.String r13 = "shouldCheckTbsBeforeAppLaunch inMonkeyEnv"
            com.tencent.mars.xlog.Log.i(r12, r13)
            return r1
        L13:
            com.tencent.mm.plugin.appbrand.task.u0 r0 = com.tencent.mm.plugin.appbrand.task.u0.C()
            java.lang.String r2 = r12.f77278d
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
            boolean r13 = com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.h.a(r12, r13)
            r13 = r13 | r0
            boolean r0 = r12.f77292e2
            if (r0 == 0) goto Laf
            java.lang.String r0 = com.tencent.mm.plugin.appbrand.d0.f77557a
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r3 = e42.d0.clicfg_android_appbrand_fakenative_check_xweb_required
            h62.d r0 = (h62.d) r0
            java.lang.String r4 = com.tencent.mm.plugin.appbrand.d0.f77557a
            java.lang.String r5 = r0.Zi(r3, r4, r1)
            java.lang.String r0 = "getExpt(...)"
            kotlin.jvm.internal.o.f(r5, r0)
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
            java.lang.String r3 = r12.f77278d
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.precondition.a.k(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject):boolean");
    }

    public void onDestroy() {
        d();
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(android.content.Context context) {
        super.setBaseContext(context);
        if (c()) {
            if (this.f84934d) {
                ((java.util.concurrent.ConcurrentLinkedQueue) this.f84937g).clear();
                return;
            }
            while (!((java.util.concurrent.ConcurrentLinkedQueue) this.f84937g).isEmpty()) {
                if (!c()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "fileAllPendingUiTasks but !currentInUiEnv, return");
                    ((java.util.concurrent.ConcurrentLinkedQueue) this.f84937g).clear();
                    return;
                }
                try {
                    ((java.lang.Runnable) ((java.util.concurrent.ConcurrentLinkedQueue) this.f84937g).poll()).run();
                } catch (java.lang.ClassCastException e17) {
                    if (!e17.getMessage().endsWith("cannot be cast to com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI")) {
                        throw e17;
                    }
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", e17, "mUiEnvQueue.poll().run()", new java.lang.Object[0]);
                    ((java.util.concurrent.ConcurrentLinkedQueue) this.f84937g).clear();
                    return;
                }
            }
        }
    }
}
