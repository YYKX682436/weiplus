package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class u0 {

    /* renamed from: k, reason: collision with root package name */
    public static final android.graphics.RectF f91248k = new android.graphics.RectF();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f91249l = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f91250a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f91251b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f91252c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f91253d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f91254e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f91255f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f91256g = false;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f91257h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f91258i;

    /* renamed from: j, reason: collision with root package name */
    public final android.content.Context f91259j;

    public u0(android.widget.TextView textView) {
        this.f91258i = textView;
        this.f91259j = textView.getContext();
    }

    public void a() {
        if (h() && this.f91250a != 0) {
            if (this.f91251b) {
                if (this.f91258i.getMeasuredHeight() <= 0 || this.f91258i.getMeasuredWidth() <= 0) {
                    return;
                }
                android.widget.TextView textView = this.f91258i;
                java.lang.Object obj = java.lang.Boolean.FALSE;
                try {
                    obj = d("getHorizontallyScrolling").invoke(textView, new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                }
                int measuredWidth = ((java.lang.Boolean) obj).booleanValue() ? 1048576 : (this.f91258i.getMeasuredWidth() - this.f91258i.getTotalPaddingLeft()) - this.f91258i.getTotalPaddingRight();
                int height = (this.f91258i.getHeight() - this.f91258i.getCompoundPaddingBottom()) - this.f91258i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                android.graphics.RectF rectF = f91248k;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float c17 = c(rectF);
                    if (c17 != this.f91258i.getTextSize()) {
                        e(0, c17);
                    }
                }
            }
            this.f91251b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        java.util.Arrays.sort(iArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 : iArr) {
            if (i17 > 0 && java.util.Collections.binarySearch(arrayList, java.lang.Integer.valueOf(i17)) < 0) {
                arrayList.add(java.lang.Integer.valueOf(i17));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i18 = 0; i18 < size; i18++) {
            iArr2[i18] = ((java.lang.Integer) arrayList.get(i18)).intValue();
        }
        return iArr2;
    }

    public final int c(android.graphics.RectF rectF) {
        java.lang.CharSequence transformation;
        int length = this.f91255f.length;
        if (length == 0) {
            throw new java.lang.IllegalStateException("No available text sizes to choose from.");
        }
        int i17 = length - 1;
        int i18 = 1;
        int i19 = 0;
        while (i18 <= i17) {
            int i27 = (i18 + i17) / 2;
            int i28 = this.f91255f[i27];
            android.widget.TextView textView = this.f91258i;
            java.lang.CharSequence text = textView.getText();
            android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            android.text.TextPaint textPaint = this.f91257h;
            if (textPaint == null) {
                this.f91257h = new android.text.TextPaint();
            } else {
                textPaint.reset();
            }
            this.f91257h.set(textView.getPaint());
            this.f91257h.setTextSize(i28);
            java.lang.Object obj = android.text.Layout.Alignment.ALIGN_NORMAL;
            try {
                obj = d("getLayoutAlignment").invoke(textView, new java.lang.Object[0]);
            } catch (java.lang.Exception unused) {
            }
            android.text.Layout.Alignment alignment = (android.text.Layout.Alignment) obj;
            int round = java.lang.Math.round(rectF.right);
            java.lang.Object obj2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
            try {
                obj2 = d("getTextDirectionHeuristic").invoke(textView, new java.lang.Object[0]);
            } catch (java.lang.Exception unused2) {
            }
            android.text.StaticLayout build = android.text.StaticLayout.Builder.obtain(text, 0, text.length(), this.f91257h, round).setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines).setTextDirection((android.text.TextDirectionHeuristic) obj2).build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                int i29 = i27 + 1;
                i19 = i18;
                i18 = i29;
            } else {
                i19 = i27 - 1;
                i17 = i19;
            }
        }
        return this.f91255f[i19];
    }

    public final java.lang.reflect.Method d(java.lang.String str) {
        try {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f91249l;
            java.lang.reflect.Method method = (java.lang.reflect.Method) concurrentHashMap.get(str);
            if (method == null && (method = android.widget.TextView.class.getDeclaredMethod(str, new java.lang.Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public void e(int i17, float f17) {
        android.content.Context context = this.f91259j;
        float applyDimension = android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
        android.widget.TextView textView = this.f91258i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f91251b = false;
                try {
                    java.lang.reflect.Method d17 = d("nullLayouts");
                    if (d17 != null) {
                        d17.invoke(textView, new java.lang.Object[0]);
                    }
                } catch (java.lang.Exception unused) {
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean f() {
        if (h() && this.f91250a == 1) {
            if (!this.f91256g || this.f91255f.length == 0) {
                float round = java.lang.Math.round(this.f91253d);
                int i17 = 1;
                while (java.lang.Math.round(this.f91252c + round) <= java.lang.Math.round(this.f91254e)) {
                    i17++;
                    round += this.f91252c;
                }
                int[] iArr = new int[i17];
                float f17 = this.f91253d;
                for (int i18 = 0; i18 < i17; i18++) {
                    iArr[i18] = java.lang.Math.round(f17);
                    f17 += this.f91252c;
                }
                this.f91255f = b(iArr);
            }
            this.f91251b = true;
        } else {
            this.f91251b = false;
        }
        return this.f91251b;
    }

    public final boolean g() {
        boolean z17 = this.f91255f.length > 0;
        this.f91256g = z17;
        if (z17) {
            this.f91250a = 1;
            this.f91253d = r0[0];
            this.f91254e = r0[r1 - 1];
            this.f91252c = -1.0f;
        }
        return z17;
    }

    public final boolean h() {
        return !(this.f91258i instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0083x8fabc05a);
    }

    public final void i(float f17, float f18, float f19) {
        if (f17 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + f17 + "px) is less or equal to (0px)");
        }
        if (f18 <= f17) {
            throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + f18 + "px) is less or equal to minimum auto-size text size (" + f17 + "px)");
        }
        if (f19 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + f19 + "px) is less or equal to (0px)");
        }
        this.f91250a = 1;
        this.f91253d = f17;
        this.f91254e = f18;
        this.f91252c = f19;
        this.f91256g = false;
    }
}
