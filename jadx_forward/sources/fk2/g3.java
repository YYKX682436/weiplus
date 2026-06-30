package fk2;

/* loaded from: classes3.dex */
public final class g3 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f344930d;

    public g3(bm2.h1 h1Var) {
        this.f344930d = h1Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        bm2.h1 h1Var = this.f344930d;
        h1Var.f103465m.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = h1Var.f103465m.getHeight();
        android.graphics.drawable.Drawable background = h1Var.f103465m.getBackground();
        android.graphics.drawable.GradientDrawable gradientDrawable = background instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setCornerRadius(height / 2.0f);
    }
}
