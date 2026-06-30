package b74;

/* loaded from: classes4.dex */
public class a extends a74.a {
    @Override // a74.a
    public boolean c(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADXml aDXml, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
        s34.h0 h0Var = aDXml.adFinderTopicInfo;
        if (h0Var == null || view == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.FinderTopicMaterialClick", "the finder topic info is null!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
            return false;
        }
        boolean a17 = d44.i.a(view.getContext(), h0Var.f402651a, h0Var.f402652b, snsInfo, 6, dVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
        return a17;
    }

    @Override // a74.a
    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdFinderTopicMaterialClick");
        return 46;
    }
}
