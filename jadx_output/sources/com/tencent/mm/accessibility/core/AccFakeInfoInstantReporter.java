package com.tencent.mm.accessibility.core;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR*\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/accessibility/core/AccFakeInfoInstantReporter;", "Lcom/tencent/mm/accessibility/core/AccFrequencyControlReporter;", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "", "routeRule", "I", "getRouteRule", "()I", "setRouteRule", "(I)V", "EventId", "getEventId", "setEventId", "Lcom/tencent/mm/sdk/platformtools/o4;", "kotlin.jvm.PlatformType", "mmkv", "Lcom/tencent/mm/sdk/platformtools/o4;", "getMmkv", "()Lcom/tencent/mm/sdk/platformtools/o4;", "setMmkv", "(Lcom/tencent/mm/sdk/platformtools/o4;)V", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class AccFakeInfoInstantReporter extends com.tencent.mm.accessibility.core.AccFrequencyControlReporter {
    public static final com.tencent.mm.accessibility.core.AccFakeInfoInstantReporter INSTANCE = new com.tencent.mm.accessibility.core.AccFakeInfoInstantReporter();
    private static java.lang.String TAG = "MicroMsg.AccFakeInfoInstantReporter";
    private static int routeRule = 33811;
    private static java.lang.String EventId = "fake_info_create";
    private static com.tencent.mm.sdk.platformtools.o4 mmkv = com.tencent.mm.sdk.platformtools.o4.M("AccFakeInfoInstantReporter");

    private AccFakeInfoInstantReporter() {
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
    public void setRouteRule(int i17) {
        routeRule = i17;
    }

    @Override // x51.i0
    public void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        TAG = str;
    }
}
