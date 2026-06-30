package s34;

/* loaded from: classes4.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f484355a;

    /* renamed from: b, reason: collision with root package name */
    public s34.v f484356b;

    /* renamed from: dropCardAnimInfo */
    @za4.k1
    public s34.p f76722x5f2c8e1e;

    /* renamed from: flyingFlipInfo */
    @za4.k1
    public s34.q f76723x63ae126a;

    /* renamed from: hugeDiskAnimInfo */
    @za4.k1
    public s34.r f76724x55766567;

    /* renamed from: pagThemeAnimInfo */
    @za4.k1
    public s34.t f76725x1442ce52;

    /* renamed from: randomSpriteAnimInfo */
    @za4.k1
    public s34.u f76726x352a9be7;

    /* renamed from: twistCardAnimInfo */
    @za4.k1
    public s34.w f76727xc2c52256;

    public static s34.x a(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        s34.x xVar = new s34.x();
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str + ".animationType"), 0);
        xVar.f484355a = D1;
        s34.v vVar = null;
        s34.q qVar = null;
        s34.r rVar = null;
        s34.u uVar = null;
        s34.t tVar = null;
        switch (D1) {
            case 1:
                xVar.f76727xc2c52256 = s34.w.a(map, str + ".hugeDiskInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 2:
                java.lang.String str2 = str + ".simpleTwistAnimInfo";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$SimpleTwistAnimInfo");
                if (map.containsKey(str2)) {
                    vVar = new s34.v();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str2);
                    sb6.append(".clockwise");
                    vVar.f484319a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(sb6.toString()), 0) == 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$SimpleTwistAnimInfo");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$SimpleTwistAnimInfo");
                }
                xVar.f484356b = vVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 3:
                xVar.f76722x5f2c8e1e = s34.p.a(map, str + ".dropCardAnimInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 4:
                java.lang.String str3 = str + ".pagThemeAnimInfo";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$PagThemeAnimInfo");
                if (map.containsKey(str3)) {
                    s34.t tVar2 = new s34.t();
                    s34.s sVar = new s34.s();
                    java.lang.String str4 = (java.lang.String) map.get(str3 + ".pagUrl");
                    if (str4 == null) {
                        str4 = "";
                    }
                    sVar.f76715xc4a5ccf9 = str4;
                    if (android.text.TextUtils.isEmpty(str4)) {
                        java.lang.String str5 = (java.lang.String) map.get(str3 + ".simpleTransitionAnimationUrl");
                        if (str5 == null) {
                            str5 = "";
                        }
                        sVar.f76715xc4a5ccf9 = str5;
                    }
                    java.lang.String str6 = (java.lang.String) map.get(str3 + ".pagMD5");
                    if (str6 == null) {
                        str6 = "";
                    }
                    sVar.f484289a = str6;
                    if (android.text.TextUtils.isEmpty(str6)) {
                        java.lang.String str7 = (java.lang.String) map.get(str3 + ".simpleTransitionAnimationMD5");
                        if (str7 == null) {
                            str7 = "";
                        }
                        sVar.f484289a = str7;
                    }
                    if (!android.text.TextUtils.isEmpty(sVar.f76715xc4a5ccf9) && !android.text.TextUtils.isEmpty(sVar.f484289a)) {
                        tVar2.f76717xd00e4e64 = sVar;
                    }
                    s34.s sVar2 = new s34.s();
                    java.lang.String str8 = (java.lang.String) map.get(str3 + ".lowQualityPagUrl");
                    if (str8 == null) {
                        str8 = "";
                    }
                    sVar2.f76715xc4a5ccf9 = str8;
                    java.lang.String str9 = (java.lang.String) map.get(str3 + ".lowQualityPagMD5");
                    sVar2.f484289a = str9 != null ? str9 : "";
                    if (!android.text.TextUtils.isEmpty(sVar2.f76715xc4a5ccf9) && !android.text.TextUtils.isEmpty(sVar2.f484289a)) {
                        tVar2.f76716x7c97e4d9 = sVar2;
                    }
                    tVar2.f484298a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str3 + ".pagDuration"), 0);
                    if (tVar2.f76717xd00e4e64 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$PagThemeAnimInfo");
                        tVar = tVar2;
                        xVar.f76725x1442ce52 = tVar;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                        return xVar;
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$PagThemeAnimInfo");
                xVar.f76725x1442ce52 = tVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 5:
                java.lang.String str10 = str + ".randomSpriteAnimInfo";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$RandomSpriteAnimInfo");
                if (map.containsKey(str10)) {
                    uVar = new s34.u();
                    uVar.f484315a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str10 + ".spriteType"), 0);
                    uVar.f484316b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str10 + ".spriteSizeType"), 0);
                    uVar.f484317c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) map.get(str10 + ".spriteDuration"), 0);
                    java.lang.String str11 = (java.lang.String) map.get(str10 + ".spriteImageUrl");
                    uVar.f76719x4fc233f9 = str11 != null ? str11 : "";
                    if (uVar.f484317c == 0) {
                        uVar.f484317c = 4000;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$RandomSpriteAnimInfo");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$RandomSpriteAnimInfo");
                }
                xVar.f76726x352a9be7 = uVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 6:
                java.lang.String str12 = str + ".hugeDiskImprovedInfo";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$HugeDiskAnimInfo");
                if (map.containsKey(str12)) {
                    rVar = new s34.r();
                    java.lang.String str13 = (java.lang.String) map.get(str12 + ".transitionImg");
                    if (str13 == null) {
                        str13 = "";
                    }
                    rVar.f76713xe8683144 = str13;
                    java.lang.String str14 = (java.lang.String) map.get(str12 + ".transitionColor");
                    rVar.f484277a = ca4.n0.e(str14 != null ? str14 : "", 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$HugeDiskAnimInfo");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$HugeDiskAnimInfo");
                }
                xVar.f76724x55766567 = rVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            case 7:
                java.lang.String str15 = str + ".flyingFlipInfo";
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$FlyingFlipInfo");
                if (map.containsKey(str15)) {
                    qVar = new s34.q();
                    java.lang.String str16 = (java.lang.String) map.get(str15 + ".transitionImg");
                    if (str16 == null) {
                        str16 = "";
                    }
                    qVar.f76711xe8683144 = str16;
                    java.lang.String str17 = (java.lang.String) map.get(str15 + ".transitionColor");
                    qVar.f484275a = ca4.n0.e(str17 != null ? str17 : "", 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$FlyingFlipInfo");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$FlyingFlipInfo");
                }
                xVar.f76723x63ae126a = qVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return xVar;
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doParse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return null;
        }
    }

    public static s34.x b(java.util.Map map, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        if (map == null || map.size() == 0 || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
            return null;
        }
        if (i17 == 2) {
            java.lang.String str2 = str + ".adCanvasInfo.eggAnimationInfo";
            if (map.containsKey(str2)) {
                s34.x a17 = a(map, str2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return a17;
            }
            java.lang.String str3 = str + ".adFullCardGestureCanvasInfo.eggAnimationInfo";
            if (map.containsKey(str3)) {
                s34.x a18 = a(map, str3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return a18;
            }
        } else {
            java.lang.String str4 = str + ".adCanvasInfo.eggAnimationInfo";
            if (map.containsKey(str4)) {
                s34.x a19 = a(map, str4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return a19;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        return null;
    }

    public static s34.x c(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        if (map == null || map.size() == 0 || android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
            return null;
        }
        s34.x a17 = a(map, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromAdXml", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        return a17;
    }
}
