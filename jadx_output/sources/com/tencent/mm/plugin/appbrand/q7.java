package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.r7 f87735d;

    public q7(com.tencent.mm.plugin.appbrand.r7 r7Var) {
        this.f87735d = r7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f87735d.f87758d.f86036f.f85093b) {
            return;
        }
        com.tencent.mm.plugin.appbrand.c6.a(6, this.f87735d.f87758d.f86038h.u0());
        this.f87735d.f87758d.f86038h.z1(null, "safeCheckAvailableLib");
    }
}
