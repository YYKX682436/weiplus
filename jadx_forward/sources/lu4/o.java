package lu4;

/* loaded from: classes7.dex */
public final class o implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu4.q f402979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f402980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402981f;

    public o(lu4.q qVar, int i17, java.lang.String str) {
        this.f402979d = qVar;
        this.f402980e = i17;
        this.f402981f = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o rr6, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        lu4.q qVar = this.f402979d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f402964c, "do cgi callback cmdId=" + this.f402980e);
        com.p314xaae8f345.mm.p944x882e457a.n nVar = rr6.f152244b;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(nVar.f152233a.m75962x8b6d8abc())) {
            byte[] encode = android.util.Base64.encode(nVar.f152233a.m75962x8b6d8abc(), 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
            java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
            java.lang.String str2 = new java.lang.String(encode, UTF_8);
            lu4.c.u((lu4.c) qVar.f402963b, this.f402981f, "'" + str2 + '\'', null, 4, null);
            return 0;
        }
        java.lang.String str3 = this.f402981f;
        qVar.getClass();
        r45.bk bkVar = new r45.bk();
        r45.ie ieVar = new r45.ie();
        bkVar.f76492x92037252 = ieVar;
        r45.du5 du5Var = new r45.du5();
        du5Var.c("fail response data is empty");
        ieVar.f458493e = du5Var;
        bkVar.f76492x92037252.f458492d = -1;
        byte[] encode2 = android.util.Base64.encode(bkVar.mo14344x5f01b1f6(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode2, "encode(...)");
        java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_82, "UTF_8");
        java.lang.String str4 = new java.lang.String(encode2, UTF_82);
        lu4.c.u((lu4.c) qVar.f402963b, str3, "'" + str4 + '\'', null, 4, null);
        return 0;
    }
}
