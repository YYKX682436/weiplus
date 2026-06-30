package x4;

/* loaded from: classes.dex */
public abstract class b {
    public static android.view.View a(android.view.View view, int i17) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View findViewById = viewGroup.getChildAt(i18).findViewById(i17);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }
}
