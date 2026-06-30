package a44;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a44.k f1267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f1269f;

    public g(a44.k kVar, java.lang.String str, android.view.View view) {
        this.f1267d = kVar;
        this.f1268e = str;
        this.f1269f = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$1");
        a44.k kVar = this.f1267d;
        if (kVar.d() != null) {
            android.view.View d17 = kVar.d();
            java.lang.Object tag = d17 != null ? d17.getTag(com.tencent.mm.R.id.nug) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resetComplianceViewUI, snsId is ");
            java.lang.String str = this.f1268e;
            sb6.append(str);
            sb6.append(", tagSnsId is ");
            sb6.append(tag);
            com.tencent.mars.xlog.Log.i("AdDownloadHelper", sb6.toString());
            if ((tag instanceof java.lang.String) && !com.tencent.mm.sdk.platformtools.t8.N0(str, tag) && ((java.lang.String) tag).equals(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resetCardAdBottomLabel", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                kVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCardAdBottomLabel", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                android.view.View view = this.f1269f;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "resetCardAdBottomLabel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/download/AdDownloadHelper", "resetCardAdBottomLabel", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                kVar.j();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCardAdBottomLabel", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resetCardAdBottomLabel", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$1");
    }
}
