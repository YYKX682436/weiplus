package su4;

/* loaded from: classes.dex */
public class s1 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f494621d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f494622e;

    /* renamed from: f, reason: collision with root package name */
    public final long f494623f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f494624g;

    /* renamed from: h, reason: collision with root package name */
    public final int f494625h;

    public s1(java.lang.String str, java.lang.String str2, int i17) {
        this.f494625h = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2975;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/searchwebquery";
        lVar.f152197a = new r45.sx5();
        lVar.f152198b = new r45.e97();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f494622e = a17;
        r45.sx5 sx5Var = (r45.sx5) a17.f152243a.f152217a;
        sx5Var.f467542d = str2;
        sx5Var.f467543e = str;
        r45.e64 i18 = su4.r2.i();
        sx5Var.f467545g = i18;
        this.f494624g = str;
        if (i18 == null) {
            r45.e64 e64Var = new r45.e64();
            sx5Var.f467545g = e64Var;
            e64Var.f454586n = !su4.r2.j() ? 1 : 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f494621d = u0Var;
        return mo9409x10f9447a(sVar, this.f494622e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2975;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.NetSceneSearchWebQuery", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f494623f));
        this.f494621d.mo815x76e0bfae(i18, i19, str, this);
    }
}
