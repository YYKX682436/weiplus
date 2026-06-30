package h34;

/* loaded from: classes9.dex */
public class k extends h34.j {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f360079f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f360080g;

    public k(byte[] bArr, int i17, long j17, int i18, boolean z17, int i19) {
        super(bArr, i17, j17, i18, z17, i19);
        float f17;
        float f18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.s36();
        lVar.f152198b = new r45.t36();
        lVar.f152199c = "/cgi-bin/micromsg-bin/shakemusic";
        lVar.f152200d = 367;
        lVar.f152201e = 177;
        lVar.f152202f = 1000000177;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f360080g = a17;
        r45.s36 s36Var = (r45.s36) a17.f152243a.f152217a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        s36Var.f467008d = cu5Var;
        s36Var.f467009e = i18;
        s36Var.f467010f = z17 ? 1 : 0;
        s36Var.f467011g = i17;
        s36Var.f467012h = com.p314xaae8f345.mm.p971x6de15a2e.y2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 1 : 2;
        s36Var.f467013i = i19;
        int i27 = 0;
        float f19 = 0.0f;
        try {
            f18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_TV_LATITUDE_STRING, null), 0.0f);
        } catch (java.lang.Exception unused) {
            f17 = 0.0f;
        }
        try {
            f19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_TV_LONGTITUDE_STRING, null), 0.0f);
            i27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_TV_ACCURACY_STRING, null), 0);
        } catch (java.lang.Exception unused2) {
            f17 = f19;
            f19 = f18;
            float f27 = f17;
            f18 = f19;
            f19 = f27;
            s36Var.f467015n = f18;
            s36Var.f467014m = f19;
            s36Var.f467016o = 1 ^ (b21.q.a() ? 1 : 0);
            s36Var.f467017p = b21.q.b() ? 1 : 0;
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46368x75a8a97d, s36Var.f467014m, s36Var.f467015n, i27);
        }
        s36Var.f467015n = f18;
        s36Var.f467014m = f19;
        s36Var.f467016o = 1 ^ (b21.q.a() ? 1 : 0);
        s36Var.f467017p = b21.q.b() ? 1 : 0;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46368x75a8a97d, s36Var.f467014m, s36Var.f467015n, i27);
    }

    @Override // h34.j
    public r45.js5 H() {
        return (r45.t36) this.f360080g.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f360080g;
        r45.s36 s36Var = (r45.s36) oVar.f152243a.f152217a;
        int i17 = s36Var.f467009e;
        int i18 = s36Var.f467008d.f453372d;
        this.f360079f = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 367;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f360080g;
        r45.s36 s36Var = (r45.s36) oVar.f152243a.f152217a;
        r45.t36 t36Var = (r45.t36) oVar.f152244b.f152233a;
        int i27 = s36Var.f467009e;
        int i28 = t36Var.f467631d;
        if (i18 == 0 && i19 == 0 && t36Var.f467631d == 1) {
            this.f360077d = true;
        }
        this.f360079f.mo815x76e0bfae(i18, i19, str, this);
    }
}
