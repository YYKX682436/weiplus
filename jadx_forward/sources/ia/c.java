package ia;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f371404a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.ColorStateList f371405b;

    /* renamed from: c, reason: collision with root package name */
    public final int f371406c;

    /* renamed from: d, reason: collision with root package name */
    public final int f371407d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f371408e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.res.ColorStateList f371409f;

    /* renamed from: g, reason: collision with root package name */
    public final float f371410g;

    /* renamed from: h, reason: collision with root package name */
    public final float f371411h;

    /* renamed from: i, reason: collision with root package name */
    public final float f371412i;

    /* renamed from: j, reason: collision with root package name */
    public final int f371413j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f371414k = false;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Typeface f371415l;

    public c(android.content.Context context, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i17, v9.a.f515665v);
        this.f371404a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f371405b = ia.a.a(context, obtainStyledAttributes, 3);
        ia.a.a(context, obtainStyledAttributes, 4);
        ia.a.a(context, obtainStyledAttributes, 5);
        this.f371406c = obtainStyledAttributes.getInt(2, 0);
        this.f371407d = obtainStyledAttributes.getInt(1, 1);
        int i18 = obtainStyledAttributes.hasValue(11) ? 11 : 10;
        this.f371413j = obtainStyledAttributes.getResourceId(i18, 0);
        this.f371408e = obtainStyledAttributes.getString(i18);
        obtainStyledAttributes.getBoolean(12, false);
        this.f371409f = ia.a.a(context, obtainStyledAttributes, 6);
        this.f371410g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f371411h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f371412i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        android.graphics.Typeface typeface = this.f371415l;
        int i17 = this.f371406c;
        if (typeface == null) {
            this.f371415l = android.graphics.Typeface.create(this.f371408e, i17);
        }
        if (this.f371415l == null) {
            int i18 = this.f371407d;
            if (i18 == 1) {
                this.f371415l = android.graphics.Typeface.SANS_SERIF;
            } else if (i18 == 2) {
                this.f371415l = android.graphics.Typeface.SERIF;
            } else if (i18 != 3) {
                this.f371415l = android.graphics.Typeface.DEFAULT;
            } else {
                this.f371415l = android.graphics.Typeface.MONOSPACE;
            }
            android.graphics.Typeface typeface2 = this.f371415l;
            if (typeface2 != null) {
                this.f371415l = android.graphics.Typeface.create(typeface2, i17);
            }
        }
    }

    public void b(android.content.Context context, android.text.TextPaint textPaint, d3.p pVar) {
        c(context, textPaint, pVar);
        android.content.res.ColorStateList colorStateList = this.f371405b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        android.content.res.ColorStateList colorStateList2 = this.f371409f;
        textPaint.setShadowLayer(this.f371412i, this.f371410g, this.f371411h, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void c(android.content.Context context, android.text.TextPaint textPaint, d3.p pVar) {
        if (this.f371414k) {
            d(textPaint, this.f371415l);
        } else {
            a();
            if (context.isRestricted()) {
                this.f371414k = true;
                d(textPaint, this.f371415l);
            } else {
                try {
                    d3.q.a(context, this.f371413j, new ia.b(this, textPaint, pVar), null);
                } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException | java.lang.Exception unused) {
                }
            }
        }
        if (this.f371414k) {
            return;
        }
        d(textPaint, this.f371415l);
    }

    public void d(android.text.TextPaint textPaint, android.graphics.Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i17 = (~typeface.getStyle()) & this.f371406c;
        textPaint.setFakeBoldText((i17 & 1) != 0);
        textPaint.setTextSkewX((i17 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f371404a);
    }
}
