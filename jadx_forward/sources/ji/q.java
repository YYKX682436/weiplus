package ji;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f381438a;

    /* renamed from: b, reason: collision with root package name */
    public long f381439b;

    /* renamed from: c, reason: collision with root package name */
    public final long f381440c;

    /* renamed from: d, reason: collision with root package name */
    public final int f381441d;

    /* renamed from: e, reason: collision with root package name */
    public final long f381442e;

    public q(long j17, int i17, long j18) {
        this.f381440c = j17;
        this.f381441d = i17;
        this.f381442e = j18;
    }

    public final boolean a(long j17, yz5.a cb6) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = currentTimeMillis - this.f381439b;
        this.f381439b = currentTimeMillis;
        boolean z17 = j17 > this.f381440c;
        int i18 = this.f381441d;
        long j19 = this.f381442e;
        if (z17 && j18 > j19 && (i17 = this.f381438a) < i18) {
            int i19 = i17 + 1;
            this.f381438a = i19;
            if (i19 == i18) {
                cb6.mo152xb9724478();
                return !z17 && j18 > j19;
            }
        }
        if (!z17 && j18 > j19 && this.f381438a < i18) {
            this.f381438a = 0;
        }
        if (z17) {
        }
    }

    /* renamed from: equals */
    public boolean m140986xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji.q)) {
            return false;
        }
        ji.q qVar = (ji.q) obj;
        return this.f381440c == qVar.f381440c && this.f381441d == qVar.f381441d && this.f381442e == qVar.f381442e;
    }

    /* renamed from: hashCode */
    public int m140987x8cdac1b() {
        long j17 = this.f381440c;
        int i17 = ((((int) (j17 ^ (j17 >>> 32))) * 31) + this.f381441d) * 31;
        long j18 = this.f381442e;
        return i17 + ((int) ((j18 >>> 32) ^ j18));
    }

    /* renamed from: toString */
    public java.lang.String m140988x9616526c() {
        return "{size = " + this.f381440c + ", checkTimes = " + this.f381441d + '}';
    }
}
