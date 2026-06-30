package ms4;

/* loaded from: classes7.dex */
public class c extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f412536d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f412537e = null;

    public c() {
        this.f412536d = null;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.zx6();
        lVar.f152198b = new r45.ay6();
        lVar.f152200d = 5249;
        lVar.f152199c = "/cgi-bin/micromsg-bin/verifysignaturetest";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        this.f412536d = lVar.a();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f412537e = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = this.f412536d;
        r45.zx6 zx6Var = (r45.zx6) oVar.f152243a.f152217a;
        com.p314xaae8f345.mm.p971x6de15a2e.j jVar = com.p314xaae8f345.mm.p971x6de15a2e.j.f153559e;
        java.lang.String c17 = jVar.c("TestSignData");
        byte[] bytes = c17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        if (android.text.TextUtils.isEmpty(c17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMVerifyCgiSignatureTest", "sign failed");
            return -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMVerifyCgiSignatureTest", "after sign data length " + c17.length() + " byte length " + bytes.length);
        zx6Var.f473995e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        zx6Var.f473994d = new com.p314xaae8f345.mm.p2495xc50a8b8b.g("TestSignData".getBytes());
        jVar.getClass();
        try {
            com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46311xc5651f52(jVar.f153562c.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), "TestSignData".getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), c17.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("CgiSignerPublicAndPrivateKey", "verify failed " + e17.getLocalizedMessage());
        }
        return mo9409x10f9447a(sVar, oVar, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5249;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        r45.ie ieVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMVerifyCgiSignatureTest", "receive response " + i18 + " code " + i19 + " message " + str + " code " + v0Var.mo13821x7f35c2d1().mo150578x7f2fddf8());
        r45.ay6 ay6Var = (r45.ay6) this.f412536d.f152244b.f152233a;
        v0Var.mo13821x7f35c2d1().m150576x2b5bc573();
        if (ay6Var == null || (ieVar = ay6Var.f76492x92037252) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response or BaseResponse is null ");
            sb6.append(ay6Var == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMVerifyCgiSignatureTest", sb6.toString());
        } else {
            int i27 = ieVar.f458492d;
        }
        this.f412537e.mo815x76e0bfae(i18, i19, str, this);
    }
}
