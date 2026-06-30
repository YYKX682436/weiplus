package va3;

/* loaded from: classes15.dex */
public class v0 implements com.p314xaae8f345.mm.p944x882e457a.u0, q21.b {
    public va3.w0 I;

    /* renamed from: f, reason: collision with root package name */
    public i11.e f515884f;

    /* renamed from: g, reason: collision with root package name */
    public va3.f0 f515885g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f515887i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f515888m;

    /* renamed from: o, reason: collision with root package name */
    public int f515890o;

    /* renamed from: p, reason: collision with root package name */
    public r45.mw6 f515891p;

    /* renamed from: d, reason: collision with root package name */
    public int f515882d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f515883e = 1000;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f515886h = new java.util.HashSet();

    /* renamed from: n, reason: collision with root package name */
    public int f515889n = 1;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 f515892q = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23(false);

    /* renamed from: r, reason: collision with root package name */
    public boolean f515893r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f515894s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f515895t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f515896u = this.f515889n;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f515897v = "";

    /* renamed from: w, reason: collision with root package name */
    public boolean f515898w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f515899x = false;

    /* renamed from: y, reason: collision with root package name */
    public va3.t0 f515900y = null;

    /* renamed from: z, reason: collision with root package name */
    public int f515901z = -1;
    public boolean A = true;
    public long B = 0;
    public long C = 0;
    public double D = -1000.0d;
    public double E = -1000.0d;
    public int F = -1;
    public long G = 0;
    public int H = 0;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f515881J = new va3.q0(this, android.os.Looper.getMainLooper());
    public final i11.c K = new va3.r0(this);
    public final va3.d0 L = new va3.s0(this);

    public final va3.w0 a(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i19, boolean z17, boolean z18) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        va3.w0 w0Var = new va3.w0();
        w0Var.f515902a = i17;
        w0Var.f515903b = i18;
        w0Var.f515904c = str2;
        w0Var.f515907f = str3;
        w0Var.f515905d = z17;
        w0Var.f515911j = z17;
        w0Var.f515912k = z18;
        w0Var.f515910i = i19;
        w0Var.f515906e = str.endsWith("@chatroom") ? 1 : 2;
        w0Var.f515908g = currentTimeMillis - j17;
        if (i17 == 4 && !str3.isEmpty() && str3.contains("_TS")) {
            try {
                w0Var.f515909h = currentTimeMillis - java.lang.Long.parseLong(str3.substring(str3.lastIndexOf("_TS") + 3));
            } catch (java.lang.NumberFormatException unused) {
                w0Var.f515909h = 0L;
            }
        }
        return w0Var;
    }

    public void b(int i17) {
        ua3.a c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.TrackRefreshManager", "track endTrack");
        if (d()) {
            java.lang.String str = this.f515887i;
            this.I = a(4, 0, this.f515897v, str, this.f515888m, this.G, this.H, false, false);
            ya3.a aVar = new ya3.a(str);
            ((r45.xl0) aVar.f542122e.f152243a.f152217a).f471743e = i17;
            gm0.j1.d().g(aVar);
            this.f515887i = "";
            this.f515888m = "";
            this.G = 0L;
            this.H = 0;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f515897v) && (c17 = va3.j0.Ui().c(this.f515897v)) != null) {
            c17.f507503e.remove(c01.z1.r());
            va3.j0.Ui().g(this.f515897v, c17.f507503e, c17.f507505g, c17.f507504f, c17.f507506h, null, null);
        }
        va3.z0 Ui = va3.j0.Ui();
        ua3.b bVar = Ui.f515930b;
        if (bVar != null) {
            bVar.f507509e = "";
        }
        Ui.d(bVar);
        this.f515887i = "";
        this.f515888m = "";
        this.f515897v = "";
        this.f515893r = false;
        this.f515894s = false;
        this.D = -1000.0d;
        this.E = -1000.0d;
        this.F = -1;
        this.f515901z = -1;
    }

    public boolean c() {
        return d() && this.f515893r;
    }

    public boolean d() {
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f515887i);
    }

    public final void e() {
        if (!this.f515895t || !this.f515893r || this.f515892q == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("error to exit refresh isStart: ");
            sb6.append(this.f515895t);
            sb6.append(" isShared: ");
            sb6.append(this.f515893r);
            sb6.append(" ");
            sb6.append(this.f515892q == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.TrackRefreshManager", sb6.toString());
            return;
        }
        r45.mw6 mw6Var = this.f515891p;
        if (mw6Var != null) {
            r45.wa5 wa5Var = mw6Var.f462406e;
            if (wa5Var.f470544d != -1000.0d && wa5Var.f470545e != -1000.0d) {
                java.lang.String r17 = c01.z1.r();
                r45.io6 io6Var = new r45.io6();
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = this.f515892q;
                io6Var.f458758g = c16279x64cea23.f226122h;
                io6Var.f458755d = c16279x64cea23.f226119e;
                io6Var.f458756e = c16279x64cea23.f226120f;
                io6Var.f458757f = r17;
                r45.mw6 mw6Var2 = this.f515891p;
                mw6Var2.f462405d = r17;
                r45.wa5 wa5Var2 = mw6Var2.f462406e;
                va3.f0 Bi = va3.j0.Bi();
                wa5Var2.f470546f = Bi.f515819i ? Bi.f515814d : Bi.f515818h;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("refreshLoopImpl, [trackRoomId:");
                sb7.append(this.f515887i);
                sb7.append("]");
                int i17 = this.f515889n;
                if (i17 != 0 && i17 != 1 && i17 != 2 && i17 == 3) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[ trackItem ");
                    sb8.append(io6Var.f458755d);
                    sb8.append(" ");
                    sb8.append(io6Var.f458756e);
                    sb8.append(" ]");
                }
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[ mMyPosiItem ");
                sb9.append(this.f515891p.f462406e.f470544d);
                sb9.append(" ");
                sb9.append(this.f515891p.f462406e.f470545e);
                sb9.append(" ");
                sb9.append(this.f515891p.f462406e.f470546f);
                sb9.append(" ]");
                java.lang.String str = this.f515887i;
                int i18 = this.f515889n;
                r45.mw6 mw6Var3 = this.f515891p;
                int i19 = this.f515890o + 1;
                this.f515890o = i19;
                gm0.j1.d().g(new ya3.c(str, i18, mw6Var3, i19, io6Var));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicorMsg.TrackRefreshManager", "error to get my location ");
        this.f515881J.mo50307xb9e94560(1, this.f515883e);
    }

    public final void f(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        int i19;
        int i27;
        if (z17) {
            i19 = i17 != 0 ? (i17 == 3 || i17 != 4) ? 7 : 8 : 6;
        } else if (i17 == 0) {
            i19 = 1;
        } else {
            if (i17 != 3 && i17 == 4) {
                i27 = 3;
                va3.x0.a(a(i27, i18, this.f515897v, this.f515887i, this.f515888m, this.G, this.H, z18, z19));
            }
            i19 = 2;
        }
        i27 = i19;
        va3.x0.a(a(i27, i18, this.f515897v, this.f515887i, this.f515888m, this.G, this.H, z18, z19));
    }

    public void g() {
        this.f515899x = false;
        if (d()) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h e17 = i11.h.e();
            this.f515884f = e17;
            e17.j(this.K, true);
            if (this.f515885g == null) {
                this.f515885g = va3.j0.Bi();
            }
            this.f515885g.a(this.L);
            e();
        }
    }

    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.TrackRefreshManager", "stop location");
        i11.e eVar = this.f515884f;
        if (eVar != null) {
            ((i11.h) eVar).m(this.K);
        }
        va3.f0 f0Var = this.f515885g;
        if (f0Var != null) {
            f0Var.c(this.L);
        }
        gm0.j1.d().q(uc1.o.f76896x366c91de, this);
        gm0.j1.d().q(490, this);
        this.f515889n = 1;
        this.f515895t = false;
        this.f515901z = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:274:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0641  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r27, int r28, java.lang.String r29, com.p314xaae8f345.mm.p944x882e457a.m1 r30) {
        /*
            Method dump skipped, instructions count: 1999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va3.v0.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
