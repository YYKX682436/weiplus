package v33;

/* loaded from: classes4.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514636d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514637e;

    public c(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.Lbs lbs, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15754x1d35eb62 c15754x1d35eb62) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15759x9a4651a7();
        lVar.f152198b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15760xb1ab9829();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroombaseinfo";
        lVar.f152200d = 4391;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f514637e = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15759x9a4651a7 c15759x9a4651a7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15759x9a4651a7) a17.f152243a.f152217a;
        c15759x9a4651a7.f36675x3923b317 = str;
        c15759x9a4651a7.f36678xdccb09f0 = lbs;
        c15759x9a4651a7.f36677x4159a5e2 = c15754x1d35eb62;
        if (x51.o1.U) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15750xffa66888 c15750xffa66888 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15750xffa66888();
            c15750xffa66888.f36654xc421396a = true;
            c15750xffa66888.f36653x924b831a = "forceShowFirstEnterNotify";
            c15759x9a4651a7.f36676x37d6bbe1 = c15750xffa66888;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514636d = u0Var;
        return mo9409x10f9447a(sVar, this.f514637e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4391;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiGetChatRoomBaseInfo", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f514636d.mo815x76e0bfae(i18, i19, str, this);
    }
}
