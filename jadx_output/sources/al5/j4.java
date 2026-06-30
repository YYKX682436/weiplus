package al5;

/* loaded from: classes8.dex */
public final class j4 {
    public j4(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.view.ViewGroup root, java.util.List out) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(out, "out");
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
        kotlin.jvm.internal.o.g(view, "view");
        if ((view instanceof android.widget.AbsListView) || (view instanceof android.widget.ScrollView)) {
            return true;
        }
        for (java.lang.Class<?> cls = view.getClass(); cls != null && !kotlin.jvm.internal.o.b(cls, android.view.View.class); cls = cls.getSuperclass()) {
            java.lang.String name = cls.getName();
            if (kotlin.jvm.internal.o.b(name, "androidx.recyclerview.widget.RecyclerView") ? true : kotlin.jvm.internal.o.b(name, "androidx.core.widget.NestedScrollView")) {
                return true;
            }
        }
        return false;
    }
}
