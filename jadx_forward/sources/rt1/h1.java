package rt1;

/* loaded from: classes7.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f480950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480951e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(rt1.p1 p1Var, java.lang.String str) {
        super(0);
        this.f480950d = p1Var;
        this.f480951e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rt1.p1 p1Var = this.f480950d;
        p1Var.b().a(this.f480951e);
        rt1.b1 b1Var = p1Var.f481006b;
        if (b1Var != null) {
            b1Var.b(p1Var.b().f176156d);
        }
        return jz5.f0.f384359a;
    }
}
