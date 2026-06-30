package t9;

/* loaded from: classes15.dex */
public final class v implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        float f17 = ((t9.w) obj).f498083c;
        float f18 = ((t9.w) obj2).f498083c;
        if (f17 < f18) {
            return -1;
        }
        return f18 < f17 ? 1 : 0;
    }
}
