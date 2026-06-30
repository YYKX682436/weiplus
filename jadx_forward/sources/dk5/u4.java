package dk5;

/* loaded from: classes9.dex */
public class u4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f316469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316470b;

    public u4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, java.util.List list) {
        this.f316470b = activityC22573x19a79d99;
        this.f316469a = list;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        org.json.JSONArray optJSONArray;
        if (!z17) {
            com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.U6(this.f316470b);
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f316469a)) {
            return;
        }
        ik5.a aVar = ik5.b.f373505a;
        int size = this.f316469a.size();
        if (size <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReceiveFromWeWorkUtil", "initHelper: size <= 0");
        } else {
            ik5.b.f373505a = ik5.a.f373502e;
            ik5.b.f373506b = size;
        }
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316470b;
        dk5.C28228x688ed22 c28228x688ed22 = new dk5.C28228x688ed22(this, this.f316469a, str);
        int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.B;
        activityC22573x19a79d99.getClass();
        c01.l2 c17 = c01.n2.d().c("kWXEntryActivity_data_center_session_id", true);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendAppMessageWrapperUI", "dealFileInfo fail values is null");
            return;
        }
        java.lang.String str2 = (java.lang.String) c17.b("kWXEntryActivity_data_center_wework_msg_file_file_info");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "dealFileInfo: fileInfoString isNullOrNil");
            c28228x688ed22.a(null);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (jSONObject.has("file_info") && (optJSONArray = jSONObject.optJSONArray("file_info")) != null) {
                for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
                    if (optJSONObject != null) {
                        linkedList.add(new dk5.p5(activityC22573x19a79d99, optJSONObject.optString("msgId"), optJSONObject.optString("uri")));
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("dealFileInfo", "Error  json: " + e17.getMessage());
        }
        ((ku5.t0) ku5.t0.f394148d).g(new dk5.g5(activityC22573x19a79d99, linkedList, c28228x688ed22));
    }
}
