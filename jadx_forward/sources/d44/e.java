package d44;

/* loaded from: classes4.dex */
public class e extends d44.d implements vd2.g5 {
    @Override // vd2.g5
    public void a(java.lang.Object obj) {
        int intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
        int i17 = -1;
        if (num == null) {
            intValue = -1;
        } else {
            try {
                intValue = num.intValue();
            } catch (java.lang.Throwable unused) {
            }
        }
        if (intValue != 0) {
            i17 = intValue;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.FinderLivingRequest", "onCallback err, errCode=" + i17);
        b(i17, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCallback", "com.tencent.mm.plugin.sns.ad.finder.FinderLivingRequest$RequestErrorCallBack");
    }
}
