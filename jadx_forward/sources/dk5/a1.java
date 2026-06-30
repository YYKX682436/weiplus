package dk5;

/* loaded from: classes7.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final android.util.SparseIntArray f316023a = new android.util.SparseIntArray();

    public static c01.l2 a(java.lang.String str) {
        boolean z17;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        int hashCode = str.hashCode();
        android.util.SparseIntArray sparseIntArray = f316023a;
        synchronized (sparseIntArray) {
            int i17 = sparseIntArray.get(hashCode, 0) - 1;
            if (i17 <= 0) {
                sparseIntArray.delete(hashCode);
                z17 = true;
            } else {
                sparseIntArray.put(hashCode, i17);
                z17 = false;
            }
        }
        return z17 ? c01.n2.d().e(str) : c01.n2.d().c(str, false);
    }
}
