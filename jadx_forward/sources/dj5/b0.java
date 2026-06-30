package dj5;

/* loaded from: classes.dex */
public final class b0 extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f314588d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f314589e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f314590f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f314591g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f314592h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f314593i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f314588d = jz5.h.b(new dj5.s(this));
        this.f314589e = jz5.h.b(new dj5.a0(this));
        this.f314590f = jz5.h.b(new dj5.z(activity));
        this.f314591g = jz5.h.b(new dj5.v(this, activity));
        this.f314592h = jz5.h.b(new dj5.t(this));
        this.f314593i = jz5.h.b(new dj5.u(this, activity));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return ((java.lang.Boolean) ((jz5.n) this.f314588d).mo141623x754a37bb()).booleanValue() ? (ym3.f) ((jz5.n) this.f314592h).mo141623x754a37bb() : (pi5.y) ((jz5.n) this.f314593i).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(m158354x19263085(), new dj5.w(this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(m158354x19263085(), new dj5.y(this, stringExtra));
        }
    }
}
