package ux2;

/* loaded from: classes16.dex */
public final class g extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f513398a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f513399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f513400c;

    /* renamed from: d, reason: collision with root package name */
    public final int f513401d;

    /* renamed from: e, reason: collision with root package name */
    public final int f513402e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f513403f;

    public g(android.content.Context context, int i17, float f17, float f18, float f19, int i18, float f27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f513398a = f17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f513399b = paint;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.afe);
        this.f513400c = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
        this.f513401d = dimensionPixelSize2;
        this.f513402e = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561207cb);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563114d16, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(drawable, "getDrawable(...)");
        this.f513403f = f3.d.a(drawable, dimensionPixelSize2, dimensionPixelSize, null, 4, null);
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setShadowLayer(f27, f18, f19, i18);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        float f17 = getBounds().left;
        float f18 = getBounds().top;
        float f19 = getBounds().right;
        float f27 = getBounds().bottom;
        float f28 = this.f513398a / 2.0f;
        int i17 = this.f513400c;
        android.graphics.RectF rectF = new android.graphics.RectF(f17, f18, f19, f27 - i17);
        android.graphics.Paint paint = this.f513399b;
        canvas.drawRoundRect(rectF, f28, f28, paint);
        canvas.drawBitmap(this.f513403f, (f19 - this.f513401d) - this.f513402e, f27 - i17, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f513399b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f513399b.setColorFilter(colorFilter);
    }
}
