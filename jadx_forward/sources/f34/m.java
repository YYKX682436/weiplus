package f34;

/* loaded from: classes11.dex */
public class m extends c34.z implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: u, reason: collision with root package name */
    public static int f340892u;

    /* renamed from: e, reason: collision with root package name */
    public f34.b f340893e;

    /* renamed from: f, reason: collision with root package name */
    public int f340894f;

    /* renamed from: g, reason: collision with root package name */
    public final f34.d f340895g;

    /* renamed from: h, reason: collision with root package name */
    public long f340896h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f340897i;

    /* renamed from: m, reason: collision with root package name */
    public int f340898m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f340899n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f340900o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f340901p;

    /* renamed from: q, reason: collision with root package name */
    public i11.e f340902q;

    /* renamed from: r, reason: collision with root package name */
    public float f340903r;

    /* renamed from: s, reason: collision with root package name */
    public float f340904s;

    /* renamed from: t, reason: collision with root package name */
    public final i11.c f340905t;

    public m(c34.x xVar) {
        super(xVar);
        this.f340895g = new f34.d();
        this.f340896h = 0L;
        this.f340897i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f340898m = 0;
        this.f340899n = "";
        this.f340900o = false;
        this.f340901p = false;
        this.f340903r = -85.0f;
        this.f340904s = -1000.0f;
        this.f340905t = new f34.j(this);
    }

    @Override // c34.z
    public void a() {
        c01.d9.e().q(1250, this);
        i11.e eVar = this.f340902q;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f340905t);
        }
        h();
        this.f119780d = null;
    }

    @Override // c34.z
    public void b() {
        f340892u = c34.h0.Bi().f340856b;
        this.f340896h = c34.h0.Bi().f340857c;
        this.f340903r = c34.h0.Bi().f340858d;
        this.f340904s = c34.h0.Bi().f340859e;
        c01.d9.e().a(1250, this);
        g();
    }

    @Override // c34.z
    public void c() {
        i11.e eVar = this.f340902q;
        if (eVar != null) {
            ((i11.h) eVar).m(this.f340905t);
        }
    }

    @Override // c34.z
    public void d() {
        i11.e eVar = this.f340902q;
        if (eVar != null) {
            ((i11.h) eVar).k(this.f340905t, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // c34.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r10 = this;
            r10.b()
            r10.h()
            i11.e r0 = r10.f340902q
            if (r0 != 0) goto Ld
            r10.g()
        Ld:
            i11.e r0 = r10.f340902q
            i11.c r1 = r10.f340905t
            i11.h r0 = (i11.h) r0
            r2 = 1
            r0.j(r1, r2)
            r0 = 22
            r1 = 10
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(r0, r1)
            f34.c r0 = c34.h0.Bi()
            r0.getClass()
            java.lang.String r1 = "key_shake_card_item"
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            if (r3 == 0) goto L2f
            goto L3e
        L2f:
            java.util.Map r0 = r0.f340855a
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L3e
            java.lang.Object r0 = r0.get(r1)
            goto L3f
        L3e:
            r0 = r4
        L3f:
            long r5 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            long r7 = r10.f340896h
            long r5 = r5 - r7
            java.lang.String r3 = "MicroMsg.ShakeCardService"
            if (r0 == 0) goto L79
            boolean r9 = r0 instanceof f34.d
            if (r9 == 0) goto L79
            f34.d r0 = (f34.d) r0
            c34.x r2 = r10.f119780d
            com.tencent.mm.plugin.shake.ui.ShakeReportUI r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) r2
            r5 = 1250(0x4e2, float:1.752E-42)
            r6 = 1
            r2.Z6(r5, r0, r6)
            f34.c r0 = c34.h0.Bi()
            r0.getClass()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L6c
            goto L73
        L6c:
            java.util.Map r0 = r0.f340855a
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r1, r4)
        L73:
            java.lang.String r0 = "getlbscard return data is no empty, don't do doNetSceneShakeCard, return ok"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            return
        L79:
            r0 = 0
            int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            com.tencent.mm.sdk.platformtools.n3 r7 = r10.f340897i
            if (r4 != 0) goto L82
            goto L86
        L82:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L88
        L86:
            r0 = r2
            goto La9
        L88:
            com.tencent.mm.plugin.report.service.g0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            int r1 = r10.f340898m
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r4 = 11666(0x2d92, float:1.6348E-41)
            r0.d(r4, r1)
            f34.k r0 = new f34.k
            r0.<init>(r10)
            r4 = 3000(0xbb8, double:1.482E-320)
            r7.mo50297x7c4d7ca2(r0, r4)
            java.lang.String r0 = "ShakeCardService do not doNetSceneShakeCard, because time is not expire"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            r0 = 0
        La9:
            if (r0 == 0) goto Ldb
            boolean r0 = r10.f340900o
            if (r0 == 0) goto Lb5
            java.lang.String r0 = "ShakeCardService is doing netscene, return"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            return
        Lb5:
            float r0 = r10.f340903r
            r1 = -1029046272(0xffffffffc2aa0000, float:-85.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lca
            float r0 = r10.f340904s
            r1 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc6
            goto Lca
        Lc6:
            r10.f()
            goto Ldb
        Lca:
            r10.f340901p = r2
            java.lang.String r0 = "ShakeCardService location is not geted, wait 4 second"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            f34.l r0 = new f34.l
            r0.<init>(r10)
            r1 = 4000(0xfa0, double:1.9763E-320)
            r7.mo50297x7c4d7ca2(r0, r1)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f34.m.e():void");
    }

    public final void f() {
        if (this.f340900o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService is doing doNetSceneShakeCard, return");
            return;
        }
        this.f340900o = true;
        this.f340901p = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService do doNetSceneShakeCard");
        this.f340893e = new f34.b(this.f340904s, this.f340903r, this.f340898m, this.f340899n);
        c01.d9.e().g(this.f340893e);
    }

    public final void g() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h e17 = i11.h.e();
        this.f340902q = e17;
        e17.k(this.f340905t, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(22, 10);
    }

    public void h() {
        if (this.f340893e != null) {
            c01.d9.e().d(this.f340893e);
        }
    }

    public final void i() {
        long e17;
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        int i17 = f340892u;
        int i18 = 0;
        if (i17 >= 0 && i17 <= 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is valid");
            int i19 = f340892u;
            if (i19 == 1) {
                i18 = 10;
            } else if (i19 == 2) {
                i18 = 30;
            } else if (i19 == 3) {
                i18 = 60;
            } else if (i19 == 4) {
                i18 = 120;
            } else if (i19 == 5) {
                i18 = 240;
            }
            e17 = i18;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService frequency_level is not valid");
            e17 = g34.a.e(g34.a.b());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService updateWaitingTime wait nextInterval is " + e17);
        this.f340896h = currentTimeMillis + e17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof f34.b) {
            f34.d dVar = ((f34.b) m1Var).f340854f;
            f34.d dVar2 = this.f340895g;
            dVar2.getClass();
            int i19 = dVar.f340861a;
            dVar2.f340861a = i19;
            dVar2.f340862b = dVar.f340862b;
            dVar2.f340863c = dVar.f340863c;
            dVar2.f340864d = dVar.f340864d;
            dVar2.f340865e = dVar.f340865e;
            dVar2.f340866f = dVar.f340866f;
            dVar2.f340867g = dVar.f340867g;
            dVar2.f340868h = dVar.f340868h;
            dVar2.f340869i = dVar.f340869i;
            dVar2.f340870j = dVar.f340870j;
            dVar2.f340871k = dVar.f340871k;
            dVar2.f340872l = dVar.f340872l;
            dVar2.f340873m = dVar.f340873m;
            dVar2.f340874n = dVar.f340874n;
            dVar2.f340875o = dVar.f340875o;
            dVar2.f340876p = dVar.f340876p;
            this.f340894f = i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd()  action_type:" + this.f340894f + "  frequency_level:" + f340892u + " control_flag:" + dVar2.f340869i);
            if (i17 == 0 && i18 == 0) {
                f340892u = dVar2.f340868h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd is OK ");
                c34.x xVar = this.f119780d;
                if (xVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) xVar).Z6(1250, dVar2, 1L);
                }
                i();
            } else if (!(i17 == 5 && i18 == -1) && (i17 != 4 || i18 == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + i17 + " errCode is " + i18);
                c34.x xVar2 = this.f119780d;
                if (xVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) xVar2).Z6(1250, dVar2, 2L);
                }
                i();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd errType is " + i17 + " errCode is " + i18);
                c34.x xVar3 = this.f119780d;
                if (xVar3 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.ActivityC17671x63665fce) xVar3).Z6(1250, dVar2, 2L);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                long e17 = g34.a.e(g34.a.b());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardService", "ShakeCardService onSceneEnd wait nextInterval is " + e17);
                this.f340896h = currentTimeMillis + e17;
            }
            c34.h0.Bi().f340856b = f340892u;
            c34.h0.Bi().f340857c = this.f340896h;
            this.f340900o = false;
        }
    }
}
