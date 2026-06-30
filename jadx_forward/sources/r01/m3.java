package r01;

/* loaded from: classes2.dex */
public class m3 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f449691d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f449692e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f449693f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f449694g;

    public m3(java.lang.String str, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.w34();
        lVar.f152198b = new r45.x34();
        lVar.f152199c = "/cgi-bin/mmkf-bin/kfgetinfolist";
        lVar.f152200d = 675;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f449692e = a17;
        r45.w34 w34Var = (r45.w34) a17.f152243a.f152217a;
        w34Var.f470372d = str;
        w34Var.f470373e = linkedList;
        w34Var.f470374f = linkedList2;
        this.f449693f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f449691d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneKFGetInfoList", "do scene");
        return mo9409x10f9447a(sVar, this.f449692e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 675;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneKFGetInfoList", "onGYNetEnd code(%d, %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f449691d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
