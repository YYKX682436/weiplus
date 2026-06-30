package rf2;

/* loaded from: classes10.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.v0 f476436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476439g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476440h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476441i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476442m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(rf2.v0 v0Var, r45.f02 f02Var, android.view.View view, android.widget.TextView textView, android.view.View view2, android.widget.TextView textView2, android.view.View view3) {
        super(3);
        this.f476436d = v0Var;
        this.f476437e = f02Var;
        this.f476438f = view;
        this.f476439g = textView;
        this.f476440h = view2;
        this.f476441i = textView2;
        this.f476442m = view3;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mm2.r4 data = (mm2.r4) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View view = this.f476438f;
        android.widget.TextView textView = this.f476439g;
        rf2.v0 v0Var = this.f476436d;
        r45.f02 f02Var = this.f476437e;
        v0Var.h(f02Var, data, view, textView);
        if (data.f410909a != 1) {
            v0Var.g(this.f476440h, this.f476441i, this.f476442m, f02Var);
        }
        return jz5.f0.f384359a;
    }
}
