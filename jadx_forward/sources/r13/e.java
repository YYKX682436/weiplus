package r13;

/* loaded from: classes9.dex */
public class e implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final r13.e f450138d = new r13.e();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((p13.y) obj2).f432721f;
        long j18 = ((p13.y) obj).f432721f;
        if (j17 < j18) {
            return -1;
        }
        return j17 == j18 ? 0 : 1;
    }
}
