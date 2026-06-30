package bj5;

/* loaded from: classes.dex */
public final class y extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f21245d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f21246e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f21247f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f21248g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f21249h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f21250i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f21251m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f21252n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f21253o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f21254p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f21245d = "";
        this.f21246e = jz5.h.b(new bj5.x(this));
        this.f21247f = jz5.h.b(new bj5.w(this));
        this.f21248g = jz5.h.b(new bj5.v(activity));
        this.f21249h = jz5.h.b(new bj5.p(activity));
        this.f21250i = jz5.h.b(new bj5.u(this, activity));
        this.f21251m = new java.util.ArrayList();
        this.f21252n = jz5.h.b(new bj5.q(this, activity));
        this.f21253o = jz5.h.b(new bj5.o(this, activity));
        this.f21254p = jz5.h.b(new bj5.r(this));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (ym3.f) ((jz5.n) this.f21254p).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("msgQuoteName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f21245d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("chatroomName");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.util.List m17 = c01.v1.m(stringExtra2);
        java.lang.String r17 = c01.z1.r();
        if (!((java.util.LinkedList) m17).contains(this.f21245d) || kotlin.jvm.internal.o.b(this.f21245d, r17)) {
            this.f21245d = "";
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new bj5.t(this, stringExtra2));
        }
    }
}
