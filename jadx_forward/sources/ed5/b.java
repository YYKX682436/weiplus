package ed5;

/* loaded from: classes5.dex */
public final class b extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f332870a;

    /* renamed from: b, reason: collision with root package name */
    public final int f332871b;

    /* renamed from: c, reason: collision with root package name */
    public final int f332872c;

    /* renamed from: d, reason: collision with root package name */
    public final int f332873d;

    /* renamed from: e, reason: collision with root package name */
    public final int f332874e;

    /* renamed from: f, reason: collision with root package name */
    public final float f332875f;

    /* renamed from: g, reason: collision with root package name */
    public final float f332876g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f332877h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f332878i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.RectF f332879j;

    /* renamed from: k, reason: collision with root package name */
    public float f332880k;

    public b(android.graphics.Bitmap bitmap, int i17, int i18, int i19, int i27, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        this.f332870a = bitmap;
        this.f332871b = i17;
        this.f332872c = i18;
        this.f332873d = i19;
        this.f332874e = i27;
        this.f332875f = f17;
        this.f332876g = f18;
        this.f332877h = new android.graphics.Paint(3);
        this.f332878i = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f332879j = new android.graphics.RectF();
        this.f332880k = 1.0f;
        a();
    }

    public final void a() {
        int i17 = this.f332873d;
        float f17 = this.f332880k;
        float f18 = i17 * f17;
        int i18 = this.f332874e;
        float f19 = i18 * f17;
        float f27 = this.f332871b;
        float f28 = this.f332875f;
        float f29 = f27 + (i17 * f28);
        float f37 = this.f332872c;
        float f38 = this.f332876g;
        float f39 = f29 - (f28 * f18);
        float f47 = (f37 + (i18 * f38)) - (f38 * f19);
        float f48 = f18 + f39;
        float f49 = f19 + f47;
        this.f332879j.set(f39, f47, f48, f49);
        setBounds((int) f39, (int) f47, (int) f48, (int) f49);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f332870a;
        if (bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(bitmap, this.f332878i, this.f332879j, this.f332877h);
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
