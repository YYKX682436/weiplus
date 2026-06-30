package z9;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p250xade22732.C2692x47948b59 f552366a;

    /* renamed from: b, reason: collision with root package name */
    public int f552367b;

    /* renamed from: c, reason: collision with root package name */
    public int f552368c;

    /* renamed from: d, reason: collision with root package name */
    public int f552369d;

    /* renamed from: e, reason: collision with root package name */
    public int f552370e;

    /* renamed from: f, reason: collision with root package name */
    public int f552371f;

    /* renamed from: g, reason: collision with root package name */
    public int f552372g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f552373h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.res.ColorStateList f552374i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.res.ColorStateList f552375j;

    /* renamed from: k, reason: collision with root package name */
    public android.content.res.ColorStateList f552376k;

    /* renamed from: l, reason: collision with root package name */
    public final android.graphics.Paint f552377l = new android.graphics.Paint(1);

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f552378m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f552379n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f552380o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f552381p;

    public b(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p250xade22732.C2692x47948b59 c2692x47948b59) {
        new android.graphics.Rect();
        new android.graphics.RectF();
        this.f552381p = false;
        this.f552366a = c2692x47948b59;
    }

    public final android.graphics.drawable.Drawable a() {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        this.f552378m = gradientDrawable;
        gradientDrawable.setCornerRadius(this.f552371f + 1.0E-5f);
        this.f552378m.setColor(-1);
        b();
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        this.f552379n = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.f552371f + 1.0E-5f);
        this.f552379n.setColor(0);
        this.f552379n.setStroke(this.f552372g, this.f552375j);
        android.graphics.drawable.InsetDrawable insetDrawable = new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{this.f552378m, this.f552379n}), this.f552367b, this.f552369d, this.f552368c, this.f552370e);
        android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
        this.f552380o = gradientDrawable3;
        gradientDrawable3.setCornerRadius(this.f552371f + 1.0E-5f);
        this.f552380o.setColor(-1);
        return new z9.a(ja.a.a(this.f552376k), insetDrawable, this.f552380o);
    }

    public final void b() {
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f552378m;
        if (gradientDrawable != null) {
            f3.b.h(gradientDrawable, this.f552374i);
            android.graphics.PorterDuff.Mode mode = this.f552373h;
            if (mode != null) {
                f3.b.i(this.f552378m, mode);
            }
        }
    }
}
