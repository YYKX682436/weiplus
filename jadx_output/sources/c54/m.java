package c54;

/* loaded from: classes4.dex */
public final class m implements com.tencent.mm.plugin.finder.webview.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c54.k f38712a;

    public m(c54.k kVar) {
        this.f38712a = kVar;
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.LayoutBuilder", "--onError");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 9);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void b(boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateBoxWebViewEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.LayoutBuilder", "--onCreateBoxWebViewEnd, enablePreload=" + z17 + ", useCache=" + z19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateBoxWebViewEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInitWebViewStart", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.LayoutBuilder", "--onInitWebViewStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInitWebViewStart", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInitWebViewEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.LayoutBuilder", "--onInitWebViewEnd");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInitWebViewEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateBoxWebViewStart", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.LayoutBuilder", "--onCreateBoxWebViewStart");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateBoxWebViewStart", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void f(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onExecuteActionCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.LayoutBuilder", "--onExecuteActionCode");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onExecuteActionCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
    }

    @Override // com.tencent.mm.plugin.finder.webview.o0
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onWebViewReady", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
        com.tencent.mars.xlog.Log.i("SnsAd.HalfEggCard.LayoutBuilder", "--onWebViewReady, stopLoading");
        c54.k kVar = this.f38712a;
        com.tencent.mm.ui.widget.MMProcessBar n17 = kVar.n();
        if (n17 != null) {
            n17.setTag(com.tencent.mm.R.id.v7_, java.lang.Boolean.TRUE);
        }
        com.tencent.mm.ui.widget.MMProcessBar n18 = kVar.n();
        if (n18 != null) {
            n18.setVisibility(4);
        }
        com.tencent.mm.ui.widget.MMProcessBar n19 = kVar.n();
        if (n19 != null) {
            n19.e();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1970, 8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onWebViewReady", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$initWebView$2");
    }
}
