package kn1;

/* loaded from: classes12.dex */
public class i implements java.lang.Comparable, java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391158d;

    /* renamed from: e, reason: collision with root package name */
    public long f391159e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f391160f = new long[2];

    /* renamed from: g, reason: collision with root package name */
    public long f391161g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f391162h = -1;

    /* renamed from: clone */
    public java.lang.Object m143775x5a5dd5d() {
        kn1.i iVar = new kn1.i();
        iVar.f391158d = this.f391158d;
        iVar.f391159e = this.f391159e;
        iVar.f391161g = this.f391161g;
        iVar.f391162h = this.f391162h;
        return iVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        long j17 = this.f391161g;
        long j18 = ((kn1.i) obj).f391161g;
        if (j17 < j18) {
            return 1;
        }
        return j17 > j18 ? -1 : 0;
    }
}
