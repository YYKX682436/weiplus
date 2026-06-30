package mz5;

/* renamed from: mz5.a$$a */
/* loaded from: classes5.dex */
public final /* synthetic */ class C29181x2ca3e0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l[] f414891d;

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        for (yz5.l lVar : this.f414891d) {
            int b17 = mz5.a.b((java.lang.Comparable) lVar.mo146xb9724478(obj), (java.lang.Comparable) lVar.mo146xb9724478(obj2));
            if (b17 != 0) {
                return b17;
            }
        }
        return 0;
    }
}
