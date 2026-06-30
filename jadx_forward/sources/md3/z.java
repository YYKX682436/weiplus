package md3;

/* loaded from: classes7.dex */
public final class z extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f407401f = true;

    @Override // lc3.c0
    public java.lang.String f() {
        return "preloadLiteApp";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("appId", "");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            s().mo146xb9724478(h(1, "preloadLiteApp fail, appId is null"));
            return;
        }
        java.lang.String optString2 = data.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, "");
        java.lang.String str = data.optBoolean("onlyPreLoadBaseLib", false) ? "updateBaseLibPath" : "preloadLiteApp";
        if (f407401f) {
            f407401f = false;
            ku5.u0 u0Var = ku5.t0.f394148d;
            md3.x xVar = new md3.x(this, optString, optString2, str);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(xVar, 500L, false);
            ku5.u0 u0Var2 = ku5.t0.f394148d;
            md3.y yVar = md3.y.f407400d;
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(yVar, 5000L, false);
        }
        s().mo146xb9724478(k());
    }
}
