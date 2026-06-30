package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class q5 implements com.p314xaae8f345.mm.p944x882e457a.v0, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static boolean f289533y;

    /* renamed from: o, reason: collision with root package name */
    public android.app.Activity f289542o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f289543p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q f289544q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o5 f289545r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m6 f289546s;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f289548u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f289549v;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.C20992x3fea691 f289550w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f289551x;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f289534d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f289535e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f289536f = false;

    /* renamed from: g, reason: collision with root package name */
    public final fp.j f289537g = new fp.j();

    /* renamed from: h, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f289538h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f289539i = false;

    /* renamed from: m, reason: collision with root package name */
    public w11.k0 f289540m = null;

    /* renamed from: n, reason: collision with root package name */
    public android.app.ProgressDialog f289541n = null;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o6 f289547t = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o6();

    public q5() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f289548u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5861xe454507b>(a0Var) { // from class: com.tencent.mm.ui.conversation.InitHelper$1
            {
                this.f39173x3fe91575 = 1192037483;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5861xe454507b c5861xe454507b) {
                am.cp cpVar = c5861xe454507b.f136168g;
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5.this.getClass();
                cpVar.getClass();
                return false;
            }
        };
        this.f289549v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6180xa852c4b2>(a0Var) { // from class: com.tencent.mm.ui.conversation.InitHelper$2
            {
                this.f39173x3fe91575 = -1308291390;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6180xa852c4b2 c6180xa852c4b2) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5.this;
                if (q5Var.f289542o == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "inithelper hasn't initialized");
                } else {
                    q5Var.f289536f = false;
                    q5Var.c();
                }
                return false;
            }
        };
        this.f289551x = false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null || m1Var.mo808xfb85f7b0() != 139) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j6(this, (int) (j18 != 0 ? (j17 * 100) / j18 : 0L)));
    }

    public final void a() {
        android.app.Activity activity = (android.app.Activity) this.f289543p.get();
        if (this.f289551x || activity == null) {
            j35.b.a(activity);
            return;
        }
        this.f289551x = true;
        if (android.os.Build.VERSION.SDK_INT < 33 || activity.getApplicationInfo().targetSdkVersion < 33) {
            j35.b.a(activity);
            return;
        }
        if (j35.u.d(activity, "android.permission.POST_NOTIFICATIONS", true)) {
            j35.b.a(activity);
            return;
        }
        if (j35.u.f("android.permission.POST_NOTIFICATIONS", 160) != 0 && !z2.h.b(activity, "android.permission.POST_NOTIFICATIONS")) {
            j35.b.a(activity);
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(160, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u5(this, activity), "android.permission.POST_NOTIFICATIONS");
    }

    public final boolean b(int i17, int i18, int i19) {
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InitHelper", "account not ready");
            return false;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_UPDATE_UPDATE_FLAG_LONG;
        long k17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) p17.m(u3Var, null), 0L);
        long k18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_UPDATE_UPDATE_TIME_LONG, null), 0L);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p18 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_UPDATE_UPDATE_VERION_LONG;
        long k19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) p18.m(u3Var2, null), 0L);
        c01.d9.b().p().x(u3Var, 0L);
        c01.d9.b().p().x(u3Var2, 0L);
        if (k19 == o45.wf.f424562g && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(k18) < 3600) {
            if (k17 == 1) {
                if (com.p314xaae8f345.mm.ui.qc.b(this.f289542o, 4, -17, null)) {
                    return true;
                }
            } else if (k17 == 2 && com.p314xaae8f345.mm.ui.qc.b(this.f289542o, 4, -16, null)) {
                return true;
            }
        }
        if (i17 != 4) {
            return false;
        }
        if (i18 != -16 && i18 != -17) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "trigger check update: errCode:%d, sceneType:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (x51.o1.f533588h) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - 86400) - 1).commit();
        }
        return com.p314xaae8f345.mm.ui.qc.b(this.f289542o, i17, i18, null);
    }

    public final void c() {
        if (this.f289536f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "summerinit doPreCreate but hasTryDoInitButFailed true ret");
            return;
        }
        if (!this.f289538h.isHeld()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InitHelper", "tryDoInit wakelock.acquire!");
            android.os.PowerManager.WakeLock wakeLock = this.f289538h;
            yj0.a.c(wakeLock, "com/tencent/mm/ui/conversation/InitHelper", "doInit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/ui/conversation/InitHelper", "doInit", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        yf5.j0 j0Var = ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) this.f289546s).f288912v;
        if (j0Var != null) {
            ((yf5.w0) j0Var).f543527z = true;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501 c5306x8769501 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5306x8769501();
        c5306x8769501.f135626g.f88169a = 1;
        c5306x8769501.e();
        if (this.f289540m == null) {
            if (p94.w0.c() != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2 e2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c();
                e2Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("attachCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
                e2Var.f247503d = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("attachCache", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            }
            this.f289540m = new w11.k0(this, this.f289542o);
            fp.j jVar = this.f289537g;
            jVar.a();
            this.f289540m.hashCode();
            jVar.b();
            c01.d9.e().g(this.f289540m);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i6(this));
    }

    public void d() {
        android.os.PowerManager.WakeLock wakeLock = this.f289538h;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InitHelper", "onTabPause wakelock.release!");
        android.os.PowerManager.WakeLock wakeLock2 = this.f289538h;
        yj0.a.c(wakeLock2, "com/tencent/mm/ui/conversation/InitHelper", "onTabPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock2.release();
        yj0.a.f(wakeLock2, "com/tencent/mm/ui/conversation/InitHelper", "onTabPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5.e():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x020e  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r27, int r28, java.lang.String r29, com.p314xaae8f345.mm.p944x882e457a.m1 r30) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
