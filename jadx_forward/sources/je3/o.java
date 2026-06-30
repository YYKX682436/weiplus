package je3;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f380838a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f380839b;

    /* renamed from: c, reason: collision with root package name */
    public long f380840c;

    /* renamed from: d, reason: collision with root package name */
    public long f380841d;

    /* renamed from: e, reason: collision with root package name */
    public long f380842e;

    /* renamed from: f, reason: collision with root package name */
    public long f380843f;

    /* renamed from: g, reason: collision with root package name */
    public long f380844g;

    /* renamed from: h, reason: collision with root package name */
    public long f380845h;

    /* renamed from: i, reason: collision with root package name */
    public long f380846i;

    /* renamed from: j, reason: collision with root package name */
    public long f380847j;

    public o(java.lang.String bizName, java.lang.String str, long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.String sessionID = (i17 & 2) != 0 ? java.lang.String.valueOf(java.lang.System.currentTimeMillis()) : str;
        long j39 = (i17 & 4) != 0 ? 0L : j17;
        long j47 = (i17 & 8) != 0 ? 0L : j18;
        long j48 = (i17 & 16) != 0 ? 0L : j19;
        long j49 = (i17 & 32) != 0 ? 0L : j27;
        long j57 = (i17 & 64) != 0 ? 0L : j28;
        long j58 = (i17 & 128) != 0 ? 0L : j29;
        long j59 = (i17 & 256) != 0 ? 0L : j37;
        long j66 = (i17 & 512) != 0 ? 0L : j38;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionID, "sessionID");
        this.f380838a = bizName;
        this.f380839b = sessionID;
        this.f380840c = j39;
        this.f380841d = j47;
        this.f380842e = j48;
        this.f380843f = j49;
        this.f380844g = j57;
        this.f380845h = j58;
        this.f380846i = j59;
        this.f380847j = j66;
    }

    public final void a() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f380847j = elapsedRealtime;
        je3.i.M2(je3.k.f380831e, this.f380839b, this.f380838a, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72.f37615x879f2bda, elapsedRealtime - this.f380846i, null, 0.0f, 48, null);
    }

    public final void b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f380843f = elapsedRealtime;
        je3.i.M2(je3.k.f380831e, this.f380839b, this.f380838a, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72.f37620x4b2425d, elapsedRealtime - this.f380842e, null, 0.0f, 48, null);
    }

    public final void c() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.f380845h = elapsedRealtime;
        je3.i.M2(je3.k.f380831e, this.f380839b, this.f380838a, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16456x617fbd72.f37621x4b8cc42, elapsedRealtime - this.f380844g, null, 0.0f, 48, null);
    }

    /* renamed from: equals */
    public boolean m140792xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je3.o)) {
            return false;
        }
        je3.o oVar = (je3.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380838a, oVar.f380838a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f380839b, oVar.f380839b) && this.f380840c == oVar.f380840c && this.f380841d == oVar.f380841d && this.f380842e == oVar.f380842e && this.f380843f == oVar.f380843f && this.f380844g == oVar.f380844g && this.f380845h == oVar.f380845h && this.f380846i == oVar.f380846i && this.f380847j == oVar.f380847j;
    }

    /* renamed from: hashCode */
    public int m140793x8cdac1b() {
        return (((((((((((((((((this.f380838a.hashCode() * 31) + this.f380839b.hashCode()) * 31) + java.lang.Long.hashCode(this.f380840c)) * 31) + java.lang.Long.hashCode(this.f380841d)) * 31) + java.lang.Long.hashCode(this.f380842e)) * 31) + java.lang.Long.hashCode(this.f380843f)) * 31) + java.lang.Long.hashCode(this.f380844g)) * 31) + java.lang.Long.hashCode(this.f380845h)) * 31) + java.lang.Long.hashCode(this.f380846i)) * 31) + java.lang.Long.hashCode(this.f380847j);
    }

    /* renamed from: toString */
    public java.lang.String m140794x9616526c() {
        return "MagicBrushRuntimeInfo(bizName=" + this.f380838a + ", sessionID=" + this.f380839b + ", bindServiceStartTime=" + this.f380840c + ", bindServiceEndTime=" + this.f380841d + ", setupStartTime=" + this.f380842e + ", setupEndTime=" + this.f380843f + ", startStartTime=" + this.f380844g + ", startEndTime=" + this.f380845h + ", destroyStartTime=" + this.f380846i + ", destroyEndTime=" + this.f380847j + ')';
    }
}
