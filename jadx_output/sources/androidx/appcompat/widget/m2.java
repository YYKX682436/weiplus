package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public abstract class m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f9648a = new java.lang.ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9649b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9650c = {android.R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9651d = {android.R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9652e = {android.R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f9653f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f9654g = new int[1];

    public static int a(android.content.Context context, int i17) {
        android.content.res.ColorStateList c17 = c(context, i17);
        if (c17 != null && c17.isStateful()) {
            return c17.getColorForState(f9649b, c17.getDefaultColor());
        }
        java.lang.ThreadLocal threadLocal = f9648a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f17 = typedValue.getFloat();
        return e3.b.i(b(context, i17), java.lang.Math.round(android.graphics.Color.alpha(r4) * f17));
    }

    public static int b(android.content.Context context, int i17) {
        int[] iArr = f9654g;
        iArr[0] = i17;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static android.content.res.ColorStateList c(android.content.Context context, int i17) {
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f9654g;
        iArr[0] = i17;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                java.lang.Object obj = k.a.f302856a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
