package mq4;

/* loaded from: classes8.dex */
public class c0 extends mq4.e0 {
    public c0(int i17, r45.k27 k27Var, byte[] bArr, long j17, int i18) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.w37();
        lVar.f152198b = new r45.x37();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipsync";
        lVar.f152200d = 174;
        lVar.f152201e = 62;
        lVar.f152202f = 1000000062;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        r45.w37 w37Var = (r45.w37) a17.f152243a.f152217a;
        w37Var.f470395e = i17;
        w37Var.f470397g = k27Var;
        w37Var.f470398h = j17;
        w37Var.f470394d = c01.z1.r();
        w37Var.f470399i = i18;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        w37Var.f470396f = cu5Var;
        w37Var.f470400m = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneVoipSync", "sync timestamp: " + w37Var.f470400m);
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.b0(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 174;
    }
}
