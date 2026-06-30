package sm4;

/* loaded from: classes.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f491455d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f491456e;

    /* renamed from: f, reason: collision with root package name */
    public final long f491457f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f491458g;

    public a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2582;
        lVar.f152199c = "/cgi-bin/mmsearch-bin/searchwebcomm";
        lVar.f152197a = new r45.d97();
        lVar.f152198b = new r45.e97();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f491456e = a17;
        r45.d97 d97Var = (r45.d97) a17.f152243a.f152217a;
        d97Var.f453792d = str2;
        d97Var.f453793e = str;
        this.f491458g = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f491455d = u0Var;
        return mo9409x10f9447a(sVar, this.f491456e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 2582;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.NetSceneSearchWebComm", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f491457f));
        this.f491455d.mo815x76e0bfae(i18, i19, str, this);
    }
}
