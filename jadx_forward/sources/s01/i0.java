package s01;

/* loaded from: classes4.dex */
public class i0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f483412d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f483413e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f483414f = new java.util.HashMap();

    public i0(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.rj rjVar = (r45.rj) it.next();
            java.lang.String str = rjVar.f466474e;
            java.lang.String str2 = rjVar.f466473d;
            if (str2 != null && str != null) {
                this.f483414f.put(str, str2);
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xa3();
        lVar.f152198b = new r45.ya3();
        lVar.f152199c = "/cgi-bin/mmocbiz-bin/getbizchatinfolist";
        lVar.f152200d = 1365;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f483413e = a17;
        ((r45.xa3) a17.f152243a.f152217a).f471449d = linkedList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f483412d = u0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "do scene");
        return mo9409x10f9447a(sVar, this.f483413e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1365;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f483412d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
