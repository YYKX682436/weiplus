package o9;

/* loaded from: classes15.dex */
public final class b implements i9.d {

    /* renamed from: e, reason: collision with root package name */
    public static final o9.b f425219e = new o9.b();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f425220d;

    public b(i9.a aVar) {
        this.f425220d = java.util.Collections.singletonList(aVar);
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
        return j17 >= 0 ? this.f425220d : java.util.Collections.emptyList();
    }

    public b() {
        this.f425220d = java.util.Collections.emptyList();
    }
}
