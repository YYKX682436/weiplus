package ze;

/* loaded from: classes7.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 implements u81.f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g {
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga V1;
    public java.lang.Boolean W1;
    public volatile si1.g X1;
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b Y1;
    public final xh1.g[] Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[] f553274a2;

    /* renamed from: b2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[] f553275b2;

    /* renamed from: c2, reason: collision with root package name */
    public final bm5.i1 f553276c2;

    /* renamed from: d2, reason: collision with root package name */
    public final bm5.i1 f553277d2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f553278e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f553279f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f553280g2;

    /* renamed from: h2, reason: collision with root package name */
    public volatile android.os.PowerManager.WakeLock f553281h2;

    public n(xi1.g gVar) {
        super(gVar.mo52325x76847179());
        this.f156329e = null;
        this.f156331g = gVar;
        this.W1 = null;
        this.Y1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b.f167633f;
        this.Z1 = new xh1.g[]{null};
        this.f553274a2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[]{null};
        this.f553275b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[]{null};
        this.f553276c2 = bm5.i1.a(new bm5.h1() { // from class: ze.n$$a
            @Override // bm5.h1
            public final java.lang.Object a() {
                ze.n nVar = ze.n.this;
                nVar.getClass();
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.me(nVar);
            }
        }, new ze.C30837x328cb4());
        this.f553277d2 = bm5.i1.a(new bm5.h1() { // from class: ze.n$$c
            @Override // bm5.h1
            public final java.lang.Object a() {
                ze.n nVar = ze.n.this;
                nVar.getClass();
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.rd(nVar);
            }
        }, new ze.C30839x328cb6());
        this.f553281h2 = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void C1(boolean z17, int i17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeLU", "reportCapsuleBlinkMutation isStart:%b, status:%d, isCustomStatus:%b", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z18));
        X1((z17 ? mi1.y0.f408263e : mi1.y0.f408264f).f408266d, (z18 ? i17 == 1 ? mi1.z0.f408277m : i17 == 0 ? mi1.z0.f408278n : mi1.z0.f408272e : mi1.a1.e(i17)).f408280d, (this.f156354z.f408240f.f408198f.f408100a > 0 ? mi1.z0.f408273f : mi1.z0.f408272e).f408280d);
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.SUSPEND == bVar) {
            android.os.PowerManager.WakeLock wakeLock = this.f553281h2;
            this.f553281h2 = null;
            v2(wakeLock);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void D1(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeLU", "reportCapsuleMutationClick type:%d", java.lang.Integer.valueOf(i17));
        mi1.y0 y0Var = mi1.y0.f408263e;
        mi1.z0 z0Var = mi1.z0.f408272e;
        X1(3, i17, 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void E1(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeLU", "reportCapsuleBlinkMutation isStart:%b type:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        X1((z17 ? mi1.y0.f408263e : mi1.y0.f408264f).f408266d, i17, mi1.a1.d(this).f408280d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public final boolean M0() {
        return u0().f128818z1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if ((r2 == 1101) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x004c, code lost:
    
        if ((r0 != 1011 || r0 == 1012 || r0 == 1013) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 r10) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.n.U1(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 W() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h b17;
        if (E0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.AppBrandRuntimeLU", "createFileSystem but get NUL sysConfig, appId:%s", this.f156336n);
            b17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.h();
        } else {
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.a.b(u0());
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2(this, b17);
    }

    public final void W1() {
        android.os.PowerManager.WakeLock wakeLock = this.f553281h2;
        if (!Z1()) {
            v2(wakeLock);
            return;
        }
        if (wakeLock == null || !wakeLock.isHeld()) {
            android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) this.f156328d.getSystemService("power")).newWakeLock(1, "wx:appbrand_headless");
            newWakeLock.setReferenceCounted(false);
            if (!newWakeLock.isHeld()) {
                K("acquireWakeLock", new java.lang.Object[0]);
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                aVar.c(60000L);
                yj0.a.d(newWakeLock, aVar.b(), "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "acquireWakeLock", "()Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
                zj0.c.f554818a.set(aVar);
                long longValue = ((java.lang.Long) aVar.a(0)).longValue();
                zj0.c.a();
                newWakeLock.acquire(longValue);
                yj0.a.f(newWakeLock, "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "acquireWakeLock", "()Landroid/os/PowerManager$WakeLock;", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "(J)V");
            }
            this.f553281h2 = newWakeLock;
        }
    }

    public final void X1(int i17, int i18, int i19) {
        if (i17 <= 0 || i18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WXA.AppBrandRuntimeLU", "action <= 0 || type <= 0");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2 j2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j2.class);
        java.lang.String str = this.f156336n;
        java.lang.String t17 = x0() != null ? u46.l.t(nf.z.a(x0().m52170xad58292c()), 0, 1024) : "";
        java.lang.String t18 = x0() != null ? u46.l.t(nf.z.b(x0().m52170xad58292c()), 0, 1024) : "";
        if (u0() != null) {
            java.lang.String str2 = u0().f128809v;
        }
        int g27 = g2();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1198x697f164.a) j2Var;
        aVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7069x78a358ec c7069x78a358ec = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7069x78a358ec();
        c7069x78a358ec.f143758d = i17;
        c7069x78a358ec.f143759e = i18;
        c7069x78a358ec.f143760f = i19;
        c7069x78a358ec.f143761g = c7069x78a358ec.b("appid", str, true);
        c7069x78a358ec.f143762h = c7069x78a358ec.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, t17, true);
        c7069x78a358ec.f143763i = c7069x78a358ec.b("query", t18, true);
        c7069x78a358ec.f143764j = c7069x78a358ec.b("sessionid", c7069x78a358ec.f143764j, true);
        c7069x78a358ec.f143765k = g27;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(aVar.f170766d, c7069x78a358ec.n());
        c7069x78a358ec.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public ph1.h Y() {
        return E0() != null && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(E0().f387385r.f156935g) || u0().k()) ? new ph1.g0(this) : new ve.b(this, null);
    }

    public android.graphics.Bitmap Y1() {
        mi1.v vVar = this.f156354z;
        if (vVar != null && vVar.f408236b != null) {
            vVar.c().cancelPendingInputEvents();
        }
        if (D0() != null) {
            D0().m53052x1dd8af86();
        }
        try {
            if (x0() != null) {
                x0().m52169xfdaa7672().mo14682x9dee9c37().r1().cancelPendingInputEvents();
            }
        } catch (java.lang.NullPointerException unused) {
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ie.b(this.f156343s);
    }

    public final boolean Z1() {
        return !L0() && com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.HEADLESS == u0().W1;
    }

    public final boolean a2() {
        if (L0()) {
            return false;
        }
        return u0().W1.h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void b1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.f.a();
        java.util.ArrayList arrayList = u0().O1;
        if (!(arrayList == null || arrayList.isEmpty())) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.u0(arrayList, null), 2, null);
        }
        W1();
        u81.h hVar = this.N;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.AppBrandRuntimeLU", "installOnRunningStateChangedListener, runningStateController is null");
        } else {
            hVar.a(this);
        }
    }

    public boolean b2() {
        return 1030 == l2().f169323f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void c1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h hVar;
        super.c1();
        android.os.PowerManager.WakeLock wakeLock = this.f553281h2;
        this.f553281h2 = null;
        v2(wakeLock);
        u81.h hVar2 = this.N;
        if (hVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.AppBrandRuntimeLU", "uninstallOnRunningStateChangedListener, runningStateController is null");
        } else {
            hVar2.c(this);
        }
        xe.g.f535275c.remove(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar = this.V1;
        if (gaVar != null) {
            if (gaVar.getParent() instanceof android.view.ViewGroup) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar2 = this.V1;
                java.lang.String str = gaVar2.f171270d.f156336n;
                java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.f168884a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f) hashMap.get(str);
                if (fVar != null) {
                    hashMap.remove(str);
                    fVar.h();
                }
                gaVar2.animate().alpha(0.0f).setDuration(500L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ba(gaVar2));
                ((android.view.ViewGroup) this.V1.getParent()).removeView(this.V1);
            }
            this.V1 = null;
        }
        if (this.X1 != null) {
            si1.g gVar = this.X1;
            synchronized (gVar.f489783d) {
                gVar.f489783d.clear();
            }
        }
        ui1.t.f509615d.g(this.f156336n);
        this.X1 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[][] hVarArr = {this.f553274a2, this.f553275b2};
        for (int i17 = 0; i17 < 2; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[] hVarArr2 = hVarArr[i17];
            synchronized (hVarArr2) {
                hVar = hVarArr2[0];
                hVarArr2[0] = null;
            }
            if (hVar != null) {
                hVar.h();
            }
        }
        xh1.g[] gVarArr = this.Z1;
        if (gVarArr != null) {
            synchronized (gVarArr) {
                xh1.g gVar2 = this.Z1[0];
                if (gVar2 != null) {
                    try {
                        gVar2.c();
                        this.Z1[0] = null;
                    } catch (java.lang.Throwable th6) {
                        this.Z1[0] = null;
                        throw th6;
                    }
                }
            }
        }
        this.f553276c2.c();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga c2() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga(r0(), this);
    }

    public final int d2() {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(this.f156338p.f158814g)) {
            return 0;
        }
        return u0().L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void e1() {
        this.Y1 = u0().X1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g
    /* renamed from: e2, reason: merged with bridge method [inline-methods] */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f L() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h hVar = this.f553274a2[0];
        if (hVar != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f) hVar;
        }
        if (L0()) {
            return null;
        }
        synchronized (this.f553274a2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h hVar2 = this.f553274a2[0];
            if (hVar2 != null) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f) hVar2;
            }
            com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0 = E0();
            int i17 = (E0 != null ? E0.Y : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b()).R;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[] hVarArr = this.f553274a2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.f(i17);
            hVarArr[0] = fVar;
            return fVar;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void f1() {
        if (this.X1 == null) {
            throw new java.lang.IllegalStateException("Should ensure ApiPermissionController installed before init. Use #setApiPermissionController().");
        }
        if ((Z1() || 4 == u0().f128817z) && android.text.TextUtils.isEmpty(u0().f158816i) && !android.text.TextUtils.isEmpty(u0().f128814y)) {
            u0().f158816i = u0().f128814y;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.g
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l B() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h hVar = this.f553275b2[0];
        if (hVar != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l) hVar;
        }
        if (L0()) {
            return null;
        }
        synchronized (this.f553275b2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[] hVarArr = this.f553275b2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h hVar2 = hVarArr[0];
            if (hVar2 != null) {
                return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l) hVar2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l(this.f156336n);
            hVarArr[0] = lVar;
            return lVar;
        }
    }

    public int g2() {
        return l2().f169323f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void h1() {
        boolean z17;
        xe.g gVar = xe.g.f535273a;
        xe.c cVar = xe.g.f535274b;
        final xe.e eVar = new xe.e(this);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = ((xe.d) cVar).f535270a;
        try {
            z17 = copyOnWriteArrayList.removeIf(new java.util.function.Predicate(eVar) { // from class: xe.f

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ yz5.l f535272a;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "function");
                    this.f535272a = eVar;
                }

                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(java.lang.Object obj) {
                    return ((java.lang.Boolean) this.f535272a.mo146xb9724478(obj)).booleanValue();
                }
            });
        } catch (java.lang.UnsupportedOperationException unused) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                xe.b bVar = (xe.b) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
                if (((java.lang.Boolean) eVar.mo146xb9724478(bVar)).booleanValue()) {
                    copyOnWriteArrayList.remove(bVar);
                    z17 = true;
                    break;
                }
            }
        }
        if (!z17) {
            xe.g.f535275c.add(this);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("register with rt(appId:");
        sb6.append(this.f156336n);
        sb6.append(", instanceId:");
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u07 = u0();
        java.lang.String str = u07 != null ? u07.f128810w : null;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("), but finished by pending message.");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageClientProcessMessageDispatcher", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    /* renamed from: h2, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2 mo48802x59eafec1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2) super.mo48802x59eafec1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    /* renamed from: i2, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 u0() {
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) this.f156338p;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    /* renamed from: j2, reason: merged with bridge method [inline-methods] */
    public we.a x0() {
        return (we.a) this.f156342r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void k0(java.lang.Object obj) {
        if (u0().f128813x1 != null) {
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5.class.cast(obj);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5 c11542x677b32c5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5) obj;
                if (c11542x677b32c5 == null) {
                    c11542x677b32c5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5.f156406g;
                }
                K("doNotifyReturnData call onNavigateBackToWxAppResultListener", new java.lang.Object[0]);
                u0().f128813x1.a(c11542x677b32c5);
            } catch (java.lang.ClassCastException e17) {
                throw new java.lang.IllegalStateException("Only data as MiniProgramNavigationBackResult acceptable here.", e17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    /* renamed from: k2, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y C0() {
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) this.f156341q;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void l1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        if (K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class) == null) {
            x1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11653xaba0e3b3.f156903n);
        }
        p2();
        N1(new ne.e(this), false);
        e9Var.N0(mo48803xee5260a9());
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 l2() {
        return u0().f128802b2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void m1() {
        super.m1();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.f(this) && this.V1 == null) {
            java.lang.String str = this.f156336n;
            java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.h.f168884a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f) hashMap.get(str);
            if (fVar == null) {
                fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.f(this);
                hashMap.put(str, fVar);
            }
            fVar.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga c27 = c2();
            this.V1 = c27;
            if (c27 != null) {
                this.f156343s.addView(c27);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar = this.V1;
                ze.n nVar = gaVar.f171270d;
                java.lang.String str2 = nVar.f156336n;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar2 = nVar.V1;
                c01.l2 e17 = c01.n2.d().e(str2 + "performance_data");
                if (gaVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPerformanceManager", "insertCachedPerformanceData panel is not ready.");
                } else if (e17 != null) {
                    for (java.lang.String str3 : ((java.util.concurrent.ConcurrentHashMap) e17.f118838a).keySet()) {
                        java.lang.String str4 = (java.lang.String) e17.b(str3);
                        if (str4 != null) {
                            ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ca(gaVar2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str3, 0), str4));
                        }
                    }
                }
                java.lang.String str5 = nVar.f156336n;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar3 = nVar.V1;
                c01.l2 e18 = c01.n2.d().e(str5 + "performance_custom_data");
                if (gaVar3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPerformanceManager", "insertCachedCustomData panel is not ready.");
                } else if (e18 != null) {
                    for (java.lang.String str6 : ((java.util.concurrent.ConcurrentHashMap) e18.f118838a).keySet()) {
                        java.lang.String str7 = (java.lang.String) e18.b(str6);
                        if (str7 != null) {
                            ik1.h0.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.da(gaVar3, str6, str7));
                        }
                    }
                }
                gaVar.setVisibility(0);
                gaVar.setAlpha(0.0f);
                gaVar.animate().alpha(1.0f).setDuration(500L).setStartDelay(500L).setListener(null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    /* renamed from: m2, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 E0() {
        return (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) p0(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052.class, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void n1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718, java.lang.Object obj) {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5.class.cast(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = u0().f128802b2;
            if (c12559xbdae8559 != null && c12559xbdae8559.f169323f != 1038) {
                this.f553280g2 = c12559xbdae8559;
            }
            com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 mo32063x5a5dd5d = u0().mo32063x5a5dd5d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = mo32063x5a5dd5d.D;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5 c11542x677b32c5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11542x677b32c5) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc982 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
            c11812xa040dc982.f158856e = c11808xe47dc718.f158811d;
            c11812xa040dc982.f158855d = 3;
            c11812xa040dc982.f158857f = c11542x677b32c5 == null ? null : c11542x677b32c5.f156408e.toString();
            c11812xa040dc982.f158858g = c11542x677b32c5 == null ? null : c11542x677b32c5.f156409f.toString();
            c11812xa040dc98.b(c11812xa040dc982);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85592 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
            c12559xbdae85592.f169323f = 1038;
            if (c11808xe47dc718 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(c11808xe47dc718.f158811d);
                sb6.append(':');
                com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) c11808xe47dc718;
                sb6.append(c3897xbc286aa1.f128809v);
                sb6.append(':');
                sb6.append(c3897xbc286aa1.f128817z + 1000);
                c12559xbdae85592.f169324g = sb6.toString();
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            mo32063x5a5dd5d.I = java.lang.System.currentTimeMillis();
            mo32063x5a5dd5d.f158816i = null;
            mo32063x5a5dd5d.m();
            mo32063x5a5dd5d.f128802b2 = c12559xbdae85592;
            e0(mo32063x5a5dd5d);
        } catch (java.lang.ClassCastException e17) {
            throw new java.lang.IllegalStateException("Only data as MiniProgramNavigationBackResult acceptable here.", e17);
        }
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b o2() {
        return this.Y1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public lm0.a p1(java.lang.Class cls) {
        return null;
    }

    public final void p2() {
        if (p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5.class, false) == null) {
            N1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u5((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) K1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(this, false)), false);
        }
    }

    public final boolean q2() {
        return u0().k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2
    public void r1() {
        java.util.LinkedList linkedList;
        si1.g gVar = this.X1;
        synchronized (gVar.f489783d) {
            linkedList = new java.util.LinkedList(gVar.f489783d);
            gVar.f489783d.clear();
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((si1.k) it.next()).a(si1.j.f489802g);
        }
    }

    public final boolean r2() {
        return u0().g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if ((r0 == 1101) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s2() {
        /*
            r4 = this;
            java.lang.Boolean r0 = r4.W1
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            com.tencent.luggage.sdk.config.AppBrandInitConfigLU r0 = r4.u0()
            boolean r1 = r0.G
            r2 = 0
            if (r1 == 0) goto L33
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r0 = r0.f128802b2
            int r0 = r0.f169323f
            r1 = 1011(0x3f3, float:1.417E-42)
            r3 = 1
            if (r0 == r1) goto L26
            r1 = 1012(0x3f4, float:1.418E-42)
            if (r0 == r1) goto L26
            r1 = 1013(0x3f5, float:1.42E-42)
            if (r0 != r1) goto L24
            goto L26
        L24:
            r1 = r2
            goto L27
        L26:
            r1 = r3
        L27:
            if (r1 != 0) goto L32
            r1 = 1101(0x44d, float:1.543E-42)
            if (r0 != r1) goto L2f
            r0 = r3
            goto L30
        L2f:
            r0 = r2
        L30:
            if (r0 == 0) goto L33
        L32:
            r2 = r3
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.W1 = r0
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.n.s2():boolean");
    }

    public boolean t2() {
        return false;
    }

    public final void u2(com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        if (c3897xbc286aa1 == null || c12559xbdae8559 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar = this.f156329e;
        if (hcVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WXA.AppBrandRuntimeLU", "load with self.appId[%s] config[%s] stat[%d], skip by NULL container", this.f156336n, c3897xbc286aa1.f158811d, java.lang.Integer.valueOf(c12559xbdae8559.f169323f));
            return;
        }
        if (hcVar instanceof ze.l) {
            ze.l lVar = (ze.l) hcVar;
            lVar.w().runOnUiThread(new ze.h(lVar, this, c3897xbc286aa1, c12559xbdae8559));
        } else if (!(hcVar instanceof ze.m)) {
            hcVar.j(this, c3897xbc286aa1);
        } else {
            c3897xbc286aa1.f128802b2 = c12559xbdae8559;
            ((ze.m) hcVar).j(this, c3897xbc286aa1);
        }
    }

    public final void v2(android.os.PowerManager.WakeLock wakeLock) {
        if (wakeLock != null && wakeLock.isHeld()) {
            K("releaseWakeLock", new java.lang.Object[0]);
            yj0.a.c(wakeLock, "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            wakeLock.release();
            yj0.a.f(wakeLock, "com/tencent/luggage/sdk/runtime/AppBrandRuntimeLU", "releaseWakeLock", "(Landroid/os/PowerManager$WakeLock;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    public void w2() {
    }

    public boolean x2() {
        return false;
    }

    public boolean y2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 c11808xe47dc718) {
        return !android.text.TextUtils.isEmpty(c11808xe47dc718.f158816i);
    }

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc hcVar) {
        super(hcVar.h());
        this.f156329e = hcVar;
        this.f156330f.addLast(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.z5(hcVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntime", "addAppBrandRuntimePageStack  " + this.f156330f.peekLast());
        this.f156331g = null;
        this.W1 = null;
        this.Y1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p1163x88633665.C12444x48c806b.f167633f;
        this.Z1 = new xh1.g[]{null};
        this.f553274a2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[]{null};
        this.f553275b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.h[]{null};
        this.f553276c2 = bm5.i1.a(new bm5.h1() { // from class: ze.n$$a
            @Override // bm5.h1
            public final java.lang.Object a() {
                ze.n nVar = ze.n.this;
                nVar.getClass();
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.me(nVar);
            }
        }, new ze.C30837x328cb4());
        this.f553277d2 = bm5.i1.a(new bm5.h1() { // from class: ze.n$$c
            @Override // bm5.h1
            public final java.lang.Object a() {
                ze.n nVar = ze.n.this;
                nVar.getClass();
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.rd(nVar);
            }
        }, new ze.C30839x328cb6());
        this.f553281h2 = null;
    }
}
