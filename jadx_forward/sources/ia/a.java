package ia;

/* loaded from: classes13.dex */
public abstract class a {
    public static android.content.res.ColorStateList a(android.content.Context context, android.content.res.TypedArray typedArray, int i17) {
        int resourceId;
        if (typedArray.hasValue(i17) && (resourceId = typedArray.getResourceId(i17, 0)) != 0) {
            java.lang.Object obj = k.a.f384389a;
            android.content.res.ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i17);
    }

    public static android.graphics.drawable.Drawable b(android.content.Context context, android.content.res.TypedArray typedArray, int i17) {
        int resourceId;
        android.graphics.drawable.Drawable a17;
        return (!typedArray.hasValue(i17) || (resourceId = typedArray.getResourceId(i17, 0)) == 0 || (a17 = k.a.a(context, resourceId)) == null) ? typedArray.getDrawable(i17) : a17;
    }
}
