package sc2;

/* loaded from: classes2.dex */
public final class q5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f487704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f487706g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487707h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(android.view.View view, r45.h32 h32Var, java.lang.String str, sc2.d6 d6Var, xc2.p0 p0Var) {
        super(0);
        this.f487703d = view;
        this.f487704e = h32Var;
        this.f487705f = str;
        this.f487706g = d6Var;
        this.f487707h = p0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.h32 h32Var = this.f487704e;
        java.lang.String str = this.f487705f;
        sc2.d6 d6Var = this.f487706g;
        xc2.p0 p0Var = this.f487707h;
        android.content.Context context = this.f487703d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        sc2.d6.T(h32Var, str, d6Var, p0Var, context, 2, this.f487703d);
        return jz5.f0.f384359a;
    }
}
