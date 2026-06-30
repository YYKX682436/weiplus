package hq5;

/* loaded from: classes5.dex */
public final class a0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364747d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f364748e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f364749f;

    /* renamed from: g, reason: collision with root package name */
    public int f364750g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f364747d = "MicroMsg.WeDrop.WeDropPreviewUIC";
        this.f364748e = jz5.h.b(new hq5.x(this));
    }

    public static final boolean T6(hq5.a0 a0Var) {
        eq5.h hVar;
        j75.f Q6 = a0Var.Q6();
        return ((Q6 == null || (hVar = (eq5.h) Q6.mo140437x75286adb()) == null) ? 0 : hVar.f337452m) > 0;
    }

    public final em.h4 U6() {
        return (em.h4) ((jz5.n) this.f364748e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new hq5.y(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        em.h4 U6 = U6();
        if (U6 != null) {
            if (U6.f335937f == null) {
                U6.f335937f = (android.widget.FrameLayout) U6.f335932a.findViewById(com.p314xaae8f345.mm.R.id.cpv);
            }
            android.widget.FrameLayout frameLayout = U6.f335937f;
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new hq5.z(this));
            }
        }
    }
}
