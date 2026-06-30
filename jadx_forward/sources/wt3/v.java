package wt3;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: i, reason: collision with root package name */
    public static wt3.v f531038i;

    /* renamed from: b, reason: collision with root package name */
    public int f531041b;

    /* renamed from: c, reason: collision with root package name */
    public long f531042c;

    /* renamed from: d, reason: collision with root package name */
    public long f531043d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f531044e;

    /* renamed from: h, reason: collision with root package name */
    public static final wt3.u f531037h = new wt3.u(null);

    /* renamed from: j, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6995x32f4d2aa f531039j = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6995x32f4d2aa();

    /* renamed from: a, reason: collision with root package name */
    public int f531040a = 3;

    /* renamed from: f, reason: collision with root package name */
    public boolean f531045f = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f531046g = new java.util.ArrayList();

    public final void a() {
        if (this.f531043d == 0) {
            return;
        }
        r45.lh4 lh4Var = new r45.lh4();
        lh4Var.f461013d = this.f531041b;
        if (this.f531044e) {
            lh4Var.f461014e = this.f531040a == 4 ? 11 : 5;
        } else {
            lh4Var.f461014e = this.f531040a == 4 ? 13 : 7;
        }
        lh4Var.f461016g = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        c();
        java.util.ArrayList arrayList = this.f531046g;
        arrayList.add(lh4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioReporter", "record cancel " + wt3.w.a(lh4Var));
        gm0.j1.n().f354821b.g(new xt3.a(this.f531043d, arrayList));
        f531038i = null;
    }

    public final void b() {
        this.f531044e = false;
        r45.lh4 lh4Var = new r45.lh4();
        lh4Var.f461013d = this.f531041b;
        lh4Var.f461014e = 8;
        lh4Var.f461016g = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        this.f531046g.add(lh4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioReporter", "record no bgm " + wt3.w.a(lh4Var));
    }

    public final void c() {
        if (this.f531045f) {
            return;
        }
        r45.lh4 lh4Var = new r45.lh4();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        lh4Var.f461013d = this.f531041b;
        lh4Var.f461014e = this.f531040a == 3 ? 1 : 9;
        long j17 = this.f531042c;
        lh4Var.f461015f = (int) (currentTimeMillis - j17);
        lh4Var.f461016g = (int) (j17 / 1000);
        this.f531046g.add(lh4Var);
        this.f531045f = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioReporter", "record pause " + wt3.w.a(lh4Var));
    }

    public final void d(int i17, int i18) {
        this.f531041b = i17;
        this.f531042c = java.lang.System.currentTimeMillis();
        this.f531044e = true;
        this.f531045f = false;
        this.f531040a = i18;
    }

    public final void e() {
        if (this.f531043d == 0) {
            return;
        }
        r45.lh4 lh4Var = new r45.lh4();
        lh4Var.f461013d = this.f531041b;
        if (this.f531044e) {
            lh4Var.f461014e = this.f531040a == 4 ? 10 : 2;
        } else {
            lh4Var.f461014e = this.f531040a == 4 ? 12 : 6;
        }
        lh4Var.f461016g = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        c();
        java.util.ArrayList arrayList = this.f531046g;
        arrayList.add(lh4Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioReporter", "record send " + wt3.w.a(lh4Var));
        if (this.f531043d != 0) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            int i17 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context) ? 1 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context) ? 6 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context) ? 5 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context) ? 4 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40091x5fd3d5c(context) ? 3 : 2;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[11];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = 1;
            objArr[2] = "";
            objArr[3] = 0L;
            objArr[4] = 0L;
            objArr[5] = "";
            objArr[6] = java.lang.Long.valueOf(this.f531043d);
            objArr[7] = java.lang.Integer.valueOf(this.f531044e ? 2 : 1);
            objArr[8] = java.lang.Integer.valueOf(this.f531041b);
            objArr[9] = "";
            objArr[10] = "";
            g0Var.d(16208, objArr);
        }
        gm0.j1.n().f354821b.g(new xt3.a(this.f531043d, arrayList));
        f531038i = null;
    }
}
