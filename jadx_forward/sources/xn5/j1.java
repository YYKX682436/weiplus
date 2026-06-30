package xn5;

/* loaded from: classes5.dex */
public abstract class j1 {
    public static int a(android.content.Context context, int i17) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        android.content.res.Resources.Theme theme = context.getTheme();
        theme.resolveAttribute(i17, typedValue, true);
        android.content.res.TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(typedValue.resourceId, new int[]{i17});
        try {
            return obtainStyledAttributes.getResourceId(0, 0);
        } catch (java.lang.Exception unused) {
            obtainStyledAttributes.recycle();
            return 0;
        }
    }
}
