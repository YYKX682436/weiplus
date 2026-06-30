package com.tencent.liteapp.gen;

/* loaded from: classes15.dex */
public interface LiteAppReporterDependency {
    boolean calcIsSample();

    boolean calcIsTemporarySample();

    java.lang.String generateUUID();

    com.tencent.liteapp.gen.LiteAppMetricsInfo getMetricsInfo();

    void kvlog(int i17, java.lang.String str);

    boolean useNewSampling();
}
