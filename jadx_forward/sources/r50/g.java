package r50;

/* loaded from: classes.dex */
public final class g extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f474110d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f474111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f474110d = jz5.h.b(new r50.e(this));
        this.f474111e = jz5.h.b(new r50.f(activity));
    }

    public final em.b T6() {
        return (em.b) ((jz5.n) this.f474110d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new r50.d(this));
        }
    }
}
