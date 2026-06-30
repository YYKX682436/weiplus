package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class o2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f86157d;

    public o2(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f86157d = appBrandRuntime;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f86157d;
        appBrandRuntime.K("onResourcePrepareTimeout", new java.lang.Object[0]);
        appBrandRuntime.q1();
        return false;
    }
}
