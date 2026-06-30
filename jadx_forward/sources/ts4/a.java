package ts4;

/* loaded from: classes2.dex */
public class a extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f503246d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f503247e;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.c65();
        lVar.f152198b = new r45.d65();
        lVar.f152199c = "/cgi-bin/mmpay-bin/payibgcheckjsapisign";
        lVar.f152200d = 1767;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f503247e = a17;
        r45.c65 c65Var = (r45.c65) a17.f152243a.f152217a;
        c65Var.f452863d = str;
        c65Var.f452866g = str4;
        c65Var.f452864e = str2;
        c65Var.f452867h = str5;
        c65Var.f452868i = str6;
        c65Var.f452865f = str3;
        c65Var.f452869m = str7;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f503246d = u0Var;
        return mo9409x10f9447a(sVar, this.f503247e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1767;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneIbgCheckJsapi", "check jsapi: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.d65 d65Var = (r45.d65) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
        if (i19 == 0 && i18 == 0) {
            i19 = d65Var.f453713d;
            str = d65Var.f453714e;
        }
        this.f503246d.mo815x76e0bfae(i18, i19, str, this);
    }
}
