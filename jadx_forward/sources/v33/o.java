package v33;

/* loaded from: classes4.dex */
public class o extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514666d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514667e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f514668f;

    /* renamed from: g, reason: collision with root package name */
    public final long f514669g;

    /* renamed from: h, reason: collision with root package name */
    public final long f514670h;

    public o(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs, boolean z17, long j17, long j18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32();
        lVar.f152198b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15779x9605fefe();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/joinchatroom";
        lVar.f152200d = 4897;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f514668f = z17;
        this.f514669g = j17;
        this.f514670h = j18;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f514667e = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32 c15778x36493c32 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15778x36493c32) a17.f152243a.f152217a;
        c15778x36493c32.f36733x3923b317 = str;
        if (lbs != null) {
            c15778x36493c32.f36735xdccb09f0 = lbs;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 c15754x1d35eb62 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62();
        c15754x1d35eb62.f36659x6816da76 = j18;
        c15754x1d35eb62.f36660x36037b = j17;
        c15778x36493c32.f36734xbb2821ed = c15754x1d35eb62;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514666d = u0Var;
        return mo9409x10f9447a(sVar, this.f514667e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4897;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiJoinChatRoom", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        if (i18 == 0 && i19 == 0 && this.f514668f) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.m(1L, 14L, 0L, this.f514669g, this.f514670h);
        }
        this.f514666d.mo815x76e0bfae(i18, i19, str, this);
    }
}
