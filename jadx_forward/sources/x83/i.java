package x83;

/* loaded from: classes2.dex */
public class i extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f534104d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f534105e;

    public i(java.lang.String str) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.v44 v44Var = new r45.v44();
        r45.w44 w44Var = new r45.w44();
        lVar.f152197a = v44Var;
        lVar.f152198b = w44Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmcancel";
        lVar.f152200d = 973;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        v44Var.f469411d = str;
        this.f534105e = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f534104d = u0Var;
        return mo9409x10f9447a(sVar, this.f534105e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 973;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f534104d.mo815x76e0bfae(i18, i19, str, this);
    }
}
