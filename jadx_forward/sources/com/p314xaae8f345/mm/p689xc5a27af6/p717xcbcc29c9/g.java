package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f146963a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f146964b;

    /* renamed from: c, reason: collision with root package name */
    public long f146965c;

    public g(java.util.Map commonParams, java.util.List reportMsgList, long j17, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        commonParams = (i17 & 1) != 0 ? new java.util.LinkedHashMap() : commonParams;
        reportMsgList = (i17 & 2) != 0 ? new java.util.ArrayList() : reportMsgList;
        if ((i17 & 8) != 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            j18 = java.lang.System.currentTimeMillis();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonParams, "commonParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportMsgList, "reportMsgList");
        this.f146963a = commonParams;
        this.f146964b = reportMsgList;
        this.f146965c = j18;
    }
}
