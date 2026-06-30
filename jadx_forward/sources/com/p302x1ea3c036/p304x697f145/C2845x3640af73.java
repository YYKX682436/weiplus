package com.p302x1ea3c036.p304x697f145;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/luggage/trace/MemoryUsages;", "", "jsHeapSizeUsed", "", "allUsed", "startTime", "", "(JJD)V", "getAllUsed", "()J", "getJsHeapSizeUsed", "getStartTime", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "trace_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.luggage.trace.MemoryUsages */
/* loaded from: classes7.dex */
public final /* data */ class C2845x3640af73 {
    private final long allUsed;
    private final long jsHeapSizeUsed;
    private final double startTime;

    public C2845x3640af73(long j17, long j18, double d17) {
        this.jsHeapSizeUsed = j17;
        this.allUsed = j18;
        this.startTime = d17;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p302x1ea3c036.p304x697f145.C2845x3640af73 m21121x75149012(com.p302x1ea3c036.p304x697f145.C2845x3640af73 c2845x3640af73, long j17, long j18, double d17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = c2845x3640af73.jsHeapSizeUsed;
        }
        long j19 = j17;
        if ((i17 & 2) != 0) {
            j18 = c2845x3640af73.allUsed;
        }
        long j27 = j18;
        if ((i17 & 4) != 0) {
            d17 = c2845x3640af73.startTime;
        }
        return c2845x3640af73.m21125x2eaf75(j19, j27, d17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getJsHeapSizeUsed() {
        return this.jsHeapSizeUsed;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAllUsed() {
        return this.allUsed;
    }

    /* renamed from: component3, reason: from getter */
    public final double getStartTime() {
        return this.startTime;
    }

    /* renamed from: copy */
    public final com.p302x1ea3c036.p304x697f145.C2845x3640af73 m21125x2eaf75(long jsHeapSizeUsed, long allUsed, double startTime) {
        return new com.p302x1ea3c036.p304x697f145.C2845x3640af73(jsHeapSizeUsed, allUsed, startTime);
    }

    /* renamed from: equals */
    public boolean m21126xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p302x1ea3c036.p304x697f145.C2845x3640af73)) {
            return false;
        }
        com.p302x1ea3c036.p304x697f145.C2845x3640af73 c2845x3640af73 = (com.p302x1ea3c036.p304x697f145.C2845x3640af73) other;
        return this.jsHeapSizeUsed == c2845x3640af73.jsHeapSizeUsed && this.allUsed == c2845x3640af73.allUsed && java.lang.Double.compare(this.startTime, c2845x3640af73.startTime) == 0;
    }

    /* renamed from: getAllUsed */
    public final long m21127x76f5cc8() {
        return this.allUsed;
    }

    /* renamed from: getJsHeapSizeUsed */
    public final long m21128x25956649() {
        return this.jsHeapSizeUsed;
    }

    /* renamed from: getStartTime */
    public final double m21129x8082fb99() {
        return this.startTime;
    }

    /* renamed from: hashCode */
    public int m21130x8cdac1b() {
        return (((java.lang.Long.hashCode(this.jsHeapSizeUsed) * 31) + java.lang.Long.hashCode(this.allUsed)) * 31) + java.lang.Double.hashCode(this.startTime);
    }

    /* renamed from: toString */
    public java.lang.String m21131x9616526c() {
        return "MemoryUsages(jsHeapSizeUsed=" + this.jsHeapSizeUsed + ", allUsed=" + this.allUsed + ", startTime=" + this.startTime + ')';
    }
}
