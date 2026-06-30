package r34;

/* loaded from: classes4.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r34.b a(org.json.JSONObject json) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("parseFromStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(json, "json");
        long optLong = json.optLong("snsId");
        java.lang.String optString = json.optString("aboveSnsId", "");
        java.lang.String optString2 = json.optString("belowSnsId", "");
        long optLong2 = json.optLong("createTime");
        if (optLong == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord$Companion");
            return null;
        }
        if (optString == null || optString.length() == 0) {
            if (optString2 == null || optString2.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord$Companion");
                return null;
            }
        }
        java.lang.String t07 = ca4.z0.t0(optLong);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t07);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        r34.b bVar = new r34.b(optLong, t07, optLong2, 0, 0, 0, null, optString, optString2, false, false, null, 3704, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("parseFromStorageJson", "com.tencent.mm.plugin.sns.ad.adpull.SnsAdPositionStorage$AdRecord$Companion");
        return bVar;
    }
}
