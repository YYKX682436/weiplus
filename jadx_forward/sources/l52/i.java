package l52;

/* loaded from: classes15.dex */
public abstract class i {
    public static org.json.JSONObject a(r45.va6 va6Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("HABBYGE-MALI.HellTimelineReport", "createInvalidateFeed, timeline: %s, %s, %s", java.lang.Long.valueOf(va6Var.f469577e), java.lang.Long.valueOf(va6Var.f469578f), java.lang.Long.valueOf(va6Var.f469579g));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("feedId", "10001");
            jSONObject.put("viewLikeCount", 0);
            jSONObject.put("viewCommentCount", 0);
            jSONObject.put("userName", "");
            jSONObject.put("feedheight", 0);
            jSONObject.put("realShowTime", new java.math.BigDecimal(va6Var.f469577e).setScale(2, 4).doubleValue());
            jSONObject.put("stayTimeRelative", new java.math.BigDecimal(va6Var.f469577e).setScale(2, 4).doubleValue());
            jSONObject.put("realScreenHeight", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.HellTimelineReport", e17, "createInvalidateFeed-crash, %s", e17.getMessage());
        }
        return jSONObject;
    }
}
