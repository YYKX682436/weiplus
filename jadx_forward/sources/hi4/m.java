package hi4;

/* loaded from: classes11.dex */
public final class m extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: f, reason: collision with root package name */
    public static final hi4.k f363088f = new hi4.k(null);

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f363089g = "";

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f363090d;

    /* renamed from: e, reason: collision with root package name */
    public int f363091e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f363090d = jz5.h.b(new hi4.l(this));
    }

    public static void O6(hi4.m mVar, int i17, int i18, int i19, int i27, int i28, java.lang.Object obj) {
        int j17 = (i28 & 2) != 0 ? ai4.m0.f86706a.j() : i18;
        int D0 = (i28 & 4) != 0 ? ni4.x.f419309d.h().D0() : i19;
        int y07 = (i28 & 8) != 0 ? li4.b.y0(ni4.x.f419309d.k(), 0, 1, null) : i27;
        mVar.getClass();
        qj4.s.o(qj4.s.f445491a, i17, null, f363089g, 0, null, 0, j17, D0, y07, null, null, null, null, null, 15930, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        int j17 = ai4.m0.f86706a.j();
        ni4.x xVar = ni4.x.f419309d;
        int D0 = xVar.h().D0();
        int y07 = li4.b.y0(xVar.k(), 0, 1, null);
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(hi4.j.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        qj4.s.o(qj4.s.f445491a, 1L, "0", f363089g, ((java.lang.Number) ((jz5.n) this.f363090d).mo141623x754a37bb()).intValue(), null, ((java.lang.Number) ((jz5.n) ((hi4.j) a17).f363086f).mo141623x754a37bb()).intValue(), j17, D0, y07, null, null, null, null, null, 15888, null);
    }
}
