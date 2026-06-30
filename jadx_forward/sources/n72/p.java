package n72;

/* loaded from: classes14.dex */
public class p implements java.util.Comparator {
    public p(n72.c cVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.hardware.Camera.Size size = (android.hardware.Camera.Size) obj;
        android.hardware.Camera.Size size2 = (android.hardware.Camera.Size) obj2;
        int i17 = size.height * size.width;
        int i18 = size2.height * size2.width;
        if (i18 < i17) {
            return -1;
        }
        return i18 > i17 ? 1 : 0;
    }
}
