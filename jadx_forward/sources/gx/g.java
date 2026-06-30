package gx;

/* loaded from: classes7.dex */
public final class g extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setScreenReaderInfo";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetName");
        java.lang.String optString2 = data.optString("semanticLabel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiSetScreenReaderInfo", "frameSetName: " + optString + ", semanticLabel: " + optString2);
        if (!(optString == null || optString.length() == 0)) {
            if (!(optString2 == null || optString2.length() == 0)) {
                cx.w0 w0Var = (cx.w0) this.f399423a;
                if (w0Var != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    gx.f fVar = new gx.f(this, optString);
                    com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.i mo20599xaaa148a0 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.j.f149511h.mo20599xaaa148a0();
                    mo20599xaaa148a0.f149508d = 1 | mo20599xaaa148a0.f149508d;
                    mo20599xaaa148a0.f149509e = optString;
                    mo20599xaaa148a0.m20881x7bb163d5();
                    mo20599xaaa148a0.f149508d |= 2;
                    mo20599xaaa148a0.f149510f = optString2;
                    mo20599xaaa148a0.m20881x7bb163d5();
                    com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.j mo20557x85702333 = mo20599xaaa148a0.mo20557x85702333();
                    if (!mo20557x85702333.mo20562xf582434a()) {
                        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
                    }
                    w0Var.f306012x.n("setScreenReaderInfo", mo20557x85702333.mo20648x5f01b1f6(), new cx.u0(fVar));
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    s().mo146xb9724478(j(lc3.x.f399469c, "context null"));
                    return;
                }
                return;
            }
        }
        s().mo146xb9724478(j(lc3.x.f399470d, "frameSetName or semanticLabel is empty"));
    }
}
