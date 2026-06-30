package kn;

/* loaded from: classes8.dex */
public class b0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f390911d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f390912e;

    public b0(java.lang.String str, java.lang.String str2, java.lang.String str3, r45.vt5 vt5Var) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = str2 == null ? "" : str2;
        objArr[2] = str3 == null ? "" : str3;
        objArr[3] = kn.j0.f(vt5Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.NetSceneRoomToolsReplyTodo", "NetSceneRoomToolsReplyTodo chatRoomName:%s creator:%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/roomtoolsreplytodo";
        lVar.f152200d = 3854;
        lVar.f152197a = new r45.tt5();
        lVar.f152198b = new r45.ut5();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f390912e = a17;
        r45.tt5 tt5Var = (r45.tt5) a17.f152243a.f152217a;
        tt5Var.f468320d = str == null ? "" : str;
        tt5Var.f468321e = str2;
        tt5Var.f468322f = str3;
        tt5Var.f468323g = vt5Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f390911d = u0Var;
        return mo9409x10f9447a(sVar, this.f390912e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3854;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f390911d.mo815x76e0bfae(i18, i19, str, this);
    }
}
