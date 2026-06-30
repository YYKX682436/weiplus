package s9;

/* loaded from: classes7.dex */
public abstract class k implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f486484d;

    /* renamed from: e, reason: collision with root package name */
    public final long f486485e;

    /* renamed from: f, reason: collision with root package name */
    public final long f486486f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f486487g;

    /* renamed from: h, reason: collision with root package name */
    public final java.io.File f486488h;

    /* renamed from: i, reason: collision with root package name */
    public final long f486489i;

    public k(java.lang.String str, long j17, long j18, long j19, java.io.File file) {
        this.f486484d = str;
        this.f486485e = j17;
        this.f486486f = j18;
        this.f486487g = file != null;
        this.f486488h = file;
        this.f486489i = j19;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(s9.k kVar) {
        java.lang.String str = kVar.f486484d;
        java.lang.String str2 = this.f486484d;
        if (!str2.equals(str)) {
            return str2.compareTo(kVar.f486484d);
        }
        long j17 = this.f486485e - kVar.f486485e;
        if (j17 == 0) {
            return 0;
        }
        return j17 < 0 ? -1 : 1;
    }
}
