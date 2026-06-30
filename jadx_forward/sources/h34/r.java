package h34;

/* loaded from: classes11.dex */
public class r extends c34.z implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public h34.i f360089e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Collection f360090f;

    /* renamed from: g, reason: collision with root package name */
    public i11.e f360091g;

    /* renamed from: h, reason: collision with root package name */
    public float f360092h;

    /* renamed from: i, reason: collision with root package name */
    public float f360093i;

    /* renamed from: m, reason: collision with root package name */
    public int f360094m;

    /* renamed from: n, reason: collision with root package name */
    public final int f360095n;

    /* renamed from: o, reason: collision with root package name */
    public final int f360096o;

    /* renamed from: p, reason: collision with root package name */
    public final int f360097p;

    /* renamed from: q, reason: collision with root package name */
    public final i11.c f360098q;

    public r(c34.x xVar) {
        super(xVar);
        this.f360090f = null;
        this.f360092h = -85.0f;
        this.f360093i = -1000.0f;
        this.f360094m = -1000;
        this.f360095n = 10001;
        this.f360096o = 10002;
        this.f360097p = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
        this.f360098q = new h34.n(this);
    }

    public static void g(c34.r rVar) {
        java.lang.String str;
        if (rVar == null || rVar.f66438x4b6e7fa1 != 3) {
            return;
        }
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_IS_OPEN_BOOLEAN, java.lang.Boolean.TRUE);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_OPEN_TIEMSTAMP_LONG, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
        try {
            str = new java.lang.String(rVar.f66430xbcdbef, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShakeIbeaconService", e17, "%s", "Unsupported");
            str = null;
        }
        if (str != null) {
            java.lang.String[] split = str.split(",");
            if (split.length == 4) {
                c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IBEACON_PUSH_SHOP_ID_LONG, java.lang.Long.valueOf(split[0]));
            }
        }
    }

    @Override // c34.z
    public void a() {
        h();
        this.f119780d = null;
        c01.d9.e().q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q0.f33746x366c91de, this);
    }

    @Override // c34.z
    public void b() {
        c01.d9.e().a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q0.f33746x366c91de, this);
        f();
    }

    @Override // c34.z
    public void c() {
        i11.e eVar = this.f360091g;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f360098q);
        }
    }

    @Override // c34.z
    public void d() {
        i11.e eVar = this.f360091g;
        if (eVar != null) {
            ((i11.h) eVar).k(this.f360098q, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
        }
    }

    @Override // c34.z
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:start");
        b();
        h();
        if (this.f360091g == null) {
            f();
        }
        ((i11.h) this.f360091g).j(this.f360098q, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
        java.lang.String str = android.os.Build.VERSION.RELEASE;
        if (!str.equals("6.0") && !str.equals("6.0.0") && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a()) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new h34.o(this), 1000L);
            return;
        }
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() != 12) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new h34.p(this), 1000L);
            return;
        }
        if (defaultAdapter == null) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new h34.q(this), 1000L);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.Collection collection = this.f360090f;
        objArr[0] = java.lang.Integer.valueOf(collection != null ? collection.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeIbeaconService", "[oneliang][ShakeIbeaconService][shakezb]:beaconCollection.size:%d", objArr);
        this.f360089e = new h34.i(null, this.f360090f, 1, this.f360092h, this.f360093i, this.f360094m);
        c01.d9.e().g(this.f360089e);
    }

    public final void f() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f360091g = e17;
        e17.k(this.f360098q, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
    }

    public void h() {
        if (this.f360089e != null) {
            c01.d9.e().d(this.f360089e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0245  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r23, int r24, java.lang.String r25, com.p314xaae8f345.mm.p944x882e457a.m1 r26) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h34.r.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
