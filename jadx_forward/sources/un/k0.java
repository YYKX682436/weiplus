package un;

/* loaded from: classes.dex */
public final class k0 extends zm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f510829d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f510830e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f510831f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f510832g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.a3 f510833h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f510834i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f510835m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f510836n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f510829d = jz5.h.b(new un.x(this));
        this.f510830e = jz5.h.b(new un.j0(this));
        this.f510831f = jz5.h.b(new un.i0(activity));
        this.f510832g = jz5.h.b(new un.a0(activity));
        this.f510834i = jz5.h.b(new un.z(activity, this));
        this.f510835m = jz5.h.b(new un.h0(activity, this));
        this.f510836n = jz5.h.b(new un.y(activity, this));
    }

    public static final java.lang.String U6(un.k0 k0Var) {
        return (java.lang.String) ((jz5.n) k0Var.f510829d).mo141623x754a37bb();
    }

    public static final em.l2 V6(un.k0 k0Var) {
        return (em.l2) ((jz5.n) k0Var.f510830e).mo141623x754a37bb();
    }

    @Override // zm3.a
    public ym3.f T6() {
        return ((ym3.n) ((pi5.o) ((jz5.n) this.f510835m).mo141623x754a37bb()).b((pi5.i) ((jz5.n) this.f510834i).mo141623x754a37bb())).b((pi5.d) ((jz5.n) this.f510836n).mo141623x754a37bb());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        ul5.k m78511x9f88d943;
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null && (mo2533x106ab264 = P6.mo2533x106ab264()) != null) {
            mo2533x106ab264.o();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null && (m78511x9f88d943 = P62.m78511x9f88d943()) != null) {
            m78511x9f88d943.mo82163x4e0f6657(false);
        }
        S6(new un.b0(this));
        R6(new un.g0(this));
    }
}
