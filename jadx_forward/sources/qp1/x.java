package qp1;

/* loaded from: classes14.dex */
public class x implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) obj2;
        boolean z17 = c12886x91aa2b6d.I;
        if (z17 && !c12886x91aa2b6d2.I) {
            return 1;
        }
        if (z17 || !c12886x91aa2b6d2.I) {
            long j17 = c12886x91aa2b6d.C;
            long j18 = c12886x91aa2b6d2.C;
            if (j17 <= j18) {
                return j17 < j18 ? 1 : 0;
            }
        }
        return -1;
    }
}
