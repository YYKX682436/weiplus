package a5;

/* loaded from: classes13.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f1394a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1395b;

    public g(android.net.Uri uri, boolean z17) {
        this.f1394a = uri;
        this.f1395b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.g.class != obj.getClass()) {
            return false;
        }
        a5.g gVar = (a5.g) obj;
        return this.f1395b == gVar.f1395b && this.f1394a.equals(gVar.f1394a);
    }

    public int hashCode() {
        return (this.f1394a.hashCode() * 31) + (this.f1395b ? 1 : 0);
    }
}
