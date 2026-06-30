package c32;

/* loaded from: classes10.dex */
public final class a implements c32.e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f38170a;

    @Override // c32.e
    public void a() {
    }

    @Override // c32.e
    public void b(java.lang.String fontName) {
        kotlin.jvm.internal.o.g(fontName, "fontName");
    }

    @Override // c32.e
    public void c(android.graphics.Canvas canvas, int i17, int i18, float f17, float f18, android.graphics.Paint paint, boolean z17) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        java.lang.CharSequence charSequence = this.f38170a;
        if (charSequence == null) {
            return;
        }
        kotlin.jvm.internal.o.d(charSequence);
        canvas.drawText(charSequence, i17, i18, f17, f18, paint);
        if (z17) {
            canvas.drawText("...", paint.measureText(this.f38170a, i17, i18) + f17, f18, paint);
        }
    }

    @Override // c32.e
    public void setText(java.lang.CharSequence text) {
        kotlin.jvm.internal.o.g(text, "text");
        this.f38170a = text;
    }
}
