package b2;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f17293a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17294b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17295c;

    /* renamed from: d, reason: collision with root package name */
    public final android.text.TextPaint f17296d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17297e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.TextDirectionHeuristic f17298f;

    /* renamed from: g, reason: collision with root package name */
    public final android.text.Layout.Alignment f17299g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17300h;

    /* renamed from: i, reason: collision with root package name */
    public final android.text.TextUtils.TruncateAt f17301i;

    /* renamed from: j, reason: collision with root package name */
    public final int f17302j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17303k;

    /* renamed from: l, reason: collision with root package name */
    public final float f17304l;

    /* renamed from: m, reason: collision with root package name */
    public final int f17305m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f17306n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17307o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17308p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17309q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f17310r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f17311s;

    public q(java.lang.CharSequence text, int i17, int i18, android.text.TextPaint paint, int i19, android.text.TextDirectionHeuristic textDir, android.text.Layout.Alignment alignment, int i27, android.text.TextUtils.TruncateAt truncateAt, int i28, float f17, float f18, int i29, boolean z17, boolean z18, int i37, int i38, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(paint, "paint");
        kotlin.jvm.internal.o.g(textDir, "textDir");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        this.f17293a = text;
        this.f17294b = i17;
        this.f17295c = i18;
        this.f17296d = paint;
        this.f17297e = i19;
        this.f17298f = textDir;
        this.f17299g = alignment;
        this.f17300h = i27;
        this.f17301i = truncateAt;
        this.f17302j = i28;
        this.f17303k = f17;
        this.f17304l = f18;
        this.f17305m = i29;
        this.f17306n = z17;
        this.f17307o = z18;
        this.f17308p = i37;
        this.f17309q = i38;
        this.f17310r = iArr;
        this.f17311s = iArr2;
        if (!(i17 >= 0 && i17 <= i18)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i18 >= 0 && i18 <= text.length())) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i27 >= 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i19 >= 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i28 >= 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f17 >= 0.0f)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
