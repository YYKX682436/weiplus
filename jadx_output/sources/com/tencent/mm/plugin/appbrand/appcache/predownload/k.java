package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes4.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.predownload.o f75856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f75857e;

    public k(com.tencent.mm.plugin.appbrand.appcache.predownload.o oVar, boolean z17) {
        this.f75856d = oVar;
        this.f75857e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75856d.s(this.f75857e);
    }
}
