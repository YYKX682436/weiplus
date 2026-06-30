package gx;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getFrameSetPosition";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetName");
        cx.w0 w0Var = (cx.w0) this.f399423a;
        if (w0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            gx.a aVar = new gx.a(optString, this);
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.d0 h17 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.e0.h();
            h17.g(optString);
            w0Var.f306012x.n("getFrameSetPosition", h17.mo20556x59bc66e().mo20648x5f01b1f6(), new cx.q0(aVar));
        }
    }
}
