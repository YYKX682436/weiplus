package vq1;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f520772d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f520773e;

    /* renamed from: f, reason: collision with root package name */
    public long f520774f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f520775g;

    /* renamed from: h, reason: collision with root package name */
    public r45.vr3 f520776h;

    public a(java.lang.String str, java.lang.String str2) {
        this.f520775g = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1869;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/getweappbox";
        lVar.f152197a = new r45.ur3();
        lVar.f152198b = new r45.vr3();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f520773e = a17;
        ((r45.ur3) a17.f152243a.f152217a).f469126d = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.NetSceneBox", "Create NetSceneBox %s %s", str, str2);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f520774f = java.lang.System.currentTimeMillis();
        this.f520772d = u0Var;
        return mo9409x10f9447a(sVar, this.f520773e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1869;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.NetSceneBox", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f520774f));
        this.f520776h = (r45.vr3) this.f520773e.f152244b.f152233a;
        this.f520772d.mo815x76e0bfae(i18, i19, str, this);
    }
}
