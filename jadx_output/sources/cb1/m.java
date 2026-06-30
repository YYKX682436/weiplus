package cb1;

/* loaded from: classes7.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f40268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40270c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f40271d;

    public m(cb1.j0 j0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, boolean z17) {
        this.f40268a = j0Var;
        this.f40269b = v5Var;
        this.f40270c = str;
        this.f40271d = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String apiName = this.f40270c;
        kotlin.jvm.internal.o.f(apiName, "$apiName");
        vi1.l2 l2Var = vi1.l2.f437401a;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40269b;
        java.lang.String appId = v5Var.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        vi1.j2 a17 = l2Var.a(appId);
        this.f40268a.getClass();
        km5.b c17 = km5.u.c();
        if (a17 != null) {
            a17.f437354c++;
        }
        java.lang.String appId2 = v5Var.getAppId();
        kotlin.jvm.internal.o.f(appId2, "getAppId(...)");
        new vi1.m(appId2, apiName, this.f40271d).a(new cb1.j(c17, list));
        return null;
    }
}
