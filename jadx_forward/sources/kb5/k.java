package kb5;

/* loaded from: classes.dex */
public final class k extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f387788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f387788d = jz5.h.b(new kb5.g(this, activity));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (pi5.y) ((jz5.n) this.f387788d).mo141623x754a37bb();
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
            Q6.z3(m158354x19263085(), new kb5.i(stringExtra, this));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(m158354x19263085(), new kb5.j(this));
        }
    }
}
