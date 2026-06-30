package s53;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f484702a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.TextPaint f484703b;

    /* renamed from: c, reason: collision with root package name */
    public float f484704c;

    /* renamed from: d, reason: collision with root package name */
    public int f484705d;

    /* renamed from: e, reason: collision with root package name */
    public float f484706e;

    /* renamed from: f, reason: collision with root package name */
    public float f484707f;

    /* renamed from: g, reason: collision with root package name */
    public float f484708g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f484709h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f484710i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.ArrayList f484711j;

    /* renamed from: k, reason: collision with root package name */
    public final android.text.TextWatcher f484712k = new s53.c(this, null);

    public e(android.widget.TextView textView) {
        float f17 = textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        this.f484702a = textView;
        this.f484703b = new android.text.TextPaint();
        float textSize = textView.getTextSize();
        if (this.f484704c != textSize) {
            this.f484704c = textSize;
        }
        android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
        this.f484705d = (transformationMethod == null || !(transformationMethod instanceof android.text.method.SingleLineTransformationMethod)) ? textView.getMaxLines() : 1;
        this.f484706e = f17 * 8.0f;
        this.f484707f = this.f484704c;
        this.f484708g = 0.5f;
    }

    public static float b(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, float f17, int i17, float f18, float f19, float f27, android.util.DisplayMetrics displayMetrics) {
        android.text.StaticLayout staticLayout;
        int i18;
        float f28;
        float f29 = (f18 + f19) / 2.0f;
        textPaint.setTextSize(android.util.TypedValue.applyDimension(0, f29, displayMetrics));
        if (i17 != 1) {
            staticLayout = new android.text.StaticLayout(charSequence, textPaint, (int) f17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            i18 = staticLayout.getLineCount();
        } else {
            staticLayout = null;
            i18 = 1;
        }
        if (i18 > i17) {
            return f19 - f18 < f27 ? f18 : b(charSequence, textPaint, f17, i17, f18, f29, f27, displayMetrics);
        }
        if (i18 < i17) {
            return b(charSequence, textPaint, f17, i17, f29, f19, f27, displayMetrics);
        }
        if (i17 == 1) {
            f28 = textPaint.measureText(charSequence, 0, charSequence.length());
        } else {
            float f37 = 0.0f;
            for (int i19 = 0; i19 < i18; i19++) {
                if (staticLayout.getLineWidth(i19) > f37) {
                    f37 = staticLayout.getLineWidth(i19);
                }
            }
            f28 = f37;
        }
        return f19 - f18 < f27 ? f18 : f28 > f17 ? b(charSequence, textPaint, f17, i17, f18, f29, f27, displayMetrics) : f28 < f17 ? b(charSequence, textPaint, f17, i17, f29, f19, f27, displayMetrics) : f29;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s53.e.a():void");
    }

    public s53.e c(boolean z17) {
        if (this.f484709h != z17) {
            this.f484709h = z17;
            android.text.TextWatcher textWatcher = this.f484712k;
            android.widget.TextView textView = this.f484702a;
            if (z17) {
                textView.addTextChangedListener(textWatcher);
                a();
            } else {
                textView.removeTextChangedListener(textWatcher);
                textView.setTextSize(0, this.f484704c);
            }
        }
        return this;
    }

    public s53.e d(int i17, float f17) {
        android.content.Context context = this.f484702a.getContext();
        android.content.res.Resources system = android.content.res.Resources.getSystem();
        if (context != null) {
            system = context.getResources();
        }
        float applyDimension = android.util.TypedValue.applyDimension(i17, f17, system.getDisplayMetrics());
        if (applyDimension != this.f484706e) {
            this.f484706e = applyDimension;
            a();
        }
        return this;
    }
}
