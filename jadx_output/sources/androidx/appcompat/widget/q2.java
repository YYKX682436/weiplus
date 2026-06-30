package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f9692a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.res.TypedArray f9693b;

    /* renamed from: c, reason: collision with root package name */
    public android.util.TypedValue f9694c;

    public q2(android.content.Context context, android.content.res.TypedArray typedArray) {
        this.f9692a = context;
        this.f9693b = typedArray;
    }

    public static androidx.appcompat.widget.q2 l(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i17, int i18) {
        return new androidx.appcompat.widget.q2(context, context.obtainStyledAttributes(attributeSet, iArr, i17, i18));
    }

    public boolean a(int i17, boolean z17) {
        return this.f9693b.getBoolean(i17, z17);
    }

    public android.content.res.ColorStateList b(int i17) {
        int resourceId;
        android.content.res.TypedArray typedArray = this.f9693b;
        if (typedArray.hasValue(i17) && (resourceId = typedArray.getResourceId(i17, 0)) != 0) {
            java.lang.Object obj = k.a.f302856a;
            android.content.res.ColorStateList colorStateList = this.f9692a.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i17);
    }

    public int c(int i17, int i18) {
        return this.f9693b.getDimensionPixelOffset(i17, i18);
    }

    public int d(int i17, int i18) {
        return this.f9693b.getDimensionPixelSize(i17, i18);
    }

    public android.graphics.drawable.Drawable e(int i17) {
        int resourceId;
        android.content.res.TypedArray typedArray = this.f9693b;
        return (!typedArray.hasValue(i17) || (resourceId = typedArray.getResourceId(i17, 0)) == 0) ? typedArray.getDrawable(i17) : k.a.a(this.f9692a, resourceId);
    }

    public android.graphics.drawable.Drawable f(int i17) {
        int resourceId;
        android.content.res.TypedArray typedArray = this.f9693b;
        if (!typedArray.hasValue(i17) || (resourceId = typedArray.getResourceId(i17, 0)) == 0) {
            return null;
        }
        return androidx.appcompat.widget.h0.f().i(this.f9692a, resourceId, true);
    }

    public android.graphics.Typeface g(int i17, int i18, d3.p pVar) {
        int resourceId = this.f9693b.getResourceId(i17, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f9694c == null) {
            this.f9694c = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.f9694c;
        java.lang.ThreadLocal threadLocal = d3.q.f226108a;
        android.content.Context context = this.f9692a;
        if (context.isRestricted()) {
            return null;
        }
        return d3.q.b(context, resourceId, typedValue, i18, pVar, null, true, false);
    }

    public int h(int i17, int i18) {
        return this.f9693b.getInt(i17, i18);
    }

    public int i(int i17, int i18) {
        return this.f9693b.getResourceId(i17, i18);
    }

    public java.lang.CharSequence j(int i17) {
        return this.f9693b.getText(i17);
    }

    public boolean k(int i17) {
        return this.f9693b.hasValue(i17);
    }

    public void m() {
        this.f9693b.recycle();
    }
}
