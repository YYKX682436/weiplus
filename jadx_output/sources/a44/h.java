package a44;

/* loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a44.k f1270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1271e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f1273g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f1274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1275i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f1276m;

    public h(a44.k kVar, android.content.Context context, java.lang.String str, int i17, android.view.View view, android.view.View view2, int i18, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f1270d = kVar;
        this.f1271e = str;
        this.f1272f = i17;
        this.f1273g = view;
        this.f1274h = view2;
        this.f1275i = i18;
        this.f1276m = snsInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
        a44.k kVar = this.f1270d;
        if (kVar.c() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            android.view.ViewStub viewStub = kVar.f1287a;
            if (viewStub != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isImproveItem", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isImproveItem", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView complianceManagementView = (com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView) a84.y0.h(viewStub);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                kVar.f1290d = complianceManagementView;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComplianceManagementView", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
            }
        }
        if (kVar.d() != null) {
            android.view.View d17 = kVar.d();
            java.lang.Object tag = d17 != null ? d17.getTag(com.tencent.mm.R.id.nug) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show complianceManagementView, snsId is ");
            java.lang.String str3 = this.f1271e;
            sb6.append(str3);
            sb6.append(", tagSnsId is ");
            sb6.append(tag);
            com.tencent.mars.xlog.Log.i("AdDownloadHelper", sb6.toString());
            if ((tag instanceof java.lang.String) && !com.tencent.mm.sdk.platformtools.t8.N0(str3, tag) && ((java.lang.String) tag).equals(str3)) {
                com.tencent.mm.plugin.sns.ad.download.ComplianceManagementView c17 = kVar.c();
                if (c17 != null) {
                    c17.setContentWidth(this.f1272f);
                }
                a44.a a17 = i64.i.f289183d.i().a(str3);
                if (kVar.c() == null || !a44.k.f1285g.c(a17)) {
                    if (a17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(a17.n())) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
                        return;
                    }
                    android.view.View view = this.f1273g;
                    android.view.View view2 = this.f1274h;
                    int i17 = this.f1272f;
                    int i18 = this.f1275i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f1276m;
                    if (snsInfo == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    } else {
                        a44.a aVar = snsInfo.getAdXml().adCheckDownloadAppInfo;
                        if (aVar != null) {
                            java.lang.String T = ca4.z0.T(snsInfo);
                            kotlin.jvm.internal.o.f(T, "getSnsStringId(...)");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            java.util.HashMap hashMap = a44.k.f1286h;
                            java.lang.Long l17 = (java.lang.Long) hashMap.get(T);
                            boolean z17 = l17 == null || l17.longValue() == 0 || a84.f0.b() - l17.longValue() >= 5000;
                            if (z17) {
                                str2 = "run";
                                hashMap.put(T, java.lang.Long.valueOf(a84.f0.b()));
                            } else {
                                str2 = "run";
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isIntervalTimeExpired", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            if (z17) {
                                kotlinx.coroutines.y0 y0Var = kVar.f1289c;
                                if (y0Var != null) {
                                    kotlinx.coroutines.z0.c(y0Var, null);
                                }
                                kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
                                kVar.f1289c = b17;
                                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                                kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a.plus(kVar.f1292f), null, new a44.f(aVar, snsInfo, kVar, view, view2, i17, i18, null), 2, null);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            } else {
                                com.tencent.mars.xlog.Log.i("AdDownloadHelper", "isIntervalTimeExpired, snsId is " + ca4.z0.T(snsInfo));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                            str = str2;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    }
                    str2 = "run";
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doRequestDownloadInfo", "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper");
                    str = str2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
                }
                a44.k.a(this.f1270d, this.f1273g, this.f1274h, a17, this.f1272f, this.f1275i);
            }
        }
        str = "run";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.download.AdDownloadHelper$refreshUI$1$2");
    }
}
