package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f91235a;

    /* renamed from: b, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91236b;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91237c;

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91238d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91239e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91240f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 f91241g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u0 f91242h;

    /* renamed from: i, reason: collision with root package name */
    public int f91243i = 0;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Typeface f91244j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f91245k;

    public t0(android.widget.TextView textView) {
        this.f91235a = textView;
        this.f91242h = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u0(textView);
    }

    public static p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 c(android.content.Context context, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0 h0Var, int i17) {
        android.content.res.ColorStateList k17 = h0Var.k(context, i17);
        if (k17 == null) {
            return null;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2();
        o2Var.f91202d = true;
        o2Var.f91199a = k17;
        return o2Var;
    }

    public final void a(android.graphics.drawable.Drawable drawable, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var) {
        if (drawable == null || o2Var == null) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.m(drawable, o2Var, this.f91235a.getDrawableState());
    }

    public void b() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o2 o2Var = this.f91236b;
        android.widget.TextView textView = this.f91235a;
        if (o2Var != null || this.f91237c != null || this.f91238d != null || this.f91239e != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f91236b);
            a(compoundDrawables[1], this.f91237c);
            a(compoundDrawables[2], this.f91238d);
            a(compoundDrawables[3], this.f91239e);
        }
        if (this.f91240f == null && this.f91241g == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f91240f);
        a(compoundDrawablesRelative[2], this.f91241g);
    }

    public void d(android.util.AttributeSet attributeSet, int i17) {
        boolean z17;
        boolean z18;
        int i18;
        int resourceId;
        android.widget.TextView textView = this.f91235a;
        android.content.Context context = textView.getContext();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0 f17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h0.f();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 l17 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2.l(context, attributeSet, j.a.f377714i, i17, 0);
        int i19 = l17.i(0, -1);
        if (l17.k(3)) {
            this.f91236b = c(context, f17, l17.i(3, 0));
        }
        if (l17.k(1)) {
            this.f91237c = c(context, f17, l17.i(1, 0));
        }
        if (l17.k(4)) {
            this.f91238d = c(context, f17, l17.i(4, 0));
        }
        if (l17.k(2)) {
            this.f91239e = c(context, f17, l17.i(2, 0));
        }
        int i27 = android.os.Build.VERSION.SDK_INT;
        if (l17.k(5)) {
            this.f91240f = c(context, f17, l17.i(5, 0));
        }
        if (l17.k(6)) {
            this.f91241g = c(context, f17, l17.i(6, 0));
        }
        l17.m();
        boolean z19 = textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        int[] iArr = j.a.f377730y;
        if (i19 != -1) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 q2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2(context, context.obtainStyledAttributes(i19, iArr));
            if (z19 || !q2Var.k(12)) {
                z17 = false;
                z18 = false;
            } else {
                z17 = q2Var.a(12, false);
                z18 = true;
            }
            i(context, q2Var);
            q2Var.m();
        } else {
            z17 = false;
            z18 = false;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 q2Var2 = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2(context, context.obtainStyledAttributes(attributeSet, iArr, i17, 0));
        if (!z19 && q2Var2.k(12)) {
            z17 = q2Var2.a(12, false);
            z18 = true;
        }
        if (i27 >= 28 && q2Var2.k(0) && q2Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        i(context, q2Var2);
        q2Var2.m();
        if (!z19 && z18) {
            textView.setAllCaps(z17);
        }
        android.graphics.Typeface typeface = this.f91244j;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f91243i);
        }
        int[] iArr2 = j.a.f377715j;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u0 u0Var = this.f91242h;
        android.content.Context context2 = u0Var.f91259j;
        android.content.res.TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i17, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            u0Var.f91250a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            android.content.res.TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i28 = 0; i28 < length; i28++) {
                    iArr3[i28] = obtainTypedArray.getDimensionPixelSize(i28, -1);
                }
                u0Var.f91255f = u0Var.b(iArr3);
                u0Var.g();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!u0Var.h()) {
            u0Var.f91250a = 0;
        } else if (u0Var.f91250a == 1) {
            if (!u0Var.f91256g) {
                android.util.DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i18 = 2;
                    dimension2 = android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i18 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = android.util.TypedValue.applyDimension(i18, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                u0Var.i(dimension2, dimension3, dimension);
            }
            u0Var.f();
        }
        if (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.d.f92634d0 && u0Var.f91250a != 0) {
            int[] iArr4 = u0Var.f91255f;
            if (iArr4.length > 0) {
                if (textView.getAutoSizeStepGranularity() != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(java.lang.Math.round(u0Var.f91253d), java.lang.Math.round(u0Var.f91254e), java.lang.Math.round(u0Var.f91252c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(6, -1);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(8, -1);
        int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(9, -1);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.d(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.e(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.a0.f(textView, dimensionPixelSize3);
        }
    }

    public void e(android.content.Context context, int i17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 q2Var = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2(context, context.obtainStyledAttributes(i17, j.a.f377730y));
        boolean k17 = q2Var.k(12);
        android.widget.TextView textView = this.f91235a;
        if (k17) {
            textView.setAllCaps(q2Var.a(12, false));
        }
        if (q2Var.k(0) && q2Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        i(context, q2Var);
        q2Var.m();
        android.graphics.Typeface typeface = this.f91244j;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f91243i);
        }
    }

    public void f(int i17, int i18, int i19, int i27) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u0 u0Var = this.f91242h;
        if (u0Var.h()) {
            android.util.DisplayMetrics displayMetrics = u0Var.f91259j.getResources().getDisplayMetrics();
            u0Var.i(android.util.TypedValue.applyDimension(i27, i17, displayMetrics), android.util.TypedValue.applyDimension(i27, i18, displayMetrics), android.util.TypedValue.applyDimension(i27, i19, displayMetrics));
            if (u0Var.f()) {
                u0Var.a();
            }
        }
    }

    public void g(int[] iArr, int i17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u0 u0Var = this.f91242h;
        if (u0Var.h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i17 == 0) {
                    iArr2 = java.util.Arrays.copyOf(iArr, length);
                } else {
                    android.util.DisplayMetrics displayMetrics = u0Var.f91259j.getResources().getDisplayMetrics();
                    for (int i18 = 0; i18 < length; i18++) {
                        iArr2[i18] = java.lang.Math.round(android.util.TypedValue.applyDimension(i17, iArr[i18], displayMetrics));
                    }
                }
                u0Var.f91255f = u0Var.b(iArr2);
                if (!u0Var.g()) {
                    throw new java.lang.IllegalArgumentException("None of the preset sizes is valid: " + java.util.Arrays.toString(iArr));
                }
            } else {
                u0Var.f91256g = false;
            }
            if (u0Var.f()) {
                u0Var.a();
            }
        }
    }

    public void h(int i17) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.u0 u0Var = this.f91242h;
        if (u0Var.h()) {
            if (i17 == 0) {
                u0Var.f91250a = 0;
                u0Var.f91253d = -1.0f;
                u0Var.f91254e = -1.0f;
                u0Var.f91252c = -1.0f;
                u0Var.f91255f = new int[0];
                u0Var.f91251b = false;
                return;
            }
            if (i17 != 1) {
                throw new java.lang.IllegalArgumentException("Unknown auto-size text type: " + i17);
            }
            android.util.DisplayMetrics displayMetrics = u0Var.f91259j.getResources().getDisplayMetrics();
            u0Var.i(android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics), android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u0Var.f()) {
                u0Var.a();
            }
        }
    }

    public final void i(android.content.Context context, p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q2 q2Var) {
        java.lang.String string;
        this.f91243i = q2Var.h(2, this.f91243i);
        if (q2Var.k(10) || q2Var.k(11)) {
            this.f91244j = null;
            int i17 = q2Var.k(11) ? 11 : 10;
            if (!context.isRestricted()) {
                try {
                    android.graphics.Typeface g17 = q2Var.g(i17, this.f91243i, new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.s0(this, new java.lang.ref.WeakReference(this.f91235a)));
                    this.f91244j = g17;
                    this.f91245k = g17 == null;
                } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
                }
            }
            if (this.f91244j != null || (string = q2Var.f91226b.getString(i17)) == null) {
                return;
            }
            this.f91244j = android.graphics.Typeface.create(string, this.f91243i);
            return;
        }
        if (q2Var.k(1)) {
            this.f91245k = false;
            int h17 = q2Var.h(1, 1);
            if (h17 == 1) {
                this.f91244j = android.graphics.Typeface.SANS_SERIF;
            } else if (h17 == 2) {
                this.f91244j = android.graphics.Typeface.SERIF;
            } else {
                if (h17 != 3) {
                    return;
                }
                this.f91244j = android.graphics.Typeface.MONOSPACE;
            }
        }
    }
}
