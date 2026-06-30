package gh1;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "createMagicBrushFrameSetRoot";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!data.has(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714)) {
            s().mo146xb9724478(i(new lc3.z(1, "fail")));
            return;
        }
        java.lang.String optString = data.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, ya.b.f77479x42930b2);
        java.lang.String optString2 = data.optString("query", "");
        boolean optBoolean = data.optBoolean("useClientClick", false);
        lc3.e eVar = this.f399423a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MagicSclMBFrameBiz");
        fh1.x0 x0Var = (fh1.x0) eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var.A, "createFrameSetRoot: " + x0Var.B);
        if (x0Var.B == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            x0Var.B = x0Var.H0(x0Var, context, "MagicWeAppMagicBrushFrame", optString, optString2, optBoolean);
        }
        s().mo146xb9724478(k());
    }
}
