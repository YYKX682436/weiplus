package ll;

/* loaded from: classes13.dex */
public abstract class n implements java.lang.Runnable, java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f400650d;

    /* renamed from: e, reason: collision with root package name */
    public final int f400651e;

    /* renamed from: f, reason: collision with root package name */
    public long f400652f = java.lang.System.currentTimeMillis();

    public n(java.lang.String str, int i17) {
        this.f400650d = "";
        this.f400650d = str;
        this.f400651e = i17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        ll.n nVar = (ll.n) obj;
        int abs = (int) (java.lang.Math.abs(java.lang.System.currentTimeMillis() - this.f400652f) / 1000);
        int i17 = this.f400651e;
        if (abs > 0) {
            i17 += abs;
        }
        return nVar.f400651e - i17;
    }

    public void h() {
    }
}
