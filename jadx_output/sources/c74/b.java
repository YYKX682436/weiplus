package c74;

/* loaded from: classes4.dex */
public class b extends v64.b {

    /* renamed from: a, reason: collision with root package name */
    public int f39633a;

    public b(android.content.Context context) {
        super(context);
        this.f39633a = 0;
    }

    @Override // v64.b, v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        this.f39633a = i17;
        boolean a17 = super.a(view, i17, snsInfo, dVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        return a17;
    }

    @Override // v64.b
    public v64.c d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        d74.a aVar = null;
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        } else {
            try {
                adInfo = snsInfo.getAdInfo(this.f39633a);
            } catch (java.lang.Throwable unused) {
            }
            if (adInfo == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
            } else {
                if (adInfo.adActionType == 11) {
                    d74.a aVar2 = new d74.a();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
                    aVar = aVar2;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.topic.AdFinderTopicCardActionWrapper");
        return aVar;
    }
}
