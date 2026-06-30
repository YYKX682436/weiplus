package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class yc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi1.a f87294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ad f87295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f87296f;

    public yc(pi1.a aVar, com.tencent.mm.plugin.appbrand.page.ad adVar, android.content.res.Configuration configuration) {
        this.f87294d = aVar;
        this.f87295e = adVar;
        this.f87296f = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xi1.g windowAndroid = this.f87295e.f86412a.getWindowAndroid();
        kotlin.jvm.internal.o.d(windowAndroid);
        this.f87294d.e(windowAndroid.shouldInLargeScreenCompatMode(), this.f87296f.orientation);
    }
}
