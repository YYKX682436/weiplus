package go0;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.o0 f355290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(go0.f0 f0Var, p05.o0 o0Var) {
        super(0);
        this.f355289d = f0Var;
        this.f355290e = o0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.a aVar;
        rh0.d0 d0Var;
        go0.f1 f1Var = this.f355289d.f355300p;
        if (f1Var != null) {
            p05.o0 effect = this.f355290e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
            go0.t1 t1Var = f1Var.I;
            if (t1Var != null && (aVar = t1Var.f355389c) != null && (d0Var = aVar.f355263f) != null) {
                ((p05.i0) effect).b(d0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
