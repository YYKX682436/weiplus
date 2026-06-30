package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qp extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static final int f51018a = -12028419;

    /* renamed from: b, reason: collision with root package name */
    private android.graphics.Paint f51019b;

    public qp() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f51019b = paint;
        paint.setAntiAlias(true);
        if (com.tencent.mapsdk.internal.tf.f51581c.equals("wechat")) {
            this.f51019b.setColor(-16531104);
        } else {
            this.f51019b.setColor(f51018a);
        }
    }

    private void a(int i17) {
        this.f51019b.setColor(i17);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        canvas.drawCircle(getBounds().width() / 2.0f, getBounds().height() / 2.0f, getBounds().width() / 2.0f, this.f51019b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i17) {
        this.f51019b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f51019b.setColorFilter(colorFilter);
    }
}
