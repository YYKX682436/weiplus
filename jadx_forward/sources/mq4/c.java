package mq4;

/* loaded from: classes14.dex */
public class c extends mq4.e0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f412318h = "MicroMsg.NetSceneVoipAck";

    public c(int i17, long j17, int i18, byte[] bArr, byte[] bArr2, java.lang.String str, java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.z17();
        lVar.f152198b = new r45.a27();
        lVar.f152199c = "/cgi-bin/micromsg-bin/voipack";
        lVar.f152200d = 305;
        lVar.f152201e = 123;
        lVar.f152202f = 1000000123;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f412326d = a17;
        r45.z17 z17Var = (r45.z17) a17.f152243a.f152217a;
        z17Var.f473143d = i17;
        z17Var.f473144e = j17;
        z17Var.f473151o = i18;
        if (i18 != 1) {
            z17Var.f473146g = 0;
            return;
        }
        z17Var.f473150n = str;
        r45.k37 k37Var = new r45.k37();
        k37Var.f459876d = 2;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(bArr);
        k37Var.f459877e = cu5Var;
        z17Var.f473147h = k37Var;
        r45.k37 k37Var2 = new r45.k37();
        k37Var2.f459876d = 3;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(bArr2);
        k37Var2.f459877e = cu5Var2;
        z17Var.f473148i = k37Var2;
        z17Var.f473152p = java.lang.System.currentTimeMillis();
        z17Var.f473156t = this.f412329g.f258065x.m72813xb422216b();
        z17Var.f473146g = 1;
        int Ai = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Ai(2);
        vq4.d0.c("MicroMsg.NetSceneVoipAck", "simType:" + Ai + " ipstack:" + z17Var.f473156t);
        if (Ai == 0) {
            z17Var.f473153q = 0;
        } else if (Ai == 3) {
            z17Var.f473153q = 3;
        } else {
            z17Var.f473153q = Ai != 1 ? 2 : 1;
        }
        z17Var.f473154r = linkedList.size();
        z17Var.f473155s = linkedList;
        z17Var.f473157u = vq4.p0.b();
    }

    @Override // mq4.e0
    public com.p314xaae8f345.mm.p944x882e457a.u0 J() {
        return new mq4.b(this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 305;
    }
}
