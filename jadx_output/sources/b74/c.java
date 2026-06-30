package b74;

/* loaded from: classes4.dex */
public class c extends a74.a {
    @Override // a74.a
    public boolean c(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.ADXml aDXml, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        com.tencent.mars.xlog.Log.i("SnsAd.FinderLiveClick.AdFinderLiveClick", "AdFinderLiveRoomClick doClick, source=" + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1837, 20);
        s34.c0 c0Var = aDXml.adFinderLiveInfo;
        boolean z17 = false;
        if (view == null || snsInfo == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLiveClick.AdFinderLiveClick", "info null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            return false;
        }
        android.content.Context context = view.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderLiveClick.AdFinderLiveClick", "context null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFinderRoomInfoValid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c0Var != null && !com.tencent.mm.sdk.platformtools.t8.N0(c0Var.f402595a, c0Var.f402596b, c0Var.f402597c, c0Var.f402598d)) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFinderRoomInfoValid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (!z17) {
            com.tencent.mars.xlog.Log.i("SnsAd.FinderLiveClick.AdFinderLiveClick", "doClick, but finderLiveInfo invalid");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable unused) {
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            return true;
        }
        java.lang.String T = ca4.z0.T(snsInfo);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        try {
            e74.i.f().c(i17, snsInfo);
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        java.lang.String m17 = l44.s4.m(snsInfo.getUxinfo(), T, 3);
        p52.h.f352016a.f(m17, c0Var.f402595a);
        com.tencent.mars.xlog.Log.i("SnsAd.FinderLiveClick.AdFinderLiveClick", "doClick, setSnsAdData, snsAdInfo=" + m17 + ", finderUsername=" + c0Var.f402595a);
        java.lang.Object tag = view.getTag();
        int i18 = snsInfo.localid;
        if (tag instanceof com.tencent.mm.plugin.sns.ui.oj) {
            i18 = ((com.tencent.mm.plugin.sns.ui.oj) tag).f170104c;
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.Ng((zy2.zb) c17, snsInfo.field_snsId, com.tencent.mm.sdk.platformtools.t8.E1(c0Var.f402596b), null, c0Var.f402595a, i18, 0L, ml2.x1.f328207n, "37", null, 0, null, 768, null);
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("is_from_ad", java.lang.Boolean.TRUE);
        arrayMap.put("key_extra_info", m17);
        d44.h.e(context, c0Var.f402595a, c0Var.f402596b, c0Var.f402597c, c0Var.f402598d, arrayMap, T, new b74.b(this, context));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        return true;
    }

    @Override // a74.a
    public int d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        return 44;
    }
}
