package e74;

/* loaded from: classes4.dex */
public class e implements e74.j {
    public e(e74.i iVar) {
    }

    @Override // e74.j
    public void a(int i17, java.lang.String str, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$5");
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, resp failed, respSnsId=" + str + ", errCode=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$5");
            return;
        }
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, data==null, respSnsId=" + str + ", errCode=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$5");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.a3 a3Var = (r45.a3) it.next();
            if (a3Var.f451223d == 13) {
                java.lang.String str2 = a3Var.f451224e;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "doUpdateDynamicFeedInfo, respSnsId=" + str + ", resp=" + str2);
                if (str != null) {
                    i64.u.f370855d.a(str, str2);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$5");
    }
}
