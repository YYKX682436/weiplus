package s34;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f484263a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f484264b;

    /* renamed from: transitionAnimationUrl */
    @za4.k1(m178630x415c6bfa = 3)
    public java.lang.String f76710xe3c4bd40;

    public static s34.p a(java.util.Map map, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList;
        int i17;
        java.lang.String str4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
        try {
            str2 = (java.lang.String) map.get(str + ".transitionAnimationUrl");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            str3 = (java.lang.String) map.get(str + ".transitionAnimationMD5");
            if (str3 == null) {
                str3 = "";
            }
            arrayList = new java.util.ArrayList();
            i17 = 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdEggAnimationInfo", "ShakeCardInfo parseFromXml, exp=" + th6.toString());
        }
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(".transitionImgInfos.transitionImgInfo");
            sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            if (!map.containsKey(sb7)) {
                break;
            }
            java.lang.String str5 = (java.lang.String) map.get(sb7 + ".transitionImg");
            if (str5 == null) {
                str5 = "";
            }
            try {
                java.lang.String str6 = (java.lang.String) map.get(sb7 + ".transitionColor");
                if (str6 == null) {
                    str6 = "";
                }
                java.lang.String str7 = (java.lang.String) map.get(sb7 + ".transitionColorAlpha");
                if (str7 == null) {
                    str7 = "";
                }
                str4 = ca4.m0.q0(str6, str7);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdEggAnimationInfo", "parseFromXml ShakeCardInfo parse color exp=" + e17.toString());
                str4 = "";
            }
            if (!android.text.TextUtils.isEmpty(str5) || !android.text.TextUtils.isEmpty(str4)) {
                s34.o oVar = new s34.o();
                oVar.f484253a = str5;
                oVar.f484254b = str4;
                arrayList.add(oVar);
            }
            i17++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdEggAnimationInfo", "ShakeCardInfo parseFromXml, exp=" + th6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
            return null;
        }
        if (arrayList.size() > 0) {
            s34.p pVar = new s34.p();
            pVar.f484263a = arrayList;
            pVar.f76710xe3c4bd40 = str2;
            pVar.f484264b = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
            return pVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
        return null;
    }
}
