package bg5;

/* loaded from: classes.dex */
public final class a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b((java.lang.Comparable) ((java.util.Map.Entry) obj2).getValue(), (java.lang.Comparable) ((java.util.Map.Entry) obj).getValue());
    }
}
