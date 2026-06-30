package al1;

/* loaded from: classes7.dex */
public final class y implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout f5820d;

    public y(com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout appBrandTranslateLayout) {
        this.f5820d = appBrandTranslateLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandTranslateLayout appBrandTranslateLayout = this.f5820d;
        if (appBrandTranslateLayout.f91044i) {
            appBrandTranslateLayout.f91044i = false;
            al1.b0 b0Var = appBrandTranslateLayout.f91047o;
            if (b0Var != null) {
                tj1.r rVar = (tj1.r) b0Var;
                mi1.v vVar = rVar.f419710a;
                if (vVar != null) {
                    vVar.m();
                }
                new mi1.k2().x(rVar.f419711b.getRuntime().C0());
            }
        }
    }
}
