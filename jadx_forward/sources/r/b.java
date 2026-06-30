package r;

/* loaded from: classes16.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.View root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        android.content.Context context = root.getContext();
        if (context == null) {
            return;
        }
        try {
            float q17 = i65.a.q(context);
            if (java.lang.Math.abs(q17 - 1.0f) < 0.001f) {
                return;
            }
            float g17 = i65.a.g(context);
            if (g17 <= 0.0f) {
                return;
            }
            b(root, q17, g17);
        } catch (java.lang.Throwable unused) {
        }
    }

    public final void b(android.view.View view, float f17, float f18) {
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            textView.setTextSize(1, (textView.getTextSize() * f17) / f18);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(childAt, "getChildAt(...)");
                b(childAt, f17, f18);
            }
        }
    }
}
