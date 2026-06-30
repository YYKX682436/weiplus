package cb1;

/* loaded from: classes7.dex */
public final class r implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f40298c;

    public r(com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, cb1.j0 j0Var) {
        this.f40296a = v5Var;
        this.f40297b = i17;
        this.f40298c = j0Var;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.j0 j0Var = (com.tencent.mm.plugin.appbrand.jsapi.j0) obj;
        vi1.l2 l2Var = vi1.l2.f437401a;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40296a;
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callResult: ");
        sb6.append(j0Var.f81320b);
        sb6.append(' ');
        java.util.Map map = j0Var.f81319a;
        sb6.append(map);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPhoneNumberNew", sb6.toString());
        v5Var.a(this.f40297b, this.f40298c.p(j0Var.f81320b, map));
    }
}
