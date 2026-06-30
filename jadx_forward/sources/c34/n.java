package c34;

/* loaded from: classes9.dex */
public class n extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f119751d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f119752e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f119753f;

    /* renamed from: g, reason: collision with root package name */
    public int f119754g;

    public n(int i17, float f17, float f18, int i18, int i19, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.u36();
        lVar.f152198b = new r45.v36();
        lVar.f152199c = "/cgi-bin/micromsg-bin/shakereport";
        lVar.f152200d = 161;
        lVar.f152201e = 56;
        lVar.f152202f = 1000000056;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f119752e = a17;
        r45.u36 u36Var = (r45.u36) a17.f152243a.f152217a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneShakeReport", "share reprot %f %f", java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        u36Var.f468524d = i17;
        u36Var.f468525e = f17;
        u36Var.f468526f = f18;
        u36Var.f468527g = i18;
        u36Var.f468528h = str;
        u36Var.f468529i = str2;
        u36Var.f468532o = i19;
        u36Var.f468530m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) c01.d9.b().p().l(4107, null), 0);
        int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) c01.d9.b().p().l(4106, null));
        u36Var.f468531n = q17;
        c01.d9.b().p().w(4106, java.lang.Integer.valueOf(q17 + 1));
        try {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(fo3.s.INSTANCE.h());
            k57Var.f459929f = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(k57Var.mo14344x5f01b1f6());
            u36Var.f468534q = cu5Var2;
        } catch (java.lang.Throwable unused) {
        }
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2002, f17, f18, i18);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f119751d = u0Var;
        return mo9409x10f9447a(sVar, this.f119752e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 161;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f119752e;
        r45.v36 v36Var = (r45.v36) oVar.f152244b.f152233a;
        this.f119754g = v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8();
        if (i18 == 0 && i19 == 0) {
            this.f119753f = x51.j1.d(v36Var.f469386d);
        }
        this.f119751d.mo815x76e0bfae(i18, i19, str, this);
    }
}
