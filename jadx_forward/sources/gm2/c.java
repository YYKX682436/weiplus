package gm2;

/* loaded from: classes3.dex */
public class c extends gm2.a {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f354848d;

    /* renamed from: e, reason: collision with root package name */
    public wo.q1 f354849e;

    /* renamed from: f, reason: collision with root package name */
    public int f354850f;

    /* renamed from: g, reason: collision with root package name */
    public int f354851g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.drawable.Drawable drawable) {
        super(drawable);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawable, "drawable");
        this.f354849e = new wo.q1(0, 0);
        gm2.c1.f354853a.k();
    }

    @Override // gm2.y1
    public int a() {
        return getDrawable().getMinimumWidth();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        int color = paint.getColor();
        float textSize = paint.getTextSize();
        int i29 = i28 - i19;
        float f18 = f17 + this.f354851g;
        android.graphics.drawable.Drawable drawable = this.f354848d;
        if (drawable != null) {
            if (this.f354850f != 0) {
                drawable.setColorFilter(new android.graphics.PorterDuffColorFilter(this.f354850f, android.graphics.PorterDuff.Mode.SRC_ATOP));
            }
            int i37 = i19 + ((i29 - this.f354849e.f529324b) / 2);
            drawable.setBounds(new android.graphics.Rect((int) f18, i37, (int) (f18 + r0.f529323a), this.f354849e.f529324b + i37));
            drawable.draw(canvas);
        }
        paint.setColor(color);
        paint.setTextSize(textSize);
    }
}
