package a5;

/* loaded from: classes12.dex */
public final class x extends a5.y {

    /* renamed from: a, reason: collision with root package name */
    public final a5.m f82973a;

    public x(a5.m mVar) {
        this.f82973a = mVar;
    }

    /* renamed from: equals */
    public boolean m614xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a5.x.class != obj.getClass()) {
            return false;
        }
        return this.f82973a.m593xb2c87fbf(((a5.x) obj).f82973a);
    }

    /* renamed from: hashCode */
    public int m615x8cdac1b() {
        return (a5.x.class.getName().hashCode() * 31) + this.f82973a.m594x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m616x9616526c() {
        return "Success {mOutputData=" + this.f82973a + '}';
    }
}
