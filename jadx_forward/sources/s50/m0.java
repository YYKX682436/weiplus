package s50;

@j95.b
/* loaded from: classes12.dex */
public class m0 extends i95.w implements u50.x {

    /* renamed from: d, reason: collision with root package name */
    public final p13.w f484624d = new p13.w();

    public void x1() {
        java.lang.String j17 = j62.e.g().j("clicfg_android_websearch_sort_with_group_chat", "", true, true);
        p13.w wVar = this.f484624d;
        wVar.getClass();
        try {
            wVar.f432694a = false;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(j17);
                wVar.f432695b = jSONObject.optInt("prefixCnt", 0);
                wVar.f432696c = jSONObject.optDouble(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54480x74e6a74f, 0.0d);
                wVar.f432697d = jSONObject.optInt("count", 0);
                wVar.f432698e = jSONObject.optInt("matchMemberCnt", 0);
                wVar.f432694a = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSortConfig", "parseSortConfig, matchRate: %f, matchQueryCnt: %d, matchMemberCnt: %d", java.lang.Double.valueOf(wVar.f432696c), java.lang.Integer.valueOf(wVar.f432697d), java.lang.Integer.valueOf(wVar.f432698e));
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSSortConfig", e17.getMessage());
        }
        java.lang.String j18 = j62.e.g().j("clicfg_android_fts_group_chat_sort_v2", "", true, true);
        wVar.f432699f = true;
        wVar.f432700g = true;
        wVar.f432701h = false;
        wVar.f432702i = 14;
        wVar.f432703j = 15;
        wVar.f432704k = true;
        wVar.f432705l = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j18)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(j18);
            wVar.f432699f = jSONObject2.optBoolean("useAllMemberFirst", true);
            wVar.f432700g = jSONObject2.optBoolean("useFoldSort", true);
            wVar.f432701h = jSONObject2.optBoolean("useSilentSort", false);
            wVar.f432702i = jSONObject2.optInt("groupActiveDays", 14);
            wVar.f432703j = jSONObject2.optInt("smallChatroomMembers", 15);
            wVar.f432704k = jSONObject2.optBoolean("useTrainSort", true);
            wVar.f432705l = jSONObject2.optBoolean("useTrainSortFold", true);
            if (wVar.f432702i <= 0) {
                wVar.f432702i = 14;
            }
            if (wVar.f432703j <= 0) {
                wVar.f432703j = 15;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSSortConfig", "parseGroupSortConfig, useAllMemberFirst=%b, useFoldSort=%b, useSilentSort=%b, groupActiveDays=%d, smallChatroomMembers=%d, useTrainSort=%b, useTrainSortFold=%b", java.lang.Boolean.valueOf(wVar.f432699f), java.lang.Boolean.valueOf(wVar.f432700g), java.lang.Boolean.valueOf(wVar.f432701h), java.lang.Integer.valueOf(wVar.f432702i), java.lang.Integer.valueOf(wVar.f432703j), java.lang.Boolean.valueOf(wVar.f432704k), java.lang.Boolean.valueOf(wVar.f432705l));
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSSortConfig", "parseGroupSortConfig failed: " + e18.getMessage());
        }
    }
}
