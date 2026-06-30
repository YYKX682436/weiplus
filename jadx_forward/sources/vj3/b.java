package vj3;

/* loaded from: classes3.dex */
public class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f519209a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f519210b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f519211c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f519212d;

    public b(int i17, float f17) {
        this.f519209a = f17;
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.f519210b = paint;
        paint.setColor(i17);
        this.f519211c = new android.graphics.RectF();
        this.f519212d = new android.graphics.Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.f519211c;
        android.graphics.Paint paint = this.f519210b;
        float f17 = this.f519209a;
        canvas.drawRoundRect(rectF, f17, f17, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        outline.setRoundRect(this.f519212d, this.f519209a);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        if (rect == null) {
            rect = getBounds();
        }
        this.f519211c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f519212d.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
