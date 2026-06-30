package kn;

/* loaded from: classes8.dex */
public class z extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f391024d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f391025e;

    public z(java.lang.String str, int i17, r45.vt5 vt5Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        objArr[0] = str == null ? "" : str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = kn.j0.f(vt5Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.roomTodo.NetSceneRoomToolsAlterTodo", "NetSceneRoomToolsAlterTodo chatRoomName:%s op:%s roomToolsTodo%s", objArr);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152199c = "/cgi-bin/micromsg-bin/roomtoolsaltertodo";
        lVar.f152200d = 3618;
        lVar.f152197a = new r45.pt5();
        lVar.f152198b = new r45.qt5();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f391025e = a17;
        r45.pt5 pt5Var = (r45.pt5) a17.f152243a.f152217a;
        pt5Var.f464935d = str == null ? "" : str;
        pt5Var.f464936e = i17;
        pt5Var.f464937f = vt5Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f391024d = u0Var;
        return mo9409x10f9447a(sVar, this.f391025e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3618;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f391024d.mo815x76e0bfae(i18, i19, str, this);
    }
}
