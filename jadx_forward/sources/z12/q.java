package z12;

/* loaded from: classes4.dex */
public class q extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550883d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550884e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f550885f;

    /* renamed from: g, reason: collision with root package name */
    public final int f550886g;

    /* renamed from: h, reason: collision with root package name */
    public final int f550887h;

    public q(java.lang.String str, int i17, int i18) {
        this.f550885f = str;
        this.f550886g = i17;
        this.f550887h = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.re3();
        lVar.f152198b = new r45.se3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getemotiondetail";
        lVar.f152200d = 412;
        lVar.f152201e = 211;
        lVar.f152202f = 1000000211;
        this.f550883d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        int i17 = this.f550886g;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f550887h;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.String str = this.f550885f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ProductID:%s, Scene:%d, Version:%d", str, valueOf, valueOf2);
        this.f550884e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550883d;
        r45.re3 re3Var = (r45.re3) oVar.f152243a.f152217a;
        re3Var.f466293d = str;
        re3Var.f466294e = i17;
        re3Var.f466295f = i18;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 412;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ErrType:" + i18 + "   errCode:" + i19);
        if (i18 != 0 && i19 != 0 && i19 != 5) {
            this.f550884e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        if (i18 == 0 && i19 == 0) {
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().d().z0(this.f550885f, (r45.se3) this.f550883d.f152244b.f152233a, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        }
        this.f550884e.mo815x76e0bfae(i18, i19, str, this);
    }
}
