package a74;

/* loaded from: classes4.dex */
public class b extends v64.b {

    /* renamed from: a, reason: collision with root package name */
    public int f1938a;

    public b(android.content.Context context) {
        super(context);
        this.f1938a = 0;
    }

    @Override // v64.b, v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        this.f1938a = i17;
        boolean a17 = super.a(view, i17, snsInfo, dVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        return a17;
    }

    @Override // v64.b
    public v64.c d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        v64.c aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        v64.c cVar = null;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        } else {
            try {
                adInfo = snsInfo.getAdInfo(this.f1938a);
            } catch (java.lang.Throwable unused) {
            }
            if (adInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
            } else {
                int i17 = adInfo.adActionType;
                if (i17 == 10) {
                    aVar = new b74.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                } else {
                    if (i17 == 11) {
                        aVar = new b74.a();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
                }
                cVar = aVar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AdActionMaterialClickWrapper");
        return cVar;
    }
}
