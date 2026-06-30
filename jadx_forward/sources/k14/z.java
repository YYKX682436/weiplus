package k14;

/* loaded from: classes4.dex */
public class z extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f384952d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f384953e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f384954f = false;

    public z() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.hl3();
        lVar.f152198b = new r45.il3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getpluginswitch";
        lVar.f152200d = 4158;
        this.f384952d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f384953e = u0Var;
        return mo9409x10f9447a(sVar, this.f384952d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 4158;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.il3 il3Var;
        r45.y85 y85Var;
        java.util.LinkedList linkedList;
        if (i18 == 0 && i19 == 0 && (il3Var = (r45.il3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a) != null && (y85Var = il3Var.f458661d) != null && (linkedList = y85Var.f472396d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.x85 x85Var = (r45.x85) it.next();
                if (x85Var != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetMiniShopHelperPluginShowStatus", "updateNeedShow, switchId: %d, switchValue: %b", java.lang.Integer.valueOf(x85Var.f471407d), java.lang.Boolean.valueOf(x85Var.f471408e));
                    if (5200001 == x85Var.f471407d) {
                        this.f384954f = x85Var.f471408e;
                        break;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f384953e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
