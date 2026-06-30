package com.luggage.trace;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/luggage/trace/ScreenShotInfo;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "startTime", "", "(Ljava/lang/String;D)V", "getData", "()Ljava/lang/String;", "getStartTime", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "trace_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ScreenShotInfo {
    private final java.lang.String data;
    private final double startTime;

    public ScreenShotInfo(java.lang.String data, double d17) {
        kotlin.jvm.internal.o.g(data, "data");
        this.data = data;
        this.startTime = d17;
    }

    public static /* synthetic */ com.luggage.trace.ScreenShotInfo copy$default(com.luggage.trace.ScreenShotInfo screenShotInfo, java.lang.String str, double d17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = screenShotInfo.data;
        }
        if ((i17 & 2) != 0) {
            d17 = screenShotInfo.startTime;
        }
        return screenShotInfo.copy(str, d17);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final double getStartTime() {
        return this.startTime;
    }

    public final com.luggage.trace.ScreenShotInfo copy(java.lang.String data, double startTime) {
        kotlin.jvm.internal.o.g(data, "data");
        return new com.luggage.trace.ScreenShotInfo(data, startTime);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.luggage.trace.ScreenShotInfo)) {
            return false;
        }
        com.luggage.trace.ScreenShotInfo screenShotInfo = (com.luggage.trace.ScreenShotInfo) other;
        return kotlin.jvm.internal.o.b(this.data, screenShotInfo.data) && java.lang.Double.compare(this.startTime, screenShotInfo.startTime) == 0;
    }

    public final java.lang.String getData() {
        return this.data;
    }

    public final double getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (this.data.hashCode() * 31) + java.lang.Double.hashCode(this.startTime);
    }

    public java.lang.String toString() {
        return "ScreenShotInfo(data=" + this.data + ", startTime=" + this.startTime + ')';
    }
}
