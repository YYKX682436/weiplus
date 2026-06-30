package r01;

/* loaded from: classes4.dex */
public class o3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f449705d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f449706e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f449707f;

    public o3(r45.hk hkVar, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.p16();
        lVar.f152198b = new r45.q16();
        lVar.f152199c = "/cgi-bin/mmocbiz-bin/setbizenterpriseattr";
        lVar.f152200d = 1228;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f449706e = a17;
        r45.p16 p16Var = (r45.p16) a17.f152243a.f152217a;
        p16Var.f464200f = hkVar;
        p16Var.f464199e = i17;
        p16Var.f464198d = i18;
        this.f449707f = obj;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f449705d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSetBizEnterpriseAttr", "do scene");
        return mo9409x10f9447a(sVar, this.f449706e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1228;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f449705d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
