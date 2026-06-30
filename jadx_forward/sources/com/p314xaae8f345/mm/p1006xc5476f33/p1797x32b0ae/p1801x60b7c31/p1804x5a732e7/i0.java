package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class i0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("param is null");
            return;
        }
        java.lang.String optString = jSONObject.optString("src");
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("editingOptions");
        if (android.text.TextUtils.isEmpty(optString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiEditImage", "cropImage fail, src is null");
            this.f224976f.a("cropImage fail, src is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("src", optString);
        hashMap.put("appId", this.f224976f.f224973a.f380558b);
        hashMap.put("appUuid", java.lang.String.valueOf(this.f224976f.f224973a.f380557a));
        hashMap.put("editingOptions", optJSONObject == null ? "" : optJSONObject.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
        intent.putExtra("proxyui_action_code_key", 13);
        intent.putExtra("edit_image_params", hashMap);
        int i17 = m93.j.C + 1;
        m93.j.C = i17;
        m93.j.D.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.C);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEditImage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEditImage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void k(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1000) {
            if (i18 != -1) {
                this.f224976f.a("cancel");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
            if (c16991x15ced046 == null) {
                this.f224976f.a(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16697x69dc35be);
                return;
            }
            java.lang.String str = c16991x15ced046.f237195f;
            if (android.text.TextUtils.isEmpty(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
                this.f224976f.a(com.p314xaae8f345.map.sdk.p497x5a73344.vis.InterfaceC4273x137f8dd1.OnLayerStatusChangedListener.LayerStatusMsg.f16697x69dc35be);
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(str).f264269e);
            ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).getClass();
            java.lang.String g17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.g(arrayList);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("localIds", g17);
            this.f224976f.b(hashMap);
        }
    }
}
