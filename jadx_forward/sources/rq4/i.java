package rq4;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public int f480501b;

    /* renamed from: c, reason: collision with root package name */
    public int f480502c;

    /* renamed from: e, reason: collision with root package name */
    public long f480504e;

    /* renamed from: f, reason: collision with root package name */
    public long f480505f;

    /* renamed from: g, reason: collision with root package name */
    public long f480506g;

    /* renamed from: i, reason: collision with root package name */
    public int f480508i;

    /* renamed from: j, reason: collision with root package name */
    public int f480509j;

    /* renamed from: l, reason: collision with root package name */
    public int f480511l;

    /* renamed from: m, reason: collision with root package name */
    public int f480512m;

    /* renamed from: n, reason: collision with root package name */
    public long f480513n;

    /* renamed from: o, reason: collision with root package name */
    public long f480514o;

    /* renamed from: p, reason: collision with root package name */
    public long f480515p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f480516q;

    /* renamed from: r, reason: collision with root package name */
    public long f480517r;

    /* renamed from: t, reason: collision with root package name */
    public qj0.a f480519t;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f480500a = new int[2];

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f480503d = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final int[] f480507h = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public final int[] f480510k = new int[2];

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f480518s = jz5.h.a(jz5.i.f384364f, rq4.h.f480499d);

    public i() {
        ((ku5.t0) ku5.t0.f394148d).h(new rq4.f(this), "getGpuInfo");
    }

    public final void a() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7020xc92f1a92 c7020xc92f1a92 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7020xc92f1a92();
        qq4.b wi6 = gq4.v.wi();
        if (wi6 == null) {
            return;
        }
        long j17 = wi6.f447516q;
        jz5.g gVar = this.f480518s;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPProfileReport", "error report while init time is null");
            ((vq4.i) gVar.mo141623x754a37bb()).b();
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c7020xc92f1a92.f143337d = (int) (java.lang.System.currentTimeMillis() - j17);
        java.util.HashMap hashMap = this.f480503d;
        c7020xc92f1a92.f143338e = java.lang.Math.max(100 - (hashMap.size() * 20), 0);
        int[] iArr = this.f480500a;
        c7020xc92f1a92.f143339f = kz5.z.e0(iArr);
        c7020xc92f1a92.f143340g = kz5.z.K(iArr);
        c7020xc92f1a92.f143342i = this.f480501b;
        int[] iArr2 = this.f480507h;
        c7020xc92f1a92.f143343j = kz5.z.e0(iArr2);
        c7020xc92f1a92.f143344k = kz5.z.K(iArr2);
        c7020xc92f1a92.f143346m = this.f480508i;
        int[] iArr3 = this.f480510k;
        c7020xc92f1a92.f143347n = kz5.z.e0(iArr3);
        c7020xc92f1a92.f143348o = kz5.z.K(iArr3);
        c7020xc92f1a92.f143349p = this.f480511l;
        sq4.b bVar = (sq4.b) hashMap.get("EncoderLackFrame");
        c7020xc92f1a92.f143341h = bVar != null ? bVar.c().f492917a : 0;
        sq4.b bVar2 = (sq4.b) hashMap.get("LocalRenderLackFrame");
        c7020xc92f1a92.f143345l = bVar2 != null ? bVar2.c().f492917a : 0;
        sq4.b bVar3 = (sq4.b) hashMap.get("RemoteRenderLackFrame");
        c7020xc92f1a92.f143350q = bVar3 != null ? bVar3.c().f492917a : 0;
        c7020xc92f1a92.f143352s = (int) this.f480504e;
        c7020xc92f1a92.f143351r = (int) this.f480506g;
        c7020xc92f1a92.f143353t = (int) this.f480505f;
        if (this.f480516q) {
            c7020xc92f1a92.f143354u = (int) this.f480513n;
            c7020xc92f1a92.f143355v = (int) this.f480514o;
            c7020xc92f1a92.f143356w = (int) this.f480515p;
        }
        vq4.e b17 = ((vq4.i) gVar.mo141623x754a37bb()).b();
        java.lang.Integer h17 = r26.h0.h(b17.f520824f);
        c7020xc92f1a92.f143357x = h17 != null ? h17.intValue() : 0;
        c7020xc92f1a92.f143359z = c7020xc92f1a92.b("CpuLoadInfo", b17.f520825g, true);
        java.lang.String jSONObject = b17.f520821c.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        c7020xc92f1a92.f143358y = c7020xc92f1a92.b("PhoneTemprateInfo", r26.i0.t(jSONObject, ",", ";", false), true);
        java.lang.String jSONObject2 = b17.f520820b.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c7020xc92f1a92.A = c7020xc92f1a92.b("CpuTemprateInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
        java.lang.String jSONObject3 = b17.f520819a.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        c7020xc92f1a92.B = c7020xc92f1a92.b("BatteryTemprateInfo", r26.i0.t(jSONObject3, ",", ";", false), true);
        c7020xc92f1a92.k();
    }

    public final java.lang.String b() {
        cl0.g gVar = new cl0.g();
        gVar.p("gl", this.f480513n);
        gVar.p("gfx", this.f480515p);
        gVar.p("egl", this.f480514o);
        gVar.o("cpuload", 0);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final java.lang.String c() {
        cl0.g gVar = new cl0.g();
        gVar.o("encodeFirst", (int) this.f480506g);
        gVar.o("localFirst", (int) this.f480504e);
        gVar.o("remoteFirst", (int) this.f480505f);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final java.lang.String d() {
        cl0.g gVar = new cl0.g();
        java.util.HashMap hashMap = this.f480503d;
        sq4.b bVar = (sq4.b) hashMap.get("LocalRenderLackFrame");
        gVar.o(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1918xa622cbca.f5943x453e74b, bVar != null ? bVar.c().f492917a : 0);
        sq4.b bVar2 = (sq4.b) hashMap.get("RemoteRenderLackFrame");
        gVar.o("remote", bVar2 != null ? bVar2.c().f492917a : 0);
        sq4.b bVar3 = (sq4.b) hashMap.get("EncoderLackFrame");
        gVar.o("encode", bVar3 != null ? bVar3.c().f492917a : 0);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        return r26.i0.t(gVar2, ",", ";", false);
    }

    public final void e(int i17, boolean z17) {
        java.util.HashMap hashMap = this.f480503d;
        if (z17) {
            int[] iArr = this.f480507h;
            int K = kz5.z.K(iArr);
            if (i17 < K || K == 0) {
                iArr[0] = i17;
            }
            if (i17 > kz5.z.e0(iArr)) {
                iArr[1] = i17;
            }
            int i18 = this.f480508i + i17;
            this.f480508i = i18;
            this.f480508i = i18 / 2;
            if (this.f480509j - i17 > 5) {
                long j17 = gq4.v.wi().f447516q;
                if (j17 != 0) {
                    sq4.b bVar = (sq4.b) hashMap.get("LocalRenderLackFrame");
                    if (bVar == null) {
                        bVar = new sq4.b();
                    }
                    bVar.f492906a = "LocalRenderLackFrame";
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    bVar.d(java.lang.System.currentTimeMillis() - j17);
                    bVar.b();
                    hashMap.put("LocalRenderLackFrame", bVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", "local render frame lack");
                }
            }
            this.f480509j = i17;
            return;
        }
        int[] iArr2 = this.f480510k;
        int K2 = kz5.z.K(iArr2);
        if (i17 < K2 || K2 == 0) {
            iArr2[0] = i17;
        }
        if (i17 > kz5.z.e0(iArr2)) {
            iArr2[1] = i17;
        }
        int i19 = this.f480511l + i17;
        this.f480511l = i19;
        this.f480511l = i19 / 2;
        if (this.f480512m - i17 > 5) {
            long j18 = gq4.v.wi().f447516q;
            if (j18 != 0) {
                sq4.b bVar2 = (sq4.b) hashMap.get("RemoteRenderLackFrame");
                if (bVar2 == null) {
                    bVar2 = new sq4.b();
                }
                bVar2.f492906a = "RemoteRenderLackFrame";
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                bVar2.d(java.lang.System.currentTimeMillis() - j18);
                bVar2.b();
                hashMap.put("RemoteRenderLackFrame", bVar2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", "remote render frame lack");
            }
        }
        this.f480512m = i17;
    }
}
