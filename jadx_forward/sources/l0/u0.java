package l0;

/* loaded from: classes14.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f396069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f396070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f396071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(int i17, s1.o1 o1Var, int i18) {
        super(1);
        this.f396069d = i17;
        this.f396070e = o1Var;
        this.f396071f = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        s1.o1 o1Var = this.f396070e;
        s1.n1.b(layout, this.f396070e, a06.d.b((this.f396069d - o1Var.f483583d) / 2.0f), a06.d.b((this.f396071f - o1Var.f483584e) / 2.0f), 0.0f, 4, null);
        return jz5.f0.f384359a;
    }
}
