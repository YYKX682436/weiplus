package b95;

/* loaded from: classes8.dex */
public final class i implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f18631d;

    public i(java.util.Comparator comparator) {
        this.f18631d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f18631d.compare(obj, obj2);
        return compare != 0 ? compare : mz5.a.b(java.lang.Long.valueOf(((com.tencent.mm.storage.ea) obj2).f193886e), java.lang.Long.valueOf(((com.tencent.mm.storage.ea) obj).f193886e));
    }
}
