package c32;

/* loaded from: classes10.dex */
public final class a implements c32.e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f119703a;

    @Override // c32.e
    public void a() {
    }

    @Override // c32.e
    public void b(java.lang.String fontName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontName, "fontName");
    }

    @Override // c32.e
    public void c(android.graphics.Canvas canvas, int i17, int i18, float f17, float f18, android.graphics.Paint paint, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        java.lang.CharSequence charSequence = this.f119703a;
        if (charSequence == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence);
        canvas.drawText(charSequence, i17, i18, f17, f18, paint);
        if (z17) {
            canvas.drawText("...", paint.measureText(this.f119703a, i17, i18) + f17, f18, paint);
        }
    }

    @Override // c32.e
    /* renamed from: setText */
    public void mo14070x765074af(java.lang.CharSequence text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f119703a = text;
    }
}
