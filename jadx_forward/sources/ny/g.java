package ny;

/* loaded from: classes3.dex */
public final class g extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f422909d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f422910e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f422911f;

    /* renamed from: g, reason: collision with root package name */
    public float f422912g;

    /* renamed from: h, reason: collision with root package name */
    public final float f422913h;

    /* renamed from: i, reason: collision with root package name */
    public final float f422914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, android.graphics.Bitmap bitmap) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f422909d = bitmap;
        this.f422910e = new android.graphics.Paint(3);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(-16777216);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f422911f = paint;
        this.f422913h = 8.0f;
        this.f422914i = 16.0f;
    }

    /* renamed from: getShadowBlurRadius */
    private final float m150288xebc1348f() {
        return i65.a.b(getContext(), (int) this.f422914i);
    }

    /* renamed from: getShadowOffset */
    private final float m150289xfb7c0449() {
        return i65.a.b(getContext(), (int) this.f422913h);
    }

    /* renamed from: getShadowAlpha */
    public final float m150290x7af742e8() {
        return this.f422912g;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.f422909d;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f422910e);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        android.graphics.Bitmap bitmap = this.f422909d;
        if (bitmap == null || bitmap.isRecycled()) {
            super.onMeasure(i17, i18);
        } else {
            setMeasuredDimension(bitmap.getWidth(), bitmap.getHeight());
        }
    }

    /* renamed from: setShadowAlpha */
    public final void m150291x115cb65c(float f17) {
        float e17 = e06.p.e(f17, 0.0f, 1.0f);
        this.f422912g = e17;
        this.f422911f.setAlpha((int) (e17 * 40));
        invalidate();
    }
}
