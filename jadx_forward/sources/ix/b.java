package ix;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showPopupWindow";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        boolean optBoolean = data.optBoolean("mask");
        try {
            i17 = android.graphics.Color.parseColor(data.optString("maskColor"));
        } catch (java.lang.IllegalArgumentException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiShowPopupWindow", data.optString("maskColor"));
            i17 = 0;
        }
        cx.w0 w0Var = (cx.w0) this.f399423a;
        if (w0Var != null) {
            ax.t tVar = w0Var.f306012x;
            tVar.getClass();
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10711xd183ac2f.Builder m45457x3136c9db = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10711xd183ac2f.m45457x3136c9db();
            m45457x3136c9db.m45493x764d366e(optBoolean);
            m45457x3136c9db.m45494x571ddd95(i17);
            tVar.n("showPopupWindow", m45457x3136c9db.mo20556x59bc66e().mo20648x5f01b1f6(), ax.s.f96491d);
        }
        s().mo146xb9724478(k());
    }
}
