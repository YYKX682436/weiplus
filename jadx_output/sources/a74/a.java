package a74;

/* loaded from: classes4.dex */
public abstract class a implements v64.c {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        if (adXml == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return false;
        }
        try {
            boolean c17 = c(view, i17, snsInfo, adXml, dVar);
            if (c17) {
                e(i17, snsInfo, dVar);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return c17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            return false;
        }
    }

    public abstract boolean c(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADXml aDXml, v64.d dVar);

    public abstract int d();

    public void e(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = null;
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
        } else {
            i64.b1 b1Var = (i64.b1) dVar.a("snsAdStatistic", null);
            if (b1Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            } else {
                if (dVar.containsKey("flipStatus")) {
                    snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, snsInfo.field_snsId, 22, d(), ((java.lang.Integer) dVar.a("flipStatus", 0)).intValue());
                } else {
                    snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, snsInfo.field_snsId, 22, d());
                }
                ca4.m0.f(snsAdClick, b1Var, snsInfo, 22);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
            }
        }
        if (snsAdClick != null) {
            ca4.z0.x0(snsAdClick);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportSnsAdClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.AbsMaterialClickAction");
    }
}
