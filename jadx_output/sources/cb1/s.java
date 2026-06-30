package cb1;

/* loaded from: classes7.dex */
public final class s implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f40302c;

    public s(com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, cb1.j0 j0Var) {
        this.f40300a = v5Var;
        this.f40301b = i17;
        this.f40302c = j0Var;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        vi1.l2 l2Var = vi1.l2.f437401a;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40300a;
        java.lang.String appId = v5Var.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        vi1.j2 a17 = l2Var.a(appId);
        if (a17 != null) {
            vi1.l1.f437399a.a().ud(a17);
        }
        java.lang.String appId2 = v5Var.getAppId();
        if (appId2 != null) {
            l2Var.d(appId2);
        }
        boolean z17 = obj instanceof java.lang.String;
        cb1.j0 j0Var = this.f40302c;
        int i17 = this.f40301b;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "getphonenumber fail:" + obj);
            v5Var.a(i17, j0Var.o("fail:" + obj));
            return;
        }
        if (!(obj instanceof java.lang.Exception)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "getphonenumber fail");
            v5Var.a(i17, j0Var.o("fail"));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "getphonenumber fail:{" + obj + ".message}");
        v5Var.a(i17, j0Var.o("fail:{" + obj + ".message}"));
    }
}
