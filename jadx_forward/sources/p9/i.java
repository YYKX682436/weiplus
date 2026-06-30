package p9;

/* loaded from: classes15.dex */
public final class i implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f434376d;

    /* renamed from: e, reason: collision with root package name */
    public final p9.d f434377e;

    public i(int i17, p9.d dVar) {
        this.f434376d = i17;
        this.f434377e = dVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f434376d - ((p9.i) obj).f434376d;
    }
}
