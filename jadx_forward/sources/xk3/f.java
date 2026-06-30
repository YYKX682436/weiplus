package xk3;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f536557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f536558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f536559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f536560g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f536561h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.View view, in5.s0 s0Var) {
        super(0);
        this.f536557d = c16601x7ed0e40c;
        this.f536558e = imageView;
        this.f536559f = imageView2;
        this.f536560g = view;
        this.f536561h = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f536557d;
        c16601x7ed0e40c.v0().set(7, java.lang.Boolean.TRUE);
        android.widget.ImageView imageView = this.f536558e;
        imageView.setVisibility(0);
        this.f536559f.setVisibility(8);
        this.f536560g.setBackgroundColor(this.f536561h.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560976zf));
        imageView.setImageResource(wk3.a.f528490a.b(c16601x7ed0e40c.f66793x2262335f));
        return jz5.f0.f384359a;
    }
}
