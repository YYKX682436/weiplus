package ak4;

/* loaded from: classes4.dex */
public final class h extends android.text.style.ImageSpan implements gb5.a, xe0.h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final android.graphics.drawable.Drawable f5626e;

    /* renamed from: d, reason: collision with root package name */
    public final ak4.d f5627d;

    static {
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(0);
        colorDrawable.setBounds(0, 0, 0, 0);
        f5626e = colorDrawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ak4.d delegate) {
        super(f5626e);
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f5627d = delegate;
    }

    @Override // xe0.h0
    public boolean a(int i17, int i18) {
        return this.f5627d.d(i17, i18);
    }

    @Override // xe0.h0
    public void b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        ak4.d dVar = this.f5627d;
        dVar.getClass();
        dVar.onClick(view);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        this.f5627d.draw(canvas, charSequence, i17, i18, f17, i19, i27, i28, paint);
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public android.graphics.drawable.Drawable getDrawable() {
        android.graphics.drawable.Drawable drawable = this.f5627d.f5613q;
        return drawable == null ? f5626e : drawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        return this.f5627d.getSize(paint, charSequence, i17, i18, fontMetricsInt);
    }

    @Override // gb5.a
    public void setIsPressed(boolean z17) {
        this.f5627d.setIsPressed(z17);
    }
}
