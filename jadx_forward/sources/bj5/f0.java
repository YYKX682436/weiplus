package bj5;

/* loaded from: classes.dex */
public final class f0 extends zm3.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f102715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f102715d = jz5.h.b(new bj5.e0(this));
    }

    public static final void U6(bj5.f0 f0Var, int i17) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = f0Var.P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new wi5.t(i17));
    }

    public final em.l2 V6() {
        return (em.l2) ((jz5.n) this.f102715d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new bj5.d0(this));
    }
}
