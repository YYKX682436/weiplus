package v33;

/* loaded from: classes4.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514638d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514639e;

    /* renamed from: f, reason: collision with root package name */
    public final int f514640f;

    /* renamed from: g, reason: collision with root package name */
    public final long f514641g;

    public e(java.lang.String str, long j17, long j18, int i17, long j19, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237();
        lVar.f152198b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15764x734a8999();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroommsg";
        lVar.f152200d = 4562;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f514639e = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237 c15763xb94b7237 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15763xb94b7237) a17.f152243a.f152217a;
        c15763xb94b7237.f36695x3923b317 = str;
        if (j17 > 0) {
            c15763xb94b7237.f36696xca0164cd = j17;
        } else if (j18 > 0) {
            c15763xb94b7237.f36697xca016568 = j18;
        }
        c15763xb94b7237.f36694x8cea31d7 = i18;
        this.f514640f = i17;
        this.f514641g = j19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiGetChatRoomMsg", "gtSeq:%d, ltSeq:%d, channelId:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514638d = u0Var;
        return mo9409x10f9447a(sVar, this.f514639e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4562;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiGetChatRoomMsg", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f514638d.mo815x76e0bfae(i18, i19, str, this);
    }
}
