package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes2.dex */
public final class bd extends android.graphics.drawable.Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2 f197748a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f197749b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Paint f197750c;

    public bd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2 gradientOrientation, int[] colorArray) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gradientOrientation, "gradientOrientation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorArray, "colorArray");
        this.f197748a = gradientOrientation;
        this.f197749b = colorArray;
        this.f197750c = new android.graphics.Paint();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        int ordinal = this.f197748a.ordinal();
        if (ordinal != 0) {
            f18 = 0.0f;
            if (ordinal == 1) {
                f17 = width;
            } else if (ordinal != 2) {
                f17 = 0.0f;
            } else {
                f17 = 0.0f;
                f18 = height;
            }
        } else {
            f17 = width;
            f18 = height;
        }
        android.graphics.Paint paint = this.f197750c;
        paint.setShader(new android.graphics.LinearGradient(0.0f, 0.0f, f17, f18, this.f197749b, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawRect(new android.graphics.Rect(0, 0, getBounds().width(), getBounds().height()), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
