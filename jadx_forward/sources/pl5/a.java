package pl5;

/* loaded from: classes5.dex */
public final class a extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f438271d;

    public a(boolean z17) {
        this.f438271d = z17;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence text, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        int i29;
        android.graphics.Paint paint2;
        android.graphics.Shader shader;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        float measureText = paint.measureText(text, i17, i17 + 1);
        float measureText2 = paint.measureText(text, i17, i18);
        float f18 = measureText / 2;
        float f19 = measureText2 - f18;
        int color = paint.getColor();
        android.graphics.Shader shader2 = paint.getShader();
        if (this.f438271d) {
            float f27 = f17 - f18;
            float f28 = f19 + f17;
            android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(f27, 0.0f, f28, 0.0f, new int[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560405ji)}, new float[]{0.25f, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
            paint.setAlpha(255);
            paint.setShader(linearGradient);
            canvas.save();
            canvas.clipRect(f17, i19, f28, i28);
            canvas.drawText(text, i17, i18, f27, i27, paint);
            canvas.restore();
            i29 = color;
            paint2 = paint;
            shader = shader2;
        } else {
            i29 = color;
            android.graphics.LinearGradient linearGradient2 = new android.graphics.LinearGradient(f17, 0.0f, f17 + f19, 0.0f, new int[]{com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f560405ji), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28)}, new float[]{0.0f, 0.75f}, android.graphics.Shader.TileMode.CLAMP);
            paint.setAlpha(255);
            paint.setShader(linearGradient2);
            canvas.save();
            canvas.clipRect(f17, i19, (f17 + measureText2) - f18, i28);
            paint2 = paint;
            canvas.drawText(text, i17, i18, f17, i27, paint);
            canvas.restore();
            shader = shader2;
        }
        paint2.setShader(shader);
        paint2.setColor(i29);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence text, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        return (int) (paint.measureText(text, i17, i18) - (paint.measureText(text, i17, i17 + 1) / 2));
    }
}
