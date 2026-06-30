package bf3;

/* loaded from: classes3.dex */
public final class c extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f19613a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f19614b;

    public c(int i17) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f19613a = paint;
        this.f19614b = new android.graphics.Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        float width;
        int height;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Rect rect = this.f19614b;
        if (rect.width() <= 0 || rect.height() <= 0) {
            width = getBounds().width();
            height = getBounds().height();
        } else {
            width = rect.width();
            height = rect.height();
        }
        float f17 = height;
        java.util.Objects.toString(rect);
        float f18 = f17 / 2.0f;
        android.graphics.Paint paint = this.f19613a;
        canvas.drawCircle(f18, f18, f18, paint);
        float f19 = width - f18;
        canvas.drawCircle(f19, f18, f18, paint);
        float f27 = 1;
        canvas.drawRect(f18 - f27, 0.0f, f19 + f27, f17, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect bounds) {
        kotlin.jvm.internal.o.g(bounds, "bounds");
        super.onBoundsChange(bounds);
        int i17 = bounds.left;
        android.graphics.Rect rect = this.f19614b;
        rect.left = i17;
        rect.right = bounds.right;
        rect.top = bounds.top;
        rect.bottom = bounds.bottom;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
