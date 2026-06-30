package sa5;

/* loaded from: classes14.dex */
public final class o extends sa5.j {

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f486894e;

    public o(java.lang.Float f17, float[] fArr) {
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        if (f17 != null) {
            gradientDrawable.setCornerRadius(f17.floatValue());
        }
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        this.f486894e = gradientDrawable;
    }

    @Override // sa5.j
    public void a() {
        android.view.View view = this.f486884d;
        if (view == null) {
            return;
        }
        view.setForeground(null);
    }

    @Override // sa5.j
    public void c() {
    }

    @Override // sa5.j
    public boolean e() {
        return false;
    }

    @Override // sa5.j
    public void g(android.view.ViewPropertyAnimator viewPropertyAnimator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewPropertyAnimator, "viewPropertyAnimator");
    }

    @Override // sa5.j
    public void h(android.animation.ValueAnimator animation) {
        android.content.res.Resources resources;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        float animatedFraction = animation.getAnimatedFraction();
        android.view.View view = this.f486884d;
        if (view == null || (resources = view.getResources()) == null) {
            return;
        }
        int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77766x20e835);
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f486894e;
        gradientDrawable.setColor(color);
        gradientDrawable.setAlpha(255 - ((int) (255 * animatedFraction)));
        gradientDrawable.getAlpha();
        android.view.View view2 = this.f486884d;
        if (view2 == null) {
            return;
        }
        view2.setForeground(gradientDrawable);
    }
}
