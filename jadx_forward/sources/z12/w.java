package z12;

/* loaded from: classes2.dex */
public class w extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550909d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550910e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f550911f;

    /* renamed from: g, reason: collision with root package name */
    public final int f550912g;

    public w(java.lang.String str, int i17) {
        this.f550911f = str;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.equals(java.lang.String.valueOf(17))) {
            this.f550911f = "com.tencent.xin.emoticon.tusiji";
        }
        this.f550912g = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xn4();
        lVar.f152198b = new r45.yn4();
        lVar.f152199c = "/cgi-bin/micromsg-bin/modemotionpack";
        lVar.f152200d = 413;
        lVar.f152201e = 212;
        lVar.f152202f = 1000000212;
        this.f550909d = lVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneModEmotionPack", "NetSceneModEmotionPack: %s, %s", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550910e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550909d;
        r45.xn4 xn4Var = (r45.xn4) oVar.f152243a.f152217a;
        xn4Var.f471785d = this.f550911f;
        xn4Var.f471786e = this.f550912g;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 413;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int i27 = this.f550912g;
        if (i18 == 0 && i19 == 0) {
            if (i27 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(165L, 2L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(165L, 4L, 1L, false);
            }
            this.f550910e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        this.f550910e.mo815x76e0bfae(i18, i19, str, this);
        if (i27 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(165L, 3L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneModEmotionPack", "del tukiz failed  ");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(165L, 5L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneModEmotionPack", "del emoji failed md5:%s", this.f550911f);
        }
    }
}
