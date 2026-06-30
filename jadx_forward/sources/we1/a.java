package we1;

/* loaded from: classes13.dex */
public class a implements we1.h {

    /* renamed from: k, reason: collision with root package name */
    public static int f526726k;

    /* renamed from: l, reason: collision with root package name */
    public static int f526727l;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f526728a;

    /* renamed from: b, reason: collision with root package name */
    public int f526729b;

    /* renamed from: c, reason: collision with root package name */
    public int f526730c;

    /* renamed from: d, reason: collision with root package name */
    public android.text.StaticLayout f526731d;

    /* renamed from: e, reason: collision with root package name */
    public int f526732e;

    /* renamed from: f, reason: collision with root package name */
    public int f526733f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f526734g;

    /* renamed from: h, reason: collision with root package name */
    public final int f526735h;

    /* renamed from: i, reason: collision with root package name */
    public int f526736i;

    /* renamed from: j, reason: collision with root package name */
    public final float f526737j;

    public a(android.content.Context context, android.text.SpannableString spannableString, int i17, int i18, float f17, int i19) {
        this.f526736i = -1;
        this.f526728a = context;
        if (i18 > 0) {
            this.f526734g = i65.a.b(context, i18);
        } else {
            this.f526734g = i65.a.b(context, 18);
        }
        this.f526736i = i17;
        this.f526737j = f17;
        this.f526735h = i19;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(this.f526736i);
        textPaint.setTextSize(this.f526734g);
        android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        java.lang.Math.ceil(fontMetrics.descent - fontMetrics.top);
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spannableString, textPaint, ((int) android.text.Layout.getDesiredWidth(spannableString, 0, spannableString.length(), textPaint)) + 1, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f526731d = staticLayout;
        this.f526732e = staticLayout.getWidth();
    }

    public void a(android.graphics.Canvas canvas, boolean z17) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (width != f526726k || height != f526727l) {
            f526726k = width;
            f526727l = height;
        }
        canvas.save();
        canvas.translate(this.f526729b, this.f526730c);
        this.f526731d.draw(canvas);
        canvas.restore();
        if (z17) {
            return;
        }
        this.f526729b = (int) (this.f526729b - (3 * this.f526737j));
    }

    public boolean b(we1.h hVar) {
        int i17 = ((we1.a) hVar).f526732e;
        we1.a aVar = (we1.a) hVar;
        if (i17 + aVar.f526729b > f526726k) {
            return true;
        }
        if (this.f526733f < 0) {
            this.f526733f = i65.a.b(this.f526728a, 20);
        }
        float f17 = aVar.f526737j;
        float f18 = this.f526737j;
        if (f17 >= f18) {
            return f17 == f18 && ((float) (f526726k - (aVar.f526729b + aVar.f526732e))) < ((float) this.f526733f);
        }
        float f19 = 3;
        return ((double) (((((float) (aVar.f526729b + aVar.f526732e)) / (f17 * f19)) * f18) * f19)) > ((double) f526726k) - (((double) this.f526733f) * 1.5d);
    }
}
