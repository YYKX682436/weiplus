package f54;

/* loaded from: classes4.dex */
public class g0 extends ab4.d0 {
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f341254J;
    public java.util.ArrayList K;
    public java.util.ArrayList L;
    public java.lang.String M;
    public java.lang.String N;

    /* renamed from: adAvatarImg */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f69688x353d3ec7;

    /* renamed from: avatarBackgroundImg */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f69689xaeeabadc;

    /* renamed from: backgroundImgCommon */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f69690x5d34e00;

    /* renamed from: backgroundImgWithFriends */
    @za4.k1(m178630x415c6bfa = 2)
    public java.lang.String f69691x429706fa;

    public static f54.g0 b(java.util.Map map, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
        try {
            f54.g0 g0Var = new f54.g0();
            java.lang.String str2 = (java.lang.String) map.get(str + ".titlePrefix");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            g0Var.F = str2;
            java.lang.String str4 = (java.lang.String) map.get(str + ".titleInfix");
            if (str4 == null) {
                str4 = "";
            }
            g0Var.G = str4;
            java.lang.String str5 = (java.lang.String) map.get(str + ".titleSuffix");
            if (str5 == null) {
                str5 = "";
            }
            g0Var.H = str5;
            java.lang.String str6 = (java.lang.String) map.get(str + ".desc");
            if (str6 == null) {
                str6 = "";
            }
            g0Var.I = str6;
            java.lang.String str7 = (java.lang.String) map.get(str + ".backgroundImgWithFriends");
            if (str7 == null) {
                str7 = "";
            }
            g0Var.f69691x429706fa = str7;
            java.lang.String str8 = (java.lang.String) map.get(str + ".backgroundImgCommon");
            if (str8 == null) {
                str8 = "";
            }
            g0Var.f69690x5d34e00 = str8;
            java.lang.String str9 = (java.lang.String) map.get(str + ".avatarBackgroundImg");
            if (str9 == null) {
                str9 = "";
            }
            g0Var.f69689xaeeabadc = str9;
            java.lang.String str10 = (java.lang.String) map.get(str + ".avatarDesc");
            if (str10 == null) {
                str10 = "";
            }
            g0Var.f341254J = str10;
            java.lang.String str11 = (java.lang.String) map.get(str + ".adAvatarImg");
            if (str11 == null) {
                str11 = "";
            }
            g0Var.f69688x353d3ec7 = str11;
            g0Var.K = new java.util.ArrayList();
            int i17 = 0;
            int i18 = 0;
            while (true) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(".friendAvatarImgs.username");
                sb6.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
                java.lang.String sb7 = sb6.toString();
                if (!map.containsKey(sb7)) {
                    break;
                }
                java.lang.String str12 = (java.lang.String) map.get(sb7);
                if (str12 == null) {
                    str12 = "";
                }
                if (!android.text.TextUtils.isEmpty(str12)) {
                    g0Var.K.add(str12);
                }
                i18++;
            }
            g0Var.L = new java.util.ArrayList();
            while (true) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(str);
                sb8.append(".commonAvatarImgs.imageUrl");
                sb8.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                java.lang.String sb9 = sb8.toString();
                if (!map.containsKey(sb9)) {
                    break;
                }
                java.lang.String str13 = (java.lang.String) map.get(sb9);
                if (str13 == null) {
                    str13 = "";
                }
                if (!android.text.TextUtils.isEmpty(str13)) {
                    g0Var.L.add(str13);
                }
                i17++;
            }
            java.lang.String str14 = (java.lang.String) map.get(str + ".friendAvatarDescWithFriends");
            if (str14 == null) {
                str14 = "";
            }
            g0Var.M = str14;
            java.lang.String str15 = (java.lang.String) map.get(str + ".friendAvatarDescCommon");
            if (str15 != null) {
                str3 = str15;
            }
            g0Var.N = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
            return g0Var;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageComponentInfo", "parseFromXml, exp=" + th6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageComponentInfo", "parseFromXml, null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromXml", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
            return null;
        }
    }

    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateFromJson", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdLandingPageComponentInfo", "updateFromJson, json=" + str);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("titlePrefix");
            if (!android.text.TextUtils.isEmpty(optString)) {
                this.F = optString;
            }
            java.lang.String optString2 = jSONObject.optString("titleInfix");
            if (!android.text.TextUtils.isEmpty(optString2)) {
                this.G = optString2;
            }
            java.lang.String optString3 = jSONObject.optString("titleSuffix");
            if (!android.text.TextUtils.isEmpty(optString3)) {
                this.H = optString3;
            }
            java.lang.String optString4 = jSONObject.optString("desc");
            if (!android.text.TextUtils.isEmpty(optString4)) {
                this.I = optString4;
            }
            java.lang.String optString5 = jSONObject.optString("avatarDesc");
            if (!android.text.TextUtils.isEmpty(optString5)) {
                this.f341254J = optString5;
            }
            java.lang.String optString6 = jSONObject.optString("friendAvatarDescWithFriends");
            if (!android.text.TextUtils.isEmpty(optString6)) {
                this.M = optString6;
            }
            java.lang.String optString7 = jSONObject.optString("friendAvatarDescCommon");
            if (!android.text.TextUtils.isEmpty(optString7)) {
                this.N = optString7;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("friendAvatarImgs");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    java.lang.String optString8 = optJSONArray.optString(i17);
                    if (!android.text.TextUtils.isEmpty(optString8)) {
                        arrayList.add(optString8);
                    }
                }
            }
            this.K = arrayList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("commonAvatarImgs");
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    java.lang.String optString9 = optJSONArray2.optString(i18);
                    if (!android.text.TextUtils.isEmpty(optString9)) {
                        arrayList2.add(optString9);
                    }
                }
            }
            if (arrayList2.size() > 0) {
                this.L = arrayList2;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AdLandingPageComponentInfo", "updateFromJson, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateFromJson", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
    }

    /* renamed from: toString */
    public java.lang.String m129064x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[titlePrefix=");
        sb6.append(this.F);
        sb6.append(", titleInfix=");
        sb6.append(this.G);
        sb6.append(", titleSuffix=");
        sb6.append(this.H);
        sb6.append(", desc=");
        sb6.append(this.I);
        sb6.append(", backgroundImgWithFriends=");
        sb6.append(this.f69691x429706fa);
        sb6.append(", backgroundImgCommon=");
        sb6.append(this.f69690x5d34e00);
        sb6.append(", avatarBackgroundImg=");
        sb6.append(this.f69689xaeeabadc);
        sb6.append(", avatarDesc=");
        sb6.append(this.f341254J);
        sb6.append(", adAvatarImg=");
        sb6.append(this.f69688x353d3ec7);
        sb6.append(", userNameList.size=");
        java.util.ArrayList arrayList = this.K;
        sb6.append(arrayList == null ? 0 : arrayList.size());
        sb6.append(", avatarUrlList.size=");
        java.util.ArrayList arrayList2 = this.L;
        sb6.append(arrayList2 != null ? arrayList2.size() : 0);
        sb6.append(", friendAvatarDescWithFriends=");
        sb6.append(this.M);
        sb6.append(", friendAvatarDescCommon=");
        sb6.append(this.N);
        sb6.append("]");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingSocialCardCompInfo");
        return sb7;
    }
}
