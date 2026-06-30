package y22;

/* loaded from: classes10.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f540638a = {-1, -16777216, -314573, -12493, -4920114, -4724993, -144437};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f540639b = {-16777216, -1, -15616, -2724096, -16339626, -15954996, -298125};

    public static final int a(int i17) {
        int V = kz5.z.V(f540638a, i17);
        if (V < 0) {
            return -16777216;
        }
        return f540639b[V];
    }

    public static final int b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        return view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
    }

    public static final int c(android.view.View view) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        android.content.res.Resources resources = view.getContext().getResources();
        android.content.Context context = view.getContext();
        if (context == null) {
            i17 = 0;
        } else {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559821fs, typedValue, true);
            i17 = typedValue.resourceId;
        }
        return resources.getColor(i17);
    }

    public static final void d(android.widget.ImageView imageView, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<this>");
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), i17, i18));
    }
}
