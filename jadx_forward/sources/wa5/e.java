package wa5;

/* loaded from: classes5.dex */
public abstract class e {
    public static final java.util.List a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        b(view, linkedList);
        if (linkedList.size() > 0) {
            return linkedList;
        }
        return null;
    }

    public static final void b(android.view.View view, java.util.List list) {
        if (view.getVisibility() == 0) {
            java.lang.String transitionName = view.getTransitionName();
            if (!(transitionName == null || r26.n0.N(transitionName))) {
                android.util.Pair create = android.util.Pair.create(view, view.getTransitionName());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
                list.add(create);
            }
        }
        if ((view.getVisibility() == 0) && (view instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                b(viewGroup.getChildAt(i17), list);
            }
        }
    }
}
