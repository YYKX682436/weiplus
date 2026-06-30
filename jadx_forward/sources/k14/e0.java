package k14;

/* loaded from: classes8.dex */
public class e0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f384856d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f384857e;

    /* renamed from: f, reason: collision with root package name */
    public r45.px5 f384858f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f384859g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f384860h;

    public e0(java.lang.String str, byte[] bArr, boolean z17) {
        this.f384857e = str;
        this.f384859g = bArr;
        this.f384860h = z17;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f384856d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ox5 ox5Var = new r45.ox5();
        ox5Var.f464139d = this.f384857e;
        ox5Var.f464141f = this.f384860h;
        byte[] bArr = this.f384859g;
        if (bArr != null) {
            ox5Var.f464140e = x51.j1.a(bArr).f453374f;
        }
        lVar.f152197a = ox5Var;
        lVar.f152198b = new r45.px5();
        lVar.f152200d = ma1.m.f72805x366c91de;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/searchuserauth";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        return mo9409x10f9447a(sVar, lVar.a(), this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return ma1.m.f72805x366c91de;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.px5 px5Var = (r45.px5) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        this.f384858f = px5Var;
        if (px5Var != null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = px5Var.f464998f;
            objArr[1] = java.lang.Integer.valueOf(px5Var.f464999g);
            java.util.LinkedList linkedList = this.f384858f.f464997e;
            objArr[2] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSearchUserAuth", "searchUserAuth nextPageData: %s, flag: %s, size: %s", objArr);
        }
        r45.qv6 qv6Var = this.f384858f.f464996d;
        if (qv6Var != null) {
            i19 = qv6Var.f465837d;
            str = qv6Var.f465838e;
        }
        this.f384856d.mo815x76e0bfae(i18, i19, str, this);
    }
}
