package k14;

/* loaded from: classes2.dex */
public class v extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f384921d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f384922e;

    public v(java.util.List list) {
        this.f384922e = list;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f384921d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.z4 z4Var = new r45.z4();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f384922e;
        if (list != null) {
            for (int i17 = 0; i17 < list.size(); i17++) {
                r45.fq6 fq6Var = new r45.fq6();
                fq6Var.f456087d = (java.lang.String) list.get(i17);
                arrayList.add(fq6Var);
            }
        }
        z4Var.f473217d.addAll(arrayList);
        lVar.f152197a = z4Var;
        lVar.f152198b = new r45.a5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/addtrustedfriends";
        lVar.f152200d = 583;
        lVar.f152201e = 0;
        return mo9409x10f9447a(sVar, lVar.a(), this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 583;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        m48025x7d7117e2(i17);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        this.f384921d.mo815x76e0bfae(i18, i19, str, this);
    }
}
