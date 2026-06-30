package q1;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f441015a;

    /* renamed from: b, reason: collision with root package name */
    public final long f441016b;

    public b(long j17, long j18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f441015a = j17;
        this.f441016b = j18;
    }

    /* renamed from: equals */
    public boolean m159254xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1.b)) {
            return false;
        }
        q1.b bVar = (q1.b) obj;
        return d1.e.a(this.f441015a, bVar.f441015a) && this.f441016b == bVar.f441016b;
    }

    /* renamed from: hashCode */
    public int m159255x8cdac1b() {
        int i17 = d1.e.f307159e;
        return (java.lang.Long.hashCode(this.f441015a) * 31) + java.lang.Long.hashCode(this.f441016b);
    }

    /* renamed from: toString */
    public java.lang.String m159256x9616526c() {
        return "PointAtTime(point=" + ((java.lang.Object) d1.e.h(this.f441015a)) + ", time=" + this.f441016b + ')';
    }
}
