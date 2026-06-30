package p000;

/* loaded from: classes3.dex */
public final class a extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f81571a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f81572b = new android.graphics.Paint(3);

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f81573c = new android.graphics.RectF();

    public a(android.graphics.Bitmap bitmap) {
        this.f81571a = bitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f81571a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        android.graphics.Rect bounds = getBounds();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bounds, "getBounds(...)");
        if (bounds.isEmpty()) {
            return;
        }
        float max = java.lang.Math.max(bounds.width() / bitmap.getWidth(), bounds.height() / bitmap.getHeight());
        float width = bitmap.getWidth() * max;
        float height = bitmap.getHeight() * max;
        float width2 = (bounds.width() - width) / 2.0f;
        float height2 = (bounds.height() - height) / 2.0f;
        android.graphics.RectF rectF = this.f81573c;
        int i17 = bounds.left;
        int i18 = bounds.top;
        rectF.set(i17 + width2, i18 + height2, i17 + width2 + width, i18 + height2 + height);
        canvas.drawBitmap(bitmap, (android.graphics.Rect) null, rectF, this.f81572b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        android.graphics.Bitmap bitmap = this.f81571a;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.graphics.Bitmap bitmap = this.f81571a;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect bounds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
        super.onBoundsChange(bounds);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f81572b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f81572b.setColorFilter(colorFilter);
    }
}
