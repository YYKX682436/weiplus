package qf2;

/* loaded from: classes.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f444070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(qf2.q3 q3Var, int i17) {
        super(0);
        this.f444070d = q3Var;
        this.f444071e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qf2.q3 q3Var = this.f444070d;
        lj2.o0 o0Var = q3Var.f444081m;
        if (o0Var != null) {
            o0Var.a(this.f444071e, 2);
        }
        lj2.o0 o0Var2 = q3Var.f444081m;
        if (o0Var2 != null) {
            o0Var2.b();
        }
        return jz5.f0.f384359a;
    }
}
