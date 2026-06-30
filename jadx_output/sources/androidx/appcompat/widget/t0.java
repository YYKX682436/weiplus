package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f9702a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9703b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9704c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9705d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9706e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9707f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.appcompat.widget.o2 f9708g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.appcompat.widget.u0 f9709h;

    /* renamed from: i, reason: collision with root package name */
    public int f9710i = 0;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Typeface f9711j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9712k;

    public t0(android.widget.TextView textView) {
        this.f9702a = textView;
        this.f9709h = new androidx.appcompat.widget.u0(textView);
    }

    public static androidx.appcompat.widget.o2 c(android.content.Context context, androidx.appcompat.widget.h0 h0Var, int i17) {
        android.content.res.ColorStateList k17 = h0Var.k(context, i17);
        if (k17 == null) {
            return null;
        }
        androidx.appcompat.widget.o2 o2Var = new androidx.appcompat.widget.o2();
        o2Var.f9669d = true;
        o2Var.f9666a = k17;
        return o2Var;
    }

    public final void a(android.graphics.drawable.Drawable drawable, androidx.appcompat.widget.o2 o2Var) {
        if (drawable == null || o2Var == null) {
            return;
        }
        androidx.appcompat.widget.h0.m(drawable, o2Var, this.f9702a.getDrawableState());
    }

    public void b() {
        androidx.appcompat.widget.o2 o2Var = this.f9703b;
        android.widget.TextView textView = this.f9702a;
        if (o2Var != null || this.f9704c != null || this.f9705d != null || this.f9706e != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f9703b);
            a(compoundDrawables[1], this.f9704c);
            a(compoundDrawables[2], this.f9705d);
            a(compoundDrawables[3], this.f9706e);
        }
        if (this.f9707f == null && this.f9708g == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f9707f);
        a(compoundDrawablesRelative[2], this.f9708g);
    }

    public void d(android.util.AttributeSet attributeSet, int i17) {
        boolean z17;
        boolean z18;
        int i18;
        int resourceId;
        android.widget.TextView textView = this.f9702a;
        android.content.Context context = textView.getContext();
        androidx.appcompat.widget.h0 f17 = androidx.appcompat.widget.h0.f();
        androidx.appcompat.widget.q2 l17 = androidx.appcompat.widget.q2.l(context, attributeSet, j.a.f296181i, i17, 0);
        int i19 = l17.i(0, -1);
        if (l17.k(3)) {
            this.f9703b = c(context, f17, l17.i(3, 0));
        }
        if (l17.k(1)) {
            this.f9704c = c(context, f17, l17.i(1, 0));
        }
        if (l17.k(4)) {
            this.f9705d = c(context, f17, l17.i(4, 0));
        }
        if (l17.k(2)) {
            this.f9706e = c(context, f17, l17.i(2, 0));
        }
        int i27 = android.os.Build.VERSION.SDK_INT;
        if (l17.k(5)) {
            this.f9707f = c(context, f17, l17.i(5, 0));
        }
        if (l17.k(6)) {
            this.f9708g = c(context, f17, l17.i(6, 0));
        }
        l17.m();
        boolean z19 = textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        int[] iArr = j.a.f296197y;
        if (i19 != -1) {
            androidx.appcompat.widget.q2 q2Var = new androidx.appcompat.widget.q2(context, context.obtainStyledAttributes(i19, iArr));
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
        androidx.appcompat.widget.q2 q2Var2 = new androidx.appcompat.widget.q2(context, context.obtainStyledAttributes(attributeSet, iArr, i17, 0));
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
        android.graphics.Typeface typeface = this.f9711j;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f9710i);
        }
        int[] iArr2 = j.a.f296182j;
        androidx.appcompat.widget.u0 u0Var = this.f9709h;
        android.content.Context context2 = u0Var.f9726j;
        android.content.res.TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i17, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            u0Var.f9717a = obtainStyledAttributes.getInt(5, 0);
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
                u0Var.f9722f = u0Var.b(iArr3);
                u0Var.g();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!u0Var.h()) {
            u0Var.f9717a = 0;
        } else if (u0Var.f9717a == 1) {
            if (!u0Var.f9723g) {
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
        if (androidx.core.widget.d.f11101d0 && u0Var.f9717a != 0) {
            int[] iArr4 = u0Var.f9722f;
            if (iArr4.length > 0) {
                if (textView.getAutoSizeStepGranularity() != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(java.lang.Math.round(u0Var.f9720d), java.lang.Math.round(u0Var.f9721e), java.lang.Math.round(u0Var.f9719c), 0);
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
            androidx.core.widget.a0.d(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            androidx.core.widget.a0.e(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            androidx.core.widget.a0.f(textView, dimensionPixelSize3);
        }
    }

    public void e(android.content.Context context, int i17) {
        androidx.appcompat.widget.q2 q2Var = new androidx.appcompat.widget.q2(context, context.obtainStyledAttributes(i17, j.a.f296197y));
        boolean k17 = q2Var.k(12);
        android.widget.TextView textView = this.f9702a;
        if (k17) {
            textView.setAllCaps(q2Var.a(12, false));
        }
        if (q2Var.k(0) && q2Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        i(context, q2Var);
        q2Var.m();
        android.graphics.Typeface typeface = this.f9711j;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f9710i);
        }
    }

    public void f(int i17, int i18, int i19, int i27) {
        androidx.appcompat.widget.u0 u0Var = this.f9709h;
        if (u0Var.h()) {
            android.util.DisplayMetrics displayMetrics = u0Var.f9726j.getResources().getDisplayMetrics();
            u0Var.i(android.util.TypedValue.applyDimension(i27, i17, displayMetrics), android.util.TypedValue.applyDimension(i27, i18, displayMetrics), android.util.TypedValue.applyDimension(i27, i19, displayMetrics));
            if (u0Var.f()) {
                u0Var.a();
            }
        }
    }

    public void g(int[] iArr, int i17) {
        androidx.appcompat.widget.u0 u0Var = this.f9709h;
        if (u0Var.h()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i17 == 0) {
                    iArr2 = java.util.Arrays.copyOf(iArr, length);
                } else {
                    android.util.DisplayMetrics displayMetrics = u0Var.f9726j.getResources().getDisplayMetrics();
                    for (int i18 = 0; i18 < length; i18++) {
                        iArr2[i18] = java.lang.Math.round(android.util.TypedValue.applyDimension(i17, iArr[i18], displayMetrics));
                    }
                }
                u0Var.f9722f = u0Var.b(iArr2);
                if (!u0Var.g()) {
                    throw new java.lang.IllegalArgumentException("None of the preset sizes is valid: " + java.util.Arrays.toString(iArr));
                }
            } else {
                u0Var.f9723g = false;
            }
            if (u0Var.f()) {
                u0Var.a();
            }
        }
    }

    public void h(int i17) {
        androidx.appcompat.widget.u0 u0Var = this.f9709h;
        if (u0Var.h()) {
            if (i17 == 0) {
                u0Var.f9717a = 0;
                u0Var.f9720d = -1.0f;
                u0Var.f9721e = -1.0f;
                u0Var.f9719c = -1.0f;
                u0Var.f9722f = new int[0];
                u0Var.f9718b = false;
                return;
            }
            if (i17 != 1) {
                throw new java.lang.IllegalArgumentException("Unknown auto-size text type: " + i17);
            }
            android.util.DisplayMetrics displayMetrics = u0Var.f9726j.getResources().getDisplayMetrics();
            u0Var.i(android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics), android.util.TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u0Var.f()) {
                u0Var.a();
            }
        }
    }

    public final void i(android.content.Context context, androidx.appcompat.widget.q2 q2Var) {
        java.lang.String string;
        this.f9710i = q2Var.h(2, this.f9710i);
        if (q2Var.k(10) || q2Var.k(11)) {
            this.f9711j = null;
            int i17 = q2Var.k(11) ? 11 : 10;
            if (!context.isRestricted()) {
                try {
                    android.graphics.Typeface g17 = q2Var.g(i17, this.f9710i, new androidx.appcompat.widget.s0(this, new java.lang.ref.WeakReference(this.f9702a)));
                    this.f9711j = g17;
                    this.f9712k = g17 == null;
                } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
                }
            }
            if (this.f9711j != null || (string = q2Var.f9693b.getString(i17)) == null) {
                return;
            }
            this.f9711j = android.graphics.Typeface.create(string, this.f9710i);
            return;
        }
        if (q2Var.k(1)) {
            this.f9712k = false;
            int h17 = q2Var.h(1, 1);
            if (h17 == 1) {
                this.f9711j = android.graphics.Typeface.SANS_SERIF;
            } else if (h17 == 2) {
                this.f9711j = android.graphics.Typeface.SERIF;
            } else {
                if (h17 != 3) {
                    return;
                }
                this.f9711j = android.graphics.Typeface.MONOSPACE;
            }
        }
    }
}
