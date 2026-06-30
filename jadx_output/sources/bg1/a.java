package bg1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f19873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf.f f19874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg1.h f19875g;

    public a(bg1.h hVar, java.lang.String str, yf.i0 i0Var, sf.f fVar) {
        this.f19875g = hVar;
        this.f19872d = str;
        this.f19873e = i0Var;
        this.f19874f = fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        super.e(w0Var);
        bg1.h hVar = this.f19875g;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onPause mIsVoip:%b isVoipPageBackgroundRuntimeForegroundState:%b", java.lang.Boolean.valueOf(hVar.f19892c), java.lang.Boolean.valueOf(hVar.f19893d));
        if (hVar.f19892c && hVar.f19893d) {
            yf.i0 i0Var = this.f19873e;
            if (i0Var.f461362i == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onPause livePusherPluginHandler.getAdapter() null");
            } else {
                if (h()) {
                    return;
                }
                i0Var.f461362i.f(false);
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onPause enterBackground");
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "pushBegin, onReconnected");
        super.f();
        if (this.f19875g.f19894e) {
            fb1.e.f260836e.F3(fb1.d.f260833h, true, this.f19872d);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void g() {
        super.g();
        bg1.h hVar = this.f19875g;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onResume mIsVoip:%b isVoipPageBackgroundRuntimeForegroundState:%b", java.lang.Boolean.valueOf(hVar.f19892c), java.lang.Boolean.valueOf(hVar.f19893d));
        if (hVar.f19892c && hVar.f19893d) {
            yf.i0 i0Var = this.f19873e;
            if (i0Var.f461362i == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onResume livePusherPluginHandler.getAdapter() null");
            } else {
                if (h()) {
                    return;
                }
                i0Var.f461362i.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "onPause enterForeground");
            }
        }
    }

    public final boolean h() {
        bg1.h hVar;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime;
        sf.f fVar = this.f19874f;
        if (fVar == null || fVar.m() == null || (appBrandRuntime = (hVar = this.f19875g).f19895f) == null || appBrandRuntime.x0() == null || hVar.f19895f.x0().getCurrentPage() == null || hVar.f19895f.x0().getCurrentPage().getCurrentPageView() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "isLivePusherPageTheCurrentPage sth npe");
            return true;
        }
        int componentId = fVar.m().getComponentId();
        int componentId2 = hVar.f19895f.x0().getCurrentPage().getCurrentPageView().getComponentId();
        boolean z17 = componentId == componentId2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandLivePusherCustomHandler", "isLivePusherPageTheCurrentPage livePusherPageId:%d, livePusherPageId:%d", java.lang.Integer.valueOf(componentId), java.lang.Integer.valueOf(componentId2));
        return z17;
    }
}
