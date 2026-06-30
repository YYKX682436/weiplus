package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public class q implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        androidx.viewpager.widget.ViewPager.LayoutParams layoutParams = (androidx.viewpager.widget.ViewPager.LayoutParams) ((android.view.View) obj).getLayoutParams();
        androidx.viewpager.widget.ViewPager.LayoutParams layoutParams2 = (androidx.viewpager.widget.ViewPager.LayoutParams) ((android.view.View) obj2).getLayoutParams();
        boolean z17 = layoutParams.f12423a;
        return z17 != layoutParams2.f12423a ? z17 ? 1 : -1 : layoutParams.f12427e - layoutParams2.f12427e;
    }
}
