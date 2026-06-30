package al5;

/* loaded from: classes8.dex */
public final class j4 {
    public j4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.view.ViewGroup root, java.util.List out) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        int childCount = root.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = root.getChildAt(i17);
            if (childAt != null && childAt.getVisibility() != 8 && childAt.getWidth() >= root.getWidth() * 0.7d && childAt.getHeight() >= root.getHeight() * 0.5d) {
                if (b(childAt)) {
                    if (childAt.getVisibility() == 0) {
                        out.add(childAt);
                    }
                } else if (childAt.getVisibility() == 0 && (childAt instanceof android.view.ViewGroup)) {
                    a((android.view.ViewGroup) childAt, out);
                }
            }
        }
    }

    public final boolean b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if ((view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView)) {
            return true;
        }
        for (java.lang.Class<?> cls = view.getClass(); cls != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls, android.view.View.class); cls = cls.getSuperclass()) {
            java.lang.String name = cls.getName();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "androidx.recyclerview.widget.RecyclerView") ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "androidx.core.widget.NestedScrollView")) {
                return true;
            }
        }
        return false;
    }
}
