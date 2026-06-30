package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b;

/* loaded from: classes4.dex */
public abstract class w2 {
    public static java.lang.String a(java.lang.String str) {
        java.lang.String j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        java.lang.String str2 = "";
        try {
            j17 = gm0.j1.b().j();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StorageHelper", th6.toString());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StorageHelper", "HalfScreenSubscribe, snsId or uin is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "";
        }
        sb6.append(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
            j17 = "";
        }
        sb6.append(j17);
        if (sb6.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StorageHelper", "HalfScreenSubscribe, key is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return "";
        }
        str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("SnsAdVoteSubscribe", 0).getString(sb6.toString(), "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return str2;
    }

    public static int b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdVoteIndex", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        int c17 = c(str, str2, gm0.j1.b().j());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdVoteIndex", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return c17;
    }

    public static int c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdVoteIndex", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        java.lang.String d17 = d(str, str2, str3);
        int i17 = 0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
            java.lang.String[] split = d17.split("&");
            int i18 = 0;
            while (true) {
                if (i18 < split.length) {
                    java.lang.String str4 = split[i18];
                    if (str4 != null && str4.contains("voteResultIndex=")) {
                        i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[i18].substring(16), 0);
                        break;
                    }
                    i18++;
                } else {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdVoteIndex", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return i17;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        java.lang.String string = sb6.length() > 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("SnsAdVote", 0).getString(sb6.toString(), "") : "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return string;
    }

    public static boolean e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isAd", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        boolean z17 = str != null && str.startsWith("ad_table_");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isAd", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return z17;
    }

    public static boolean f(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        boolean z17 = !h(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return z17;
    }

    public static boolean g(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSns", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        boolean z17 = str != null && str.startsWith("sns_table_");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSns", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return z17;
    }

    public static boolean h(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        if (str.startsWith("ad_table_")) {
            z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str.substring(9)) != 0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return z17;
        }
        z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str.substring(10)) != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return z17;
    }

    public static java.lang.String i(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("packLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        java.lang.String str2 = str + j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("packLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return str2;
    }

    public static java.lang.String j(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("packSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        java.lang.String str2 = str + j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("packSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return str2;
    }

    public static void k(java.lang.String str, java.lang.String str2) {
        java.lang.String j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        try {
            j17 = gm0.j1.b().j();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StorageHelper", th6.toString());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, j17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StorageHelper", "HalfScreenSubscribe, snsId or uin is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "";
        }
        sb6.append(str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
            j17 = "";
        }
        sb6.append(j17);
        if (sb6.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StorageHelper", "HalfScreenSubscribe, key is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return;
        }
        java.lang.String sb7 = sb6.toString();
        android.content.SharedPreferences.Editor edit = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("SnsAdVoteSubscribe", 0).edit();
        edit.putString(sb7, str2);
        edit.commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StorageHelper", "HalfScreenSubscribe, key = " + sb7 + ", isSubscribe=" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveActionBtnTextRet", "com.tencent.mm.plugin.sns.storage.StorageHelper");
    }

    public static void l(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("saveSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StorageHelper", "saveSnsAdVoteInfo, url is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        if (str3 == null) {
            str3 = "";
        }
        sb6.append(str3);
        if (sb6.length() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StorageHelper", "saveSnsAdVoteInfo, key is empty");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return;
        }
        java.lang.String sb7 = sb6.toString();
        android.content.SharedPreferences.Editor edit = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("SnsAdVote", 0).edit();
        edit.putString(sb7, "voteResultIndex=" + i17 + "&isUpdate=" + i18);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        sb8.append("_voteRet");
        edit.putString(sb8.toString(), str4);
        edit.commit();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StorageHelper", "saveSnsAdVoteInfo, voteIdx=" + i17 + ", isUpdate=" + i18 + ", content=" + str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("saveSnsAdVoteInfo", "com.tencent.mm.plugin.sns.storage.StorageHelper");
    }

    public static int m(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unPackLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return 0;
        }
        if (str.startsWith("ad_table_")) {
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str.substring(9), 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return D1;
        }
        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str.substring(10), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackLocalId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return D12;
    }

    public static long n(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return 0L;
        }
        if (str.startsWith("ad_table_")) {
            long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str.substring(9));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return E1;
        }
        if (str.startsWith("sns_table_")) {
            long E12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str.substring(10));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
            return E12;
        }
        long E13 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unPackSnsId", "com.tencent.mm.plugin.sns.storage.StorageHelper");
        return E13;
    }
}
