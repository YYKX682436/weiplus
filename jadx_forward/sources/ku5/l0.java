package ku5;

/* loaded from: classes12.dex */
public class l0 implements java.util.Comparator {
    public l0(ku5.t0 t0Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Integer.compare(((java.lang.Integer) ((android.util.Pair) obj2).second).intValue(), ((java.lang.Integer) ((android.util.Pair) obj).second).intValue());
    }
}
