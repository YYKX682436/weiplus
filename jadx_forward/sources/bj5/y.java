package bj5;

/* loaded from: classes.dex */
public final class y extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f102778d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f102779e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f102780f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f102781g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f102782h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f102783i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f102784m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f102785n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f102786o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f102787p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f102778d = "";
        this.f102779e = jz5.h.b(new bj5.x(this));
        this.f102780f = jz5.h.b(new bj5.w(this));
        this.f102781g = jz5.h.b(new bj5.v(activity));
        this.f102782h = jz5.h.b(new bj5.p(activity));
        this.f102783i = jz5.h.b(new bj5.u(this, activity));
        this.f102784m = new java.util.ArrayList();
        this.f102785n = jz5.h.b(new bj5.q(this, activity));
        this.f102786o = jz5.h.b(new bj5.o(this, activity));
        this.f102787p = jz5.h.b(new bj5.r(this));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (ym3.f) ((jz5.n) this.f102787p).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("msgQuoteName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f102778d = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("chatroomName");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.util.List m17 = c01.v1.m(stringExtra2);
        java.lang.String r17 = c01.z1.r();
        if (!((java.util.LinkedList) m17).contains(this.f102778d) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102778d, r17)) {
            this.f102778d = "";
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new bj5.t(this, stringExtra2));
        }
    }
}
