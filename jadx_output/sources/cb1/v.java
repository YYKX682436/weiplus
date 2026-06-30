package cb1;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f40315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f40318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km5.b f40319h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(vi1.j2 j2Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, boolean z17, km5.b bVar) {
        super(1);
        this.f40315d = j2Var;
        this.f40316e = v5Var;
        this.f40317f = str;
        this.f40318g = z17;
        this.f40319h = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        km5.b bVar = this.f40319h;
        vi1.j2 j2Var = this.f40315d;
        if (intValue == -1) {
            if (j2Var != null) {
                j2Var.f437353b = 1L;
            }
            if (j2Var != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f437354c);
                kotlin.jvm.internal.o.d(valueOf);
                j2Var.f437354c = valueOf.longValue() + 1;
            }
            java.lang.String appId = this.f40316e.getAppId();
            kotlin.jvm.internal.o.f(appId, "getAppId(...)");
            new vi1.m(appId, this.f40317f, this.f40318g).a(new cb1.u(bVar));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "bind wechat phone number fail");
            if (j2Var != null) {
                j2Var.f437353b = 0L;
            }
            bVar.a("user cancel");
        }
        return jz5.f0.f302826a;
    }
}
