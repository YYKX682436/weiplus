package db5;

/* loaded from: classes15.dex */
public class g implements android.text.style.LineBackgroundSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f309869d;

    /* renamed from: e, reason: collision with root package name */
    public final int f309870e;

    /* renamed from: f, reason: collision with root package name */
    public int f309871f;

    /* renamed from: g, reason: collision with root package name */
    public int f309872g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f309873h = new android.graphics.Rect();

    public g(android.view.View view, int i17, int i18, int i19) {
        this.f309869d = view;
        this.f309870e = i17;
        this.f309871f = i18;
        this.f309872g = i19;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(android.graphics.Canvas canvas, android.graphics.Paint paint, int i17, int i18, int i19, int i27, int i28, java.lang.CharSequence charSequence, int i29, int i37, int i38) {
        if (this.f309872g >= i29 && this.f309871f <= i37) {
            int color = paint.getColor();
            int i39 = this.f309871f;
            android.view.View view = this.f309869d;
            int d17 = wl5.y.d(view, i39);
            int d18 = wl5.y.d(view, this.f309872g);
            if (d17 <= i38 && i38 <= d18) {
                i17 = (int) (d17 == i38 ? wl5.y.m(view, this.f309871f) : wl5.y.f(view, i38));
                i18 = (int) (d18 == i38 ? wl5.y.m(view, this.f309872g) : wl5.y.j(view, i38));
            }
            int descent = (int) (i27 + paint.descent());
            android.graphics.Rect rect = this.f309873h;
            rect.left = i17;
            if (this.f309871f == i29) {
                rect.left = i17 - 4;
            }
            rect.right = i18;
            if (this.f309872g == i18) {
                rect.right = i18 + 4;
            }
            rect.top = i19;
            rect.bottom = descent;
            paint.setColor(this.f309870e);
            canvas.drawRect(rect, paint);
            paint.setColor(color);
        }
    }
}
