package tl2;

/* loaded from: classes3.dex */
public final class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f501769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f501770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f501771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u4.m1 f501772g;

    public a(u4.m1 m1Var, int i17, u4.m1 m1Var2) {
        this.f501770e = m1Var;
        this.f501771f = i17;
        this.f501772g = m1Var2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (this.f501769d) {
            u4.m1 m1Var = this.f501770e;
            android.view.View view = m1Var != null ? m1Var.f506048b : null;
            if (view == null) {
                return;
            }
            view.setBackground(null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        android.view.View view;
        android.graphics.drawable.Drawable background;
        android.graphics.drawable.Drawable.ConstantState constantState;
        android.view.View view2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.graphics.drawable.Drawable drawable = null;
        u4.m1 m1Var = this.f501770e;
        if (((m1Var == null || (view2 = m1Var.f506048b) == null) ? null : view2.getBackground()) != null || this.f501771f <= 0) {
            return;
        }
        android.view.View view3 = m1Var != null ? m1Var.f506048b : null;
        if (view3 != null) {
            u4.m1 m1Var2 = this.f501772g;
            if (m1Var2 != null && (view = m1Var2.f506048b) != null && (background = view.getBackground()) != null && (constantState = background.getConstantState()) != null) {
                drawable = constantState.newDrawable();
            }
            view3.setBackground(drawable);
        }
        this.f501769d = true;
    }
}
