package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class qn extends android.graphics.drawable.Drawable {

    /* renamed from: c, reason: collision with root package name */
    private static final int f51011c = -2829100;

    /* renamed from: d, reason: collision with root package name */
    private static final int f51012d = -10066330;

    /* renamed from: e, reason: collision with root package name */
    private static final int f51013e = 16777215;

    /* renamed from: a, reason: collision with root package name */
    boolean f51014a = false;

    /* renamed from: b, reason: collision with root package name */
    boolean f51015b;

    /* renamed from: f, reason: collision with root package name */
    private android.graphics.Paint f51016f;

    public qn() {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f51016f = paint;
        paint.setAntiAlias(true);
        this.f51016f.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
    }

    private void b(boolean z17) {
        this.f51015b = z17;
    }

    public final void a(float f17) {
        this.f51016f.setStrokeWidth(f17);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        if (this.f51014a) {
            this.f51016f.setColor(this.f51015b ? f51012d : f51011c);
        } else {
            this.f51016f.setColor(f51013e);
        }
        canvas.drawLines(new float[]{0.0f, getBounds().height(), getBounds().width() / 2.0f, 0.0f, getBounds().width() / 2.0f, 0.0f, getBounds().width(), getBounds().height()}, this.f51016f);
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
        this.f51016f.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f51016f.setColorFilter(colorFilter);
    }

    private void a(boolean z17) {
        this.f51014a = z17;
    }
}
