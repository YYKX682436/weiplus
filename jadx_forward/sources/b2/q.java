package b2;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f98826a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98827b;

    /* renamed from: c, reason: collision with root package name */
    public final int f98828c;

    /* renamed from: d, reason: collision with root package name */
    public final android.text.TextPaint f98829d;

    /* renamed from: e, reason: collision with root package name */
    public final int f98830e;

    /* renamed from: f, reason: collision with root package name */
    public final android.text.TextDirectionHeuristic f98831f;

    /* renamed from: g, reason: collision with root package name */
    public final android.text.Layout.Alignment f98832g;

    /* renamed from: h, reason: collision with root package name */
    public final int f98833h;

    /* renamed from: i, reason: collision with root package name */
    public final android.text.TextUtils.TruncateAt f98834i;

    /* renamed from: j, reason: collision with root package name */
    public final int f98835j;

    /* renamed from: k, reason: collision with root package name */
    public final float f98836k;

    /* renamed from: l, reason: collision with root package name */
    public final float f98837l;

    /* renamed from: m, reason: collision with root package name */
    public final int f98838m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f98839n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f98840o;

    /* renamed from: p, reason: collision with root package name */
    public final int f98841p;

    /* renamed from: q, reason: collision with root package name */
    public final int f98842q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f98843r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f98844s;

    public q(java.lang.CharSequence text, int i17, int i18, android.text.TextPaint paint, int i19, android.text.TextDirectionHeuristic textDir, android.text.Layout.Alignment alignment, int i27, android.text.TextUtils.TruncateAt truncateAt, int i28, float f17, float f18, int i29, boolean z17, boolean z18, int i37, int i38, int[] iArr, int[] iArr2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textDir, "textDir");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        this.f98826a = text;
        this.f98827b = i17;
        this.f98828c = i18;
        this.f98829d = paint;
        this.f98830e = i19;
        this.f98831f = textDir;
        this.f98832g = alignment;
        this.f98833h = i27;
        this.f98834i = truncateAt;
        this.f98835j = i28;
        this.f98836k = f17;
        this.f98837l = f18;
        this.f98838m = i29;
        this.f98839n = z17;
        this.f98840o = z18;
        this.f98841p = i37;
        this.f98842q = i38;
        this.f98843r = iArr;
        this.f98844s = iArr2;
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
