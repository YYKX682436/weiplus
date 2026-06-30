package v33;

/* loaded from: classes15.dex */
public class t extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f514681d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f514682e;

    public t(s33.j jVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15812x1a9e2629();
        lVar.f152198b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15813x3c4e53e7();
        lVar.f152199c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/sendchatroommsg";
        lVar.f152200d = 4993;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f514682e = a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15812x1a9e2629 c15812x1a9e2629 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15812x1a9e2629) a17.f152243a.f152217a;
        c15812x1a9e2629.f36853x3923b317 = jVar.f484039b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67();
        c15731x94356d67.f36574xb3812938 = jVar.f484040c;
        c15731x94356d67.f36570xfd4da1cb = jVar.f484038a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f484041d)) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            java.lang.String str = jVar.f484038a;
            str = str == null ? "" : str;
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
            objArr[1] = jVar.f484039b;
            objArr[2] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.R(10, 0));
            objArr[3] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            jVar.f484041d = java.lang.String.format("gamelife_chatroom_%s%s%s_%s", objArr);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiSendChatRoomMsg", "send chat msg, msgType:%d", java.lang.Integer.valueOf(jVar.f484040c));
        c15731x94356d67.f36569x2960698 = jVar.f484041d;
        c15731x94356d67.f36568x8cea31d7 = jVar.f484042e;
        c15731x94356d67.f36575x197b124 = java.lang.System.currentTimeMillis();
        c15731x94356d67.f36571x8f2d71bb = jVar.f484044g;
        c15731x94356d67.f36572xbfcc3e0 = jVar.f484043f;
        c15812x1a9e2629.f36854xb37efc17 = c15731x94356d67;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f514681d = u0Var;
        return mo9409x10f9447a(sVar, this.f514682e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4993;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.CgiSendChatRoomMsg", "errType = " + i18 + ", errCode = " + i19 + ", errMsg = " + str);
        this.f514681d.mo815x76e0bfae(i18, i19, str, this);
    }
}
