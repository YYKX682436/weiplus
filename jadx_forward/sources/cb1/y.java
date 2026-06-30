package cb1;

/* loaded from: classes7.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f121867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f121868e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(vi1.j2 j2Var, km5.b bVar) {
        super(0);
        this.f121867d = j2Var;
        this.f121868e = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vi1.j2 j2Var = this.f121867d;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f518890f);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            j2Var.f518890f = valueOf.longValue() + 1;
        }
        this.f121868e.a("user cancel");
        return jz5.f0.f384359a;
    }
}
