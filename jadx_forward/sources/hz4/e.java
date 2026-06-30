package hz4;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f367933d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f367934e = null;

    /* renamed from: f, reason: collision with root package name */
    public final int f367935f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f367936g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.xp0 f367937h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f367938i;

    /* renamed from: m, reason: collision with root package name */
    public final int f367939m;

    public e(int i17, int i18, java.lang.String str, java.util.LinkedList linkedList, r45.xp0 xp0Var) {
        this.f367935f = 1;
        this.f367936g = "";
        this.f367937h = null;
        this.f367938i = new java.util.LinkedList();
        this.f367939m = 0;
        this.f367938i = linkedList;
        this.f367937h = xp0Var;
        this.f367936g = str;
        this.f367935f = i18;
        this.f367939m = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.gq0();
        lVar.f152198b = new r45.hq0();
        lVar.f152199c = "/cgi-bin/micromsg-bin/favsecurity ";
        lVar.f152200d = 921;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f367933d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f367933d;
        r45.gq0 gq0Var = (r45.gq0) oVar.f152243a.f152217a;
        gq0Var.f457008d = this.f367935f;
        gq0Var.f457011g = this.f367937h;
        gq0Var.f457010f = this.f367938i;
        gq0Var.f457009e = this.f367936g;
        this.f367934e = u0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 921;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "netId %d errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.hq0 hq0Var = (r45.hq0) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,errType:%d,fail", java.lang.Integer.valueOf(i18));
            this.f367934e.mo815x76e0bfae(i18, -1, str, this);
            return;
        }
        if (hq0Var == null || hq0Var.mo11484xe92ab0a8() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,response == null,ok");
            this.f367934e.mo815x76e0bfae(i18, 0, str, this);
        } else if (hq0Var.mo11484xe92ab0a8().f458492d != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,baseresponse.ret != 0,ok");
            this.f367934e.mo815x76e0bfae(i18, 0, str, this);
        } else if (hq0Var.f457918d > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult > 0,fail");
            this.f367934e.mo815x76e0bfae(i18, -1, str, this);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult = 0,fail");
            this.f367934e.mo815x76e0bfae(i18, 0, str, this);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return com.p314xaae8f345.mm.p944x882e457a.o1.EOk;
    }
}
