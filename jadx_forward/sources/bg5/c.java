package bg5;

/* loaded from: classes7.dex */
public final class c implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f102277d;

    public c(java.util.Comparator comparator) {
        this.f102277d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f102277d.compare(obj, obj2);
        return compare != 0 ? compare : mz5.a.b((java.lang.Comparable) ((java.util.Map.Entry) obj).getKey(), (java.lang.Comparable) ((java.util.Map.Entry) obj2).getKey());
    }
}
