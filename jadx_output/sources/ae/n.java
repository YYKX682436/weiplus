package ae;

/* loaded from: classes7.dex */
public class n implements gh.t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3361a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ae.a f3362b;

    public n(ae.a aVar, ae.b bVar) {
        this.f3362b = aVar;
    }

    @Override // gh.t
    public void a(java.lang.Object obj, boolean z17) {
    }

    @Override // gh.t
    public void b(java.lang.Object obj, int i17, int i18, boolean z17, boolean z18) {
        boolean z19 = this.f3361a;
        ae.a aVar = this.f3362b;
        if (z19) {
            this.f3361a = false;
            com.tencent.mm.plugin.appbrand.keylogger.w.e(aVar.N(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepSurfaceAvailable);
            return;
        }
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F();
        if (yVar != null) {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "hy: on resizeWindow");
            yVar.p(new com.tencent.mm.plugin.appbrand.page.q2());
        }
    }

    @Override // gh.t
    public void c(java.lang.Object obj, int i17, int i18) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) this.f3362b.F();
        if (yVar != null) {
            com.tencent.mars.xlog.Log.i("Luggage.AppBrandGameServiceLogicImp", "hy: on resizeWindow");
            yVar.p(new com.tencent.mm.plugin.appbrand.page.q2());
        }
    }
}
