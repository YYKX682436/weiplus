package f3;

/* loaded from: classes13.dex */
public abstract class a {
    public static int a(android.graphics.drawable.Drawable drawable) {
        return drawable.getAlpha();
    }

    public static android.graphics.drawable.Drawable b(android.graphics.drawable.DrawableContainer.DrawableContainerState drawableContainerState, int i17) {
        return drawableContainerState.getChild(i17);
    }

    public static android.graphics.drawable.Drawable c(android.graphics.drawable.InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    public static boolean d(android.graphics.drawable.Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void e(android.graphics.drawable.Drawable drawable, boolean z17) {
        drawable.setAutoMirrored(z17);
    }
}
