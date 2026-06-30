package com.tencent.liteapp.gen;

/* loaded from: classes3.dex */
public final class LiteAppMetricsInfo {
    public long mAppAvailableMemory;
    public long mAppFootprintMemory;
    public long mAppPhysicalMemory;

    public LiteAppMetricsInfo() {
    }

    public LiteAppMetricsInfo(long j17, long j18, long j19) {
        this.mAppPhysicalMemory = j17;
        this.mAppAvailableMemory = j18;
        this.mAppFootprintMemory = j19;
    }

    public long getAppAvailableMemory() {
        return this.mAppAvailableMemory;
    }

    public long getAppFootprintMemory() {
        return this.mAppFootprintMemory;
    }

    public long getAppPhysicalMemory() {
        return this.mAppPhysicalMemory;
    }

    public java.lang.String toString() {
        return "LiteAppMetricsInfo{mAppPhysicalMemory=" + this.mAppPhysicalMemory + ",mAppAvailableMemory=" + this.mAppAvailableMemory + ",mAppFootprintMemory=" + this.mAppFootprintMemory + "}";
    }
}
