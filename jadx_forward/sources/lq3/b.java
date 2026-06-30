package lq3;

/* loaded from: classes12.dex */
public class b implements java.util.Comparator {
    public b(lq3.c cVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Double) ((java.util.Map.Entry) obj2).getValue()).compareTo((java.lang.Double) ((java.util.Map.Entry) obj).getValue());
    }
}
