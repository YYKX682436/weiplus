package e74;

/* loaded from: classes4.dex */
public class f implements d44.b {
    public f(e74.i iVar) {
    }

    @Override // d44.b
    public void a(java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$6");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "the requestLivingNoticeState return errorCode is  " + i18);
            if (i18 == 0 && (obj instanceof java.lang.Integer)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.DynamicUpdate", "requestLivingNoticeState, the snsId is " + str + ", livingStatus is " + obj);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2148xbe4a42a9.i0.g(str, ((java.lang.Integer) obj).intValue());
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ad.timeline.dynamic.DynamicUpdateRequestManager$6");
    }
}
