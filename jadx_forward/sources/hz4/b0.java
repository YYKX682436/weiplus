package hz4;

/* loaded from: classes12.dex */
public class b0 {

    /* renamed from: q, reason: collision with root package name */
    public static hz4.b0 f367914q;

    /* renamed from: a, reason: collision with root package name */
    public boolean f367915a;

    /* renamed from: b, reason: collision with root package name */
    public long f367916b;

    /* renamed from: c, reason: collision with root package name */
    public long f367917c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f367918d;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Toast f367920f;

    /* renamed from: h, reason: collision with root package name */
    public tl.y0 f367922h;

    /* renamed from: i, reason: collision with root package name */
    public w21.k0 f367923i;

    /* renamed from: l, reason: collision with root package name */
    public jz4.a f367926l;

    /* renamed from: e, reason: collision with root package name */
    public long f367919e = -1;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f367924j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f367925k = "";

    /* renamed from: m, reason: collision with root package name */
    public iz4.l f367927m = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f367928n = new hz4.y(this);

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f367929o = new hz4.z(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f367930p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new hz4.a0(this), true);

    /* renamed from: g, reason: collision with root package name */
    public final fp.e f367921g = new fp.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    public static hz4.b0 a() {
        if (f367914q == null) {
            f367914q = new hz4.b0();
        }
        return f367914q;
    }

    public final void b() {
        if (this.f367915a) {
            this.f367929o.mo50303x856b99f0(4096);
            if (this.f367924j.equals("speex")) {
                this.f367923i.mo166726xad07d6f3();
            } else {
                this.f367922h.b();
            }
            fp.e eVar = this.f367921g;
            if (eVar != null) {
                eVar.a();
            }
            long j17 = this.f367916b;
            long j18 = 0;
            if (j17 != 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                j18 = android.os.SystemClock.elapsedRealtime() - j17;
            }
            this.f367917c = j18;
            boolean z18 = j18 < 800;
            this.f367930p.d();
            if (z18) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f367925k);
                if (r6Var.m()) {
                    r6Var.l();
                }
                this.f367928n.mo50307xb9e94560(0, 500L);
            } else {
                long j19 = this.f367917c / 1000;
            }
            this.f367915a = false;
        }
    }

    public int c(android.content.Context context, int i17, android.widget.TextView textView, jz4.a aVar, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        com.p314xaae8f345.mm.vfs.z2 m17;
        if (!this.f367915a) {
            this.f367915a = true;
            this.f367926l = aVar;
            this.f367924j = str;
            this.f367925k = str2;
            fp.e eVar = this.f367921g;
            if (eVar != null) {
                eVar.b();
            }
            this.f367918d = false;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f367925k)) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o72.p5.a(true), "wenote/voice/data");
                if (!r6Var.m()) {
                    r6Var.J();
                }
                java.lang.String o17 = r6Var.o();
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(o17);
                java.lang.String str4 = a17.f294812f;
                if (str4 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                    if (!str4.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, null);
                if (!(!m18.a() ? false : m18.f294799a.F(m18.f294800b))) {
                    com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a17, m18);
                    if (m19.a()) {
                        m19.f294799a.r(m19.f294800b);
                    }
                }
                do {
                    str3 = o17 + "/" + java.lang.System.currentTimeMillis();
                    com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str3);
                    java.lang.String str5 = a18.f294812f;
                    if (str5 != null) {
                        java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                        if (!str5.equals(l18)) {
                            a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                        }
                    }
                    m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                } while (!m17.a() ? false : m17.f294799a.F(m17.f294800b));
                this.f367925k = str3;
            }
            if ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? "amr" : str).equals("speex")) {
                this.f367923i = new w21.k0();
            } else {
                tl.y0 y0Var = new tl.y0();
                this.f367922h = y0Var;
                y0Var.f501724d = new hz4.x(this);
            }
            this.f367919e = -1L;
            if ((str.equals("speex") ? java.lang.Boolean.valueOf(this.f367923i.mo166725x8e35cb53(this.f367925k)) : java.lang.Boolean.valueOf(this.f367922h.a(this.f367925k, 3600010))).booleanValue()) {
                this.f367916b = android.os.SystemClock.elapsedRealtime();
                this.f367930p.c(200L, 200L);
            } else {
                this.f367916b = 0L;
            }
            if (this.f367916b == 0) {
                return -1;
            }
            this.f367929o.mo50305x3d8a09a2(4096);
        }
        return 0;
    }
}
