package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes14.dex */
public abstract class a3 {
    public static void a(android.view.View view, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3 d3Var = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3.f91082p;
        if (d3Var != null && d3Var.f91084d == view) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3.b(null);
        }
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3(view, charSequence);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3 d3Var2 = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.d3.f91083q;
        if (d3Var2 != null && d3Var2.f91084d == view) {
            d3Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
