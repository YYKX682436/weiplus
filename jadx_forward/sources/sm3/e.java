package sm3;

/* loaded from: classes10.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f491384d;

    /* renamed from: e, reason: collision with root package name */
    public final float f491385e;

    /* renamed from: f, reason: collision with root package name */
    public final float f491386f;

    /* renamed from: g, reason: collision with root package name */
    public final float f491387g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f491388h;

    /* renamed from: i, reason: collision with root package name */
    public final int f491389i;

    /* renamed from: m, reason: collision with root package name */
    public long f491390m;

    /* renamed from: n, reason: collision with root package name */
    public long f491391n;

    /* renamed from: o, reason: collision with root package name */
    public sm3.d f491392o;

    public e(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561124a1);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f491384d = paint;
        this.f491391n = 1000L;
        paint.setColor(-1);
        paint.setTextSize(dimensionPixelSize);
        this.f491385e = paint.measureText("00:00");
        this.f491387g = paint.getFontMetrics().top;
        this.f491386f = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        android.graphics.drawable.Drawable drawable = context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563531ar3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
        this.f491388h = drawable;
        int b17 = i65.a.b(context, 2);
        this.f491389i = b17;
        drawable.setBounds(0, 0, b17, b17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: onDraw */
    public void mo8166xc398a7c3(android.graphics.Canvas c17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        sm3.d dVar = this.f491392o;
        if (dVar == null) {
            return;
        }
        float width = parent.getWidth() / 2;
        float f17 = this.f491385e;
        int b17 = a06.d.b((width + f17) / dVar.f491380c);
        long b18 = this.f491390m - a06.d.b((parent.getWidth() / 2) / dVar.f491380c);
        long j17 = this.f491390m;
        long j18 = b17;
        long j19 = j17 - j18;
        if (j19 < 0) {
            j19 = 0;
        }
        long j27 = j17 + j18;
        long j28 = this.f491391n;
        if (j27 > j28) {
            j27 = j28;
        }
        long j29 = dVar.f491379b;
        long j37 = j19 / j29;
        long j38 = j27 / j29;
        if (j37 > j38) {
            return;
        }
        while (true) {
            long j39 = dVar.f491379b * j37;
            float f18 = ((float) (j39 - b18)) * dVar.f491380c;
            if (j37 % 2 == 1) {
                int i17 = (int) f18;
                int i18 = this.f491389i;
                int i19 = i17 - (i18 / 2);
                float f19 = this.f491386f;
                int i27 = (((int) f19) - i18) / 2;
                int i28 = i17 + (i18 / 2);
                int i29 = (((int) f19) + i18) / 2;
                android.graphics.drawable.Drawable drawable = this.f491388h;
                drawable.setBounds(i19, i27, i28, i29);
                drawable.draw(c17);
            } else {
                c17.drawText(y46.b.a(j39, "mm:ss", true), f18 - (f17 / 2), -this.f491387g, this.f491384d);
            }
            if (j37 == j38) {
                return;
            } else {
                j37++;
            }
        }
    }
}
