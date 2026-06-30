package com.tencent.kinda.gen;

/* loaded from: classes.dex */
public interface KReportService {
    java.lang.String getLastSessionInfo();

    void idkeyStat(long j17, long j18, long j19, boolean z17);

    void kvStat(int i17, java.lang.String str);

    void setLastSessionInfo(java.lang.String str);

    long svrTimeMs();
}
