package s01;

/* loaded from: classes4.dex */
public class q0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f483454d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f483455e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f483456f;

    public q0(java.lang.String str, java.lang.String str2, r45.tj tjVar, r45.tj tjVar2, java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.as6();
        lVar.f152198b = new r45.bs6();
        lVar.f152199c = "/cgi-bin/mmocbiz-bin/updatebizchatmemberlist";
        lVar.f152200d = 1357;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f483455e = a17;
        r45.as6 as6Var = (r45.as6) a17.f152243a.f152217a;
        as6Var.f451778d = str;
        as6Var.f451779e = str2;
        as6Var.f451780f = tjVar;
        as6Var.f451781g = tjVar2;
        this.f483456f = obj;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f483454d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "do scene");
        return mo9409x10f9447a(sVar, this.f483455e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1357;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f483454d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
