package k23;

/* loaded from: classes12.dex */
public final class o1 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f385170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f385172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f385173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f385174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f385175i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f385176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f385177n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f385178o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f385179p;

    public o1(android.view.View view, k23.j2 j2Var, android.view.ViewGroup viewGroup, android.graphics.Bitmap bitmap, float f17, float f18, android.graphics.Bitmap bitmap2, float f19, float f27, long j17) {
        this.f385170d = view;
        this.f385171e = j2Var;
        this.f385172f = viewGroup;
        this.f385173g = bitmap;
        this.f385174h = f17;
        this.f385175i = f18;
        this.f385176m = bitmap2;
        this.f385177n = f19;
        this.f385178o = f27;
        this.f385179p = j17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141816x25712705;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141816x257127052;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141816x257127053;
        android.graphics.Bitmap r17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141816x257127054;
        android.animation.ValueAnimator valueAnimator;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141816x257127055;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141816x257127056;
        this.f385170d.getViewTreeObserver().removeOnPreDrawListener(this);
        k23.j2 j2Var = this.f385171e;
        m141816x25712705 = j2Var.m141816x25712705();
        android.view.ViewGroup viewGroup = this.f385172f;
        jz5.l k17 = j2Var.k(m141816x25712705, viewGroup);
        float floatValue = ((java.lang.Number) k17.f384366d).floatValue();
        float floatValue2 = ((java.lang.Number) k17.f384367e).floatValue();
        jz5.l k18 = j2Var.k(j2Var.m141804x8ee3d2b2(), viewGroup);
        float floatValue3 = ((java.lang.Number) k18.f384366d).floatValue();
        float floatValue4 = ((java.lang.Number) k18.f384367e).floatValue();
        k23.u2 u2Var = j2Var.m141802x29c21c7c().f385085i;
        k23.u2 u2Var2 = k23.u2.f385235e;
        int d17 = u2Var == u2Var2 ? i65.a.d(j2Var.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aby) : i65.a.d(j2Var.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.abw);
        if (j2Var.m141802x29c21c7c().f385085i == u2Var2) {
            m141816x257127055 = j2Var.m141816x25712705();
            int width = m141816x257127055.getWidth();
            m141816x257127056 = j2Var.m141816x25712705();
            r17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r(com.p314xaae8f345.mm.R.raw.f80610xddce36b9, width, m141816x257127056.getHeight(), d17, 0, 1.0f);
        } else {
            m141816x257127052 = j2Var.m141816x25712705();
            int width2 = m141816x257127052.getWidth();
            m141816x257127053 = j2Var.m141816x25712705();
            r17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.r(com.p314xaae8f345.mm.R.raw.f80612xe98418cc, width2, m141816x257127053.getHeight(), d17, 0, 1.0f);
        }
        android.graphics.Bitmap m17 = j2Var.m(j2Var.m141804x8ee3d2b2());
        m141816x257127054 = j2Var.m141816x25712705();
        m141816x257127054.setAlpha(0.0f);
        j2Var.m141804x8ee3d2b2().setAlpha(0.0f);
        android.graphics.Bitmap bitmap = this.f385173g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        float f17 = this.f385174h;
        float f18 = this.f385175i;
        android.widget.ImageView c17 = k23.j2.c(viewGroup, bitmap, f17, f18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        android.widget.ImageView c18 = k23.j2.c(viewGroup, r17, floatValue, floatValue2);
        c18.setAlpha(0.0f);
        android.widget.ImageView c19 = k23.j2.c(viewGroup, this.f385176m, this.f385177n, this.f385178o);
        android.widget.ImageView c27 = k23.j2.c(viewGroup, m17, floatValue3, floatValue4);
        c27.setAlpha(0.0f);
        float f19 = floatValue - f17;
        float f27 = floatValue2 - f18;
        float f28 = -f19;
        c18.setTranslationX(f28);
        float f29 = -f27;
        c18.setTranslationY(f29);
        int d18 = i65.a.d(j2Var.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77736x48893d57);
        int d19 = i65.a.d(j2Var.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
        if (j2Var.m141802x29c21c7c().f385085i == u2Var2) {
            valueAnimator = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(d19), java.lang.Integer.valueOf(d18));
            valueAnimator.addUpdateListener(new k23.p1(j2Var));
        } else {
            valueAnimator = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(kz5.c0.i(android.animation.ObjectAnimator.ofFloat(c17, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, f19), android.animation.ObjectAnimator.ofFloat(c17, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f, f27), android.animation.ObjectAnimator.ofFloat(c17, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f), android.animation.ObjectAnimator.ofFloat(c18, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.TRANSLATION_X, f28, 0.0f), android.animation.ObjectAnimator.ofFloat(c18, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.TRANSLATION_Y, f29, 0.0f), android.animation.ObjectAnimator.ofFloat(c18, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f), android.animation.ObjectAnimator.ofFloat(c19, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f), android.animation.ObjectAnimator.ofFloat(c27, (android.util.Property<android.widget.ImageView, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f)));
        if (valueAnimator != null) {
            arrayList.add(valueAnimator);
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        animatorSet.setDuration(this.f385179p);
        animatorSet.addListener(new k23.q1(this.f385172f, c17, c18, c19, c27, this.f385171e));
        animatorSet.start();
        return true;
    }
}
