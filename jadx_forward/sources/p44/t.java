package p44;

/* loaded from: classes4.dex */
public final class t {
    public t(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final p44.u a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$Companion");
        if (map == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$Companion");
            return null;
        }
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$Companion");
            return null;
        }
        p44.u uVar = new p44.u();
        int e17 = ca4.n0.e((java.lang.String) map.get(str.concat(".titleColorAvailable")), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        uVar.f433387a = e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleColorAvailable", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        int e18 = ca4.n0.e((java.lang.String) map.get(str.concat(".titleColorAvailableDark")), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleColorAvailableDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        uVar.f433388b = e18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleColorAvailableDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        int e19 = ca4.n0.e((java.lang.String) map.get(str.concat(".titleColorPicked")), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        uVar.f433389c = e19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleColorPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        int e27 = ca4.n0.e((java.lang.String) map.get(str.concat(".titleColorPickedDark")), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleColorPickedDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        uVar.f433390d = e27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleColorPickedDark", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo");
        java.lang.String str2 = (java.lang.String) map.get(str.concat(".backgroundImageUrl"));
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        uVar.f76388xc65d0d62 = str2;
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".cardItems.cardItem");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                break;
            }
            p44.s sVar = new p44.s();
            java.lang.String str3 = (java.lang.String) map.get(sb7 + ".imageUrl");
            if (str3 == null) {
                str3 = "";
            }
            sVar.f76387xccc36214 = str3;
            java.lang.String str4 = (java.lang.String) map.get(sb7 + ".title");
            if (str4 == null) {
                str4 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            sVar.f433381a = str4;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitle", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            java.lang.String str5 = (java.lang.String) map.get(sb7 + ".cardId");
            if (str5 == null) {
                str5 = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            sVar.f433382b = str5;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setXmlIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            sVar.f433384d = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setXmlIndex", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$CardItem");
            java.lang.String b17 = sVar.b();
            if (b17 == null || b17.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RandomPickCardInfo", "cardId==null");
            } else {
                uVar.f76389x61d0ad81.add(sVar);
            }
            if (uVar.f76389x61d0ad81.size() >= 5) {
                break;
            }
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardInfo$Companion");
        return uVar;
    }
}
