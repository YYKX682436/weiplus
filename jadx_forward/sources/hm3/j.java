package hm3;

/* loaded from: classes10.dex */
public final class j extends hm3.a {

    /* renamed from: r, reason: collision with root package name */
    public static final hm3.i f363783r = new hm3.i(null);

    /* renamed from: i, reason: collision with root package name */
    public final r45.hf2 f363784i;

    /* renamed from: m, reason: collision with root package name */
    public final int f363785m;

    /* renamed from: n, reason: collision with root package name */
    public final int f363786n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f363787o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f363788p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tr4 f363789q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.hf2 songInfo, int i17, int i18, int i19) {
        super(i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        this.f363784i = songInfo;
        this.f363785m = i17;
        this.f363786n = i18;
        r45.sr4 sr4Var = new r45.sr4();
        sr4Var.f467472d = songInfo.m75945x2fec8307(5);
        sr4Var.f467473e = songInfo.m75945x2fec8307(0);
        sr4Var.f467474f = songInfo.m75945x2fec8307(1);
        sr4Var.f467476h = songInfo.m75945x2fec8307(2);
        sr4Var.f467475g = songInfo.m75945x2fec8307(4);
        sr4Var.f467477i = i17;
        sr4Var.f467478m = songInfo;
        this.f363788p = f363783r.a(sr4Var);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f363787o = callback;
        return mo9409x10f9447a(dispatcher, this.f363788p, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5904;
    }

    @Override // hm3.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.NetSceneMusicMvGetBeatTrack", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f363787o;
            if (u0Var != null) {
                u0Var.mo815x76e0bfae(i18, i19, str, this);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f363788p.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetBeatTrackResp");
        this.f363789q = (r45.tr4) fVar;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var2 = this.f363787o;
        if (u0Var2 != null) {
            u0Var2.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
