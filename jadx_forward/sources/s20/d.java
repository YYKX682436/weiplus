package s20;

/* loaded from: classes13.dex */
public final class d extends android.text.style.DynamicDrawableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.c7 f483806d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f483807e;

    /* renamed from: f, reason: collision with root package name */
    public s20.a f483808f;

    /* renamed from: g, reason: collision with root package name */
    public int f483809g;

    /* renamed from: h, reason: collision with root package name */
    public int f483810h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(bw5.c7 img, float f17, android.view.View view) {
        super(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(img, "img");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f483806d = img;
        this.f483807e = view;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(f17);
        android.graphics.Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i17 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i17 <= 0) {
            return;
        }
        this.f483810h = i17;
        int i18 = img.f107487e;
        int b17 = a06.d.b(i17 * (i18 > 0 ? img.f107488f / i18 : 1.0f));
        this.f483809g = b17;
        if (b17 <= 0) {
            this.f483809g = 1;
        }
        if (this.f483810h <= 0) {
            this.f483810h = 1;
        }
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        android.graphics.drawable.Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f17, ((i19 + i28) - drawable.getBounds().height()) / 2.0f);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan
    public android.graphics.drawable.Drawable getDrawable() {
        if (this.f483808f == null) {
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(0);
            colorDrawable.setBounds(0, 0, this.f483809g, this.f483810h);
            this.f483808f = new s20.a(colorDrawable, this.f483809g, this.f483810h);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDowload. url= ");
            bw5.c7 c7Var = this.f483806d;
            sb6.append(c7Var.b());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("bufanwang", sb6.toString());
            q00.f fVar = new q00.f();
            fVar.f440784a = c7Var;
            fVar.b(new s20.c(this));
            fVar.a();
        }
        s20.a aVar = this.f483808f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        return aVar;
    }
}
