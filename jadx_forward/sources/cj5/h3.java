package cj5;

/* loaded from: classes.dex */
public final class h3 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f123667d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f123668e;

    /* renamed from: f, reason: collision with root package name */
    public int f123669f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f123670g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f123667d = jz5.h.b(new cj5.e3(activity));
        this.f123668e = jz5.h.b(new cj5.g3(this));
        this.f123670g = "";
    }

    public static final int U6(cj5.h3 h3Var) {
        return ((java.lang.Number) ((jz5.n) h3Var.f123667d).mo141623x754a37bb()).intValue();
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f123668e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new cj5.f3(this));
    }
}
