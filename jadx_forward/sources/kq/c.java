package kq;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f392713a;

    /* renamed from: b, reason: collision with root package name */
    public final long f392714b;

    /* renamed from: c, reason: collision with root package name */
    public final long f392715c;

    /* renamed from: d, reason: collision with root package name */
    public final int f392716d;

    /* renamed from: e, reason: collision with root package name */
    public final int f392717e;

    /* renamed from: f, reason: collision with root package name */
    public final long f392718f;

    /* renamed from: g, reason: collision with root package name */
    public final long f392719g;

    /* renamed from: h, reason: collision with root package name */
    public final int f392720h;

    /* renamed from: i, reason: collision with root package name */
    public final long f392721i;

    public c(int i17, long j17, long j18, int i18, int i19, long j19, long j27, int i27, long j28, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i29 = (i28 & 1) != 0 ? 0 : i17;
        long j29 = (i28 & 2) != 0 ? 300L : j17;
        long j37 = (i28 & 4) != 0 ? com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d : j18;
        int i37 = (i28 & 8) != 0 ? 15 : i18;
        int i38 = (i28 & 16) != 0 ? 120 : i19;
        long j38 = (i28 & 32) != 0 ? 200L : j19;
        long j39 = (i28 & 64) != 0 ? 50L : j27;
        int i39 = (i28 & 128) != 0 ? 4 : i27;
        long j47 = (i28 & 256) != 0 ? 15000L : j28;
        this.f392713a = i29;
        this.f392714b = j29;
        this.f392715c = j37;
        this.f392716d = i37;
        this.f392717e = i38;
        this.f392718f = j38;
        this.f392719g = j39;
        this.f392720h = i39;
        this.f392721i = j47;
    }

    /* renamed from: equals */
    public boolean m144171xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq.c)) {
            return false;
        }
        kq.c cVar = (kq.c) obj;
        return this.f392713a == cVar.f392713a && this.f392714b == cVar.f392714b && this.f392715c == cVar.f392715c && this.f392716d == cVar.f392716d && this.f392717e == cVar.f392717e && this.f392718f == cVar.f392718f && this.f392719g == cVar.f392719g && this.f392720h == cVar.f392720h && this.f392721i == cVar.f392721i;
    }

    /* renamed from: hashCode */
    public int m144172x8cdac1b() {
        return (((((((((((((((java.lang.Integer.hashCode(this.f392713a) * 31) + java.lang.Long.hashCode(this.f392714b)) * 31) + java.lang.Long.hashCode(this.f392715c)) * 31) + java.lang.Integer.hashCode(this.f392716d)) * 31) + java.lang.Integer.hashCode(this.f392717e)) * 31) + java.lang.Long.hashCode(this.f392718f)) * 31) + java.lang.Long.hashCode(this.f392719g)) * 31) + java.lang.Integer.hashCode(this.f392720h)) * 31) + java.lang.Long.hashCode(this.f392721i);
    }

    /* renamed from: toString */
    public java.lang.String m144173x9616526c() {
        return "DownloadConfig(maxRetryCount=" + this.f392713a + ", baseDelayMs=" + this.f392714b + ", maxDelayMs=" + this.f392715c + ", cgiChunkMaxRetryCount=" + this.f392716d + ", cgiChunkMaxLoopCycles=" + this.f392717e + ", cgiChunkRetryBaseDelayMs=" + this.f392718f + ", cgiChunkRetryExpMinDelayMs=" + this.f392719g + ", cgiChunkRetryExpMaxShift=" + this.f392720h + ", cdnTimeoutMs=" + this.f392721i + ')';
    }
}
