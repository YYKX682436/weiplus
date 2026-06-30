package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34061x366c91de = 1156;

    /* renamed from: NAME */
    public static final java.lang.String f34062x24728b = "chooseMultiWechatChatroom";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f162871e = false;
        android.app.Activity Z0 = service.Z0();
        if (Z0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMultiChooseWeChatChatroom", "MultiChooseWeChatChatroom context is null, appId is %s", service.mo48798x74292566());
            service.a(i17, o("fail:internal error invalid android context"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiMultiChooseWeChatChatroom", "MultiChooseWeChatChatroom appId:%s", service.mo48798x74292566());
            org.json.JSONObject optJSONObject = data.optJSONObject("params");
            if (optJSONObject != null) {
                java.lang.String optString = optJSONObject.optString("tipWord");
                java.lang.String optString2 = optJSONObject.optString("choiseSessionWord");
                java.lang.String optString3 = optJSONObject.optString("chatroomSessionWord");
                java.lang.String optString4 = optJSONObject.optString("rightButtonWord");
                java.lang.String optString5 = optJSONObject.optString("rightButtonLightFontColor");
                java.lang.String optString6 = optJSONObject.optString("rightButtonDarkFontColor");
                java.lang.String optString7 = optJSONObject.optString("rightButtonLightColor");
                java.lang.String optString8 = optJSONObject.optString("rightButtonDarkColor");
                org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("selectedUserNameList");
                boolean optBoolean = optJSONObject.optBoolean("canSelectOpenIM");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (optJSONArray != null && optJSONArray.length() > 0 && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    int i18 = 0;
                    while (i18 < length) {
                        int i19 = length;
                        java.lang.String optString9 = optJSONArray.optString(i18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString9, "optString(...)");
                        arrayList.add(optString9);
                        i18++;
                        length = i19;
                        optJSONArray = optJSONArray;
                    }
                }
                int optInt = optJSONObject.optInt("maxCount");
                java.lang.String optString10 = optJSONObject.optString("countExceedTipWord");
                boolean optBoolean2 = optJSONObject.optBoolean("forceLightMode", false);
                ((qd0.u0) ((rd0.g1) i95.n0.c(rd0.g1.class))).getClass();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_tipWord", optString);
                intent.putExtra("key_choiseSessionWord", optString2);
                intent.putExtra("key_chatroomSessionWord", optString3);
                intent.putExtra("key_rightButtonWord", optString4);
                intent.putExtra("key_rightButtonLightFontColor", optString5);
                intent.putExtra("key_rightButtonDarkFontColor", optString6);
                intent.putExtra("key_rightButtonLightColor", optString7);
                intent.putExtra("key_rightButtonDarkColor", optString8);
                intent.putExtra("key_forceLightMode", optBoolean2);
                intent.putExtra("key_canSelectOpenIM", optBoolean);
                intent.putExtra("showLabelWhenSearch", false);
                intent.putExtra("showContactScrollbar", false);
                intent.putExtra("max_limit_num", optInt);
                intent.putExtra("too_many_member_tip_string", optString10);
                intent.putExtra("list_attr", 64);
                intent.putExtra("chatroomlist", kz5.n0.g0(kz5.p0.f395529d, ",", null, null, 0, null, null, 62, null));
                intent.putExtra("already_select_contact", kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
                intent.putExtra("openMenuStyle", 1);
                pf5.j0.a(intent, ij5.n0.class);
                pf5.j0.a(intent, ij5.f.class);
                pf5.j0.a(intent, ij5.d0.class);
                pf5.j0.a(intent, ij5.t.class);
                pf5.j0.a(intent, cj5.k4.class);
                pf5.j0.a(intent, ij5.c.class);
                pf5.j0.a(intent, cj5.n3.class);
                pf5.j0.a(intent, cj5.w2.class);
                pf5.j0.a(intent, cj5.l2.class);
                java.util.HashMap hashMap = new java.util.HashMap(1);
                bh5.c cVar = new bh5.c();
                cVar.f102455a.f102457a = Z0;
                cVar.d(intent);
                cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
                cVar.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.r(hashMap, service, i17, this));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiMultiChooseWeChatChatroom", "chooseMultiWechatChatroom fail, jsonObject is null");
            service.a(i17, o("fail:invalid data"));
        }
    }
}
