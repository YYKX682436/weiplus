package hm3;

/* loaded from: classes2.dex */
public final class g extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f363775i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363776m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363777n;

    /* renamed from: o, reason: collision with root package name */
    public r45.pr4 f363778o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r45.hf2 songInfo, int i17) {
        super(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        this.f363775i = "MicroMsg.Mv.NetSceneMusicMvCheckPermission";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5286;
        lVar.f152199c = "/cgi-bin/micromsg-bin/musiclivecheckpermission";
        lVar.f152197a = new r45.or4();
        lVar.f152198b = new r45.pr4();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveCheckPermissionReq");
        ((r45.or4) fVar).f463996e = songInfo;
        this.f363777n = a17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f363776m = u0Var;
        return mo9409x10f9447a(sVar, this.f363777n, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5286;
    }

    @Override // hm3.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363775i, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363776m;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f363777n;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveCheckPermissionResp");
        this.f363778o = (r45.pr4) fVar;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f363776m;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
