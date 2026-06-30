package e74;

/* loaded from: classes4.dex */
public class c implements e74.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331492a;

    public c(e74.i iVar, java.lang.String str) {
        this.f331492a = str;
    }

    @Override // e74.j
    public void a(int i17, java.lang.String str, java.util.List list) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct, resp failed, respSnsId=" + str + ", errCode=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
            return;
        }
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct, data==null, respSnsId=" + str + ", errCode=" + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.a3 a3Var = (r45.a3) it.next();
            if (a3Var.f451223d == 10) {
                java.lang.String str2 = a3Var.f451224e;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct, respSnsId=" + str + ", resp=" + str2);
                if (str != null) {
                    i64.y.f370890d.a(str, str2);
                }
                z17 = true;
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.DynamicUpdate", "doUpdateAdFinderLivingProduct, resp no productItem, snsId=" + this.f331492a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResponse", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$3");
    }
}
