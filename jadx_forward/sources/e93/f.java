package e93;

/* loaded from: classes4.dex */
public class f extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f331897d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f331898e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.f54 f331899f;

    public f(int i17, java.lang.String str) {
        this.f331899f = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.es6();
        lVar.f152198b = new r45.fs6();
        lVar.f152199c = "/cgi-bin/micromsg-bin/updatecontactlabel";
        lVar.f152200d = 637;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f331897d = lVar.a();
        if (i17 < 0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        r45.f54 f54Var = new r45.f54();
        this.f331899f = f54Var;
        f54Var.f455555e = i17;
        f54Var.f455554d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f331898e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f331897d;
        r45.es6 es6Var = (r45.es6) oVar.f152243a.f152217a;
        r45.f54 f54Var = this.f331899f;
        if (f54Var != null) {
            es6Var.f455248d = f54Var;
            return mo9409x10f9447a(sVar, oVar, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Label.NetSceneUpdateContactLabel", "cpan[doScene] label pair is null.");
        u0Var.mo815x76e0bfae(3, -1, "[doScene]empty label pair.", this);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 637;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f331898e.mo815x76e0bfae(i18, i19, str, this);
    }
}
