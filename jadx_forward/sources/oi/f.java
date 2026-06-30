package oi;

/* loaded from: classes12.dex */
public class f implements java.util.Comparator {
    public f(oi.h hVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((oi.c) obj2).f427080d - ((oi.c) obj).f427080d;
        if (j17 > 0) {
            return 1;
        }
        return j17 == 0 ? 0 : -1;
    }
}
