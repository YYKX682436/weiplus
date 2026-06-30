package f54;

/* loaded from: classes4.dex */
public final class e0 extends ab4.u {
    public final java.lang.String A1;
    public final java.lang.String B1;

    /* renamed from: z1, reason: collision with root package name */
    public final java.lang.String f341251z1;

    public e0(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f341251z1 = str;
        this.A1 = str2;
        this.B1 = str3;
    }

    public static final f54.e0 b(java.util.Map map, java.lang.String str) {
        f54.e0 e0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo$Companion");
        if (!(map == null || map.isEmpty())) {
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = str + ".redEnvelopesSkinInfo";
                java.lang.String str3 = (java.lang.String) map.get(str2 + ".receiveUri");
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = (java.lang.String) map.get(str2 + ".extInfo");
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = (java.lang.String) map.get(str2 + ".scene");
                e0Var = new f54.e0(str3, str4, str5 != null ? str5 : "");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo$Companion");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
                return e0Var;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.RedPkgUrlBtnInfo", "the config map or component str is empty, Please check!");
        e0Var = new f54.e0("", "", "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingRedPacketUrlBtnInfo");
        return e0Var;
    }
}
