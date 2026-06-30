package cb1;

/* loaded from: classes7.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f40219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb1.d f40221f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(vi1.j2 j2Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, eb1.d dVar) {
        super(0);
        this.f40219d = j2Var;
        this.f40220e = v5Var;
        this.f40221f = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String appId;
        vi1.j2 j2Var = this.f40219d;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f437361j);
            kotlin.jvm.internal.o.d(valueOf);
            j2Var.f437361j = valueOf.longValue() + 1;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40220e;
        java.lang.String appId2 = v5Var.getAppId();
        if (appId2 != null) {
            vi1.l2.f437401a.c(appId2);
        }
        android.content.Context f147807d = v5Var.getF147807d();
        if (f147807d != null && (appId = v5Var.getAppId()) != null) {
            vi1.l1.f437399a.a().Ha(f147807d, appId, new cb1.b0(this.f40221f, v5Var));
        }
        return jz5.f0.f302826a;
    }
}
