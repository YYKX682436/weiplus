package a5;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f82927a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82928b;

    public g(android.net.Uri uri, boolean z17) {
        this.f82927a = uri;
        this.f82928b = z17;
    }

    /* renamed from: equals */
    public boolean m582xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.g.class != obj.getClass()) {
            return false;
        }
        a5.g gVar = (a5.g) obj;
        return this.f82928b == gVar.f82928b && this.f82927a.equals(gVar.f82927a);
    }

    /* renamed from: hashCode */
    public int m583x8cdac1b() {
        return (this.f82927a.hashCode() * 31) + (this.f82928b ? 1 : 0);
    }
}
