package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qp extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    private static final int f132551a = -12028419;

    /* renamed from: b, reason: collision with root package name */
    private android.graphics.Paint f132552b;

    public qp() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f132552b = paint;
        paint.setAntiAlias(true);
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tf.f133114c.equals("wechat")) {
            this.f132552b.setColor(-16531104);
        } else {
            this.f132552b.setColor(f132551a);
        }
    }

    private void a(int i17) {
        this.f132552b.setColor(i17);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        canvas.drawCircle(getBounds().width() / 2.0f, getBounds().height() / 2.0f, getBounds().width() / 2.0f, this.f132552b);
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
        this.f132552b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f132552b.setColorFilter(colorFilter);
    }
}
