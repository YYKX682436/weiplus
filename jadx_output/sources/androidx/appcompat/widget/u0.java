package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class u0 {

    /* renamed from: k, reason: collision with root package name */
    public static final android.graphics.RectF f9715k = new android.graphics.RectF();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f9716l = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f9717a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9718b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f9719c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f9720d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f9721e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f9722f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f9723g = false;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f9724h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f9725i;

    /* renamed from: j, reason: collision with root package name */
    public final android.content.Context f9726j;

    public u0(android.widget.TextView textView) {
        this.f9725i = textView;
        this.f9726j = textView.getContext();
    }

    public void a() {
        if (h() && this.f9717a != 0) {
            if (this.f9718b) {
                if (this.f9725i.getMeasuredHeight() <= 0 || this.f9725i.getMeasuredWidth() <= 0) {
                    return;
                }
                android.widget.TextView textView = this.f9725i;
                java.lang.Object obj = java.lang.Boolean.FALSE;
                try {
                    obj = d("getHorizontallyScrolling").invoke(textView, new java.lang.Object[0]);
                } catch (java.lang.Exception unused) {
                }
                int measuredWidth = ((java.lang.Boolean) obj).booleanValue() ? 1048576 : (this.f9725i.getMeasuredWidth() - this.f9725i.getTotalPaddingLeft()) - this.f9725i.getTotalPaddingRight();
                int height = (this.f9725i.getHeight() - this.f9725i.getCompoundPaddingBottom()) - this.f9725i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                android.graphics.RectF rectF = f9715k;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float c17 = c(rectF);
                    if (c17 != this.f9725i.getTextSize()) {
                        e(0, c17);
                    }
                }
            }
            this.f9718b = true;
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
        int length = this.f9722f.length;
        if (length == 0) {
            throw new java.lang.IllegalStateException("No available text sizes to choose from.");
        }
        int i17 = length - 1;
        int i18 = 1;
        int i19 = 0;
        while (i18 <= i17) {
            int i27 = (i18 + i17) / 2;
            int i28 = this.f9722f[i27];
            android.widget.TextView textView = this.f9725i;
            java.lang.CharSequence text = textView.getText();
            android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            android.text.TextPaint textPaint = this.f9724h;
            if (textPaint == null) {
                this.f9724h = new android.text.TextPaint();
            } else {
                textPaint.reset();
            }
            this.f9724h.set(textView.getPaint());
            this.f9724h.setTextSize(i28);
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
            android.text.StaticLayout build = android.text.StaticLayout.Builder.obtain(text, 0, text.length(), this.f9724h, round).setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines).setTextDirection((android.text.TextDirectionHeuristic) obj2).build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                int i29 = i27 + 1;
                i19 = i18;
                i18 = i29;
            } else {
                i19 = i27 - 1;
                i17 = i19;
            }
        }
        return this.f9722f[i19];
    }

    public final java.lang.reflect.Method d(java.lang.String str) {
        try {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f9716l;
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
        android.content.Context context = this.f9726j;
        float applyDimension = android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
        android.widget.TextView textView = this.f9725i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f9718b = false;
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
        if (h() && this.f9717a == 1) {
            if (!this.f9723g || this.f9722f.length == 0) {
                float round = java.lang.Math.round(this.f9720d);
                int i17 = 1;
                while (java.lang.Math.round(this.f9719c + round) <= java.lang.Math.round(this.f9721e)) {
                    i17++;
                    round += this.f9719c;
                }
                int[] iArr = new int[i17];
                float f17 = this.f9720d;
                for (int i18 = 0; i18 < i17; i18++) {
                    iArr[i18] = java.lang.Math.round(f17);
                    f17 += this.f9719c;
                }
                this.f9722f = b(iArr);
            }
            this.f9718b = true;
        } else {
            this.f9718b = false;
        }
        return this.f9718b;
    }

    public final boolean g() {
        boolean z17 = this.f9722f.length > 0;
        this.f9723g = z17;
        if (z17) {
            this.f9717a = 1;
            this.f9720d = r0[0];
            this.f9721e = r0[r1 - 1];
            this.f9719c = -1.0f;
        }
        return z17;
    }

    public final boolean h() {
        return !(this.f9725i instanceof androidx.appcompat.widget.AppCompatEditText);
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
        this.f9717a = 1;
        this.f9720d = f17;
        this.f9721e = f18;
        this.f9719c = f19;
        this.f9723g = false;
    }
}
