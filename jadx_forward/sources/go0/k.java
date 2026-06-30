package go0;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f355324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.y0 f355325e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(go0.f0 f0Var, p05.y0 y0Var) {
        super(0);
        this.f355324d = f0Var;
        this.f355325e = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        go0.f1 f1Var = this.f355324d.f355300p;
        if (f1Var != null) {
            p05.y0 effect = this.f355325e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
            if (f1Var.f355309y == null) {
                f1Var.f355309y = new go0.w1();
            }
            go0.w1 w1Var = f1Var.f355309y;
            if (w1Var != null) {
                w1Var.a(effect);
            }
        }
        return jz5.f0.f384359a;
    }
}
