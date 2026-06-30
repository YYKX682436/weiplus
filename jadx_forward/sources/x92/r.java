package x92;

/* loaded from: classes2.dex */
public class r extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements x92.q {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f534252d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f534253e;

    /* renamed from: f, reason: collision with root package name */
    public x92.f f534254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public void O6(int i17, java.lang.String str) {
    }

    public void P6(int i17, java.lang.String str) {
    }

    public void Q6() {
        x92.f fVar = this.f534254f;
        if (fVar != null) {
            fVar.b(m158354x19263085());
        }
    }

    public void R6() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564124io);
        this.f534253e = frameLayout;
        if ((frameLayout != null ? frameLayout.getChildCount() : -1) == 0 && (m158354x19263085() instanceof t92.b)) {
            android.view.LayoutInflater.Factory m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.activity.base.config.IHeaderConfig");
            int N2 = ((t92.b) m158354x19263085).N2();
            if (N2 > 0) {
                android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(m158354x19263085()).inflate(N2, (android.view.ViewGroup) null);
                android.widget.FrameLayout frameLayout2 = this.f534253e;
                if (frameLayout2 != null) {
                    frameLayout2.addView(inflate);
                }
            }
        }
    }

    public void S6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        T6(fVar);
        U6();
    }

    public void T6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        this.f534252d = fVar;
        x92.f fVar2 = this.f534254f;
        if (fVar2 == null) {
            return;
        }
        fVar2.f534224a = fVar;
    }

    public void U6() {
        z5();
    }

    public void b2() {
    }

    @Override // x92.q
    public java.lang.String d2() {
        java.lang.String a17;
        x92.f fVar = this.f534254f;
        return (fVar == null || (a17 = fVar.a()) == null) ? "" : a17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.LayoutInflater.Factory m158354x19263085 = m158354x19263085();
        t92.a aVar = m158354x19263085 instanceof t92.a ? (t92.a) m158354x19263085 : null;
        this.f534254f = aVar != null ? aVar.o6() : null;
        Q6();
        R6();
    }

    /* renamed from: setNormalStyle */
    public void mo55425x60022348() {
    }
}
