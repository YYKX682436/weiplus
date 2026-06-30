package l3;

/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.TextPaint f396828a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.TextDirectionHeuristic f396829b;

    /* renamed from: c, reason: collision with root package name */
    public final int f396830c;

    /* renamed from: d, reason: collision with root package name */
    public final int f396831d;

    public d(android.text.TextPaint textPaint, android.text.TextDirectionHeuristic textDirectionHeuristic, int i17, int i18) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            new android.text.PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i17).setHyphenationFrequency(i18).setTextDirection(textDirectionHeuristic).build();
        }
        this.f396828a = textPaint;
        this.f396829b = textDirectionHeuristic;
        this.f396830c = i17;
        this.f396831d = i18;
    }

    /* renamed from: equals */
    public boolean m144965xb2c87fbf(java.lang.Object obj) {
        boolean z17;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l3.d)) {
            return false;
        }
        l3.d dVar = (l3.d) obj;
        if (this.f396830c == dVar.f396830c && this.f396831d == dVar.f396831d) {
            android.text.TextPaint textPaint = this.f396828a;
            float textSize = textPaint.getTextSize();
            android.text.TextPaint textPaint2 = dVar.f396828a;
            if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && android.text.TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null)) {
                z17 = true;
                return !z17 && this.f396829b == dVar.f396829b;
            }
        }
        z17 = false;
        if (z17) {
            return false;
        }
    }

    /* renamed from: hashCode */
    public int m144966x8cdac1b() {
        android.text.TextPaint textPaint = this.f396828a;
        return m3.c.b(java.lang.Float.valueOf(textPaint.getTextSize()), java.lang.Float.valueOf(textPaint.getTextScaleX()), java.lang.Float.valueOf(textPaint.getTextSkewX()), java.lang.Float.valueOf(textPaint.getLetterSpacing()), java.lang.Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), java.lang.Boolean.valueOf(textPaint.isElegantTextHeight()), this.f396829b, java.lang.Integer.valueOf(this.f396830c), java.lang.Integer.valueOf(this.f396831d));
    }

    /* renamed from: toString */
    public java.lang.String m144967x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("textSize=");
        android.text.TextPaint textPaint = this.f396828a;
        sb7.append(textPaint.getTextSize());
        sb6.append(sb7.toString());
        sb6.append(", textScaleX=" + textPaint.getTextScaleX());
        sb6.append(", textSkewX=" + textPaint.getTextSkewX());
        int i17 = android.os.Build.VERSION.SDK_INT;
        sb6.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb6.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb6.append(", textLocale=" + textPaint.getTextLocales());
        sb6.append(", typeface=" + textPaint.getTypeface());
        if (i17 >= 26) {
            sb6.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb6.append(", textDir=" + this.f396829b);
        sb6.append(", breakStrategy=" + this.f396830c);
        sb6.append(", hyphenationFrequency=" + this.f396831d);
        sb6.append("}");
        return sb6.toString();
    }

    public d(android.text.PrecomputedText.Params params) {
        this.f396828a = params.getTextPaint();
        this.f396829b = params.getTextDirection();
        this.f396830c = params.getBreakStrategy();
        this.f396831d = params.getHyphenationFrequency();
    }
}
