package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030;

/* loaded from: classes7.dex */
public enum i {
    INST;


    /* renamed from: d, reason: collision with root package name */
    public volatile android.os.HandlerThread f168887d;

    public android.os.HandlerThread h() {
        if (this.f168887d == null) {
            synchronized (this) {
                if (this.f168887d == null) {
                    int i17 = pu5.i.f440006b;
                    this.f168887d = pu5.f.a("MicroMsg.AppBrandPerformanceManager.DumpTraceThread", 5);
                    this.f168887d.start();
                }
            }
        }
        return this.f168887d;
    }
}
