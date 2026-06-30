package androidx.core.widget;

/* loaded from: classes15.dex */
public abstract class u {
    public static android.graphics.drawable.Drawable[] a(android.widget.TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int b(android.view.View view) {
        return view.getLayoutDirection();
    }

    public static int c(android.view.View view) {
        return view.getTextDirection();
    }

    public static java.util.Locale d(android.widget.TextView textView) {
        return textView.getTextLocale();
    }

    public static void e(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void f(android.widget.TextView textView, int i17, int i18, int i19, int i27) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i17, i18, i19, i27);
    }

    public static void g(android.widget.TextView textView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void h(android.view.View view, int i17) {
        view.setTextDirection(i17);
    }
}
