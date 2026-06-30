package rp;

/* loaded from: classes.dex */
public class d implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Integer) ((android.util.Pair) obj2).second).intValue() - ((java.lang.Integer) ((android.util.Pair) obj).second).intValue();
    }
}
