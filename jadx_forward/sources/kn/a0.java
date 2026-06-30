package kn;

/* loaded from: classes8.dex */
public class a0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390909d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390910e;

    public a0(java.lang.String str, java.util.LinkedList linkedList) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : "null";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomtools.NetSceneRoomToolsAlterWxApp", "NetSceneRoomToolsAlterWxApp chatRoomName:%s roomToolsWxApps%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/roomtoolsalterwxapp";
        lVar.f152200d = 3546;
        lVar.f152197a = new r45.rt5();
        lVar.f152198b = new r45.st5();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390910e = a17;
        r45.rt5 rt5Var = (r45.rt5) a17.f152243a.f152217a;
        rt5Var.f466740d = str == null ? "" : str;
        r45.ot5 ot5Var = new r45.ot5();
        rt5Var.f466741e = ot5Var;
        ot5Var.f464043d = linkedList.size();
        rt5Var.f466741e.f464044e = linkedList;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390909d = u0Var;
        return mo9409x10f9447a(sVar, this.f390910e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3546;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f390909d.mo815x76e0bfae(i18, i19, str, this);
    }
}
