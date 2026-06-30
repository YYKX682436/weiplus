package a54;

/* loaded from: classes3.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a54.e f1591e;

    public c(a54.e eVar, java.lang.String str) {
        this.f1591e = eVar;
        this.f1590d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        a54.e eVar = this.f1591e;
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        if (eVar.f1594b == null) {
            android.view.ViewStub viewStub = (android.view.ViewStub) eVar.f1593a.findViewById(com.tencent.mm.R.id.imh);
            if (viewStub != null) {
                eVar.f1594b = viewStub.inflate();
            }
            android.view.View view = eVar.f1594b;
            if (view != null) {
                eVar.f1595c = (android.widget.TextView) eVar.f1594b.findViewById(com.tencent.mm.R.id.f482662kk);
                eVar.f1594b.setOnClickListener(new a54.b(eVar));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
        if (a54.e.a(eVar) != null) {
            java.lang.String str = this.f1590d;
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                android.widget.TextView textView = eVar.f1595c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                textView.setVisibility(8);
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                android.widget.TextView textView2 = eVar.f1595c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                textView2.setText(str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                android.widget.TextView textView3 = eVar.f1595c;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper");
                textView3.setVisibility(0);
            }
            android.view.View a17 = a54.e.a(eVar);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/sns/ad/landingpage/AdLandingPageLoadingHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.AdLandingPageLoadingHelper$2");
    }
}
