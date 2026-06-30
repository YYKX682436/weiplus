package com.p302x1ea3c036.p304x697f145;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/luggage/trace/ScreenShotInfo;", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", "startTime", "", "(Ljava/lang/String;D)V", "getData", "()Ljava/lang/String;", "getStartTime", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "trace_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.luggage.trace.ScreenShotInfo */
/* loaded from: classes7.dex */
public final /* data */ class C2848xa8c46b74 {
    private final java.lang.String data;
    private final double startTime;

    public C2848xa8c46b74(java.lang.String data, double d17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.data = data;
        this.startTime = d17;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p302x1ea3c036.p304x697f145.C2848xa8c46b74 m21150x75149012(com.p302x1ea3c036.p304x697f145.C2848xa8c46b74 c2848xa8c46b74, java.lang.String str, double d17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = c2848xa8c46b74.data;
        }
        if ((i17 & 2) != 0) {
            d17 = c2848xa8c46b74.startTime;
        }
        return c2848xa8c46b74.m21153x2eaf75(str, d17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final double getStartTime() {
        return this.startTime;
    }

    /* renamed from: copy */
    public final com.p302x1ea3c036.p304x697f145.C2848xa8c46b74 m21153x2eaf75(java.lang.String data, double startTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return new com.p302x1ea3c036.p304x697f145.C2848xa8c46b74(data, startTime);
    }

    /* renamed from: equals */
    public boolean m21154xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p302x1ea3c036.p304x697f145.C2848xa8c46b74)) {
            return false;
        }
        com.p302x1ea3c036.p304x697f145.C2848xa8c46b74 c2848xa8c46b74 = (com.p302x1ea3c036.p304x697f145.C2848xa8c46b74) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.data, c2848xa8c46b74.data) && java.lang.Double.compare(this.startTime, c2848xa8c46b74.startTime) == 0;
    }

    /* renamed from: getData */
    public final java.lang.String m21155xfb7e5820() {
        return this.data;
    }

    /* renamed from: getStartTime */
    public final double m21156x8082fb99() {
        return this.startTime;
    }

    /* renamed from: hashCode */
    public int m21157x8cdac1b() {
        return (this.data.hashCode() * 31) + java.lang.Double.hashCode(this.startTime);
    }

    /* renamed from: toString */
    public java.lang.String m21158x9616526c() {
        return "ScreenShotInfo(data=" + this.data + ", startTime=" + this.startTime + ')';
    }
}
