package wt3;

/* loaded from: classes.dex */
public final class p0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f531000d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f531001e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f531002f = "Finder.NetSceneAudioPanelGetFinderLikedList";

    public p0(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 3965;
        r45.c71 c71Var = new r45.c71();
        c71Var.set(1, 0L);
        c71Var.set(3, gVar);
        c71Var.set(2, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null));
        c71Var.set(5, "");
        c71Var.set(6, 0);
        r45.kv0 kv0Var = new r45.kv0();
        kv0Var.set(1, 101);
        c71Var.set(4, kv0Var);
        lVar.f152197a = c71Var;
        lVar.f152200d = 3965;
        lVar.f152198b = new r45.d71();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetlikedlist";
        this.f531000d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NetSceneAudioPanelGetFinderLikedList", " init:NetSceneAudioPanelGetFinderLikedList " + c71Var.m75945x2fec8307(2));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f531001e = u0Var;
        return mo9409x10f9447a(sVar, this.f531000d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3965;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f531002f, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f531001e;
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
