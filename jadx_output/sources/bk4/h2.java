package bk4;

/* loaded from: classes3.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.h2 f21482a = new bk4.h2();

    public final void a(android.view.View view, int i17, java.util.Map oriMap) {
        kotlin.jvm.internal.o.g(oriMap, "oriMap");
        if (view == null) {
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                a(viewGroup.getChildAt(i18), i17, oriMap);
            }
            return;
        }
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (i17 != textView.getTextColors().getDefaultColor()) {
                android.content.res.ColorStateList textColors = textView.getTextColors();
                kotlin.jvm.internal.o.f(textColors, "getTextColors(...)");
                oriMap.put(view, textColors);
            }
            textView.setTextColor(i17);
        }
    }

    public final void b(android.content.Context context, android.widget.TextView textView, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (textView != null) {
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            textView.setTextSize(1, (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
        }
    }
}
