package jw;

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
        hw.c0 c0Var = (hw.c0) this.f399423a;
        if (c0Var != null) {
            jw.a aVar = new jw.a(this);
            fw.v vVar = c0Var.f366895x;
            vVar.getClass();
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.d0 h17 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.e0.h();
            h17.g(optString);
            vVar.n("getFrameSetOffsetInfo", h17.mo20556x59bc66e().mo20648x5f01b1f6(), new fw.r(aVar));
        }
    }
}
