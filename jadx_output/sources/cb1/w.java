package cb1;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f40324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb1.d f40325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.i f40327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(vi1.j2 j2Var, eb1.d dVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, cb1.i iVar) {
        super(0);
        this.f40324d = j2Var;
        this.f40325e = dVar;
        this.f40326f = v5Var;
        this.f40327g = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.i7 i7Var;
        vi1.j2 j2Var = this.f40324d;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f437360i);
            kotlin.jvm.internal.o.d(valueOf);
            j2Var.f437360i = valueOf.longValue() + 1;
        }
        cb1.i iVar = this.f40327g;
        java.lang.String str = (iVar == null || (i7Var = iVar.f40253b) == null) ? null : i7Var.f376774e;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40326f;
        this.f40325e.h(v5Var, str, (com.tencent.mm.plugin.appbrand.jsapi.r1) v5Var.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).r(v5Var);
        return jz5.f0.f302826a;
    }
}
