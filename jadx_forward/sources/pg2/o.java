package pg2;

/* loaded from: classes3.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.a0 f435704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f435706f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ug5.v f435707g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(mn0.a0 a0Var, android.view.View view, android.app.Activity activity, ug5.v vVar) {
        super(0);
        this.f435704d = a0Var;
        this.f435705e = view;
        this.f435706f = activity;
        this.f435707g = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f435704d.b();
        android.view.View view = this.f435705e;
        view.postDelayed(new pg2.n(view, this.f435706f, this.f435707g), 200L);
        return jz5.f0.f384359a;
    }
}
