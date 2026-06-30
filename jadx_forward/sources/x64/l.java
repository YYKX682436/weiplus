package x64;

/* loaded from: classes4.dex */
public class l extends w64.a {
    public l(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        this.f524816a = c17702x544f64e9;
    }

    @Override // w64.a
    public boolean c(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "AdFinderLiveRoomClick doClick, source=" + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1837, 21);
        if (view == null || c17702x544f64e9 == null || c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "info null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return false;
        }
        android.content.Context context = view.getContext();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "context null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return false;
        }
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        long h17 = i64.y.h(c17702x544f64e9, T);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinderRoomInfoValid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(c17702x544f64e9.f38004xa53ddf1c, c17702x544f64e9.f38003x16eb5eed, c17702x544f64e9.f244107c0, c17702x544f64e9.f244109d0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinderRoomInfoValid", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "doClick, but clickActionInfo finderInfo invalid");
            e((com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("snsAdClick", null), c17702x544f64e9, h17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            try {
                db5.t7.g(context, "进入直播间失败");
            } catch (java.lang.Throwable unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showErrorToast", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return true;
        }
        e((com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("snsAdClick", null), c17702x544f64e9, h17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        try {
            e74.i.f().c(i17, c17933xe8d1b226);
        } catch (java.lang.Throwable unused2) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestLiveStatus", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        java.lang.String m17 = l44.s4.m(c17933xe8d1b226.m70375x338a8cc7(), T, l44.s4.c(c17702x544f64e9.f244102a));
        p52.h.f433549a.f(m17, c17702x544f64e9.f38004xa53ddf1c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.AdFinderLiveRoomClick.AdFinderLiveClick", "doClick, setSnsAdData, snsAdInfo=" + m17 + ", finderUsername=" + c17702x544f64e9.f38004xa53ddf1c + ", clickActionType=" + c17702x544f64e9.f244104b + ", adFinderLivingProductId=" + h17);
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        arrayMap.put("is_from_ad", bool);
        arrayMap.put("key_extra_info", m17);
        if (c17702x544f64e9.f244104b == 24) {
            arrayMap.put("key_auto_open_shopping_list", bool);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1837, 8);
        } else if (i64.y.j(h17)) {
            arrayMap.put("key_product_id", java.lang.Long.valueOf(h17));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1837, 9);
        }
        d44.h.e(context, c17702x544f64e9.f38004xa53ddf1c, c17702x544f64e9.f38003x16eb5eed, c17702x544f64e9.f244107c0, c17702x544f64e9.f244109d0, arrayMap, T, new x64.k(this, h17, context));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        return true;
    }

    public void d(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doJumpFinderLiveProductList", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        c(view, i17, c17933xe8d1b226, c17702x544f64e9, dVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doJumpFinderLiveProductList", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
    }

    public final void e(com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
        if (c11137xb05b06ad == null || c17702x544f64e9 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
            return;
        }
        if (c17702x544f64e9.f244104b == 24) {
            a84.u0.a(c11137xb05b06ad, 57);
        } else if (i64.y.j(j17)) {
            a84.u0.a(c11137xb05b06ad, 68);
        } else {
            a84.u0.a(c11137xb05b06ad, 44);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdFinderLiveRoomClick");
    }
}
