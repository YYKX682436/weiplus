package mq4;

/* loaded from: classes9.dex */
public class k extends mq4.e0 {
    public k(int i17, long j17, int i18, int i19, int i27, int i28, int i29, byte[] bArr, int i37) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.o27();
        lVar.f152198b = new r45.p27();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipDoubleLinkSwitch";
        lVar.f152200d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de;
        lVar.f152201e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de;
        lVar.f152202f = 1000000249;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        r45.o27 o27Var = (r45.o27) a17.f152243a.f152217a;
        o27Var.f463385d = i17;
        o27Var.f463386e = j17;
        o27Var.f463387f = i18;
        o27Var.f463388g = i19;
        o27Var.f463389h = i27;
        o27Var.f463390i = i28;
        o27Var.f463391m = i29;
        o27Var.f463392n = 1;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.e(bArr, 0, i37);
        o27Var.f463393o = cu5Var;
    }

    @Override // mq4.e0
    public void I(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.DoubleLinkSwitch", "double link switch error");
            return;
        }
        r45.p27 p27Var = (r45.p27) K();
        if (p27Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Voip.DoubleLinkSwitch", "roomId:%d, roomKey:%s, member:%d", java.lang.Integer.valueOf(p27Var.f464221d), java.lang.Long.valueOf(p27Var.f464222e), java.lang.Integer.valueOf(p27Var.f464223f));
        }
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.j(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de;
    }
}
