package gs4;

/* loaded from: classes9.dex */
public class h extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1 {

    /* renamed from: d, reason: collision with root package name */
    public r45.zg3 f356629d;

    /* renamed from: e, reason: collision with root package name */
    public gs4.f f356630e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f356631f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f356632g;

    public h() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.yg3();
        lVar.f152198b = new r45.zg3();
        lVar.f152199c = "/cgi-bin/mmpay-bin/ftfhb/gethbrefundconfig";
        lVar.f152200d = 1477;
        this.f356631f = lVar.a();
    }

    public gs4.f H() {
        if (this.f356630e == null) {
            gs4.f fVar = new gs4.f();
            this.f356630e = fVar;
            r45.zg3 zg3Var = this.f356629d;
            fVar.f356614a = zg3Var.f473528d;
            fVar.f356615b = zg3Var.f473530f;
            fVar.f356616c = zg3Var.f473531g;
            fVar.f356617d = zg3Var.f473532h;
            fVar.f356618e = zg3Var.f473533i;
            fVar.f356619f = zg3Var.f473534m;
            fVar.f356620g = zg3Var.f473535n;
            fVar.f356621h = zg3Var.f473536o;
            fVar.f356622i = zg3Var.f473537p;
            fVar.f356624k = zg3Var.f473539r;
            fVar.f356623j = new java.util.ArrayList();
            java.util.Iterator it = this.f356629d.f473538q.iterator();
            while (it.hasNext()) {
                r45.zv3 zv3Var = (r45.zv3) it.next();
                this.f356630e.f356623j.add(new gs4.g(zv3Var.f473918d, zv3Var.f473919e, zv3Var.f473920f, zv3Var.f473921g));
            }
        }
        return this.f356630e;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f356632g = u0Var;
        return mo9409x10f9447a(sVar, this.f356631f, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1477;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.d1
    /* renamed from: onGYNetEnd */
    public void mo11134x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetHbRefundConfig", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f356629d = (r45.zg3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        }
        this.f356632g.mo815x76e0bfae(i18, i19, str, this);
    }
}
