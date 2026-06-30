package gm2;

/* loaded from: classes3.dex */
public final class v extends android.text.style.ImageSpan {

    /* renamed from: f, reason: collision with root package name */
    public static final gm2.u f355031f = new gm2.u(null);

    /* renamed from: d, reason: collision with root package name */
    public final gm2.w f355032d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f355033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.graphics.drawable.Drawable drawable, gm2.w config) {
        super(drawable);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f355032d = config;
        this.f355033e = "FinderLiveRoundImageSpan";
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        gm2.w wVar = this.f355032d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        try {
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            paint.setTextSize(wVar.f355052g);
            paint.setColor(wVar.f355049d);
            float f18 = i19;
            float f19 = i28;
            float f27 = wVar.f355053h;
            int i29 = wVar.f355050e;
            if (i29 > 0) {
                float f28 = f19 - f18;
                float f29 = 2;
                float f37 = f28 / f29;
                float f38 = i29 / f29;
                f18 = f37 - f38;
                f19 = f37 + f38;
                int i37 = gm2.w.f355042i;
                if (f27 == gm2.w.f355045l) {
                    f27 = f38;
                }
            }
            java.lang.CharSequence charSequence2 = wVar.f355046a;
            canvas.drawRoundRect(new android.graphics.RectF(f17, f18, paint.measureText(charSequence2, i17, i17 + charSequence2.length()) + wVar.f355047b + wVar.f355048c + f17, f19), f27, f27, paint);
            paint.setColor(wVar.f355051f);
            float abs = (java.lang.Math.abs(paint.ascent() + paint.descent()) / 2) + ((i28 - i19) / 2) + 1;
            com.p314xaae8f345.mm.ui.bk.r0(paint, 0.8f);
            java.lang.CharSequence charSequence3 = wVar.f355046a;
            canvas.drawText(charSequence3, i17, i17 + charSequence3.length(), f17 + wVar.f355047b, abs, paint);
            com.p314xaae8f345.mm.ui.bk.t0(paint);
            paint.setColor(color);
            paint.setTextSize(textSize);
        } catch (java.lang.Exception e17) {
            pm0.z.b(xy2.b.f539688b, "liveInvalidBadgeTag", false, null, null, false, false, null, 124, null);
            hc2.c.a(e17, this.f355033e + ".draw(config:" + wVar + ",draw text:" + ((java.lang.Object) charSequence) + ",start:" + i17 + ",end:" + i18 + ')');
        }
    }
}
