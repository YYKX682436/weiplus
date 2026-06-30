package vt2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f521508a;

    /* renamed from: b, reason: collision with root package name */
    public int f521509b;

    /* renamed from: c, reason: collision with root package name */
    public long f521510c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f521511d;

    public l(long j17, int i17, long j18, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 2) != 0 ? 1 : i17;
        j18 = (i18 & 4) != 0 ? java.lang.System.currentTimeMillis() : j18;
        z17 = (i18 & 8) != 0 ? false : z17;
        this.f521508a = j17;
        this.f521509b = i17;
        this.f521510c = j18;
        this.f521511d = z17;
    }

    /* renamed from: equals */
    public boolean m172609xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt2.l)) {
            return false;
        }
        vt2.l lVar = (vt2.l) obj;
        return this.f521508a == lVar.f521508a && this.f521509b == lVar.f521509b && this.f521510c == lVar.f521510c && this.f521511d == lVar.f521511d;
    }

    /* renamed from: hashCode */
    public int m172610x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f521508a) * 31) + java.lang.Integer.hashCode(this.f521509b)) * 31) + java.lang.Long.hashCode(this.f521510c)) * 31) + java.lang.Boolean.hashCode(this.f521511d);
    }

    /* renamed from: toString */
    public java.lang.String m172611x9616526c() {
        return "RefreshNote(productId=" + this.f521508a + ", refreshTimes=" + this.f521509b + ", lastRefreshTime=" + this.f521510c + ", refreshing=" + this.f521511d + ')';
    }
}
