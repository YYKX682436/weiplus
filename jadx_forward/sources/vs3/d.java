package vs3;

/* loaded from: classes9.dex */
public class d extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f521413d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f521414e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f521415f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f521416g;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f521415f = str2;
        this.f521416g = str3;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.q33();
        lVar.f152198b = new r45.r33();
        lVar.f152199c = "/cgi-bin/mmpay-bin/flowdatarechargepreinquery";
        lVar.f152200d = 1555;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f521414e = a17;
        r45.q33 q33Var = (r45.q33) a17.f152243a.f152217a;
        q33Var.f465151d = str;
        q33Var.f465152e = str2;
        q33Var.f465153f = str3;
        q33Var.f465154g = str4;
        q33Var.f465155h = str5;
        q33Var.f465156i = bt4.f.b().c(str);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f521413d = u0Var;
        return mo9409x10f9447a(sVar, this.f521414e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1555;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        this.f521413d.mo815x76e0bfae(i18, i19, str, this);
    }
}
