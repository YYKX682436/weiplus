package bg;

/* loaded from: classes7.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19816d;

    public m(bg.f fVar) {
        this.f19816d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19816d;
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = fVar.f19775s.m();
        com.tencent.mm.plugin.appbrand.page.v5 V0 = m17 instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) m17 : m17 instanceof com.tencent.mm.plugin.appbrand.e9 ? ((com.tencent.mm.plugin.appbrand.e9) m17).V0() : null;
        if (V0 != null) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = V0.getRuntime();
            com.tencent.mars.xlog.Log.i(fVar.A(), "requestAppEnterBackground close runtime");
            runtime.S();
        }
    }
}
