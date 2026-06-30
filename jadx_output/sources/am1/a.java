package am1;

/* loaded from: classes4.dex */
public abstract class a {
    public static final void a(android.view.ViewGroup viewGroup) {
        int childCount;
        if (viewGroup == null || (childCount = viewGroup.getChildCount()) < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof androidx.recyclerview.widget.RecyclerView) {
                childAt.setAccessibilityDelegate(null);
            } else if (childAt instanceof android.view.ViewGroup) {
                a((android.view.ViewGroup) childAt);
            }
            if (i17 == childCount) {
                return;
            } else {
                i17++;
            }
        }
    }
}
