package b95;

/* loaded from: classes8.dex */
public final class g implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f100163d;

    public g(java.util.Comparator comparator) {
        this.f100163d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int compare = this.f100163d.compare(obj, obj2);
        return compare != 0 ? compare : mz5.a.b(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.ea) obj2).f275419e), java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2621x8fb0427b.ea) obj).f275419e));
    }
}
