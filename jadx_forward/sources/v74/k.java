package v74;

/* loaded from: classes4.dex */
public final class k {
    public k(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final s34.s a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
        if (map != null && !map.isEmpty()) {
            boolean z17 = true;
            if (!(str == null || str.length() == 0)) {
                if (!map.containsKey(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
                    return null;
                }
                s34.s sVar = new s34.s();
                java.lang.String str2 = (java.lang.String) map.get(str + ".pagUrl");
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (str2 == null) {
                    str2 = "";
                }
                sVar.f76715xc4a5ccf9 = str2;
                java.lang.String str3 = (java.lang.String) map.get(str + ".pagMD5");
                sVar.f484289a = str3 != null ? str3 : "";
                sVar.f484290b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".width"), 0);
                sVar.f484291c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".height"), 0);
                java.lang.String str4 = sVar.f76715xc4a5ccf9;
                if (!(str4 == null || str4.length() == 0)) {
                    java.lang.String str5 = sVar.f484289a;
                    if (str5 != null && str5.length() != 0) {
                        z17 = false;
                    }
                    if (!z17 && sVar.f484290b > 0 && sVar.f484291c > 0) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
                        return sVar;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
                return null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parsePagInfoFromXml", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo$Companion");
        return null;
    }
}
