package bw1;

/* loaded from: classes12.dex */
public final class m implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.UUID f106359d;

    /* renamed from: e, reason: collision with root package name */
    public int f106360e = 1;

    public m(java.util.UUID uuid) {
        this.f106359d = uuid;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f106359d.compareTo((java.util.UUID) obj);
    }
}
