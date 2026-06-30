package wt3;

/* loaded from: classes.dex */
public final class o0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f530994d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f530995e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f530996f = "Finder.NetSceneAudioPanelGetFinderFavList";

    public o0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3966;
        r45.w51 w51Var = new r45.w51();
        w51Var.set(3, gVar);
        w51Var.set(2, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null));
        w51Var.set(4, 0);
        r45.kv0 kv0Var = new r45.kv0();
        kv0Var.set(1, 101);
        w51Var.set(1, kv0Var);
        lVar.f152197a = w51Var;
        lVar.f152200d = 3966;
        lVar.f152198b = new r45.x51();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetfavlist";
        this.f530994d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneAudioPanelGetFinderFavList", " init:NetSceneAudioPanelGetFinderFavList " + w51Var.m75945x2fec8307(2));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f530995e = u0Var;
        return mo9409x10f9447a(sVar, this.f530994d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3966;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530996f, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f530995e;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
