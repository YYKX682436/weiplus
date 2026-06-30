package ce;

/* loaded from: classes7.dex */
public class e extends android.widget.FrameLayout implements com.tencent.mm.plugin.appbrand.page.ib {

    /* renamed from: d, reason: collision with root package name */
    public ce.d f40670d;

    public e(android.content.Context context) {
        super(context);
        this.f40670d = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ib
    public void a(com.tencent.mm.plugin.appbrand.page.bb bbVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ma
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ib
    public android.view.ViewGroup getContainer() {
        return this;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.r8
    public void h(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ja
    public void j(boolean z17, int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ib
    public void l(com.tencent.mm.plugin.appbrand.page.fb fbVar) {
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if ((view instanceof com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) && !view.hasOnClickListeners()) {
            view.setOnTouchListener(new ce.c(null));
        }
        ce.d dVar = this.f40670d;
        if (dVar != null) {
            dVar.C(view);
        }
    }

    public void setNativeWidgetAddedCallback(ce.d dVar) {
        this.f40670d = dVar;
    }

    public void setupWebViewTouchInterceptor(com.tencent.mm.plugin.appbrand.page.fb fbVar) {
    }
}
