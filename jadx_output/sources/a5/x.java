package a5;

/* loaded from: classes12.dex */
public final class x extends a5.y {

    /* renamed from: a, reason: collision with root package name */
    public final a5.m f1440a;

    public x(a5.m mVar) {
        this.f1440a = mVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.x.class != obj.getClass()) {
            return false;
        }
        return this.f1440a.equals(((a5.x) obj).f1440a);
    }

    public int hashCode() {
        return (a5.x.class.getName().hashCode() * 31) + this.f1440a.hashCode();
    }

    public java.lang.String toString() {
        return "Success {mOutputData=" + this.f1440a + '}';
    }
}
