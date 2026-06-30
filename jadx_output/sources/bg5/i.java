package bg5;

/* loaded from: classes9.dex */
public final class i implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Long.valueOf(((g15.a) obj2).getCreateTime()), java.lang.Long.valueOf(((g15.a) obj).getCreateTime()));
    }
}
