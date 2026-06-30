package lu1;

/* loaded from: classes9.dex */
public abstract class w {
    public static java.lang.String a(android.content.Context context, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1311x633fb29.C13038x357affe c13038x357affe) {
        int i18 = i17 % 10;
        if (i18 == 0) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avy);
        }
        if (i18 == 1) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avx);
        }
        if (i18 == 2) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avw);
        }
        if (i18 == 3) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.avv);
        }
        if (i18 != 4) {
            return null;
        }
        return c13038x357affe.f67745xd7ba23c8;
    }

    public static r45.ow b(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        r45.ow owVar = new r45.ow();
        owVar.f464104e = jSONObject.optString("announcement");
        owVar.f464103d = jSONObject.optString("card_id");
        owVar.f464105f = jSONObject.optInt("end_time", 0);
        owVar.f464106g = jSONObject.optInt("update_time", 0);
        owVar.f464107h = jSONObject.optString("label_wording");
        return owVar;
    }

    public static r45.pw c(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CardStickyHelper", "parseLayoutItemList param obj null");
            return null;
        }
        r45.pw pwVar = new r45.pw();
        pwVar.f464957d = new java.util.LinkedList();
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(ya.b.f77483x2837e24a);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                r45.ow b17 = b(jSONArray.getJSONObject(i17));
                if (b17 == null || (b17.f464105f <= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() && b17.f464105f != 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardStickyHelper", "item.end_time > Util.nowSecond()");
                } else {
                    pwVar.f464957d.add(b17);
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardStickyHelper", e17, "", new java.lang.Object[0]);
        }
        return pwVar;
    }

    public static void d(java.util.LinkedList linkedList, int i17) {
        if (linkedList == null) {
            return;
        }
        int size = linkedList.size();
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            r45.ow owVar = (r45.ow) linkedList.get(i18);
            xt1.e cj6 = xt1.t0.cj();
            java.lang.String str = owVar.f464103d;
            int i19 = ((size - i18) * 10) + i17;
            java.lang.String str2 = owVar.f464104e;
            int i27 = owVar.f464105f;
            cj6.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CardInfoStorage", "cardId null");
            } else {
                cj6.f537994d.A("UserCardInfo", "update UserCardInfo set stickyIndex=" + i19 + ", stickyAnnouncement='" + str2 + "', stickyEndTime=" + i27 + " where card_id='" + str + "'");
            }
        }
    }

    public static void e(java.util.LinkedList linkedList, int i17) {
        if (linkedList == null) {
            return;
        }
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            r45.ow owVar = (r45.ow) linkedList.get(i18);
            xt1.e cj6 = xt1.t0.cj();
            java.lang.String str = owVar.f464103d;
            java.lang.String str2 = owVar.f464107h;
            if (str2 == null) {
                str2 = "";
            }
            cj6.getClass();
            cj6.f537994d.A("UserCardInfo", "update UserCardInfo set stickyIndex=" + i17 + ", label_wording='" + str2 + "' where card_id='" + str + "'");
        }
    }
}
