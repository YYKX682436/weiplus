package bw1;

/* loaded from: classes2.dex */
public final /* synthetic */ class l$$a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.util.Pair pair = (android.util.Pair) obj;
        android.util.Pair pair2 = (android.util.Pair) obj2;
        int compare = java.lang.Long.compare(((java.lang.Long) pair.second).longValue(), ((java.lang.Long) pair2.second).longValue());
        return compare != 0 ? compare : ((java.lang.String) pair.first).compareTo((java.lang.String) pair2.first);
    }
}
