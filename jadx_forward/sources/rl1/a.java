package rl1;

/* loaded from: classes5.dex */
public class a extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f478679a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f478680b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Path f478681c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f478682d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f478683e = new android.graphics.RectF();

    /* renamed from: f, reason: collision with root package name */
    public float f478684f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f478685g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final int f478686h;

    /* renamed from: i, reason: collision with root package name */
    public int f478687i;

    public a() {
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 3);
        this.f478686h = b17;
        this.f478687i = b17;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f478679a = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f478680b = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f478681c = new android.graphics.Path();
        this.f478682d = new android.graphics.Path();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF = this.f478683e;
        float width = rectF.width();
        float height = rectF.height();
        float f17 = rectF.left;
        float f18 = rectF.top;
        float f19 = rectF.right;
        float f27 = rectF.bottom;
        float min = java.lang.Math.min(this.f478684f, java.lang.Math.min(width, height) * 0.5f);
        int i17 = this.f478687i;
        android.graphics.RectF rectF2 = new android.graphics.RectF(i17 + f17, i17 + f18, f19 - i17, f27 - i17);
        android.graphics.Paint paint = this.f478680b;
        canvas.drawRoundRect(rectF2, min, min, paint);
        canvas.drawPath(this.f478682d, paint);
        int i18 = this.f478687i;
        int i19 = this.f478685g;
        android.graphics.RectF rectF3 = new android.graphics.RectF(f17 + i18 + i19, f18 + i18 + i19, (f19 - i18) - i19, (f27 - i18) - i19);
        android.graphics.Paint paint2 = this.f478679a;
        canvas.drawRoundRect(rectF3, min, min, paint2);
        canvas.drawPath(this.f478681c, paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f478679a.setAlpha(i17);
        this.f478680b.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
        float f17 = i27;
        this.f478683e.set(i17, i18, i19, f17);
        float f18 = (i17 + i19) / 2.0f;
        android.graphics.Path path = this.f478682d;
        path.moveTo(f18, f17);
        path.lineTo(f18 - this.f478687i, i27 - r7);
        path.lineTo(this.f478687i + f18, i27 - r7);
        path.close();
        android.graphics.Path path2 = this.f478681c;
        path2.moveTo(f18, i27 - this.f478685g);
        path2.lineTo(f18 - this.f478687i, (i27 - r7) - this.f478685g);
        path2.lineTo(f18 + this.f478687i, (i27 - r7) - this.f478685g);
        path2.close();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f478679a.setColorFilter(colorFilter);
        this.f478680b.setColorFilter(colorFilter);
    }
}
