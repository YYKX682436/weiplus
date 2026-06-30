package ry4;

/* loaded from: classes3.dex */
public final class i0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.j0 f483170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.a f483171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f483172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f483173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f483174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f483175i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f483176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f483177n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f483178o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f483179p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f483180q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f483181r;

    public i0(ry4.j0 j0Var, ry4.a aVar, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        this.f483170d = j0Var;
        this.f483171e = aVar;
        this.f483172f = i17;
        this.f483173g = i18;
        this.f483174h = i19;
        this.f483175i = i27;
        this.f483176m = i28;
        this.f483177n = i29;
        this.f483178o = i37;
        this.f483179p = i38;
        this.f483180q = i39;
        this.f483181r = i47;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator va6) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(va6, "va");
        java.lang.Object animatedValue = va6.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        ry4.a aVar = this.f483171e;
        android.widget.CheckBox checkBox = aVar.f483101f;
        ry4.j0 j0Var = this.f483170d;
        int i17 = this.f483172f;
        int i18 = this.f483173g;
        ry4.j0.I(j0Var, checkBox, ry4.j0.J(j0Var, i17, i18, floatValue));
        ry4.j0.I(j0Var, aVar.f483102g, ry4.j0.J(j0Var, i17, i18, floatValue));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = aVar.f483103h;
        int J2 = ry4.j0.J(j0Var, i17, i18, floatValue);
        int J3 = ry4.j0.J(j0Var, this.f483174h, this.f483175i, floatValue);
        j0Var.getClass();
        boolean z18 = false;
        boolean z19 = true;
        if (c22699x3dcdb352 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                if (layoutParams2.width != J2) {
                    layoutParams2.width = J2;
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (layoutParams2.getMarginStart() != J3) {
                    layoutParams2.setMarginStart(J3);
                    z17 = true;
                }
                if (z17) {
                    c22699x3dcdb352.setLayoutParams(layoutParams2);
                }
            }
        }
        android.view.View view = aVar.f483105m;
        int J4 = ry4.j0.J(j0Var, this.f483176m, this.f483177n, floatValue);
        int J5 = ry4.j0.J(j0Var, this.f483178o, this.f483179p, floatValue);
        j0Var.getClass();
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                if (layoutParams4.getMarginStart() != J4) {
                    layoutParams4.setMarginStart(J4);
                    z18 = true;
                }
                if (layoutParams4.getMarginEnd() != J5) {
                    layoutParams4.setMarginEnd(J5);
                } else {
                    z19 = z18;
                }
                if (z19) {
                    view.setLayoutParams(layoutParams4);
                }
            }
        }
        android.view.View view2 = aVar.f483104i;
        int J6 = ry4.j0.J(j0Var, this.f483180q, this.f483181r, floatValue);
        j0Var.getClass();
        if (view2 == null || view2.getPaddingEnd() == J6) {
            return;
        }
        view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), J6, view2.getPaddingBottom());
    }
}
