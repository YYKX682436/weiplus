package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.g {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a f234441a = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean[] f234442b = {false};

    /* renamed from: c, reason: collision with root package name */
    public static boolean f234443c = true;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(jh.c0 r14) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a.a(jh.c0):void");
    }

    public static boolean b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BacktraceLogic", "setup WeChatBacktrace");
        if (f234442b[0]) {
            return true;
        }
        synchronized (f234442b) {
            if (f234442b[0]) {
                return true;
            }
            f234442b[0] = c(z17);
            return f234442b[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(boolean r4) {
        /*
            java.lang.String r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            boolean r0 = z65.c.a()
            java.lang.Class<e42.e0> r1 = e42.e0.class
            r2 = 1
            r3 = 0
            if (r4 != 0) goto L21
            if (r0 != 0) goto L21
            i95.m r4 = i95.n0.c(r1)
            e42.e0 r4 = (e42.e0) r4
            e42.d0 r0 = e42.d0.clicfg_wechat_backtrace_enable
            h62.d r4 = (h62.d) r4
            boolean r4 = r4.fj(r0, r3)
            if (r4 == 0) goto L1f
            goto L21
        L1f:
            r4 = r3
            goto L22
        L21:
            r4 = r2
        L22:
            java.lang.String r0 = "MicroMsg.BacktraceLogic"
            if (r4 != 0) goto L2c
            java.lang.String r4 = "WeChat backtrace not enabled"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r4)
            return r3
        L2c:
            i95.m r4 = i95.n0.c(r1)
            e42.e0 r4 = (e42.e0) r4
            e42.d0 r1 = e42.d0.clicfg_pthread_hook_with_quikcen
            h62.d r4 = (h62.d) r4
            boolean r4 = r4.fj(r1, r3)
            com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a.f234443c = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = "WeChat backtrace enabled, pthread quicken %s."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1, r4)
            jh.g0 r4 = jh.e0.f381231a
            gm0.a0 r0 = gm0.j1.p()
            km0.b r0 = r0.a()
            km0.c r0 = (km0.c) r0
            android.app.Application r0 = r0.f390522c
            monitor-enter(r4)
            jh.c0 r1 = r4.f381240c     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto L60
            jh.c0 r0 = r4.f381240c     // Catch: java.lang.Throwable -> L98
            monitor-exit(r4)
            goto L6c
        L60:
            jh.c0 r1 = new jh.c0     // Catch: java.lang.Throwable -> L98
            r1.<init>(r0, r4)     // Catch: java.lang.Throwable -> L98
            r4.f381240c = r1     // Catch: java.lang.Throwable -> L98
            r4.f381238a = r2     // Catch: java.lang.Throwable -> L98
            jh.c0 r0 = r4.f381240c     // Catch: java.lang.Throwable -> L98
            monitor-exit(r4)
        L6c:
            boolean r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k
            if (r4 == 0) goto L88
            jh.d0 r4 = jh.d0.Fp
            boolean r1 = r0.f381219n
            if (r1 == 0) goto L77
            goto L79
        L77:
            r0.f381208c = r4
        L79:
            boolean r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a.f234443c
            if (r4 == 0) goto L94
            a(r0)
            boolean r4 = r0.f381219n
            if (r4 == 0) goto L85
            goto L94
        L85:
            r0.f381210e = r2
            goto L94
        L88:
            a(r0)
            jh.d0 r4 = jh.d0.Quicken
            boolean r1 = r0.f381219n
            if (r1 == 0) goto L92
            goto L94
        L92:
            r0.f381208c = r4
        L94:
            r0.a()
            return r2
        L98:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.a.c(boolean):boolean");
    }
}
