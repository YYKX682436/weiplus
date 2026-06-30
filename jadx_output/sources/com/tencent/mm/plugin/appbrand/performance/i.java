package com.tencent.mm.plugin.appbrand.performance;

/* loaded from: classes7.dex */
public enum i {
    INST;


    /* renamed from: d, reason: collision with root package name */
    public volatile android.os.HandlerThread f87354d;

    public android.os.HandlerThread h() {
        if (this.f87354d == null) {
            synchronized (this) {
                if (this.f87354d == null) {
                    int i17 = pu5.i.f358473b;
                    this.f87354d = pu5.f.a("MicroMsg.AppBrandPerformanceManager.DumpTraceThread", 5);
                    this.f87354d.start();
                }
            }
        }
        return this.f87354d;
    }
}
