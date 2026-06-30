package cs3;

/* loaded from: classes10.dex */
public final class f implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final vr3.e0 f303639d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f303640e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f303641f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e f303642g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f303643h;

    public f(vr3.e0 presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f303639d = presenter;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        ((vr3.z) this.f303639d).d();
        h().t(this);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        cs3.f fVar;
        vr3.e0 e0Var = this.f303639d;
        if (!z17 || !z18) {
            if (z17 || !z18) {
                return;
            }
            ((vr3.z) e0Var).d();
            return;
        }
        vr3.z zVar = (vr3.z) e0Var;
        zVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "onAttach");
        zVar.f521201n = this;
        h().l(true);
        g().m82555x4905e9fa().mo7966xf161ffec(false);
        if (!zVar.f521203p && (fVar = zVar.f521201n) != null) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(fVar.g(), null, 1, null);
        }
        zVar.f521205r = true;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 g() {
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f303641f;
        if (c22801x87cbdc00 != null) {
            return c22801x87cbdc00;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e h() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1968xd1075a44.C16922xfbfc713e c16922xfbfc713e = this.f303642g;
        if (c16922xfbfc713e != null) {
            return c16922xfbfc713e;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("serviceInfoDrawer");
        throw null;
    }
}
