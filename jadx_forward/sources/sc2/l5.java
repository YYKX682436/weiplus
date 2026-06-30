package sc2;

/* loaded from: classes2.dex */
public final class l5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f487581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f487582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(sc2.d6 d6Var, r45.h32 h32Var, xc2.p0 p0Var) {
        super(0);
        this.f487581d = d6Var;
        this.f487582e = h32Var;
        this.f487583f = p0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sc2.d6 d6Var = this.f487581d;
        android.view.View view = d6Var.f84676d;
        if (view != null) {
            java.lang.Object obj = sc2.d6.A;
            d6Var.U(this.f487582e, this.f487583f, view);
        }
        return jz5.f0.f384359a;
    }
}
