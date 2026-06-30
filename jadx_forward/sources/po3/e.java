package po3;

/* loaded from: classes15.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public int f438857b;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k f438856a = new com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f438858c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f438859d = new java.util.ArrayList();

    public void a(java.lang.String str) {
        int i17;
        java.util.ArrayList arrayList = this.f438858c;
        java.util.ArrayList arrayList2 = this.f438859d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1936x237a88eb.p1937x2e06d1.k kVar = this.f438856a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FailMsgFileCache", "[createFromFileContent] content is null! stack:%s", new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            kVar.f233986a.clear();
            kVar.f233987b = 0;
            arrayList2.clear();
            arrayList.clear();
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("msg_list");
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("fail_msg_list");
            org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("success_msg_list");
            int i18 = jSONObject.getInt("current_send_index");
            jSONArray.length();
            jSONArray2.length();
            jSONArray3.length();
            int i19 = 0;
            while (true) {
                i17 = 2;
                if (i19 >= jSONArray.length()) {
                    break;
                }
                java.lang.String string = jSONArray.getString(i19);
                if (string != null && !string.isEmpty()) {
                    java.lang.String[] split = string.split("|");
                    if (split.length == 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5 = new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(java.lang.Long.parseLong(split[0]), split[1]);
                        kVar.f233986a.size();
                        kVar.f233986a.add(c16564xb55e1d5);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FailMsgFileCache", "parse msgIdTalkerArray error: %s", string);
                    }
                }
                i19++;
            }
            int i27 = 0;
            while (i27 < jSONArray2.length()) {
                java.lang.String string2 = jSONArray2.getString(i27);
                if (string2 != null && !string2.isEmpty()) {
                    java.lang.String[] split2 = string2.split("|");
                    if (split2.length == i17) {
                        arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(java.lang.Long.parseLong(split2[0]), split2[1]));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FailMsgFileCache", "parse failIdTalkerArray error: %s", string2);
                    }
                }
                i27++;
                i17 = 2;
            }
            for (int i28 = 0; i28 < jSONArray3.length(); i28++) {
                java.lang.String string3 = jSONArray3.getString(i28);
                if (string3 != null && !string3.isEmpty()) {
                    java.lang.String[] split3 = string3.split("|");
                    if (split3.length == 2) {
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5(java.lang.Long.parseLong(split3[0]), split3[1]));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FailMsgFileCache", "parse successIdTalkerArray error: %s", string3);
                    }
                }
            }
            this.f438857b = i18;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FailMsgFileCache", e17, str, new java.lang.Object[0]);
        }
    }
}
