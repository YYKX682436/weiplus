package s01;

/* loaded from: classes4.dex */
public class h0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f483409d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f483410e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f483411f;

    public h0(java.lang.String str, java.lang.String str2, boolean z17) {
        this.f483411f = false;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.za3();
        lVar.f152198b = new r45.ab3();
        lVar.f152199c = "/cgi-bin/mmocbiz-bin/getbizchatinfo";
        lVar.f152200d = 1352;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f483410e = a17;
        r45.za3 za3Var = (r45.za3) a17.f152243a.f152217a;
        za3Var.f473391e = str;
        za3Var.f473390d = str2;
        this.f483411f = z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f483409d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.brandservice.NetSceneGetBizChatInfo", "do scene");
        return mo9409x10f9447a(sVar, this.f483410e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1352;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f483409d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
