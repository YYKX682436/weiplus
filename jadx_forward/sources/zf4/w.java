package zf4;

/* loaded from: classes13.dex */
public class w implements com.p314xaae8f345.mm.p944x882e457a.g1 {

    /* renamed from: i, reason: collision with root package name */
    public static int f554227i = 100;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.f1 f554229b;

    /* renamed from: a, reason: collision with root package name */
    public w21.k0 f554228a = null;

    /* renamed from: c, reason: collision with root package name */
    public int f554230c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f554231d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f554232e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f554233f = 0;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f554235h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new zf4.t(this), true);

    /* renamed from: g, reason: collision with root package name */
    public final tf4.b f554234g = new tf4.b(new zf4.s(this));

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public java.lang.String a() {
        return this.f554231d;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public void b(com.p314xaae8f345.mm.p944x882e457a.e1 e1Var) {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public long c() {
        long j17 = this.f554232e;
        if (j17 <= 0) {
            return 0L;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return android.os.SystemClock.elapsedRealtime() - j17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    /* renamed from: cancel */
    public boolean mo47958xae7a2e7a() {
        zf4.q c17;
        synchronized (this) {
            w21.k0 k0Var = this.f554228a;
            if (k0Var != null) {
                k0Var.mo166726xad07d6f3();
            }
        }
        java.lang.String str = this.f554231d;
        if (str != null && (c17 = zf4.r.c(str)) != null) {
            c17.f68517x10a0fed7 = 8;
            c17.f68518xeb1ad9f6 = zf4.i.a(zf4.r.b(str, false));
            c17.U = 64;
            zf4.r.f(c17);
        }
        zf4.l.Ai().c();
        this.f554231d = "";
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public int d() {
        w21.k0 k0Var = this.f554228a;
        if (k0Var == null) {
            return 0;
        }
        int d17 = k0Var.d();
        if (d17 > f554227i) {
            f554227i = d17;
        }
        int i17 = f554227i;
        int i18 = d17 * 100;
        int i19 = i18 / i17;
        return i18 / i17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public int e() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public void f() {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public boolean g(java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String y07 = zf4.b0.y0(c01.z1.r());
        zf4.q qVar = new zf4.q();
        qVar.f68507xf1f75bac = y07;
        qVar.f68519x22628ff0 = str;
        qVar.f68506xad24a2e = java.lang.System.currentTimeMillis() / 1000;
        qVar.f68505x53e843cb = y07;
        qVar.f68510x8de42782 = java.lang.System.currentTimeMillis() / 1000;
        qVar.f68517x10a0fed7 = 1;
        qVar.f68509x293941a8 = c01.z1.r();
        qVar.U = -1;
        zf4.b0 Bi = zf4.l.Bi();
        Bi.getClass();
        if (((int) Bi.f554182d.l("VoiceRemindInfo", "", qVar.mo9763xeb27878e())) == -1) {
            y07 = null;
        }
        this.f554231d = y07;
        tf4.b bVar = this.f554234g;
        bVar.q("record");
        int r17 = bVar.r("record", 4);
        bVar.f500484l = false;
        if (r17 != 0) {
            bVar.o(100);
        } else {
            new tf4.a(bVar).mo50307xb9e94560(0, 50L);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public void h(com.p314xaae8f345.mm.p944x882e457a.f1 f1Var) {
        this.f554229b = f1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public boolean i() {
        w21.k0 k0Var = this.f554228a;
        return k0Var != null && k0Var.f523952c == 1;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 j() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    public int k() {
        return this.f554230c;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    /* renamed from: reset */
    public void mo47959x6761d4f() {
        w21.k0 k0Var = this.f554228a;
        if (k0Var != null) {
            k0Var.mo166726xad07d6f3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceRemindRecorder", "Reset recorder.stopReocrd");
        }
        this.f554231d = "";
        this.f554233f = 0;
        this.f554232e = 0L;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.g1
    /* renamed from: stop */
    public boolean mo47960x360802() {
        zf4.q c17;
        ym1.f.Ai("record").q("record");
        synchronized (this) {
            w21.k0 k0Var = this.f554228a;
            if (k0Var != null) {
                k0Var.mo166726xad07d6f3();
            }
        }
        boolean z17 = false;
        if (this.f554233f != 2) {
            zf4.r.a(this.f554231d);
            this.f554231d = null;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
        } else {
            int c18 = (int) c();
            this.f554230c = c18;
            if (c18 < 800 || c18 < 1000) {
                zf4.r.a(this.f554231d);
                this.f554231d = "";
            } else {
                java.lang.String str = this.f554231d;
                if (str != null && (c17 = zf4.r.c(str)) != null) {
                    int i17 = c17.f68517x10a0fed7;
                    if (i17 != 97 && i17 != 98) {
                        c17.f68517x10a0fed7 = 3;
                    }
                    int a17 = zf4.i.a(zf4.r.b(str, false));
                    c17.f68518xeb1ad9f6 = a17;
                    if (a17 <= 0) {
                        zf4.r.e(str);
                    } else {
                        c17.f68510x8de42782 = java.lang.System.currentTimeMillis() / 1000;
                        c17.f68521x920b456b = c18;
                        c17.U = 3424;
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        f9Var.u1(c17.f68519x22628ff0);
                        f9Var.m124850x7650bebc(34);
                        f9Var.j1(1);
                        if (!pt0.f0.f439742b1.j()) {
                            f9Var.i1(str);
                        }
                        int i18 = c17.f68517x10a0fed7;
                        if (i18 == 97) {
                            f9Var.r1(2);
                            f9Var.d1(zf4.p.a(c17.f68509x293941a8, c17.f68521x920b456b, false));
                        } else if (i18 == 98) {
                            f9Var.r1(5);
                            f9Var.d1(zf4.p.a(c17.f68509x293941a8, -1L, true));
                        } else {
                            f9Var.r1(1);
                        }
                        f9Var.e1(c01.w9.o(c17.f68519x22628ff0));
                        c17.f68512x36ef078a = (int) c01.w9.x(f9Var);
                        zf4.r.f(c17);
                    }
                }
                zf4.l.Ai().c();
                z17 = true;
            }
            this.f554231d = "";
        }
        this.f554233f = -1;
        return z17;
    }
}
