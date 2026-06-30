package ea;

/* loaded from: classes15.dex */
public abstract class l {

    /* renamed from: b, reason: collision with root package name */
    public android.animation.Animator f332014b;

    /* renamed from: c, reason: collision with root package name */
    public w9.h f332015c;

    /* renamed from: d, reason: collision with root package name */
    public w9.h f332016d;

    /* renamed from: e, reason: collision with root package name */
    public w9.h f332017e;

    /* renamed from: f, reason: collision with root package name */
    public w9.h f332018f;

    /* renamed from: g, reason: collision with root package name */
    public float f332019g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f332020h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f332021i;

    /* renamed from: j, reason: collision with root package name */
    public fa.d f332022j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.drawable.Drawable f332023k;

    /* renamed from: l, reason: collision with root package name */
    public float f332024l;

    /* renamed from: m, reason: collision with root package name */
    public float f332025m;

    /* renamed from: n, reason: collision with root package name */
    public float f332026n;

    /* renamed from: o, reason: collision with root package name */
    public int f332027o;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f332029q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f332030r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281 f332031s;

    /* renamed from: t, reason: collision with root package name */
    public final ka.b f332032t;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnPreDrawListener f332037y;

    /* renamed from: z, reason: collision with root package name */
    public static final android.animation.TimeInterpolator f332012z = w9.a.f525569c;
    public static final int[] A = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] B = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] C = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] D = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_enabled};
    public static final int[] F = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public int f332013a = 0;

    /* renamed from: p, reason: collision with root package name */
    public float f332028p = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f332033u = new android.graphics.Rect();

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.RectF f332034v = new android.graphics.RectF();

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.RectF f332035w = new android.graphics.RectF();

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Matrix f332036x = new android.graphics.Matrix();

    public l(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281 c2711x10f79281, ka.b bVar) {
        this.f332031s = c2711x10f79281;
        this.f332032t = bVar;
        fa.a0 a0Var = new fa.a0();
        a0Var.a(A, d(new ea.h(this)));
        a0Var.a(B, d(new ea.g(this)));
        a0Var.a(C, d(new ea.g(this)));
        a0Var.a(D, d(new ea.g(this)));
        a0Var.a(E, d(new ea.j(this)));
        a0Var.a(F, d(new ea.f(this)));
        this.f332019g = c2711x10f79281.getRotation();
    }

    public final void a(float f17, android.graphics.Matrix matrix) {
        matrix.reset();
        if (this.f332031s.getDrawable() == null || this.f332027o == 0) {
            return;
        }
        android.graphics.RectF rectF = this.f332034v;
        android.graphics.RectF rectF2 = this.f332035w;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i17 = this.f332027o;
        rectF2.set(0.0f, 0.0f, i17, i17);
        matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.CENTER);
        int i18 = this.f332027o;
        matrix.postScale(f17, f17, i18 / 2.0f, i18 / 2.0f);
    }

    public final android.animation.AnimatorSet b(w9.h hVar, float f17, float f18, float f19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Property property = android.view.View.ALPHA;
        float[] fArr = {f17};
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281 c2711x10f79281 = this.f332031s;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c2711x10f79281, (android.util.Property<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281, java.lang.Float>) property, fArr);
        hVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c2711x10f79281, (android.util.Property<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281, java.lang.Float>) android.view.View.SCALE_X, f18);
        hVar.d("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c2711x10f79281, (android.util.Property<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p257x21ffc6bd.C2711x10f79281, java.lang.Float>) android.view.View.SCALE_Y, f18);
        hVar.d("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        android.graphics.Matrix matrix = this.f332036x;
        a(f19, matrix);
        android.animation.ObjectAnimator ofObject = android.animation.ObjectAnimator.ofObject(c2711x10f79281, new w9.f(), new w9.g(), new android.graphics.Matrix(matrix));
        hVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        w9.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public fa.d c(int i17, android.content.res.ColorStateList colorStateList) {
        android.content.Context context = this.f332031s.getContext();
        fa.d h17 = h();
        int m9702x7444d5ad = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560412jp);
        int m9702x7444d5ad2 = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560411jo);
        int m9702x7444d5ad3 = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560409jm);
        int m9702x7444d5ad4 = b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560410jn);
        h17.f342118f = m9702x7444d5ad;
        h17.f342119g = m9702x7444d5ad2;
        h17.f342120h = m9702x7444d5ad3;
        h17.f342121i = m9702x7444d5ad4;
        float f17 = i17;
        if (h17.f342117e != f17) {
            h17.f342117e = f17;
            h17.f342113a.setStrokeWidth(f17 * 1.3333f);
            h17.f342124l = true;
            h17.invalidateSelf();
        }
        if (colorStateList != null) {
            h17.f342123k = colorStateList.getColorForState(h17.getState(), h17.f342123k);
        }
        h17.f342122j = colorStateList;
        h17.f342124l = true;
        h17.invalidateSelf();
        return h17;
    }

    public final android.animation.ValueAnimator d(ea.k kVar) {
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setInterpolator(f332012z);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(kVar);
        valueAnimator.addUpdateListener(kVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public abstract float e();

    public abstract void f(android.graphics.Rect rect);

    public abstract void g();

    public abstract fa.d h();

    public abstract void i();

    public abstract void j(int[] iArr);

    public abstract void k(float f17, float f18, float f19);

    public abstract void l(android.graphics.Rect rect);

    public abstract void m(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.content.res.ColorStateList colorStateList2, int i17);

    public void n(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.f332021i;
        if (drawable != null) {
            f3.b.h(drawable, ja.a.a(colorStateList));
        }
    }

    public final void o() {
        android.graphics.Rect rect = this.f332033u;
        f(rect);
        l(rect);
        int i17 = rect.left;
        int i18 = rect.top;
        int i19 = rect.right;
        int i27 = rect.bottom;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p256x62a1d3ee.C2702x4197484e c2702x4197484e = ((ea.b) this.f332032t).f331998a;
        c2702x4197484e.f126034r.set(i17, i18, i19, i27);
        int i28 = c2702x4197484e.f126031o;
        c2702x4197484e.setPadding(i17 + i28, i18 + i28, i19 + i28, i27 + i28);
    }
}
