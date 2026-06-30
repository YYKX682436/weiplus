package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes5.dex */
public class id extends android.graphics.drawable.Drawable {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f171319j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f171320a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f171321b;

    /* renamed from: c, reason: collision with root package name */
    public final int f171322c;

    /* renamed from: d, reason: collision with root package name */
    public final int f171323d;

    /* renamed from: e, reason: collision with root package name */
    public final int f171324e;

    /* renamed from: f, reason: collision with root package name */
    public final int f171325f;

    /* renamed from: g, reason: collision with root package name */
    public final int f171326g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f171327h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.RectF f171328i;

    public id(int i17, int[] iArr, int i18, int i19, int i27, int i28, int i29, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.gd gdVar) {
        this.f171323d = i17;
        this.f171327h = iArr;
        this.f171324e = i18;
        this.f171322c = i27;
        this.f171325f = i28;
        this.f171326g = i29;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f171320a = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer(i27, i28, i29, i19);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_ATOP));
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f171321b = paint2;
        paint2.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.f171321b;
        int[] iArr = this.f171327h;
        if (iArr != null) {
            if (iArr.length == 1) {
                paint.setColor(iArr[0]);
            } else {
                android.graphics.RectF rectF = this.f171328i;
                float f17 = rectF.left;
                float height = rectF.height() / 2.0f;
                android.graphics.RectF rectF2 = this.f171328i;
                paint.setShader(new android.graphics.LinearGradient(f17, height, rectF2.right, rectF2.height() / 2.0f, this.f171327h, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
            }
        }
        int i17 = this.f171323d;
        android.graphics.Paint paint2 = this.f171320a;
        if (i17 != 1) {
            canvas.drawCircle(this.f171328i.centerX(), this.f171328i.centerY(), java.lang.Math.min(this.f171328i.width(), this.f171328i.height()) / 2.0f, paint2);
            canvas.drawCircle(this.f171328i.centerX(), this.f171328i.centerY(), java.lang.Math.min(this.f171328i.width(), this.f171328i.height()) / 2.0f, paint);
        } else {
            android.graphics.RectF rectF3 = this.f171328i;
            int i18 = this.f171324e;
            canvas.drawRoundRect(rectF3, i18, i18, paint2);
            canvas.drawRoundRect(this.f171328i, i18, i18, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f171320a.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i17, int i18, int i19, int i27) {
        super.setBounds(i17, i18, i19, i27);
        int i28 = this.f171322c;
        int i29 = this.f171325f;
        int i37 = this.f171326g;
        this.f171328i = new android.graphics.RectF((i17 + i28) - i29, (i18 + i28) - i37, (i19 - i28) - i29, (i27 - i28) - i37);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f171320a.setColorFilter(colorFilter);
    }
}
