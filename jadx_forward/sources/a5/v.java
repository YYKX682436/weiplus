package a5;

/* loaded from: classes12.dex */
public final class v extends a5.y {

    /* renamed from: a, reason: collision with root package name */
    public final a5.m f82971a = a5.m.f82943b;

    /* renamed from: equals */
    public boolean m607xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.v.class != obj.getClass()) {
            return false;
        }
        return this.f82971a.m593xb2c87fbf(((a5.v) obj).f82971a);
    }

    /* renamed from: hashCode */
    public int m608x8cdac1b() {
        return (a5.v.class.getName().hashCode() * 31) + this.f82971a.m594x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m609x9616526c() {
        return "Failure {mOutputData=" + this.f82971a + '}';
    }
}
