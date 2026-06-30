package a5;

/* loaded from: classes12.dex */
public final class v extends a5.y {

    /* renamed from: a, reason: collision with root package name */
    public final a5.m f1438a = a5.m.f1410b;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.v.class != obj.getClass()) {
            return false;
        }
        return this.f1438a.equals(((a5.v) obj).f1438a);
    }

    public int hashCode() {
        return (a5.v.class.getName().hashCode() * 31) + this.f1438a.hashCode();
    }

    public java.lang.String toString() {
        return "Failure {mOutputData=" + this.f1438a + '}';
    }
}
