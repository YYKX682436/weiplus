package hp2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f364454a;

    /* renamed from: b, reason: collision with root package name */
    public final long f364455b;

    public b(int i17, long j17) {
        this.f364454a = i17;
        this.f364455b = j17;
    }

    /* renamed from: equals */
    public boolean m133853xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp2.b)) {
            return false;
        }
        hp2.b bVar = (hp2.b) obj;
        return this.f364454a == bVar.f364454a && this.f364455b == bVar.f364455b;
    }

    /* renamed from: hashCode */
    public int m133854x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f364454a) * 31) + java.lang.Long.hashCode(this.f364455b);
    }

    /* renamed from: toString */
    public java.lang.String m133855x9616526c() {
        return "CachedTargetItem(pos=" + this.f364454a + ", itemId=" + this.f364455b + ')';
    }
}
