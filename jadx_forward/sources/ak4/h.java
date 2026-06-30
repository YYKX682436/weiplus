package ak4;

/* loaded from: classes4.dex */
public final class h extends android.text.style.ImageSpan implements gb5.a, xe0.h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final android.graphics.drawable.Drawable f87159e;

    /* renamed from: d, reason: collision with root package name */
    public final ak4.d f87160d;

    static {
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(0);
        colorDrawable.setBounds(0, 0, 0, 0);
        f87159e = colorDrawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ak4.d delegate) {
        super(f87159e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f87160d = delegate;
    }

    @Override // xe0.h0
    public boolean a(int i17, int i18) {
        return this.f87160d.d(i17, i18);
    }

    @Override // xe0.h0
    public void b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ak4.d dVar = this.f87160d;
        dVar.getClass();
        dVar.m2166xaf6b9ae9(view);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        this.f87160d.draw(canvas, charSequence, i17, i18, f17, i19, i27, i28, paint);
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public android.graphics.drawable.Drawable getDrawable() {
        android.graphics.drawable.Drawable drawable = this.f87160d.f87146q;
        return drawable == null ? f87159e : drawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        return this.f87160d.getSize(paint, charSequence, i17, i18, fontMetricsInt);
    }

    @Override // gb5.a
    /* renamed from: setIsPressed */
    public void mo2167x263a2556(boolean z17) {
        this.f87160d.mo2167x263a2556(z17);
    }
}
