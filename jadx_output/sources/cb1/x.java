package cb1;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f40332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f40333e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(vi1.j2 j2Var, km5.b bVar) {
        super(0);
        this.f40332d = j2Var;
        this.f40333e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vi1.j2 j2Var = this.f40332d;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f437356e);
            kotlin.jvm.internal.o.d(valueOf);
            j2Var.f437356e = valueOf.longValue() + 1;
        }
        this.f40333e.a("user deny");
        return jz5.f0.f302826a;
    }
}
