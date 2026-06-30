package z12;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550842d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550843e;

    public i(java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.xe xeVar = new r45.xe();
        xeVar.f471536f = linkedList;
        xeVar.f471535e = 1;
        lVar.f152197a = xeVar;
        lVar.f152198b = new r45.ye();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
        lVar.f152200d = 697;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550843e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550842d = u0Var;
        return mo9409x10f9447a(sVar, this.f550843e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 697;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneCheckEmoijExistByp", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 != 0 || i19 != 0) {
            this.f550842d.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        java.util.LinkedList linkedList = ((r45.ye) this.f550843e.f152244b.f152233a).f472541g;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneCheckEmoijExistByp", "Change MD5 to URL failed.");
        }
        this.f550842d.mo815x76e0bfae(i18, i19, str, this);
    }
}
