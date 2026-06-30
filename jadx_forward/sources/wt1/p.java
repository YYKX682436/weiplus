package wt1;

/* loaded from: classes13.dex */
public class p implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f530852d;

    /* renamed from: e, reason: collision with root package name */
    public tt1.j f530853e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f530854f;

    /* renamed from: r, reason: collision with root package name */
    public r45.gn f530863r;

    /* renamed from: s, reason: collision with root package name */
    public wt1.t f530864s;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f530855g = false;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f530856h = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f530857i = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public boolean f530858m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f530859n = false;

    /* renamed from: o, reason: collision with root package name */
    public volatile float f530860o = -85.0f;

    /* renamed from: p, reason: collision with root package name */
    public volatile float f530861p = -1000.0f;

    /* renamed from: q, reason: collision with root package name */
    public boolean f530862q = false;

    /* renamed from: t, reason: collision with root package name */
    public int f530865t = 60;

    /* renamed from: u, reason: collision with root package name */
    public long f530866u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f530867v = 0;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f530868w = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new wt1.q(this), false);

    public final void a(java.lang.String str, byte[] bArr, float f17, float f18, int i17, boolean z17, boolean z18) {
        gm0.j1.n().f354821b.g(new xt1.p0(str, bArr, f17, f18, i17, z17, z18));
    }

    public void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.lang.String str, tt1.j jVar, float f17, float f18) {
        this.f530855g = true;
        this.f530852d = abstractActivityC21394xb3d2c0cf;
        this.f530854f = str;
        this.f530853e = jVar;
        this.f530860o = f17;
        this.f530861p = f18;
        this.f530858m = jVar.s0().f470090p1;
        this.f530859n = jVar.i0().F;
        this.f530863r = jVar.s0().f470100x1;
        this.f530865t = jVar.s0().f470100x1 == null ? 60 : jVar.s0().f470100x1.f456901e;
        this.f530862q = (jVar.s0().f470100x1 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.s0().f470100x1.f456900d)) ? false : true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "init cardId:%s, needLocation:%b, isLocationAuth:%b needBluetooth:%b reportTime:%d", str, java.lang.Boolean.valueOf(this.f530858m), java.lang.Boolean.valueOf(this.f530859n), java.lang.Boolean.valueOf(this.f530862q), java.lang.Integer.valueOf(this.f530865t));
        if (this.f530858m && !this.f530859n) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f530853e.s0().f470103y1) ? this.f530853e.s0().f470086n : this.f530853e.s0().f470103y1;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f530852d;
            db5.e1.u(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aun, str2), this.f530852d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new wt1.r(this), new wt1.s(this));
        }
        if (this.f530862q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "initBluetoothHelper blueToothInfo.name:%s", this.f530863r.f456900d);
            wt1.t tVar = new wt1.t(this, null);
            this.f530864s = tVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "init bluetoothStateListener");
            tVar.f530881e = new wt1.v(tVar);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(tVar.f530881e, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
        d();
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt1.p.c():void");
    }

    public void d() {
        if (this.f530858m || this.f530862q) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "start");
            if (!this.f530855g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardLbsOrBluetooth", "isInit:%b", java.lang.Boolean.valueOf(this.f530855g));
                return;
            }
            if (this.f530858m) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "isGPSEnable:%b isNetworkEnable:%b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.b()));
            }
            wt1.t tVar = this.f530864s;
            if (tVar != null && this.f530862q) {
                tVar.b();
            }
            e();
            gm0.j1.n().f354821b.a(2574, this);
        }
    }

    public void e() {
        f();
        int i17 = this.f530865t;
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardLbsOrBluetooth", "not to start ReportTimer!");
            return;
        }
        long j17 = i17 * 1000;
        this.f530868w.c(j17, j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "start ReportTimer!");
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "stop ReportTimer!");
        if (this.f530868w.e()) {
            return;
        }
        this.f530868w.d();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardLbsOrBluetooth", "report success, onSceneEnd errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f530856h = false;
    }
}
