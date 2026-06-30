package z12;

/* loaded from: classes4.dex */
public class f extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f550819d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f550820e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f550821f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.uj0 f550822g;

    /* renamed from: h, reason: collision with root package name */
    public final int f550823h;

    /* renamed from: i, reason: collision with root package name */
    public final int f550824i;

    public f(java.lang.String str, r45.uj0 uj0Var, int i17, int i18) {
        this.f550823h = i17;
        this.f550824i = i18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.eb();
        lVar.f152198b = new r45.fb();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mmaskforreward";
        lVar.f152200d = 830;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f550819d = lVar.a();
        this.f550821f = str;
        this.f550822g = uj0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f550820e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f550819d;
        r45.eb ebVar = (r45.eb) oVar.f152243a.f152217a;
        int i17 = this.f550823h;
        ebVar.f454742g = i17;
        int i18 = this.f550824i;
        ebVar.f454743h = i18;
        ebVar.f454739d = this.f550821f;
        r45.uj0 uj0Var = new r45.uj0();
        r45.uj0 uj0Var2 = this.f550822g;
        uj0Var.f468943d = uj0Var2.f468943d;
        uj0Var.f468945f = uj0Var2.f468945f;
        try {
            uj0Var.f468944e = new java.text.DecimalFormat("0.00").format(java.lang.Float.valueOf(uj0Var2.f468944e));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.emoji.NetSceneAskForReward", e17, "format error %s", uj0Var2.f468944e);
            uj0Var.f468944e = "0.00";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.NetSceneAskForReward", "doScene scene:%s, enterScene:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ebVar.f454740e = uj0Var;
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 830;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f550820e.mo815x76e0bfae(i18, i19, str, this);
    }
}
