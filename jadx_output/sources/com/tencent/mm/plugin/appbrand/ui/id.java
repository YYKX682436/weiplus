package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes5.dex */
public class id extends android.graphics.drawable.Drawable {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f89786j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f89787a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f89788b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89789c;

    /* renamed from: d, reason: collision with root package name */
    public final int f89790d;

    /* renamed from: e, reason: collision with root package name */
    public final int f89791e;

    /* renamed from: f, reason: collision with root package name */
    public final int f89792f;

    /* renamed from: g, reason: collision with root package name */
    public final int f89793g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f89794h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.RectF f89795i;

    public id(int i17, int[] iArr, int i18, int i19, int i27, int i28, int i29, com.tencent.mm.plugin.appbrand.ui.gd gdVar) {
        this.f89790d = i17;
        this.f89794h = iArr;
        this.f89791e = i18;
        this.f89789c = i27;
        this.f89792f = i28;
        this.f89793g = i29;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f89787a = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer(i27, i28, i29, i19);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_ATOP));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f89788b = paint2;
        paint2.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.f89788b;
        int[] iArr = this.f89794h;
        if (iArr != null) {
            if (iArr.length == 1) {
                paint.setColor(iArr[0]);
            } else {
                android.graphics.RectF rectF = this.f89795i;
                float f17 = rectF.left;
                float height = rectF.height() / 2.0f;
                android.graphics.RectF rectF2 = this.f89795i;
                paint.setShader(new android.graphics.LinearGradient(f17, height, rectF2.right, rectF2.height() / 2.0f, this.f89794h, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
            }
        }
        int i17 = this.f89790d;
        android.graphics.Paint paint2 = this.f89787a;
        if (i17 != 1) {
            canvas.drawCircle(this.f89795i.centerX(), this.f89795i.centerY(), java.lang.Math.min(this.f89795i.width(), this.f89795i.height()) / 2.0f, paint2);
            canvas.drawCircle(this.f89795i.centerX(), this.f89795i.centerY(), java.lang.Math.min(this.f89795i.width(), this.f89795i.height()) / 2.0f, paint);
        } else {
            android.graphics.RectF rectF3 = this.f89795i;
            int i18 = this.f89791e;
            canvas.drawRoundRect(rectF3, i18, i18, paint2);
            canvas.drawRoundRect(this.f89795i, i18, i18, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f89787a.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
        int i28 = this.f89789c;
        int i29 = this.f89792f;
        int i37 = this.f89793g;
        this.f89795i = new android.graphics.RectF((i17 + i28) - i29, (i18 + i28) - i37, (i19 - i28) - i29, (i27 - i28) - i37);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f89787a.setColorFilter(colorFilter);
    }
}
