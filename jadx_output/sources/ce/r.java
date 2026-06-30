package ce;

/* loaded from: classes7.dex */
public class r implements com.tencent.mm.plugin.appbrand.page.gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ce.o f40721a;

    public r(ce.o oVar) {
        this.f40721a = oVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.gb
    public void a(com.tencent.mm.plugin.appbrand.page.AppBrandPageFullScreenView appBrandPageFullScreenView) {
        if (appBrandPageFullScreenView == null || appBrandPageFullScreenView.getParent() != null) {
            return;
        }
        this.f40721a.f40685f.addView(appBrandPageFullScreenView, new android.view.ViewGroup.LayoutParams(-1, -1));
    }
}
