package al5;

/* loaded from: classes3.dex */
public final class z1 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f87638a;

    public z1(int i17) {
        this.f87638a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, view != null ? view.getMeasuredWidth() : 0.0f, view != null ? view.getMeasuredHeight() : 0.0f);
        int i17 = android.os.Build.VERSION.SDK_INT;
        int i18 = this.f87638a;
        if (i17 > 31) {
            if (outline != null) {
                outline.setPath(com.p314xaae8f345.mm.ui.dl.c(rectF, i18, i18, i18, i18, 0.6f));
            }
        } else if (outline != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            rectF.roundOut(rect);
            outline.setRoundRect(rect, i18);
        }
    }
}
