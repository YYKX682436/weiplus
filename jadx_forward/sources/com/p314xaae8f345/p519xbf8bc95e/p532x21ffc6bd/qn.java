package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qn extends android.graphics.drawable.Drawable {

    /* renamed from: c, reason: collision with root package name */
    private static final int f132544c = -2829100;

    /* renamed from: d, reason: collision with root package name */
    private static final int f132545d = -10066330;

    /* renamed from: e, reason: collision with root package name */
    private static final int f132546e = 16777215;

    /* renamed from: a, reason: collision with root package name */
    boolean f132547a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f132548b;

    /* renamed from: f, reason: collision with root package name */
    private android.graphics.Paint f132549f;

    public qn() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f132549f = paint;
        paint.setAntiAlias(true);
        this.f132549f.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
    }

    private void b(boolean z17) {
        this.f132548b = z17;
    }

    public final void a(float f17) {
        this.f132549f.setStrokeWidth(f17);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.f132547a) {
            this.f132549f.setColor(this.f132548b ? f132545d : f132544c);
        } else {
            this.f132549f.setColor(f132546e);
        }
        canvas.drawLines(new float[]{0.0f, getBounds().height(), getBounds().width() / 2.0f, 0.0f, getBounds().width() / 2.0f, 0.0f, getBounds().width(), getBounds().height()}, this.f132549f);
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
        this.f132549f.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f132549f.setColorFilter(colorFilter);
    }

    private void a(boolean z17) {
        this.f132547a = z17;
    }
}
