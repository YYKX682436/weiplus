package x2;

/* loaded from: classes14.dex */
public class d implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        float m17 = n3.a1.m((android.view.View) obj);
        float m18 = n3.a1.m((android.view.View) obj2);
        if (m17 > m18) {
            return -1;
        }
        return m17 < m18 ? 1 : 0;
    }
}
