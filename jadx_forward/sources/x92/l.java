package x92;

/* loaded from: classes3.dex */
public class l extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f534236g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f534237h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f534238i;

    /* renamed from: m, reason: collision with root package name */
    public int f534239m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f534240n;

    /* renamed from: o, reason: collision with root package name */
    public wu5.c f534241o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f534242p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // x92.r
    public void O6(int i17, java.lang.String str) {
        wu5.c cVar = this.f534241o;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    @Override // x92.r
    public void Q6() {
        super.Q6();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type android.app.Activity");
        m158354x19263085.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f534239m = displayMetrics.widthPixels;
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        this.f534236g = (android.widget.ImageView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564117ih);
        this.f534237h = (android.widget.ImageView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564120ik);
        this.f534238i = (android.view.ViewGroup) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564119ij);
        V6();
        int i17 = (int) (this.f534239m * 1.3333334f);
        android.widget.ImageView imageView = this.f534237h;
        android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = i17;
        android.widget.ImageView imageView2 = this.f534237h;
        if (imageView2 == null) {
            return;
        }
        imageView2.setLayoutParams(layoutParams);
    }

    @Override // x92.r
    public void T6(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (this.f534240n) {
            return;
        }
        super.T6(fVar);
        if (a2()) {
            Z6(d2());
        } else {
            Y6(false);
        }
        this.f534240n = true;
    }

    public void V6() {
        android.widget.ImageView imageView = this.f534236g;
        if (imageView != null) {
            imageView.post(new x92.g(imageView, this));
        }
    }

    public void W6(boolean z17) {
        android.view.ViewGroup viewGroup;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicCoverUIC", "adjustView : ignoreCover " + z17);
        if (a2() && (viewGroup = this.f534238i) != null) {
            viewGroup.setVisibility(0);
        }
        if (!z17 && a2()) {
            Z6(d2());
        }
        this.f534242p = true;
    }

    public int X6(int i17) {
        return (int) (i17 * 1.3333334f);
    }

    public final void Y6(boolean z17) {
        if (this.f534242p) {
            W6(z17);
            return;
        }
        android.widget.FrameLayout frameLayout = this.f534253e;
        if (frameLayout != null) {
            frameLayout.post(new x92.i(this, z17));
        }
    }

    public final void Z6(java.lang.String str) {
        android.widget.ImageView imageView = this.f534236g;
        if (imageView != null) {
            mn2.j0 j0Var = new mn2.j0(str);
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c a17 = g1Var.e().a(j0Var);
            a17.g(g1Var.h(mn2.f1.f411499t));
            a17.f529406d = new x92.k(str, this, imageView);
            a17.c(imageView);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicCoverUIC", "forceCampaignVisible: ");
        wu5.c cVar = this.f534241o;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        x92.h hVar = new x92.h(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f534241o = t0Var.z(hVar, 2000L, false);
    }

    @Override // x92.r, x92.q
    public void b2() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().O0(true);
        android.view.ViewGroup viewGroup = this.f534238i;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.widget.ImageView imageView = this.f534237h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f534236g;
        if (imageView2 == null) {
            return;
        }
        imageView2.setVisibility(0);
    }

    @Override // x92.r, x92.q
    /* renamed from: setNormalStyle */
    public void mo55425x60022348() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().O0(com.p314xaae8f345.mm.ui.bk.C());
        android.view.ViewGroup viewGroup = this.f534238i;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
