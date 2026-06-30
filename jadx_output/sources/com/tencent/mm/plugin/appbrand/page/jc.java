package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class jc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86799f;

    public jc(com.tencent.mm.plugin.appbrand.page.mc mcVar, com.tencent.mm.plugin.appbrand.page.mc mcVar2, java.lang.String str) {
        this.f86797d = mcVar;
        this.f86798e = mcVar2;
        this.f86799f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.mc mcVar = this.f86797d;
        if (mcVar.f86885a.isRunning()) {
            this.f86798e.f86886b.setPullDownText(this.f86799f);
        } else {
            com.tencent.mars.xlog.Log.e(mcVar.f86887c, "runOnUiThread in ui-thread PageView destroyed");
        }
    }
}
