package k72;

/* loaded from: classes14.dex */
public class u implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static k72.u B = new k72.u();
    public k72.v A;

    /* renamed from: d, reason: collision with root package name */
    public k72.n f386282d;

    /* renamed from: e, reason: collision with root package name */
    public k72.d0 f386283e;

    /* renamed from: f, reason: collision with root package name */
    public int f386284f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386285g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386286h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386287i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386288m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386289n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f386290o;

    /* renamed from: p, reason: collision with root package name */
    public float f386291p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f386292q;

    /* renamed from: r, reason: collision with root package name */
    public k72.t f386293r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f386294s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f386295t;

    /* renamed from: u, reason: collision with root package name */
    public int f386296u;

    /* renamed from: v, reason: collision with root package name */
    public int f386297v;

    /* renamed from: w, reason: collision with root package name */
    public int f386298w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 f386299x;

    /* renamed from: y, reason: collision with root package name */
    public int f386300y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f386301z = false;

    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = this.f386299x;
        if (activityC13534x1dc4b4e7 != null) {
            int i17 = this.f386300y;
            if (i17 == 0 || i17 == 1) {
                activityC13534x1dc4b4e7.U6("cancel", 90004, null, java.lang.Boolean.valueOf(activityC13534x1dc4b4e7.f181723w));
            } else if (i17 == 2) {
                activityC13534x1dc4b4e7.U6("cancel", 0, null, java.lang.Boolean.valueOf(activityC13534x1dc4b4e7.f181723w));
            } else if (i17 == 3) {
                activityC13534x1dc4b4e7.U6("cancel", 90006, null, java.lang.Boolean.valueOf(activityC13534x1dc4b4e7.f181723w));
            }
        }
    }

    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionMgr", "release, recreate: %s", java.lang.Boolean.valueOf(z17));
        if (this.f386282d != null) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceCheckActionEngine", "release");
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e.wi();
                com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121362x89dacf62();
                com.p314xaae8f345.p3223x6dd56e0.p3241xa8f04c53.C27968xf8db0013.m121317x1db61ec4();
                k72.j.f386258a.f386268j = null;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceCheckActionEngine", e17, "release error", new java.lang.Object[0]);
            }
            this.f386282d = new k72.n();
        }
        if (this.f386283e != null) {
            if (h72.s.e().h()) {
                h72.s.e().d();
            }
            this.f386283e = null;
        }
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f386295t;
            if (n3Var != null) {
                n3Var.mo50283x2f1920ea().f538836b.g();
                this.f386295t = null;
            }
            B = new k72.u();
        }
        k72.v vVar = this.A;
        if (vVar != null) {
            android.hardware.SensorManager sensorManager = vVar.f386302d;
            if (sensorManager != null) {
                sensorManager.unregisterListener(vVar);
            }
            this.A = null;
        }
    }

    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7) {
        vz2.c.j("reqCfg");
        j72.a aVar = new j72.a(this.f386284f, this.f386285g, this.f386286h);
        gm0.j1.d().a(2696, this);
        gm0.j1.d().g(aVar);
        this.f386299x = activityC13534x1dc4b4e7;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a8  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r30, int r31, java.lang.String r32, com.p314xaae8f345.mm.p944x882e457a.m1 r33) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k72.u.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
