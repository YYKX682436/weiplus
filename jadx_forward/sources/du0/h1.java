package du0;

/* loaded from: classes5.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du0.p1 f324893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(du0.p1 p1Var) {
        super(0);
        this.f324893d = p1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        du0.p1 p1Var = this.f324893d;
        float f17 = 200;
        return new jz5.l(java.lang.Integer.valueOf(e06.p.f((int) (p1Var.a7() * f17), 0, 200)), java.lang.Integer.valueOf(e06.p.f((int) (p1Var.e7() * f17), 0, 200)));
    }
}
