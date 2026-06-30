package ms4;

/* loaded from: classes8.dex */
public final class n extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final int f412600d;

    /* renamed from: e, reason: collision with root package name */
    public int f412601e;

    /* renamed from: f, reason: collision with root package name */
    public int f412602f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f412603g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f412604h = "";

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f412605i;

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412606m;

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412607n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412608o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412609p;

    /* renamed from: q, reason: collision with root package name */
    public long f412610q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f412611r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f412612s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630 f412613t;

    /* renamed from: u, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f412614u;

    public n(byte[] bArr, int i17) {
        this.f412600d = i17;
        new p012xc85e97e9.p093xedfae76a.j0();
        this.f412606m = new p012xc85e97e9.p093xedfae76a.j0();
        this.f412607n = new p012xc85e97e9.p093xedfae76a.j0();
        this.f412608o = new p012xc85e97e9.p093xedfae76a.j0();
        this.f412609p = new p012xc85e97e9.p093xedfae76a.j0();
        this.f412614u = new p012xc85e97e9.p093xedfae76a.j0();
        r45.ma7 ma7Var = new r45.ma7();
        if (bArr != null) {
            try {
                ma7Var.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
            this.f412614u.mo7808x76db6cb1(ma7Var);
        }
        ma7Var = null;
        this.f412614u.mo7808x76db6cb1(ma7Var);
    }

    public final void N6(java.lang.String token, java.lang.String str, int i17, im5.b keeper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keeper, "keeper");
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f412609p;
        os4.a.a(j0Var, java.lang.Boolean.TRUE);
        O6(7, 1, 0, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.A(fe1.l.f69742x366c91de, 96);
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f412611r;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2 = this.f412606m;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashViewModel", "mCtxBuff is null!");
            os4.a.a(j0Var, java.lang.Boolean.FALSE);
            j0Var2.mo7808x76db6cb1(new ms4.a(3, -1, "", null, 8, null));
            g0Var.A(fe1.l.f69742x366c91de, 98);
            O6(7, 3, -1, "mCtxBuff is null");
            return;
        }
        byte[] d17 = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e.d(gVar != null ? gVar.f273689a : null);
        if (d17 != null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f412611r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
            new ks4.c(token, gVar2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(d17, 0, d17.length), str, i17).l().h(new ms4.l(this, token, str, i17, keeper)).f(keeper);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinEncashViewModel", "signedByte is null!");
            os4.a.a(j0Var, java.lang.Boolean.FALSE);
            j0Var2.mo7808x76db6cb1(new ms4.a(3, 4, "", null, 8, null));
            O6(7, 3, 4, "sign data failed");
            g0Var.A(fe1.l.f69742x366c91de, 98);
            g0Var.A(fe1.l.f69742x366c91de, 100);
        }
    }

    public final void O6(int i17, int i18, int i19, java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630 c19062x526af630 = this.f412613t;
        if (c19062x526af630 == null || (str2 = c19062x526af630.f260670e) == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(c19062x526af630 != null ? c19062x526af630.f260669d : 1);
        objArr[1] = str2;
        objArr[2] = this.f412612s;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = java.lang.Integer.valueOf(i18);
        objArr[5] = java.lang.Integer.valueOf(i19);
        objArr[6] = str;
        g0Var.d(22129, objArr);
    }

    public final void P6(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.p2363x633fb29.C19062x526af630 c19062x526af630 = this.f412613t;
        if (c19062x526af630 != null) {
            java.lang.String str = c19062x526af630.f260670e;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = c19062x526af630.f260671f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21655, java.lang.Integer.valueOf(c19062x526af630.f260669d), str, java.lang.Integer.valueOf(i17), str2 != null ? str2 : "");
        }
    }
}
