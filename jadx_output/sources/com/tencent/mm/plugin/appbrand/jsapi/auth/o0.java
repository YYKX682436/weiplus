package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f79652a;

    /* renamed from: b, reason: collision with root package name */
    public final long f79653b;

    /* renamed from: c, reason: collision with root package name */
    public final long f79654c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f79655d;

    /* renamed from: e, reason: collision with root package name */
    public long f79656e;

    /* renamed from: f, reason: collision with root package name */
    public long f79657f;

    /* renamed from: g, reason: collision with root package name */
    public long f79658g;

    /* renamed from: h, reason: collision with root package name */
    public long f79659h;

    /* renamed from: i, reason: collision with root package name */
    public long f79660i;

    public o0(int i17, long j17, long j18, boolean z17, long j19, long j27, long j28, long j29, long j37, int i18, kotlin.jvm.internal.i iVar) {
        boolean z18 = (i18 & 8) != 0 ? false : z17;
        long j38 = (i18 & 16) != 0 ? 0L : j19;
        long j39 = (i18 & 32) != 0 ? 0L : j27;
        long j47 = (i18 & 64) != 0 ? 0L : j28;
        long j48 = (i18 & 128) != 0 ? 0L : j29;
        long j49 = (i18 & 256) == 0 ? j37 : 0L;
        this.f79652a = i17;
        this.f79653b = j17;
        this.f79654c = j18;
        this.f79655d = z18;
        this.f79656e = j38;
        this.f79657f = j39;
        this.f79658g = j47;
        this.f79659h = j48;
        this.f79660i = j49;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.auth.o0)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.o0 o0Var = (com.tencent.mm.plugin.appbrand.jsapi.auth.o0) obj;
        return this.f79652a == o0Var.f79652a && this.f79653b == o0Var.f79653b && this.f79654c == o0Var.f79654c && this.f79655d == o0Var.f79655d && this.f79656e == o0Var.f79656e && this.f79657f == o0Var.f79657f && this.f79658g == o0Var.f79658g && this.f79659h == o0Var.f79659h && this.f79660i == o0Var.f79660i;
    }

    public int hashCode() {
        return (((((((((((((((java.lang.Integer.hashCode(this.f79652a) * 31) + java.lang.Long.hashCode(this.f79653b)) * 31) + java.lang.Long.hashCode(this.f79654c)) * 31) + java.lang.Boolean.hashCode(this.f79655d)) * 31) + java.lang.Long.hashCode(this.f79656e)) * 31) + java.lang.Long.hashCode(this.f79657f)) * 31) + java.lang.Long.hashCode(this.f79658g)) * 31) + java.lang.Long.hashCode(this.f79659h)) * 31) + java.lang.Long.hashCode(this.f79660i);
    }

    public java.lang.String toString() {
        return "JSOperateWxDataProfileContext(queueLength=" + this.f79652a + ", wxdataQueueTimestamp=" + this.f79653b + ", wxdataDequeueTimestamp=" + this.f79654c + ", isConfirm=" + this.f79655d + ", beginCGITimestamp=" + this.f79656e + ", CGICallbackTimestamp=" + this.f79657f + ", beginCGITimestampAfterConfirm=" + this.f79658g + ", CGICallbackTimestampAfterConfirm=" + this.f79659h + ", wxlibCallbackTimestamp=" + this.f79660i + ')';
    }
}
