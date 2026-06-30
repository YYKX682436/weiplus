package r61;

/* loaded from: classes4.dex */
public class c1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f474360d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f474361e;

    /* renamed from: f, reason: collision with root package name */
    public final int f474362f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f474363g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f474364h;

    public c1(r61.b1 b1Var, java.lang.String str, int i17) {
        this.f474360d = -1;
        this.f474362f = 0;
        int ordinal = b1Var.ordinal();
        if (ordinal == 0) {
            this.f474360d = 1;
        } else if (ordinal == 1) {
            this.f474360d = 2;
        }
        this.f474361e = str;
        this.f474362f = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.vh();
        lVar.f152198b = new r45.wh();
        lVar.f152199c = "/cgi-bin/micromsg-bin/bindgooglecontact";
        lVar.f152200d = 487;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f474363g = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
        this.f474364h = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f474363g;
        r45.vh vhVar = (r45.vh) oVar.f152243a.f152217a;
        vhVar.f469762d = this.f474360d;
        vhVar.f469763e = this.f474361e;
        vhVar.f469764f = this.f474362f;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 487;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f474364h.mo815x76e0bfae(i18, i19, str, this);
    }
}
