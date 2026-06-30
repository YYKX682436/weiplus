package androidx.viewpager.widget;

/* loaded from: classes15.dex */
public final class f implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((androidx.viewpager.widget.ViewPager.ItemInfo) obj).position - ((androidx.viewpager.widget.ViewPager.ItemInfo) obj2).position;
    }
}
