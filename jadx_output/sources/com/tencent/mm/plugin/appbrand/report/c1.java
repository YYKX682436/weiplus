package com.tencent.mm.plugin.appbrand.report;

/* loaded from: classes4.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f87820d;

    public c1(int i17) {
        this.f87820d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1758, this.f87820d + 100);
    }
}
