package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class l extends com.tencent.mm.plugin.appbrand.page.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.a f86841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.appbrand.page.a aVar, android.content.Context context) {
        super(context);
        this.f86841a = aVar;
    }

    public final float a() {
        xi1.g gVar;
        if (this.f86841a.J() != null) {
            gVar = this.f86841a.J().getWindowAndroid();
        } else if (this.f86841a.F() != null) {
            gVar = ((com.tencent.luggage.sdk.jsapi.component.b) this.f86841a.F()).getWindowAndroid();
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.AbstractMPPageViewRenderer", "__DeviceInfo.widthFromMetricsInDP() null window");
            gVar = null;
        }
        return (float) java.lang.Math.ceil((gVar != null ? gVar.getVDisplayMetrics().widthPixels : com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().widthPixels) / getPixelRatio());
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ya
    @android.webkit.JavascriptInterface
    public float getWidth() {
        try {
            float a17 = a();
            float ceil = (float) java.lang.Math.ceil(this.f86841a.f86371f.getWidth() / super.getPixelRatio());
            if (ceil > 0.0f && ceil != a17) {
                com.tencent.mars.xlog.Log.w("Luggage.AbstractMPPageViewRenderer", "__deviceInfo.getWidth(), resources[%f] != view[%f], may in pad env", java.lang.Float.valueOf(a17), java.lang.Float.valueOf(ceil));
            }
            return a17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AbstractMPPageViewRenderer", th6, "__DeviceInfo.getWidth()", new java.lang.Object[0]);
            throw th6;
        }
    }
}
