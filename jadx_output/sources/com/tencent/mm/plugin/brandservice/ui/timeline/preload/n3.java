package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 f94371a = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f94372b = jz5.h.b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.f3.f94240d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f94373c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.Condition f94374d;

    /* renamed from: e, reason: collision with root package name */
    public static com.tencent.mm.plugin.brandservice.ui.timeline.preload.d3 f94375e;

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$MMTrimMemoryEventListener f94376f;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.app.s2 f94377g;

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        f94373c = reentrantLock;
        f94374d = reentrantLock.newCondition();
    }

    public final java.lang.Object a(int i17, java.lang.String url, kotlin.coroutines.Continuation continuation) {
        boolean z17;
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        nu4.b0 f17 = f94371a.f();
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.e3 e3Var = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.e3(nVar);
        kotlin.jvm.internal.o.g(url, "url");
        java.util.Iterator it = f17.D.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((nu4.c0) it.next()).a(i17, url, e3Var)) {
                z17 = true;
                break;
            }
        }
        if (!z17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) f94372b).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[LOOP:0: B:17:0x007b->B:18:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nu4.a r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.tencent.mm.plugin.brandservice.ui.timeline.preload.g3
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.g3 r0 = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.g3) r0
            int r1 = r0.f94248f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94248f = r1
            goto L18
        L13:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.g3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.g3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f94246d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f94248f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L29
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            r45.m83 r8 = r7.f340234b
            java.lang.String r8 = r8.f380231e
            if (r8 == 0) goto L43
            int r8 = r8.length()
            if (r8 != 0) goto L41
            goto L43
        L41:
            r8 = r4
            goto L44
        L43:
            r8 = r5
        L44:
            if (r8 == 0) goto L4c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L88
        L4c:
            nu4.b0 r8 = r6.f()
            r0.f94248f = r5
            nu4.k r2 = nu4.b0.f340241J
            java.lang.String r2 = "getAllCaches"
            java.lang.Object r8 = r8.I0(r7, r2, r3, r0)
            if (r8 != r1) goto L5d
            return r1
        L5d:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L6b
            boolean r7 = r26.n0.N(r8)
            r7 = r7 ^ r5
            if (r7 == 0) goto L69
            r3 = r8
        L69:
            if (r3 != 0) goto L6d
        L6b:
            java.lang.String r3 = "[]"
        L6d:
            cl0.e r7 = new cl0.e
            r7.<init>(r3)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            int r0 = r7.length()
        L7b:
            if (r4 >= r0) goto L87
            java.lang.String r1 = r7.getString(r4)
            r8.add(r1)
            int r4 = r4 + 1
            goto L7b
        L87:
            r7 = r8
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.c(nu4.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(nu4.a r6, java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.tencent.mm.plugin.brandservice.ui.timeline.preload.h3
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.h3 r0 = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.h3) r0
            int r1 = r0.f94265g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94265g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.h3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.h3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f94263e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f94265g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.f94262d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.ResultKt.throwOnFailure(r8)
            r45.m83 r8 = r6.f340234b
            java.lang.String r8 = r8.f380231e
            if (r8 == 0) goto L46
            int r8 = r8.length()
            if (r8 != 0) goto L44
            goto L46
        L44:
            r8 = r3
            goto L47
        L46:
            r8 = r4
        L47:
            if (r8 == 0) goto L4f
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            return r6
        L4f:
            nu4.b0 r8 = r5.f()
            java.lang.String r2 = r6.f340235c
            java.lang.String[] r2 = new java.lang.String[]{r7, r2}
            java.util.List r2 = kz5.c0.i(r2)
            r0.f94262d = r7
            r0.f94265g = r4
            java.lang.String r7 = "getFetchPkgType"
            java.lang.Object r8 = r8.I0(r6, r7, r2, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            java.lang.String r8 = (java.lang.String) r8
            int r6 = com.tencent.mm.sdk.platformtools.t8.D1(r8, r3)
            if (r6 == 0) goto L78
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        L78:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.d(nu4.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[Catch: all -> 0x00d1, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:11:0x0023, B:13:0x0036, B:15:0x0045, B:19:0x0057, B:22:0x0088, B:24:0x008f, B:25:0x0094, B:27:0x009a, B:29:0x009e, B:32:0x00ae, B:34:0x00b1, B:36:0x00b5, B:38:0x00bd, B:39:0x00c6, B:44:0x00cd, B:45:0x00d0, B:21:0x006b), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[Catch: all -> 0x00d1, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0017, B:11:0x0023, B:13:0x0036, B:15:0x0045, B:19:0x0057, B:22:0x0088, B:24:0x008f, B:25:0x0094, B:27:0x009a, B:29:0x009e, B:32:0x00ae, B:34:0x00b1, B:36:0x00b5, B:38:0x00bd, B:39:0x00c6, B:44:0x00cd, B:45:0x00d0, B:21:0x006b), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String e(java.lang.String r11, nu4.a r12) {
        /*
            r10 = this;
            java.lang.String r0 = "getId fail:"
            monitor-enter(r10)
            java.lang.String r1 = "url"
            kotlin.jvm.internal.o.g(r11, r1)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = "manifest"
            kotlin.jvm.internal.o.g(r12, r1)     // Catch: java.lang.Throwable -> Ld1
            r45.m83 r1 = r12.f340234b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = r1.f380231e     // Catch: java.lang.Throwable -> Ld1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L20
            int r1 = r1.length()     // Catch: java.lang.Throwable -> Ld1
            if (r1 != 0) goto L1e
            goto L20
        L1e:
            r1 = r2
            goto L21
        L20:
            r1 = r3
        L21:
            if (r1 != 0) goto L57
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 r1 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mm.sdk.platformtools.v3 r1 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94446b     // Catch: java.lang.Throwable -> Ld1
            r45.m83 r4 = r12.f340234b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.f380231e     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "ManifestUrl"
            kotlin.jvm.internal.o.f(r4, r5)     // Catch: java.lang.Throwable -> Ld1
            boolean r4 = r1.m(r4)     // Catch: java.lang.Throwable -> Ld1
            if (r4 == 0) goto L57
            r45.m83 r4 = r12.f340234b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.f380231e     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "ManifestUrl"
            kotlin.jvm.internal.o.f(r4, r5)     // Catch: java.lang.Throwable -> Ld1
            boolean r1 = r1.n(r4, r3)     // Catch: java.lang.Throwable -> Ld1
            if (r1 != 0) goto L57
            java.lang.String r11 = "MicroMsg.WebPrefetcherManifest"
            java.lang.String r0 = "getId manifest not have getId and ignore %s"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Ld1
            r45.m83 r12 = r12.f340234b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r12 = r12.f380231e     // Catch: java.lang.Throwable -> Ld1
            r1[r2] = r12     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mars.xlog.Log.w(r11, r0, r1)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r10)
            r11 = 0
            return r11
        L57:
            kotlin.jvm.internal.h0 r1 = new kotlin.jvm.internal.h0     // Catch: java.lang.Throwable -> Ld1
            r1.<init>()     // Catch: java.lang.Throwable -> Ld1
            kotlin.jvm.internal.c0 r4 = new kotlin.jvm.internal.c0     // Catch: java.lang.Throwable -> Ld1
            r4.<init>()     // Catch: java.lang.Throwable -> Ld1
            r4.f310112d = r3     // Catch: java.lang.Throwable -> Ld1
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld1
            java.util.concurrent.locks.ReentrantLock r5 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94373c     // Catch: java.lang.Throwable -> Ld1
            r5.lock()     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 r6 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94371a     // Catch: java.lang.Throwable -> Lcc
            nu4.b0 r6 = r6.f()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = "getId"
            java.util.List r8 = kz5.b0.c(r11)     // Catch: java.lang.Throwable -> Lcc
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.i3 r9 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.i3     // Catch: java.lang.Throwable -> Lcc
            r9.<init>(r1, r11, r4)     // Catch: java.lang.Throwable -> Lcc
            r6.J0(r12, r7, r8, r9)     // Catch: java.lang.Throwable -> Lcc
            java.util.concurrent.locks.Condition r6 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94374d     // Catch: java.lang.Throwable -> Lcc
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lcc
            r8 = 100
            r6.await(r8, r7)     // Catch: java.lang.Throwable -> Lcc
            r5.unlock()     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r5 = r1.f310123d     // Catch: java.lang.Throwable -> Ld1
            if (r5 == 0) goto L94
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld1
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld1
        L94:
            r45.m83 r12 = r12.f340234b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r12 = r12.f380231e     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lb1
            boolean r4 = r4.f310112d     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto Lb1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 r4 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mm.sdk.platformtools.v3 r4 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94446b     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r4 = r4.i()     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mm.sdk.platformtools.o4 r4 = (com.tencent.mm.sdk.platformtools.o4) r4     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r5 = r1.f310123d     // Catch: java.lang.Throwable -> Ld1
            if (r5 == 0) goto Lad
            goto Lae
        Lad:
            r3 = r2
        Lae:
            r4.G(r12, r3)     // Catch: java.lang.Throwable -> Ld1
        Lb1:
            java.lang.Object r12 = r1.f310123d     // Catch: java.lang.Throwable -> Ld1
            if (r12 != 0) goto Lc6
            java.lang.String r12 = "https://view.inews.qq.com/"
            boolean r12 = r26.i0.y(r11, r12, r2)     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lc6
            java.lang.String r12 = "MicroMsg.WebPrefetcherManifest"
            java.lang.String r11 = r0.concat(r11)     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mars.xlog.Log.e(r12, r11)     // Catch: java.lang.Throwable -> Ld1
        Lc6:
            java.lang.Object r11 = r1.f310123d     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r10)
            return r11
        Lcc:
            r11 = move-exception
            r5.unlock()     // Catch: java.lang.Throwable -> Ld1
            throw r11     // Catch: java.lang.Throwable -> Ld1
        Ld1:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.e(java.lang.String, nu4.a):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$MMTrimMemoryEventListener] */
    public final synchronized nu4.b0 f() {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.d3 d3Var;
        if (f94375e == null) {
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.d3 d3Var2 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.d3();
            f94375e = d3Var2;
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherManifest", "createEngine %s", java.lang.Integer.valueOf(d3Var2.hashCode()));
        }
        if (f94376f == null && ((java.lang.Boolean) ((jz5.n) mu4.w.f331453z).getValue()).booleanValue()) {
            ?? r07 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MMTrimMemoryEvent>() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$MMTrimMemoryEventListener
                {
                    com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                    this.__eventId = 708811463;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.MMTrimMemoryEvent mMTrimMemoryEvent) {
                    com.tencent.mm.autogen.events.MMTrimMemoryEvent event = mMTrimMemoryEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherManifest", "MMTrimMemoryEvent callback received");
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94371a.i();
                    jx3.f.INSTANCE.w(1454L, 131L, 1L);
                    return false;
                }
            };
            r07.alive();
            f94376f = r07;
        }
        if (f94377g == null) {
            nu4.k kVar = nu4.b0.f340241J;
            if (((java.lang.Boolean) ((jz5.n) nu4.b0.N).getValue()).booleanValue()) {
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.k3 k3Var = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.k3();
                k3Var.alive();
                f94377g = k3Var;
            }
        }
        d3Var = f94375e;
        kotlin.jvm.internal.o.d(d3Var);
        return d3Var;
    }

    public final void g(nu4.a manifest, java.lang.String func, java.util.List params, yz5.l onCallback) {
        kotlin.jvm.internal.o.g(manifest, "manifest");
        kotlin.jvm.internal.o.g(func, "func");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(onCallback, "onCallback");
        f().J0(manifest, func, params, onCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nu4.a h(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.h(java.lang.String):nu4.a");
    }

    public final synchronized void i() {
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.d3 d3Var = f94375e;
        if (d3Var != null) {
            jx3.f.INSTANCE.w(1454L, 135L, 1L);
            ((ku5.t0) ku5.t0.f312615d).k(new nu4.r(d3Var), 3000L);
            d3Var.destroy();
            com.tencent.mm.app.s2 s2Var = d3Var.G;
            if (s2Var != null) {
                s2Var.dead();
            }
        }
        f94375e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(nu4.a r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.tencent.mm.plugin.brandservice.ui.timeline.preload.l3
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l3 r0 = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.l3) r0
            int r1 = r0.f94355g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94355g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.l3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f94353e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f94355g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r7)
            goto L6f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r7)
            r45.m83 r7 = r5.f340234b
            java.lang.String r7 = r7.f380231e
            if (r7 == 0) goto L41
            int r7 = r7.length()
            if (r7 != 0) goto L3f
            goto L41
        L3f:
            r7 = 0
            goto L42
        L41:
            r7 = r3
        L42:
            if (r7 == 0) goto L53
            jz5.g r5 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94372b
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L79
        L53:
            nu4.b0 r7 = r4.f()
            java.lang.String r2 = r5.f340235c
            java.lang.String[] r2 = new java.lang.String[]{r6, r2}
            java.util.List r2 = kz5.c0.i(r2)
            r0.f94352d = r6
            r0.f94355g = r3
            java.lang.String r6 = "shouldFetchContent"
            java.lang.Object r7 = r7.I0(r5, r6, r2, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r5 = r7
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = "true"
            boolean r5 = kotlin.jvm.internal.o.b(r7, r5)
        L79:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.j(nu4.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(nu4.a r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.tencent.mm.plugin.brandservice.ui.timeline.preload.m3
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.m3 r0 = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.m3) r0
            int r1 = r0.f94364g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94364g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.m3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.m3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f94362e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f94364g
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.f94361d
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L73
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.ResultKt.throwOnFailure(r7)
            r45.m83 r7 = r5.f340234b
            java.lang.String r7 = r7.f380231e
            if (r7 == 0) goto L46
            int r7 = r7.length()
            if (r7 != 0) goto L44
            goto L46
        L44:
            r7 = 0
            goto L47
        L46:
            r7 = r3
        L47:
            if (r7 == 0) goto L58
            jz5.g r5 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.f94372b
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L99
        L58:
            nu4.b0 r7 = r4.f()
            java.lang.String r2 = r5.f340235c
            java.lang.String[] r2 = new java.lang.String[]{r6, r2}
            java.util.List r2 = kz5.c0.i(r2)
            r0.f94361d = r6
            r0.f94364g = r3
            java.lang.String r3 = "fetch"
            java.lang.Object r7 = r7.I0(r5, r3, r2, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r5 = r7
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "shouldPrefetch: '"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = "', "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "MicroMsg.WebPrefetcherManifest"
            com.tencent.mars.xlog.Log.i(r6, r5)
            java.lang.String r5 = "true"
            boolean r5 = kotlin.jvm.internal.o.b(r7, r5)
        L99:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3.k(nu4.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
