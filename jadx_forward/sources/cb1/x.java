package cb1;

/* loaded from: classes7.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f121865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f121866e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(vi1.j2 j2Var, km5.b bVar) {
        super(0);
        this.f121865d = j2Var;
        this.f121866e = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vi1.j2 j2Var = this.f121865d;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f518889e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            j2Var.f518889e = valueOf.longValue() + 1;
        }
        this.f121866e.a("user deny");
        return jz5.f0.f384359a;
    }
}
