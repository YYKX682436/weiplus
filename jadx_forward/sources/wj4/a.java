package wj4;

/* loaded from: classes5.dex */
public final class a extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f528282a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f528283b;

    public a(float f17, int i17) {
        this.f528282a = f17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f528283b = paint;
        paint.setColor(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(getBounds(), "getBounds(...)");
        float height = r0.height() * this.f528282a;
        canvas.drawRoundRect(r0.left, r0.top, r0.right, r0.bottom, height, height, this.f528283b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f528283b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f528283b.setColorFilter(colorFilter);
    }
}
