package uh;

/* loaded from: classes12.dex */
public class e implements java.util.Comparator {
    public e(uh.g gVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Long) ((rh.x2) ((java.util.Map.Entry) obj).getValue()).f477085a).longValue() - ((java.lang.Long) ((rh.x2) ((java.util.Map.Entry) obj2).getValue()).f477085a).longValue();
        if (longValue == 0) {
            return 0;
        }
        return longValue > 0 ? -1 : 1;
    }
}
