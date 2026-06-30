package g93;

/* loaded from: classes.dex */
public final class j extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f351314d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f351315e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f351316f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f351317g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f351318h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f351319i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f351320m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f351314d = com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(1, 2);
        this.f351315e = jz5.h.b(new g93.i(this));
        this.f351316f = jz5.h.b(new g93.a(this));
        this.f351317g = jz5.h.b(new g93.h(this));
        this.f351318h = jz5.h.b(new g93.c(this));
        this.f351319i = jz5.h.b(new g93.b(this));
        this.f351320m = jz5.h.b(new g93.d(activity, this));
    }

    @Override // zm3.a
    public ym3.f T6() {
        return (qi5.b0) ((jz5.n) this.f351320m).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i18 == -1 && intent != null && i17 == 1) {
            m158354x19263085().setResult(-1, intent);
            m158354x19263085().finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        S6(g93.e.f351309d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.z3(m158354x19263085(), new g93.f(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new g93.g(this));
    }
}
