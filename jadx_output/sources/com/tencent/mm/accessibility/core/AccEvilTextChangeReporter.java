package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccEvilTextChangeReporter;", "Lcom/tencent/mm/accessibility/core/AccFrequencyControlReporter;", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "EventId", "getEventId", "setEventId", "", "ReportIntervalTimeMs", "J", "getReportIntervalTimeMs", "()J", "setReportIntervalTimeMs", "(J)V", "Lcom/tencent/mm/sdk/platformtools/o4;", "kotlin.jvm.PlatformType", "mmkv", "Lcom/tencent/mm/sdk/platformtools/o4;", "getMmkv", "()Lcom/tencent/mm/sdk/platformtools/o4;", "setMmkv", "(Lcom/tencent/mm/sdk/platformtools/o4;)V", "", "routeRule", "I", "getRouteRule", "()I", "setRouteRule", "(I)V", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class AccEvilTextChangeReporter extends com.tencent.mm.accessibility.core.AccFrequencyControlReporter {
    public static final com.tencent.mm.accessibility.core.AccEvilTextChangeReporter INSTANCE = new com.tencent.mm.accessibility.core.AccEvilTextChangeReporter();
    private static java.lang.String TAG = "MicroMsg.AccEvilTextChangeReporter";
    private static java.lang.String EventId = "evil_text_change";
    private static long ReportIntervalTimeMs = 5 * (60 * 1000);
    private static com.tencent.mm.sdk.platformtools.o4 mmkv = com.tencent.mm.sdk.platformtools.o4.M("AccEvilServiceReporter");
    private static int routeRule = 33811;

    private AccEvilTextChangeReporter() {
    }

    @Override // x51.i0
    public java.lang.String getEventId() {
        return EventId;
    }

    @Override // x51.i0
    public com.tencent.mm.sdk.platformtools.o4 getMmkv() {
        return mmkv;
    }

    @Override // x51.i0
    public long getReportIntervalTimeMs() {
        return ReportIntervalTimeMs;
    }

    @Override // x51.i0
    public int getRouteRule() {
        return routeRule;
    }

    @Override // x51.i0
    public java.lang.String getTAG() {
        return TAG;
    }

    @Override // x51.i0
    public void setEventId(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        EventId = str;
    }

    @Override // x51.i0
    public void setMmkv(com.tencent.mm.sdk.platformtools.o4 o4Var) {
        mmkv = o4Var;
    }

    @Override // x51.i0
    public void setReportIntervalTimeMs(long j17) {
        ReportIntervalTimeMs = j17;
    }

    @Override // x51.i0
    public void setRouteRule(int i17) {
        routeRule = i17;
    }

    @Override // x51.i0
    public void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        TAG = str;
    }
}
