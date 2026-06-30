package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f161185a;

    /* renamed from: b, reason: collision with root package name */
    public final long f161186b;

    /* renamed from: c, reason: collision with root package name */
    public final long f161187c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f161188d;

    /* renamed from: e, reason: collision with root package name */
    public long f161189e;

    /* renamed from: f, reason: collision with root package name */
    public long f161190f;

    /* renamed from: g, reason: collision with root package name */
    public long f161191g;

    /* renamed from: h, reason: collision with root package name */
    public long f161192h;

    /* renamed from: i, reason: collision with root package name */
    public long f161193i;

    public o0(int i17, long j17, long j18, boolean z17, long j19, long j27, long j28, long j29, long j37, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        boolean z18 = (i18 & 8) != 0 ? false : z17;
        long j38 = (i18 & 16) != 0 ? 0L : j19;
        long j39 = (i18 & 32) != 0 ? 0L : j27;
        long j47 = (i18 & 64) != 0 ? 0L : j28;
        long j48 = (i18 & 128) != 0 ? 0L : j29;
        long j49 = (i18 & 256) == 0 ? j37 : 0L;
        this.f161185a = i17;
        this.f161186b = j17;
        this.f161187c = j18;
        this.f161188d = z18;
        this.f161189e = j38;
        this.f161190f = j39;
        this.f161191g = j47;
        this.f161192h = j48;
        this.f161193i = j49;
    }

    /* renamed from: equals */
    public boolean m50635xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o0 o0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o0) obj;
        return this.f161185a == o0Var.f161185a && this.f161186b == o0Var.f161186b && this.f161187c == o0Var.f161187c && this.f161188d == o0Var.f161188d && this.f161189e == o0Var.f161189e && this.f161190f == o0Var.f161190f && this.f161191g == o0Var.f161191g && this.f161192h == o0Var.f161192h && this.f161193i == o0Var.f161193i;
    }

    /* renamed from: hashCode */
    public int m50636x8cdac1b() {
        return (((((((((((((((java.lang.Integer.hashCode(this.f161185a) * 31) + java.lang.Long.hashCode(this.f161186b)) * 31) + java.lang.Long.hashCode(this.f161187c)) * 31) + java.lang.Boolean.hashCode(this.f161188d)) * 31) + java.lang.Long.hashCode(this.f161189e)) * 31) + java.lang.Long.hashCode(this.f161190f)) * 31) + java.lang.Long.hashCode(this.f161191g)) * 31) + java.lang.Long.hashCode(this.f161192h)) * 31) + java.lang.Long.hashCode(this.f161193i);
    }

    /* renamed from: toString */
    public java.lang.String m50637x9616526c() {
        return "JSOperateWxDataProfileContext(queueLength=" + this.f161185a + ", wxdataQueueTimestamp=" + this.f161186b + ", wxdataDequeueTimestamp=" + this.f161187c + ", isConfirm=" + this.f161188d + ", beginCGITimestamp=" + this.f161189e + ", CGICallbackTimestamp=" + this.f161190f + ", beginCGITimestampAfterConfirm=" + this.f161191g + ", CGICallbackTimestampAfterConfirm=" + this.f161192h + ", wxlibCallbackTimestamp=" + this.f161193i + ')';
    }
}
