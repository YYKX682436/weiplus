package ed3;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.oe.f34575x24728b;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(ya.b.f77487x44fa364);
        java.lang.String optString2 = data.optString("content");
        java.lang.String str = "[" + e().f425864a + ']' + optString2;
        boolean optBoolean = data.optBoolean("enableVConsole", false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !r26.i0.p("verbose", optString, true) && !r26.i0.p("debug", optString, true)) {
            if (r26.i0.p("info", optString, true)) {
                if (str.length() > 500) {
                    java.lang.String substring = str.substring(0, 500);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiSystemLog", substring);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiSystemLog", str);
                }
            } else if (r26.i0.p("warn", optString, true)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MBJsApiSystemLog", str);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiSystemLog", str);
            }
        }
        if (optBoolean) {
            lc3.e eVar = this.f399423a;
            sc3.k1 k1Var = eVar instanceof sc3.k1 ? (sc3.k1) eVar : null;
            if (k1Var != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                k1Var.H0().Ke(r26.p0.E0(optString2, 131072));
            }
        }
        s().mo146xb9724478(k());
    }
}
