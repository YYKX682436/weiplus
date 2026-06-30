package c74;

/* loaded from: classes4.dex */
public abstract class a implements v64.c {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
            return false;
        }
        s34.h0 h0Var = snsInfo.getAdXml().adFinderTopicInfo;
        if (h0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.impl.FinderTopicCardAction");
        boolean a17 = d44.i.a(view.getContext(), h0Var.f402651a, h0Var.f402652b, snsInfo, 6, dVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.impl.FinderTopicCardAction");
        if (a17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, snsInfo.field_snsId, 32, 46);
            if (dVar != null && (b1Var = (i64.b1) dVar.a("sns_ad_statistic", null)) != null) {
                ca4.m0.f(snsAdClick, b1Var, snsInfo, 32);
            }
            ca4.z0.x0(snsAdClick);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AbsFinderTopicCardClickAction");
        return a17;
    }
}
