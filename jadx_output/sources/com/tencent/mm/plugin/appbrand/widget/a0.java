package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes3.dex */
public class a0 extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f91022a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f91023b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f91024c;

    public a0(com.tencent.mm.plugin.appbrand.widget.z zVar) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f91022a = paint;
        this.f91023b = new android.graphics.RectF();
        this.f91024c = new android.graphics.Rect();
        paint.setColor(-12748166);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        int width;
        int height;
        android.graphics.Rect rect = this.f91024c;
        if (rect.width() <= 0 || rect.height() <= 0) {
            width = canvas.getWidth();
            height = canvas.getHeight();
        } else {
            width = rect.width();
            height = rect.height();
        }
        float f17 = height;
        float f18 = f17 / 2.0f;
        android.graphics.RectF rectF = this.f91023b;
        rectF.top = 0.0f;
        rectF.left = 0.0f;
        float f19 = 2.0f * f18;
        rectF.bottom = f19;
        rectF.right = f19;
        android.graphics.Paint paint = this.f91022a;
        canvas.drawArc(rectF, 90.0f, 180.0f, false, paint);
        float f27 = width;
        rectF.left = f27 - f19;
        rectF.top = 0.0f;
        rectF.right = f27;
        rectF.bottom = f17;
        canvas.drawArc(rectF, -90.0f, 180.0f, false, paint);
        canvas.drawRect(f18 - 1.0f, 0.0f, (f27 - f18) + 1.0f, f17, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        int i17 = rect.left;
        android.graphics.Rect rect2 = this.f91024c;
        rect2.left = i17;
        rect2.right = rect.right;
        rect2.top = rect.top;
        rect2.bottom = rect.bottom;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
