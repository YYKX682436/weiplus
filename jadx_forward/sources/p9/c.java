package p9;

/* loaded from: classes13.dex */
public final class c implements i9.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f434343d;

    public c(java.util.List list) {
        this.f434343d = java.util.Collections.unmodifiableList(list);
    }

    @Override // i9.d
    public long a(int i17) {
        t9.a.a(i17 == 0);
        return 0L;
    }

    @Override // i9.d
    public int h() {
        return 1;
    }

    @Override // i9.d
    public int i(long j17) {
        return j17 < 0 ? 0 : -1;
    }

    @Override // i9.d
    public java.util.List j(long j17) {
        return j17 >= 0 ? this.f434343d : java.util.Collections.emptyList();
    }
}
