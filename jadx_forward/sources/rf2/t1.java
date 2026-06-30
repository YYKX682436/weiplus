package rf2;

/* loaded from: classes10.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f476427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f02 f476430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476431h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476432i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476433m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(rf2.c2 c2Var, android.view.View view, android.widget.TextView textView, r45.f02 f02Var, android.widget.TextView textView2, android.view.View view2, java.lang.String str) {
        super(3);
        this.f476427d = c2Var;
        this.f476428e = view;
        this.f476429f = textView;
        this.f476430g = f02Var;
        this.f476431h = textView2;
        this.f476432i = view2;
        this.f476433m = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mm2.r4 data = (mm2.r4) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj3).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f476427d.b(data, this.f476428e, this.f476429f);
        if (data.f410909a != 1) {
            rf2.c2 c2Var = this.f476427d;
            java.lang.String str = this.f476430g.f455411d;
            if (str == null) {
                str = "";
            }
            android.widget.TextView voteBtn = this.f476431h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(voteBtn, "$voteBtn");
            android.view.View voteContainer = this.f476432i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(voteContainer, "$voteContainer");
            c2Var.d(str, voteBtn, voteContainer, this.f476433m, false);
        }
        return jz5.f0.f384359a;
    }
}
