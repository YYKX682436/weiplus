package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class x7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87251d;

    public x7(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f87251d = n7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPageViewWC", "customActionBarIfNeed toSinglePageModeActionBar");
        this.f87251d.l4();
    }
}
