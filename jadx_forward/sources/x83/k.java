package x83;

/* loaded from: classes4.dex */
public class k extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f534108d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f534109e;

    public k(java.lang.String str, java.lang.String str2, boolean z17, int i17, r45.u44 u44Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.z44 z44Var = new r45.z44();
        r45.a54 a54Var = new r45.a54();
        lVar.f152197a = z44Var;
        lVar.f152198b = a54Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmok";
        lVar.f152200d = 972;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        z44Var.f473224d = str;
        z44Var.f473225e = str2;
        z44Var.f473227g = z17;
        z44Var.f473228h = i17;
        z44Var.f473229i = u44Var;
        this.f534109e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f534108d = u0Var;
        return mo9409x10f9447a(sVar, this.f534109e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 972;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f534108d.mo815x76e0bfae(i18, i19, str, this);
    }
}
