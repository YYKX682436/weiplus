package jc3;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: i, reason: collision with root package name */
    public static final jc3.n0 f380497i = new jc3.n0(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f380498a;

    /* renamed from: b, reason: collision with root package name */
    public final long f380499b;

    /* renamed from: c, reason: collision with root package name */
    public final int f380500c;

    /* renamed from: d, reason: collision with root package name */
    public final int f380501d;

    /* renamed from: e, reason: collision with root package name */
    public final long f380502e;

    /* renamed from: f, reason: collision with root package name */
    public final long f380503f;

    /* renamed from: g, reason: collision with root package name */
    public final long f380504g;

    /* renamed from: h, reason: collision with root package name */
    public final long f380505h;

    public o0(long j17, long j18, int i17, int i18, long j19, long j27, long j28, long j29) {
        this.f380498a = j17;
        this.f380499b = j18;
        this.f380500c = i17;
        this.f380501d = i18;
        this.f380502e = j19;
        this.f380503f = j27;
        this.f380504g = j28;
        this.f380505h = j29;
    }

    /* renamed from: equals */
    public boolean m140628xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc3.o0)) {
            return false;
        }
        jc3.o0 o0Var = (jc3.o0) obj;
        return this.f380498a == o0Var.f380498a && this.f380499b == o0Var.f380499b && this.f380500c == o0Var.f380500c && this.f380501d == o0Var.f380501d && this.f380502e == o0Var.f380502e && this.f380503f == o0Var.f380503f && this.f380504g == o0Var.f380504g && this.f380505h == o0Var.f380505h;
    }

    /* renamed from: hashCode */
    public int m140629x8cdac1b() {
        return (((((((((((((java.lang.Long.hashCode(this.f380498a) * 31) + java.lang.Long.hashCode(this.f380499b)) * 31) + java.lang.Integer.hashCode(this.f380500c)) * 31) + java.lang.Integer.hashCode(this.f380501d)) * 31) + java.lang.Long.hashCode(this.f380502e)) * 31) + java.lang.Long.hashCode(this.f380503f)) * 31) + java.lang.Long.hashCode(this.f380504g)) * 31) + java.lang.Long.hashCode(this.f380505h);
    }

    /* renamed from: toString */
    public java.lang.String m140630x9616526c() {
        return "MBBizPermissionConfigInfo(maxStorageSize=" + this.f380498a + ", maxNetWorkFileSizeLimit=" + this.f380499b + ", maxNetWorkConcurrent=" + this.f380500c + ", defaultTimeOut=" + this.f380501d + ", maxTempFileTotalSize=" + this.f380502e + ", maxTempFileSize=" + this.f380503f + ", minTempFileSize=" + this.f380504g + ", maxUsrFileSize=" + this.f380505h + ')';
    }
}
