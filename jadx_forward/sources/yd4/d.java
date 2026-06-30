package yd4;

/* loaded from: classes4.dex */
public final class d extends al5.w {

    /* renamed from: f, reason: collision with root package name */
    public boolean f542617f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.RectF f542618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.graphics.drawable.Drawable drawable, int i17) {
        super(drawable, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
    }

    @Override // al5.w, android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("draw", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f18 = ((((i27 * 2) + fontMetrics.ascent) + fontMetrics.descent) / 2) - ((getDrawable().getBounds().bottom + getDrawable().getBounds().top) / 2);
        canvas.save();
        canvas.translate(f17, f18);
        getDrawable().draw(canvas);
        canvas.restore();
        this.f542618g = new android.graphics.RectF(f17, f18, getDrawable().getBounds().width() + f17, getDrawable().getBounds().height() + f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("draw", "com.tencent.mm.plugin.sns.ui.view.VerticalAlignAlphaImageSpan");
    }
}
