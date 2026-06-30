package x83;

/* loaded from: classes4.dex */
public class j extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f534106d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f534107e;

    public j(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.x44 x44Var = new r45.x44();
        r45.y44 y44Var = new r45.y44();
        lVar.f152197a = x44Var;
        lVar.f152198b = y44Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/kidswatchloginconfirmget";
        lVar.f152200d = 5218;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f534107e = lVar.a();
        x44Var.f471302d = str;
        x44Var.f471303e = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f534106d = u0Var;
        return mo9409x10f9447a(sVar, this.f534107e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5218;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f534106d.mo815x76e0bfae(i18, i19, str, this);
    }
}
