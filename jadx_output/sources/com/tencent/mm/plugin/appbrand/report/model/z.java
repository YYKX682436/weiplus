package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public class z extends ku5.f {
    @Override // ku5.f
    public void b(java.lang.Runnable runnable, java.lang.Throwable th6) {
        if (runnable instanceof com.tencent.mm.plugin.appbrand.report.model.c0) {
            ((java.util.concurrent.ConcurrentLinkedQueue) com.tencent.mm.plugin.appbrand.report.model.e0.f87939c.f87936a).offer((com.tencent.mm.plugin.appbrand.report.model.c0) runnable);
        }
    }
}
