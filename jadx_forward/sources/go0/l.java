package go0;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.u0 f355329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(go0.f0 f0Var, p05.u0 u0Var) {
        super(0);
        this.f355328d = f0Var;
        this.f355329e = u0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rh0.d0 d0Var;
        go0.f1 f1Var = this.f355328d.f355300p;
        if (f1Var != null) {
            p05.u0 effect = this.f355329e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
            go0.t1 t1Var = f1Var.I;
            if (t1Var != null) {
                t1Var.f355398l = effect;
                go0.a aVar = t1Var.f355389c;
                if (aVar != null && (d0Var = aVar.f355263f) != null) {
                    ((p05.f1) effect).b(d0Var);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
