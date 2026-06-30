package al5;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final al5.n f5961a = new al5.n();

    public final void a(android.view.View view, int i17, int i18, java.util.List list) {
        if (view.getVisibility() == 0) {
            if ((view.getAlpha() == 0.0f) || view.getWidth() <= 0 || view.getHeight() <= 0) {
                return;
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i19 = iArr[0];
            if (new android.graphics.Rect(i19, iArr[1], view.getWidth() + i19, iArr[1] + view.getHeight()).contains(i17, i18)) {
                list.add(view);
                if (view instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i27 = 0; i27 < childCount; i27++) {
                        android.view.View childAt = viewGroup.getChildAt(i27);
                        if (childAt != null) {
                            a(childAt, i17, i18, list);
                        }
                    }
                }
            }
        }
    }
}
