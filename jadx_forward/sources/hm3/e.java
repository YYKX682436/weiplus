package hm3;

/* loaded from: classes2.dex */
public final class e extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363770i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363771m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f363772n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String app_name, java.lang.String entity_id, int i17) {
        super(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(app_name, "app_name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entity_id, "entity_id");
        this.f363772n = "MicroMsg.NetSceneMusicInterAction@" + hashCode();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 8967;
        lVar.f152199c = "/cgi-bin/micromsg-bin/musiclivegetinteractioninfo";
        lVar.f152197a = new r45.ur4();
        lVar.f152198b = new r45.vr4();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f363771m = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetInteractionInfoReq");
        r45.ur4 ur4Var = (r45.ur4) fVar;
        ur4Var.f469127d = app_name;
        ur4Var.f469128e = entity_id;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f363770i = u0Var;
        return mo9409x10f9447a(sVar, this.f363771m, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 8967;
    }

    @Override // hm3.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363770i;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363772n, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
    }
}
