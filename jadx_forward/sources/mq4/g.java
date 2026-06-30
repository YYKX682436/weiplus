package mq4;

/* loaded from: classes14.dex */
public class g extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f412331h = "MicroMsg.NetSceneVoipAnswer";

    public g(int i17, int i18, int i19, byte[] bArr, byte[] bArr2, long j17, boolean z17, boolean z18, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.d27();
        lVar.f152198b = new r45.e27();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipanswer";
        lVar.f152200d = 172;
        lVar.f152201e = 65;
        lVar.f152202f = 1000000065;
        this.f412326d = lVar.a();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_voipanswer_retry_count, 1);
        if (Ni == 0) {
            this.f412326d.m47986x306cfea3(true);
        }
        r45.d27 d27Var = (r45.d27) this.f412326d.f152243a.f152217a;
        d27Var.f453550f = i17;
        d27Var.f453549e = i19;
        d27Var.f453554m = i18;
        r45.k37 k37Var = new r45.k37();
        k37Var.f459876d = 2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        k37Var.f459877e = cu5Var;
        d27Var.f453551g = k37Var;
        r45.k37 k37Var2 = new r45.k37();
        k37Var2.f459876d = 3;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(bArr2);
        k37Var2.f459877e = cu5Var2;
        d27Var.f453552h = k37Var2;
        d27Var.f453560s = this.f412329g.f258065x.m72813xb422216b();
        d27Var.f453553i = j17;
        if (z18) {
            d27Var.f453556o = z17 ? 1 : 0;
        }
        d27Var.f453555n = java.lang.System.currentTimeMillis();
        int Ai = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(2);
        vq4.d0.c("MicroMsg.NetSceneVoipAnswer", "simType:" + Ai + " ipstack:" + d27Var.f453560s + " retry count:" + Ni);
        if (Ai == 0) {
            d27Var.f453557p = 0;
        } else if (Ai == 3) {
            d27Var.f453557p = 3;
        } else {
            d27Var.f453557p = Ai != 1 ? 2 : 1;
        }
        if (linkedList != null) {
            d27Var.f453558q = linkedList.size();
            d27Var.f453559r = linkedList;
        }
        d27Var.f453561t = vq4.p0.b();
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.f(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 172;
    }
}
