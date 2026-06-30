package cf5;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f122540a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122541b;

    /* renamed from: c, reason: collision with root package name */
    public final long f122542c;

    /* renamed from: d, reason: collision with root package name */
    public final int f122543d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f122544e;

    /* renamed from: f, reason: collision with root package name */
    public final cf5.m f122545f;

    public n(long j17, int i17, long j18, int i18, boolean z17, cf5.m blockStats) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blockStats, "blockStats");
        this.f122540a = j17;
        this.f122541b = i17;
        this.f122542c = j18;
        this.f122543d = i18;
        this.f122544e = z17;
        this.f122545f = blockStats;
    }

    /* renamed from: equals */
    public boolean m14774xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf5.n)) {
            return false;
        }
        cf5.n nVar = (cf5.n) obj;
        return this.f122540a == nVar.f122540a && this.f122541b == nVar.f122541b && this.f122542c == nVar.f122542c && this.f122543d == nVar.f122543d && this.f122544e == nVar.f122544e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f122545f, nVar.f122545f);
    }

    /* renamed from: hashCode */
    public int m14775x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f122540a) * 31) + java.lang.Integer.hashCode(this.f122541b)) * 31) + java.lang.Long.hashCode(this.f122542c)) * 31) + java.lang.Integer.hashCode(this.f122543d)) * 31) + java.lang.Boolean.hashCode(this.f122544e)) * 31) + this.f122545f.m14772x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m14776x9616526c() {
        return "PendingParseData(msgSvrId=" + this.f122540a + ", textLength=" + this.f122541b + ", parseCostMs=" + this.f122542c + ", blockCount=" + this.f122543d + ", isStreaming=" + this.f122544e + ", blockStats=" + this.f122545f + ')';
    }
}
