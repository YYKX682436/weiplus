package fx;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "getFrameSetOffsetInfo";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            s().mo146xb9724478(h(1, "empty frameSetName"));
        }
        cx.w0 w0Var = (cx.w0) this.f399423a;
        if (w0Var != null) {
            fx.a aVar = new fx.a(this);
            ax.t tVar = w0Var.f306012x;
            tVar.getClass();
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.d0 h17 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.e0.h();
            h17.g(optString);
            tVar.n("getFrameSetOffsetInfo", h17.mo20556x59bc66e().mo20648x5f01b1f6(), new ax.p(aVar));
        }
    }
}
