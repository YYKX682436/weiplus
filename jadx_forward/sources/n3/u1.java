package n3;

/* loaded from: classes3.dex */
public abstract class u1 {
    public static final android.view.View a(android.view.ViewGroup viewGroup, int i17) {
        android.view.View childAt = viewGroup.getChildAt(i17);
        if (childAt != null) {
            return childAt;
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i17 + ", Size: " + viewGroup.getChildCount());
    }
}
