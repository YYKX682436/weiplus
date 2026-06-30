package h34;

/* loaded from: classes9.dex */
public class m extends h34.j {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f360083f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f360084g;

    public m(byte[] bArr, int i17, long j17, int i18, boolean z17, int i19) {
        super(bArr, i17, j17, i18, z17, i19);
        float f17;
        float f18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.w36();
        lVar.f152198b = new r45.x36();
        lVar.f152199c = "/cgi-bin/micromsg-bin/shaketv";
        lVar.f152200d = 408;
        int i27 = 0;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f360084g = a17;
        r45.w36 w36Var = (r45.w36) a17.f152243a.f152217a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        w36Var.f470386d = cu5Var;
        w36Var.f470387e = i18;
        w36Var.f470388f = z17 ? 1 : 0;
        w36Var.f470389g = i17;
        w36Var.f470390h = com.p314xaae8f345.mm.p971x6de15a2e.y2.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 1 : 2;
        w36Var.f470391i = i19;
        float f19 = 0.0f;
        try {
            f18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_TV_LATITUDE_STRING, null), 0.0f);
            try {
                f19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L((java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_TV_LONGTITUDE_STRING, null), 0.0f);
                i27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_TV_ACCURACY_STRING, null), 0);
            } catch (java.lang.Exception unused) {
                f17 = f19;
                f19 = f18;
                float f27 = f17;
                f18 = f19;
                f19 = f27;
                w36Var.f470393n = f18;
                w36Var.f470392m = f19;
                ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654, w36Var.f470392m, w36Var.f470393n, i27);
            }
        } catch (java.lang.Exception unused2) {
            f17 = 0.0f;
        }
        w36Var.f470393n = f18;
        w36Var.f470392m = f19;
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654, w36Var.f470392m, w36Var.f470393n, i27);
    }

    @Override // h34.j
    public r45.js5 H() {
        return (r45.x36) this.f360084g.f152244b.f152233a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f360084g;
        r45.w36 w36Var = (r45.w36) oVar.f152243a.f152217a;
        int i17 = w36Var.f470387e;
        int i18 = w36Var.f470386d.f453372d;
        this.f360083f = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 408;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f360084g;
        r45.w36 w36Var = (r45.w36) oVar.f152243a.f152217a;
        r45.x36 x36Var = (r45.x36) oVar.f152244b.f152233a;
        int i27 = w36Var.f470387e;
        int i28 = x36Var.f471288d;
        if (i18 == 0 && i19 == 0 && x36Var.f471288d == 1) {
            this.f360077d = true;
        }
        this.f360083f.mo815x76e0bfae(i18, i19, str, this);
    }
}
