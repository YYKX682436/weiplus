package cw3;

/* loaded from: classes10.dex */
public final class a extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f305682a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f305683b;

    /* renamed from: c, reason: collision with root package name */
    public final float f305684c;

    /* renamed from: d, reason: collision with root package name */
    public final float f305685d;

    public a(android.content.res.Resources resources) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resources, "resources");
        this.f305682a = 2.0f;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f305683b = paint;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561867uv));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f305684c = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561867uv);
        this.f305685d = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561865ut);
        resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561866uu);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        float f17 = getBounds().left;
        float f18 = this.f305685d;
        float f19 = this.f305682a;
        float f27 = f17 - (f18 / f19);
        float f28 = getBounds().top - (f18 / f19);
        float f29 = getBounds().right + (f18 / f19);
        float f37 = getBounds().bottom + (f18 / f19);
        android.graphics.Paint paint = this.f305683b;
        paint.setStrokeWidth(this.f305684c / f19);
        paint.setAntiAlias(true);
        canvas.drawLines(new float[]{f27, f28, f29, f28, f29, f28, f29, f37, f29, f37, f27, f37, f27, f37, f27, f28}, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
