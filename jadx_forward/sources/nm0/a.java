package nm0;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f419984a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f419985b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f419986c = -1;

    /* renamed from: d, reason: collision with root package name */
    public android.text.TextPaint f419987d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.text.Layout.Alignment f419988e = android.text.Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public android.text.TextUtils.TruncateAt f419989f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f419990g = 51;

    /* renamed from: h, reason: collision with root package name */
    public int f419991h = -1;

    /* renamed from: i, reason: collision with root package name */
    public float f419992i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f419993j = 1.1f;

    /* renamed from: k, reason: collision with root package name */
    public final int f419994k = -1;

    /* renamed from: l, reason: collision with root package name */
    public float f419995l = -1.0f;

    /* renamed from: m, reason: collision with root package name */
    public int f419996m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final int f419997n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f419998o = -1;

    /* renamed from: hashCode */
    public int m149766x8cdac1b() {
        int i17 = (this.f419984a * 31) + 0 + (this.f419986c * 31);
        android.text.TextPaint textPaint = this.f419987d;
        if (textPaint != null) {
            i17 += textPaint.hashCode() * 31;
        }
        int hashCode = i17 + (this.f419988e.hashCode() * 31);
        android.text.TextUtils.TruncateAt truncateAt = this.f419989f;
        if (truncateAt != null) {
            hashCode += truncateAt.hashCode() * 31;
        }
        return ((int) (((int) (((int) (hashCode + (this.f419990g * 31) + (this.f419991h * 31) + (this.f419992i * 31.0f))) + (this.f419993j * 31.0f))) + 0 + (this.f419994k * 31) + (this.f419995l * 31.0f))) + (this.f419996m * 31) + (this.f419997n * 31) + (this.f419998o * 31);
    }

    /* renamed from: toString */
    public java.lang.String m149767x9616526c() {
        return "" + java.lang.String.format("maxLines: %d ", java.lang.Integer.valueOf(this.f419984a)) + java.lang.String.format("maxLength: %d ", java.lang.Integer.valueOf(this.f419986c)) + java.lang.String.format("textPaint: %s ", this.f419987d) + java.lang.String.format("alignment: %s ", this.f419988e) + java.lang.String.format("ellipsize: %s ", this.f419989f) + java.lang.String.format("gravity: %s ", java.lang.Integer.valueOf(this.f419990g)) + java.lang.String.format("ellipsizeWidth: %s ", java.lang.Integer.valueOf(this.f419991h)) + java.lang.String.format("textDirection: %s ", null) + java.lang.String.format("spacingAdd: %s spacingMult: %s ", java.lang.Float.valueOf(this.f419992i), java.lang.Float.valueOf(this.f419993j)) + java.lang.String.format("includedPad: %b ", java.lang.Boolean.FALSE) + java.lang.String.format("typeface: %s ", null) + java.lang.String.format("fontStyle: %d ", java.lang.Integer.valueOf(this.f419994k)) + java.lang.String.format("textSize: %s ", java.lang.Float.valueOf(this.f419995l)) + java.lang.String.format("textColor: %d", java.lang.Integer.valueOf(this.f419996m)) + java.lang.String.format("linkColor: %d", java.lang.Integer.valueOf(this.f419997n)) + java.lang.String.format("breakStrategy: %d", java.lang.Integer.valueOf(this.f419998o));
    }
}
