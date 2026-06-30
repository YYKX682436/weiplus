package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed;

/* loaded from: classes10.dex */
public class a extends android.graphics.drawable.GradientDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f126125a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f126126b;

    /* renamed from: c, reason: collision with root package name */
    public int f126127c;

    public a() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f126125a = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        this.f126126b = new android.graphics.RectF();
    }

    public void a(float f17, float f18, float f19, float f27) {
        android.graphics.RectF rectF = this.f126126b;
        if (f17 == rectF.left && f18 == rectF.top && f19 == rectF.right && f27 == rectF.bottom) {
            return;
        }
        rectF.set(f17, f18, f19, f27);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback instanceof android.view.View) {
            ((android.view.View) callback).setLayerType(2, null);
        } else {
            this.f126127c = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.f126126b, this.f126125a);
        if (getCallback() instanceof android.view.View) {
            return;
        }
        canvas.restoreToCount(this.f126127c);
    }
}
