package go0;

/* loaded from: classes14.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f355335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ go0.q1 f355336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(java.lang.Object obj, go0.q1 q1Var) {
        super(0);
        this.f355335d = obj;
        this.f355336e = q1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj = this.f355335d;
        if (obj != null) {
            go0.q1 q1Var = this.f355336e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, q1Var.f355359m)) {
                q1Var.f355359m = obj;
                q1Var.f355360n = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
