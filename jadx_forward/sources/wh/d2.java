package wh;

/* loaded from: classes12.dex */
public class d2 implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((wh.h2) obj).f527330b - ((wh.h2) obj2).f527330b;
        if (j17 == 0) {
            return 0;
        }
        return j17 > 0 ? -1 : 1;
    }
}
