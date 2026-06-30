package b74;

/* loaded from: classes4.dex */
public class c extends a74.a {
    @Override // a74.a
    public boolean c(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLiveClick.AdFinderLiveClick", "AdFinderLiveRoomClick doClick, source=" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1837, 20);
        s34.c0 c0Var = c17903x3b438f4.f38175x5fd0e903;
        boolean z17 = false;
        if (view == null || c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLiveClick.AdFinderLiveClick", "info null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            return false;
        }
        android.content.Context context = view.getContext();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.FinderLiveClick.AdFinderLiveClick", "context null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinderRoomInfoValid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (c0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(c0Var.f484128a, c0Var.f484129b, c0Var.f484130c, c0Var.f484131d)) {
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinderRoomInfoValid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLiveClick.AdFinderLiveClick", "doClick, but finderLiveInfo invalid");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
            return true;
        }
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        try {
            e74.i.f().c(i17, c17933xe8d1b226);
        } catch (java.lang.Throwable unused2) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        java.lang.String m17 = l44.s4.m(c17933xe8d1b226.m70375x338a8cc7(), T, 3);
        p52.h.f433549a.f(m17, c0Var.f484128a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLiveClick.AdFinderLiveClick", "doClick, setSnsAdData, snsAdInfo=" + m17 + ", finderUsername=" + c0Var.f484128a);
        java.lang.Object tag = view.getTag();
        int i18 = c17933xe8d1b226.f38324x142bbdc6;
        if (tag instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) {
            i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) tag).f251637c;
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.Ng((zy2.zb) c17, c17933xe8d1b226.f68891x29d1292e, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(c0Var.f484129b), null, c0Var.f484128a, i18, 0L, ml2.x1.f409740n, "37", null, 0, null, 768, null);
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put("is_from_ad", java.lang.Boolean.TRUE);
        arrayMap.put("key_extra_info", m17);
        d44.h.e(context, c0Var.f484128a, c0Var.f484129b, c0Var.f484130c, c0Var.f484131d, arrayMap, T, new b74.b(this, context));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        return true;
    }

    @Override // a74.a
    public int d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionType", "com.tencent.mm.plugin.sns.ad.timeline.clicker.material.impl.AdMaterialFinderLiveClick");
        return 44;
    }
}
