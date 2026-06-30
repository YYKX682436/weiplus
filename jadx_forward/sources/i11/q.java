package i11;

/* loaded from: classes4.dex */
public class q extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f368674d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f368675e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f368676f = "";

    public q(u60.h hVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.i93();
        lVar.f152198b = new r45.j93();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getaddress";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.t.f33750x366c91de;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f368675e = a17;
        r45.i93 i93Var = (r45.i93) a17.f152243a.f152217a;
        double d17 = hVar.f506401a;
        i93Var.f458373e = d17;
        double d18 = hVar.f506402b;
        i93Var.f458372d = d18;
        i93Var.f458376h = hVar.f506403c;
        i93Var.f458374f = hVar.f506404d;
        i93Var.f458375g = hVar.f506405e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetAddress", "Latitude:%s, Longitude:%s, scene:%s, indoorswitch:%s, poiFloor:%s", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18), java.lang.Integer.valueOf(hVar.f506403c), java.lang.Integer.valueOf(hVar.f506404d), hVar.f506405e);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f368674d = u0Var;
        return mo9409x10f9447a(sVar, this.f368675e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.t.f33750x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f368674d;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        this.f368676f = ((r45.j93) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a).f459198d;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f368674d;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
