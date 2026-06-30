package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class s5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f88449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC f88450e;

    public s5(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC, android.content.res.Configuration configuration) {
        this.f88450e = appBrandRuntimeContainerWC;
        this.f88449d = configuration;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
        this.f88450e.n0(this.f88449d);
    }
}
