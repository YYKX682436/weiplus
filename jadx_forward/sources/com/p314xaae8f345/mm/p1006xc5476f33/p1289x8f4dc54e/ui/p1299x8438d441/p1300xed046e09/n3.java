package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3 f175904a = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f175905b = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.f3.f175773d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f175906c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.locks.Condition f175907d;

    /* renamed from: e, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d3 f175908e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.C13011x1b4ecfce f175909f;

    /* renamed from: g, reason: collision with root package name */
    public static com.p314xaae8f345.mm.app.s2 f175910g;

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        f175906c = reentrantLock;
        f175907d = reentrantLock.newCondition();
    }

    public final java.lang.Object a(int i17, java.lang.String url, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17;
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        nu4.b0 f17 = f175904a.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.e3(nVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
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
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            nVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) f175905b).mo141623x754a37bb()).booleanValue();
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
    public final java.lang.Object c(nu4.a r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.g3
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.g3 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.g3) r0
            int r1 = r0.f175781f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175781f = r1
            goto L18
        L13:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.g3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.g3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f175779d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f175781f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L5d
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r45.m83 r8 = r7.f421767b
            java.lang.String r8 = r8.f461764e
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
            r0.f175781f = r5
            nu4.k r2 = nu4.b0.f421774J
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
            int r0 = r7.mo15056xbe0e3ae6()
        L7b:
            if (r4 >= r0) goto L87
            java.lang.String r1 = r7.mo15054x2fec8307(r4)
            r8.add(r1)
            int r4 = r4 + 1
            goto L7b
        L87:
            r7 = r8
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.c(nu4.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(nu4.a r6, java.lang.String r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h3
            if (r0 == 0) goto L13
            r0 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.h3 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.h3) r0
            int r1 = r0.f175798g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175798g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.h3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.h3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f175796e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f175798g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.f175795d
            java.lang.String r6 = (java.lang.String) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r45.m83 r8 = r6.f421767b
            java.lang.String r8 = r8.f461764e
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
            java.lang.String r2 = r6.f421768c
            java.lang.String[] r2 = new java.lang.String[]{r7, r2}
            java.util.List r2 = kz5.c0.i(r2)
            r0.f175795d = r7
            r0.f175798g = r4
            java.lang.String r7 = "getFetchPkgType"
            java.lang.Object r8 = r8.I0(r6, r7, r2, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            java.lang.String r8 = (java.lang.String) r8
            int r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r8, r3)
            if (r6 == 0) goto L78
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        L78:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.d(nu4.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r1)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = "manifest"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r1)     // Catch: java.lang.Throwable -> Ld1
            r45.m83 r1 = r12.f421767b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r1 = r1.f461764e     // Catch: java.lang.Throwable -> Ld1
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
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mm.sdk.platformtools.v3 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175979b     // Catch: java.lang.Throwable -> Ld1
            r45.m83 r4 = r12.f421767b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.f461764e     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "ManifestUrl"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)     // Catch: java.lang.Throwable -> Ld1
            boolean r4 = r1.m(r4)     // Catch: java.lang.Throwable -> Ld1
            if (r4 == 0) goto L57
            r45.m83 r4 = r12.f421767b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = r4.f461764e     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "ManifestUrl"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)     // Catch: java.lang.Throwable -> Ld1
            boolean r1 = r1.n(r4, r3)     // Catch: java.lang.Throwable -> Ld1
            if (r1 != 0) goto L57
            java.lang.String r11 = "MicroMsg.WebPrefetcherManifest"
            java.lang.String r0 = "getId manifest not have getId and ignore %s"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Ld1
            r45.m83 r12 = r12.f421767b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r12 = r12.f461764e     // Catch: java.lang.Throwable -> Ld1
            r1[r2] = r12     // Catch: java.lang.Throwable -> Ld1
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r11, r0, r1)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r10)
            r11 = 0
            return r11
        L57:
            kotlin.jvm.internal.h0 r1 = new kotlin.jvm.internal.h0     // Catch: java.lang.Throwable -> Ld1
            r1.<init>()     // Catch: java.lang.Throwable -> Ld1
            kotlin.jvm.internal.c0 r4 = new kotlin.jvm.internal.c0     // Catch: java.lang.Throwable -> Ld1
            r4.<init>()     // Catch: java.lang.Throwable -> Ld1
            r4.f391645d = r3     // Catch: java.lang.Throwable -> Ld1
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld1
            java.util.concurrent.locks.ReentrantLock r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175906c     // Catch: java.lang.Throwable -> Ld1
            r5.lock()     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175904a     // Catch: java.lang.Throwable -> Lcc
            nu4.b0 r6 = r6.f()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = "getId"
            java.util.List r8 = kz5.b0.c(r11)     // Catch: java.lang.Throwable -> Lcc
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.i3 r9 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.i3     // Catch: java.lang.Throwable -> Lcc
            r9.<init>(r1, r11, r4)     // Catch: java.lang.Throwable -> Lcc
            r6.J0(r12, r7, r8, r9)     // Catch: java.lang.Throwable -> Lcc
            java.util.concurrent.locks.Condition r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175907d     // Catch: java.lang.Throwable -> Lcc
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> Lcc
            r8 = 100
            r6.await(r8, r7)     // Catch: java.lang.Throwable -> Lcc
            r5.unlock()     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r5 = r1.f391656d     // Catch: java.lang.Throwable -> Ld1
            if (r5 == 0) goto L94
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld1
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Ld1
        L94:
            r45.m83 r12 = r12.f421767b     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r12 = r12.f461764e     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lb1
            boolean r4 = r4.f391645d     // Catch: java.lang.Throwable -> Ld1
            if (r4 != 0) goto Lb1
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mm.sdk.platformtools.v3 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175979b     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r4 = r4.i()     // Catch: java.lang.Throwable -> Ld1
            com.tencent.mm.sdk.platformtools.o4 r4 = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) r4     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r5 = r1.f391656d     // Catch: java.lang.Throwable -> Ld1
            if (r5 == 0) goto Lad
            goto Lae
        Lad:
            r3 = r2
        Lae:
            r4.G(r12, r3)     // Catch: java.lang.Throwable -> Ld1
        Lb1:
            java.lang.Object r12 = r1.f391656d     // Catch: java.lang.Throwable -> Ld1
            if (r12 != 0) goto Lc6
            java.lang.String r12 = "https://view.inews.qq.com/"
            boolean r12 = r26.i0.y(r11, r12, r2)     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto Lc6
            java.lang.String r12 = "MicroMsg.WebPrefetcherManifest"
            java.lang.String r11 = r0.concat(r11)     // Catch: java.lang.Throwable -> Ld1
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r12, r11)     // Catch: java.lang.Throwable -> Ld1
        Lc6:
            java.lang.Object r11 = r1.f391656d     // Catch: java.lang.Throwable -> Ld1
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.e(java.lang.String, nu4.a):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$MMTrimMemoryEventListener] */
    public final synchronized nu4.b0 f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d3 d3Var;
        if (f175908e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d3 d3Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d3();
            f175908e = d3Var2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherManifest", "createEngine %s", java.lang.Integer.valueOf(d3Var2.hashCode()));
        }
        if (f175909f == null && ((java.lang.Boolean) ((jz5.n) mu4.w.f412986z).mo141623x754a37bb()).booleanValue()) {
            ?? r07 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7>() { // from class: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$MMTrimMemoryEventListener
                {
                    com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
                    this.f39173x3fe91575 = 708811463;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 c5697xfda8a2d7) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5697xfda8a2d7 event = c5697xfda8a2d7;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebPrefetcherManifest", "MMTrimMemoryEvent callback received");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175904a.i();
                    jx3.f.INSTANCE.w(1454L, 131L, 1L);
                    return false;
                }
            };
            r07.mo48813x58998cd();
            f175909f = r07;
        }
        if (f175910g == null) {
            nu4.k kVar = nu4.b0.f421774J;
            if (((java.lang.Boolean) ((jz5.n) nu4.b0.N).mo141623x754a37bb()).booleanValue()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k3 k3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.k3();
                k3Var.m43071x58998cd();
                f175910g = k3Var;
            }
        }
        d3Var = f175908e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d3Var);
        return d3Var;
    }

    public final void g(nu4.a manifest, java.lang.String func, java.util.List params, yz5.l onCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manifest, "manifest");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(func, "func");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCallback, "onCallback");
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.h(java.lang.String):nu4.a");
    }

    public final synchronized void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d3 d3Var = f175908e;
        if (d3Var != null) {
            jx3.f.INSTANCE.w(1454L, 135L, 1L);
            ((ku5.t0) ku5.t0.f394148d).k(new nu4.r(d3Var), 3000L);
            d3Var.mo14659x5cd39ffa();
            com.p314xaae8f345.mm.app.s2 s2Var = d3Var.G;
            if (s2Var != null) {
                s2Var.m43072x2efc64();
            }
        }
        f175908e = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(nu4.a r5, java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.l3
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l3 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.l3) r0
            int r1 = r0.f175888g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175888g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.l3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f175886e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f175888g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L6f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r45.m83 r7 = r5.f421767b
            java.lang.String r7 = r7.f461764e
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
            jz5.g r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175905b
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.mo141623x754a37bb()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L79
        L53:
            nu4.b0 r7 = r4.f()
            java.lang.String r2 = r5.f421768c
            java.lang.String[] r2 = new java.lang.String[]{r6, r2}
            java.util.List r2 = kz5.c0.i(r2)
            r0.f175885d = r6
            r0.f175888g = r3
            java.lang.String r6 = "shouldFetchContent"
            java.lang.Object r7 = r7.I0(r5, r6, r2, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            r5 = r7
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = "true"
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7, r5)
        L79:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.j(nu4.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(nu4.a r5, java.lang.String r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.m3
            if (r0 == 0) goto L13
            r0 = r7
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.m3 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.m3) r0
            int r1 = r0.f175897g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f175897g = r1
            goto L18
        L13:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.m3 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.m3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f175895e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f175897g
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.f175894d
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L73
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r45.m83 r7 = r5.f421767b
            java.lang.String r7 = r7.f461764e
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
            jz5.g r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175905b
            jz5.n r5 = (jz5.n) r5
            java.lang.Object r5 = r5.mo141623x754a37bb()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L99
        L58:
            nu4.b0 r7 = r4.f()
            java.lang.String r2 = r5.f421768c
            java.lang.String[] r2 = new java.lang.String[]{r6, r2}
            java.util.List r2 = kz5.c0.i(r2)
            r0.f175894d = r6
            r0.f175897g = r3
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r5)
            java.lang.String r5 = "true"
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r7, r5)
        L99:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.k(nu4.a, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
