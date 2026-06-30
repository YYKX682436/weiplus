package t74;

/* loaded from: classes4.dex */
public final class z1 {
    public z1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.util.List a(java.util.Map map, java.lang.String str) {
        t74.g2 g2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseMediaCardHolesList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".cardHole");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseMediaCardHolesList", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardInfo$Companion");
                return arrayList;
            }
            java.lang.String str2 = (java.lang.String) map.get(sb7);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str3 = str2 == null ? "" : str2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo$Companion");
            if (str3.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo$Companion");
                g2Var = null;
            } else {
                java.util.List f07 = r26.n0.f0(str3, new java.lang.String[]{"|"}, false, 0, 6, null);
                t74.g2 g2Var2 = new t74.g2();
                float parseFloat = java.lang.Float.parseFloat((java.lang.String) f07.get(0));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLeftRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                g2Var2.f497674a = parseFloat;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLeftRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                float parseFloat2 = java.lang.Float.parseFloat((java.lang.String) f07.get(1));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTopRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                g2Var2.f497675b = parseFloat2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTopRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                float parseFloat3 = java.lang.Float.parseFloat((java.lang.String) f07.get(2));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setWidthRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                g2Var2.f497676c = parseFloat3;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setWidthRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                float parseFloat4 = java.lang.Float.parseFloat((java.lang.String) f07.get(3));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHeightRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                g2Var2.f497677d = parseFloat4;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHeightRatio", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.CardHoleInfo$Companion");
                g2Var = g2Var2;
            }
            if (g2Var != null) {
                arrayList.add(g2Var);
            }
            i17++;
        }
    }
}
