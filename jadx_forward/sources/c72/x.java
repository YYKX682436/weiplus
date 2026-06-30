package c72;

/* loaded from: classes4.dex */
public class x extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f121132d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f121133e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f121134f;

    public x(java.lang.String str, long j17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f121134f = "";
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.uo0();
        lVar.f152198b = new r45.vo0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/usrmsg/facevideobindbioid";
        lVar.f152200d = 1197;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f121133e = a17;
        this.f121134f = str;
        r45.uo0 uo0Var = (r45.uo0) a17.f152243a.f152217a;
        uo0Var.f469056f = str2;
        uo0Var.f469054d = j17;
        uo0Var.f469057g = str4;
        uo0Var.f469055e = str3;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f121132d = u0Var;
        return mo9409x10f9447a(sVar, this.f121133e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1197;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f121132d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}
