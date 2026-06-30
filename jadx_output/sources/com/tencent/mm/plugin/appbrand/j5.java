package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class j5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.l5 f78468d;

    public j5(com.tencent.mm.plugin.appbrand.l5 l5Var) {
        this.f78468d = l5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = this.f78468d.getActiveRuntime();
        if (activeRuntime != null) {
            activeRuntime.f0();
        }
    }
}
