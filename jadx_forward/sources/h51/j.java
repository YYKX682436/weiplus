package h51;

/* loaded from: classes12.dex */
public class j implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f360567d;

    /* renamed from: e, reason: collision with root package name */
    public final long f360568e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f360569f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f360570g;

    public j(long j17, long j18, java.lang.Object obj) {
        this.f360567d = j17;
        this.f360568e = j18;
        this.f360569f = obj;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        long j17 = ((h51.j) obj).f360567d;
        long j18 = this.f360567d;
        if (j18 < j17) {
            return -1;
        }
        return j18 > j17 ? 1 : 0;
    }

    /* renamed from: equals */
    public boolean m132892xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h51.j.class != obj.getClass()) {
            return false;
        }
        h51.j jVar = (h51.j) obj;
        if (this.f360568e != jVar.f360568e) {
            return false;
        }
        java.lang.Object obj2 = jVar.f360569f;
        java.lang.Object obj3 = this.f360569f;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        return this.f360567d == jVar.f360567d;
    }

    /* renamed from: hashCode */
    public int m132893x8cdac1b() {
        long j17 = this.f360568e;
        int i17 = (((int) (j17 ^ (j17 >>> 32))) + 31) * 31;
        java.lang.Object obj = this.f360569f;
        int hashCode = (i17 + (obj == null ? 0 : obj.hashCode())) * 31;
        long j18 = this.f360567d;
        return hashCode + ((int) ((j18 >>> 32) ^ j18));
    }

    /* renamed from: toString */
    public java.lang.String m132894x9616526c() {
        return "offset " + this.f360567d + ", length " + this.f360568e + ", metadata " + this.f360569f + ", isDeflateCompressed " + this.f360570g;
    }

    public j(long j17, long j18, java.lang.Object obj, boolean z17) {
        this.f360567d = j17;
        this.f360568e = j18;
        this.f360569f = obj;
        this.f360570g = z17;
    }
}
