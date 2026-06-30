package vd0;

/* loaded from: classes11.dex */
public final class l1 implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4 f516991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd0.d2 f516992b;

    public l1(com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4 c10683xdec4b5b4, wd0.d2 d2Var) {
        this.f516991a = c10683xdec4b5b4;
        this.f516992b = d2Var;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c result = (eu5.c) eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] prepareAppSecureKey onResult errCode: " + result.f557138a);
        int i17 = result.f557138a;
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4 c10683xdec4b5b4 = this.f516991a;
        c10683xdec4b5b4.f149339d = i17;
        if (i17 != 0) {
            c10683xdec4b5b4.f149340e = "";
            c10683xdec4b5b4.f149341f = "";
            c10683xdec4b5b4.f149342g = "";
        } else {
            zt5.r rVar = (zt5.r) result.f338360c;
            java.lang.String mo15082x48bce8a4 = new cl0.g(rVar.f557150e).mo15082x48bce8a4("certs");
            if (mo15082x48bce8a4 == null) {
                mo15082x48bce8a4 = "";
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo15082x48bce8a4, "")) {
                java.lang.String str = rVar.f557150e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getRawJson(...)");
                c10683xdec4b5b4.f149340e = str;
                java.lang.String str2 = rVar.f557152g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getSignature(...)");
                c10683xdec4b5b4.f149341f = str2;
                c10683xdec4b5b4.f149342g = "";
            } else {
                c10683xdec4b5b4.f149340e = "";
                c10683xdec4b5b4.f149341f = "";
                java.lang.String str3 = rVar.f557150e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getRawJson(...)");
                c10683xdec4b5b4.f149342g = str3;
            }
        }
        vd0.m1 m1Var = (vd0.m1) this.f516992b;
        m1Var.getClass();
        ((p3325xe03a0797.p3326xc267989b.r) m1Var.f516999a).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c10683xdec4b5b4));
    }
}
