package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f65430a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f65431b;

    /* renamed from: c, reason: collision with root package name */
    public long f65432c;

    public g(java.util.Map commonParams, java.util.List reportMsgList, long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        commonParams = (i17 & 1) != 0 ? new java.util.LinkedHashMap() : commonParams;
        reportMsgList = (i17 & 2) != 0 ? new java.util.ArrayList() : reportMsgList;
        if ((i17 & 8) != 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            j18 = java.lang.System.currentTimeMillis();
        }
        kotlin.jvm.internal.o.g(commonParams, "commonParams");
        kotlin.jvm.internal.o.g(reportMsgList, "reportMsgList");
        this.f65430a = commonParams;
        this.f65431b = reportMsgList;
        this.f65432c = j18;
    }
}
