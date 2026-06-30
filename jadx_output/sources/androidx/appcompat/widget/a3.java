package androidx.appcompat.widget;

/* loaded from: classes14.dex */
public abstract class a3 {
    public static void a(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        androidx.appcompat.widget.d3 d3Var = androidx.appcompat.widget.d3.f9549p;
        if (d3Var != null && d3Var.f9551d == view) {
            androidx.appcompat.widget.d3.b(null);
        }
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            new androidx.appcompat.widget.d3(view, charSequence);
            return;
        }
        androidx.appcompat.widget.d3 d3Var2 = androidx.appcompat.widget.d3.f9550q;
        if (d3Var2 != null && d3Var2.f9551d == view) {
            d3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
