package cf5;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f41007a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41008b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41009c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41010d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f41011e;

    /* renamed from: f, reason: collision with root package name */
    public final cf5.m f41012f;

    public n(long j17, int i17, long j18, int i18, boolean z17, cf5.m blockStats) {
        kotlin.jvm.internal.o.g(blockStats, "blockStats");
        this.f41007a = j17;
        this.f41008b = i17;
        this.f41009c = j18;
        this.f41010d = i18;
        this.f41011e = z17;
        this.f41012f = blockStats;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5.n)) {
            return false;
        }
        cf5.n nVar = (cf5.n) obj;
        return this.f41007a == nVar.f41007a && this.f41008b == nVar.f41008b && this.f41009c == nVar.f41009c && this.f41010d == nVar.f41010d && this.f41011e == nVar.f41011e && kotlin.jvm.internal.o.b(this.f41012f, nVar.f41012f);
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f41007a) * 31) + java.lang.Integer.hashCode(this.f41008b)) * 31) + java.lang.Long.hashCode(this.f41009c)) * 31) + java.lang.Integer.hashCode(this.f41010d)) * 31) + java.lang.Boolean.hashCode(this.f41011e)) * 31) + this.f41012f.hashCode();
    }

    public java.lang.String toString() {
        return "PendingParseData(msgSvrId=" + this.f41007a + ", textLength=" + this.f41008b + ", parseCostMs=" + this.f41009c + ", blockCount=" + this.f41010d + ", isStreaming=" + this.f41011e + ", blockStats=" + this.f41012f + ')';
    }
}
