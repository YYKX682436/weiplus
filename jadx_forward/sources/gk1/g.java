package gk1;

/* loaded from: classes7.dex */
public final class g extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final gk1.c f353996f = new gk1.c(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f353997g = {l75.n0.m145250x3fdc6f77(gk1.b.f353992v, "AppBrandFakeNativeSplashScreenshot")};

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f353998h = {"appId", "versionType", "appVersion", "isDarkMode"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f353999d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f354000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l75.k0 db6) {
        super(db6, gk1.b.f353992v, "AppBrandFakeNativeSplashScreenshot", dm.x.f322467m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f353999d = db6;
        this.f354000e = new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        com.p314xaae8f345.mm.vfs.w6.h(r3);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D0(gk1.b r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L92
        L5:
            java.lang.String r1 = r11.f69057x28d45f97
            int r2 = r11.f69061x94d24c6d
            int r3 = r11.f69058x119cf7dc
            boolean r4 = r11.f69059xf1a1cde8
            java.lang.String r11 = r11.f69060xead0d2ac
            r5 = 1
            if (r1 == 0) goto L1b
            int r6 = r1.length()
            if (r6 != 0) goto L19
            goto L1b
        L19:
            r6 = r0
            goto L1c
        L1b:
            r6 = r5
        L1c:
            if (r6 == 0) goto L20
            goto L92
        L20:
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = r10.f354000e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r6.readLock()
            int r8 = r6.getWriteHoldCount()
            if (r8 != 0) goto L31
            int r8 = r6.getReadHoldCount()
            goto L32
        L31:
            r8 = r0
        L32:
            r9 = r0
        L33:
            if (r9 >= r8) goto L3b
            r7.unlock()
            int r9 = r9 + 1
            goto L33
        L3b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = r6.writeLock()
            r6.lock()
            gk1.b r9 = new gk1.b     // Catch: java.lang.Throwable -> L93
            r9.<init>()     // Catch: java.lang.Throwable -> L93
            r9.f69057x28d45f97 = r1     // Catch: java.lang.Throwable -> L93
            r9.f69061x94d24c6d = r2     // Catch: java.lang.Throwable -> L93
            r9.f69058x119cf7dc = r3     // Catch: java.lang.Throwable -> L93
            r9.f69059xf1a1cde8 = r4     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r1 = gk1.g.f353998h     // Catch: java.lang.Throwable -> L93
            int r2 = r1.length     // Catch: java.lang.Throwable -> L93
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r1, r2)     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.Throwable -> L93
            boolean r2 = super.get(r9, r2)     // Catch: java.lang.Throwable -> L93
            if (r2 != 0) goto L60
            r2 = r5
            goto L61
        L60:
            r2 = r0
        L61:
            java.lang.String r3 = r9.f69060xead0d2ac     // Catch: java.lang.Throwable -> L93
            r9.f69060xead0d2ac = r11     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L6c
            boolean r11 = super.mo880xb970c2b9(r9)     // Catch: java.lang.Throwable -> L93
            goto L77
        L6c:
            int r11 = r1.length     // Catch: java.lang.Throwable -> L93
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r1, r11)     // Catch: java.lang.Throwable -> L93
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch: java.lang.Throwable -> L93
            boolean r11 = super.mo9952xce0038c9(r9, r11)     // Catch: java.lang.Throwable -> L93
        L77:
            if (r3 == 0) goto L81
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L93
            if (r1 != 0) goto L80
            goto L81
        L80:
            r5 = r0
        L81:
            if (r5 != 0) goto L86
            com.p314xaae8f345.mm.vfs.w6.h(r3)     // Catch: java.lang.Throwable -> L93
        L86:
            if (r0 >= r8) goto L8e
            r7.lock()
            int r0 = r0 + 1
            goto L86
        L8e:
            r6.unlock()
            r0 = r11
        L92:
            return r0
        L93:
            r11 = move-exception
        L94:
            if (r0 >= r8) goto L9c
            r7.lock()
            int r0 = r0 + 1
            goto L94
        L9c:
            r6.unlock()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gk1.g.D0(gk1.b):boolean");
    }

    @Override // l75.n0
    /* renamed from: updateNotify */
    public boolean mo51732xbf274172(l75.f0 f0Var, boolean z17, java.lang.String[] keys) {
        gk1.b bVar = (gk1.b) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        if (bVar == null) {
            return false;
        }
        if (keys.length >= 0) {
            bVar.f72763xa3c65b86 = -1L;
        }
        return super.mo51732xbf274172(bVar, z17, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (r8.moveToFirst() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        r9.add(r8.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        if (r8.moveToNext() != false) goto L64;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y0(java.lang.String r13, int r14, gk1.f r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk1.g.y0(java.lang.String, int, gk1.f):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:22:0x001f, B:13:0x002e, B:15:0x004a), top: B:21:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "initConfigWC"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            boolean r0 = r7.f158825e2
            if (r0 != 0) goto La
            return
        La:
            java.lang.String r0 = r7.f158811d
            int r1 = r7.f158814g
            int r2 = r7.L
            boolean r3 = com.p314xaae8f345.mm.ui.bk.C()
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r6.f354000e
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
            r4.lock()
            if (r0 == 0) goto L2a
            int r5 = r0.length()     // Catch: java.lang.Throwable -> L28
            if (r5 != 0) goto L26
            goto L2a
        L26:
            r5 = 0
            goto L2b
        L28:
            r7 = move-exception
            goto L54
        L2a:
            r5 = 1
        L2b:
            if (r5 == 0) goto L2e
            goto L4d
        L2e:
            gk1.b r5 = new gk1.b     // Catch: java.lang.Throwable -> L28
            r5.<init>()     // Catch: java.lang.Throwable -> L28
            r5.f69057x28d45f97 = r0     // Catch: java.lang.Throwable -> L28
            r5.f69061x94d24c6d = r1     // Catch: java.lang.Throwable -> L28
            r5.f69058x119cf7dc = r2     // Catch: java.lang.Throwable -> L28
            r5.f69059xf1a1cde8 = r3     // Catch: java.lang.Throwable -> L28
            java.lang.String[] r0 = gk1.g.f353998h     // Catch: java.lang.Throwable -> L28
            int r1 = r0.length     // Catch: java.lang.Throwable -> L28
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L28
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> L28
            boolean r0 = super.get(r5, r0)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L4d
            java.lang.String r0 = r5.f69060xead0d2ac     // Catch: java.lang.Throwable -> L28
            goto L4e
        L4d:
            r0 = 0
        L4e:
            r4.unlock()
            r7.f158837q2 = r0
            return
        L54:
            r4.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gk1.g.z0(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC):void");
    }
}
