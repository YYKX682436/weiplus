package nl3;

/* loaded from: classes8.dex */
public class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f419714d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f419715e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bm3 f419716f;

    /* renamed from: g, reason: collision with root package name */
    public final ql3.a f419717g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f419718h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f419719i;

    public b(ql3.a aVar, boolean z17, boolean z18) {
        this.f419717g = aVar;
        this.f419718h = z17;
        this.f419719i = z18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.am3();
        lVar.f152198b = new r45.bm3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getqqmusiclyric";
        lVar.f152200d = 520;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f419715e = a17;
        r45.am3 am3Var = (r45.am3) a17.f152243a.f152217a;
        am3Var.f451652d = aVar.f66996x10603bf5;
        java.lang.String str = aVar.f67006x45670355;
        if (str != null) {
            am3Var.f451653e = x51.j1.a(str.getBytes());
        }
        java.lang.String str2 = aVar.f66999xfba74ece;
        if (str2 != null) {
            am3Var.f451656h = x51.j1.a(str2.getBytes());
        }
        am3Var.f451654f = !b21.q.a() ? 1 : 0;
        am3Var.f451655g = b21.q.b() ? 1 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "songId=%d, url=%s IsOutsideGFW=%d ShakeMusicGlobalSwitch=%d", java.lang.Integer.valueOf(aVar.f66996x10603bf5), aVar.f67006x45670355, java.lang.Integer.valueOf(am3Var.f451654f), java.lang.Integer.valueOf(am3Var.f451655g));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f419714d = u0Var;
        return mo9409x10f9447a(sVar, this.f419715e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 520;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f419714d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            this.f419716f = (r45.bm3) this.f419715e.f152244b.f152233a;
            this.f419714d.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
