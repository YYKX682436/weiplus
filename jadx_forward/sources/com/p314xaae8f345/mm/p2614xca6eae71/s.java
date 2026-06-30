package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public long f274895a;

    /* renamed from: b, reason: collision with root package name */
    public long f274896b;

    /* renamed from: c, reason: collision with root package name */
    public int f274897c;

    /* renamed from: d, reason: collision with root package name */
    public long f274898d;

    /* renamed from: e, reason: collision with root package name */
    public long f274899e;

    /* renamed from: f, reason: collision with root package name */
    public long f274900f;

    /* renamed from: g, reason: collision with root package name */
    public long f274901g;

    public s(long j17, long j18, int i17, long j19, long j27, long j28, long j29, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j37 = (i18 & 1) != 0 ? 0L : j17;
        long j38 = (i18 & 2) != 0 ? 0L : j18;
        int i19 = (i18 & 4) != 0 ? 0 : i17;
        long j39 = (i18 & 8) != 0 ? 0L : j19;
        long j47 = (i18 & 16) != 0 ? 0L : j27;
        long j48 = (i18 & 32) != 0 ? 0L : j28;
        long j49 = (i18 & 64) == 0 ? j29 : 0L;
        this.f274895a = j37;
        this.f274896b = j38;
        this.f274897c = i19;
        this.f274898d = j39;
        this.f274899e = j47;
        this.f274900f = j48;
        this.f274901g = j49;
    }

    /* renamed from: equals */
    public boolean m77868xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2614xca6eae71.s)) {
            return false;
        }
        com.p314xaae8f345.mm.p2614xca6eae71.s sVar = (com.p314xaae8f345.mm.p2614xca6eae71.s) obj;
        return this.f274895a == sVar.f274895a && this.f274896b == sVar.f274896b && this.f274897c == sVar.f274897c && this.f274898d == sVar.f274898d && this.f274899e == sVar.f274899e && this.f274900f == sVar.f274900f && this.f274901g == sVar.f274901g;
    }

    /* renamed from: hashCode */
    public int m77869x8cdac1b() {
        return (((((((((((java.lang.Long.hashCode(this.f274895a) * 31) + java.lang.Long.hashCode(this.f274896b)) * 31) + java.lang.Integer.hashCode(this.f274897c)) * 31) + java.lang.Long.hashCode(this.f274898d)) * 31) + java.lang.Long.hashCode(this.f274899e)) * 31) + java.lang.Long.hashCode(this.f274900f)) * 31) + java.lang.Long.hashCode(this.f274901g);
    }

    /* renamed from: toString */
    public java.lang.String m77870x9616526c() {
        return "CostStatistics(totalMs=" + this.f274895a + ", frameCount=" + this.f274896b + ", fileCount=" + this.f274897c + ", maxReadMs=" + this.f274898d + ", maxDecodeMs=" + this.f274899e + ", maxConvertMs=" + this.f274900f + ", maxOcrMs=" + this.f274901g + ')';
    }
}
