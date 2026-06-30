package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class lc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.mc f86861e;

    public lc(com.tencent.mm.plugin.appbrand.page.mc mcVar, com.tencent.mm.plugin.appbrand.page.mc mcVar2) {
        this.f86860d = mcVar;
        this.f86861e = mcVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.page.mc mcVar = this.f86860d;
        if (!mcVar.f86885a.isRunning()) {
            com.tencent.mars.xlog.Log.e(mcVar.f86887c, "runOnUiThread in ui-thread PageView destroyed");
            return;
        }
        final com.tencent.mm.plugin.appbrand.page.p8 p8Var = this.f86861e.f86886b;
        p8Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - p8Var.H;
        if (currentTimeMillis < 1000) {
            p8Var.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.p8$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.page.p8.this.a();
                }
            }, java.lang.Math.max(0L, 1000 - currentTimeMillis));
        } else {
            p8Var.a();
        }
    }
}
