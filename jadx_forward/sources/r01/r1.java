package r01;

/* loaded from: classes9.dex */
public class r1 {

    /* renamed from: j, reason: collision with root package name */
    public static long f449749j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static int f449750k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f449751l = 9;

    /* renamed from: c, reason: collision with root package name */
    public i11.e f449754c;

    /* renamed from: e, reason: collision with root package name */
    public final int f449756e;

    /* renamed from: i, reason: collision with root package name */
    public r45.j16 f449760i;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f449752a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f449753b = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f449755d = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f449757f = false;

    /* renamed from: g, reason: collision with root package name */
    public final l75.z0 f449758g = new r01.n1(this);

    /* renamed from: h, reason: collision with root package name */
    public final i11.c f449759h = new r01.o1(this);

    public r1() {
        this.f449756e = 10;
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "BrandService", "continueLocationReportInterval"), 5);
        this.f449756e = P;
        if (P < 2) {
            this.f449756e = 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportLocation", "reportLocation interval %d", java.lang.Integer.valueOf(this.f449756e));
    }

    public static void c(java.lang.String username, long j17) {
        long j18 = f449749j;
        int i17 = f449750k;
        int i18 = f449751l;
        r01.j jVar = r01.j.f449652a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        r01.j.b(r01.j.f449652a, 6, username, null, null, null, j18, i17, java.lang.Long.valueOf(j17), i18, null, 512, null);
    }

    public static void d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j17, int i17, int i18) {
        int i19 = f449751l;
        r01.j jVar = r01.j.f449652a;
        if (f9Var == null || f9Var.A0() == 1) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).a(new r01.h(f9Var, j17, i17, i18, i19));
    }

    public final void a(java.lang.String str, int i17, int i18, float f17, float f18, int i19, java.util.LinkedList linkedList) {
        b(str, i17, i18, f17, f18, i19, linkedList, 0, null, null);
    }

    public final void b(java.lang.String str, int i17, int i18, float f17, float f18, int i19, java.util.LinkedList linkedList, int i27, r45.j16 j16Var, r45.l36 l36Var) {
        java.lang.String format = i18 == 3 ? "<event></event>" : java.lang.String.format("<event><location><errcode>%d</errcode><data><latitude>%f</latitude><longitude>%f</longitude><precision>%d</precision></data></location></event>", java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportLocation", "doScene, info: %s", format);
        gm0.j1.n().f354821b.g(new r01.g3(str, i17, format, linkedList, this.f449755d, i27, j16Var, l36Var));
    }

    public void e(r45.j16 j16Var, java.lang.String str) {
        int i17;
        if (j16Var == null || (i17 = j16Var.f459031f) <= 0) {
            return;
        }
        int min = java.lang.Math.min(i17, 30);
        j16Var.f459034i = 0;
        j16Var.f459035m = 0;
        android.database.Cursor M4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M4(str, min, 0L);
        while (M4.moveToNext()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.mo9015xbf5d97fd(M4);
            if (f9Var.A0() != 1) {
                if (f9Var.a3()) {
                    j16Var.f459035m++;
                } else {
                    c01.ea w17 = c01.w9.w(f9Var.G);
                    if (w17 != null && w17.f118676b == 3) {
                        j16Var.f459034i++;
                    }
                }
            }
        }
        M4.close();
    }

    public void f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportLocation", "Start report");
        this.f449752a = str;
        qk.o b17 = r01.z.b(str);
        if (b17 == null) {
            return;
        }
        if (this.f449753b != 0) {
            g();
        }
        this.f449753b = 0;
        if (b17.U0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportLocation", "need update contact %s", str);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).bj(str);
        }
        qk.n D0 = b17.D0(false);
        if (D0 == null) {
            return;
        }
        if (!D0.o() || !b17.u0()) {
            if (!D0.o() || b17.u0()) {
                return;
            }
            a(str, 11, 1, 0.0f, 0.0f, 0, null);
            return;
        }
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f449754c = i11.h.e();
        qk.n D02 = b17.D0(false);
        org.json.JSONObject jSONObject = D02.f445789a;
        if (jSONObject != null) {
            D02.f445801m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(jSONObject.optString("ReportLocationType"), 0) == 2;
        }
        this.f449753b = D02.f445801m ? 3 : 2;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.n2.b()) {
            a(str, 11, 2, 0.0f, 0.0f, 0, null);
            return;
        }
        ((i11.h) this.f449754c).l(this.f449759h, true, this.f449753b != 2, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(3, 10);
    }

    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportLocation", "Stop report");
        this.f449753b = 0;
        i11.e eVar = this.f449754c;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f449759h);
        }
        if (gm0.j1.b().m()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this.f449758g);
        }
    }
}
