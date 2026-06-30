package fa;

/* loaded from: classes13.dex */
public abstract class d extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f342113a;

    /* renamed from: e, reason: collision with root package name */
    public float f342117e;

    /* renamed from: f, reason: collision with root package name */
    public int f342118f;

    /* renamed from: g, reason: collision with root package name */
    public int f342119g;

    /* renamed from: h, reason: collision with root package name */
    public int f342120h;

    /* renamed from: i, reason: collision with root package name */
    public int f342121i;

    /* renamed from: j, reason: collision with root package name */
    public android.content.res.ColorStateList f342122j;

    /* renamed from: k, reason: collision with root package name */
    public int f342123k;

    /* renamed from: m, reason: collision with root package name */
    public float f342125m;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f342114b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f342115c = new android.graphics.RectF();

    /* renamed from: d, reason: collision with root package name */
    public final fa.c f342116d = new fa.c(this, null);

    /* renamed from: l, reason: collision with root package name */
    public boolean f342124l = true;

    public d() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f342113a = paint;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        boolean z17 = this.f342124l;
        android.graphics.Rect rect = this.f342114b;
        android.graphics.Paint paint = this.f342113a;
        if (z17) {
            copyBounds(rect);
            float height = this.f342117e / rect.height();
            paint.setShader(new android.graphics.LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{e3.b.g(this.f342118f, this.f342123k), e3.b.g(this.f342119g, this.f342123k), e3.b.g(e3.b.i(this.f342119g, 0), this.f342123k), e3.b.g(e3.b.i(this.f342121i, 0), this.f342123k), e3.b.g(this.f342121i, this.f342123k), e3.b.g(this.f342120h, this.f342123k)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, android.graphics.Shader.TileMode.CLAMP));
            this.f342124l = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        android.graphics.RectF rectF = this.f342115c;
        copyBounds(rect);
        rectF.set(rect);
        rectF.left += strokeWidth;
        rectF.top += strokeWidth;
        rectF.right -= strokeWidth;
        rectF.bottom -= strokeWidth;
        canvas.save();
        canvas.rotate(this.f342125m, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.f342116d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f342117e > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        int round = java.lang.Math.round(this.f342117e);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.content.res.ColorStateList colorStateList = this.f342122j;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        this.f342124l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        android.content.res.ColorStateList colorStateList = this.f342122j;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f342123k)) != this.f342123k) {
            this.f342124l = true;
            this.f342123k = colorForState;
        }
        if (this.f342124l) {
            invalidateSelf();
        }
        return this.f342124l;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f342113a.setAlpha(i17);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f342113a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
