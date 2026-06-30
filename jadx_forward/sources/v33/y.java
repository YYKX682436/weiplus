package v33;

/* loaded from: classes4.dex */
public final class y extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514692d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514693e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Long f514694f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f514695g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f514696h;

    public y(java.lang.String chatRoomName, long j17, boolean z17, java.lang.String userName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRoomName, "chatRoomName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15836xb007e78();
        lVar.f152198b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15837x58370578();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/votemsg";
        lVar.f152200d = 4569;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f514693e = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15836xb007e78 c15836xb007e78 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15836xb007e78) fVar;
        c15836xb007e78.f36912x3923b317 = chatRoomName;
        c15836xb007e78.seq = j17;
        c15836xb007e78.f36913x7c1da8df = z17;
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_CHAT_ROOM_VOTE_EDUCATION_INT, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        c15836xb007e78.f36914xef56a73f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) m17) == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiVoteMsg", "seq:" + j17 + ", isVote:" + z17);
        this.f514694f = java.lang.Long.valueOf(j17);
        this.f514695g = userName;
        this.f514696h = java.lang.Integer.valueOf(i17);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514692d = u0Var;
        return mo9409x10f9447a(sVar, this.f514693e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4569;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiVoteMsg", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f514692d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
        u0Var.mo815x76e0bfae(i18, i19, str, this);
    }
}
