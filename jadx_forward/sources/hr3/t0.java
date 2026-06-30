package hr3;

/* loaded from: classes11.dex */
public class t0 implements java.util.Comparator {
    public t0(hr3.s0 s0Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((p13.y) obj2).f432721f;
        long j18 = ((p13.y) obj).f432721f;
        if (j17 > j18) {
            return 1;
        }
        return j17 < j18 ? -1 : 0;
    }
}
