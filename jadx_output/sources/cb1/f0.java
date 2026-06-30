package cb1;

/* loaded from: classes7.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f40236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb1.d f40238f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(vi1.j2 j2Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, eb1.d dVar) {
        super(0);
        this.f40236d = j2Var;
        this.f40237e = v5Var;
        this.f40238f = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String appId;
        vi1.j2 j2Var = this.f40236d;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f437362k);
            kotlin.jvm.internal.o.d(valueOf);
            j2Var.f437362k = valueOf.longValue() + 1;
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40237e;
        java.lang.String appId2 = v5Var.getAppId();
        if (appId2 != null) {
            vi1.l2.f437401a.c(appId2);
        }
        android.content.Context f147807d = v5Var.getF147807d();
        if (f147807d != null && (appId = v5Var.getAppId()) != null) {
            vi1.g0 a17 = vi1.l1.f437399a.a();
            java.lang.String Y1 = v5Var.Y1();
            if (Y1 == null) {
                Y1 = "";
            }
            a17.oc(f147807d, appId, Y1, new cb1.e0(this.f40238f, v5Var));
        }
        return jz5.f0.f302826a;
    }
}
