package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class xb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xi1.n f87257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.dc f87258e;

    public xb(com.tencent.mm.plugin.appbrand.page.dc dcVar, xi1.n nVar) {
        this.f87258e = dcVar;
        this.f87257d = nVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87258e.d(this.f87257d);
    }
}
