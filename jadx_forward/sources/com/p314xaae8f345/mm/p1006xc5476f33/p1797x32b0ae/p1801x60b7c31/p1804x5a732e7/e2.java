package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/e2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final int f225096g = 1;

    public final org.json.JSONObject A(java.lang.String str) {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        jd.c cVar = this.f224975e;
        java.lang.String str2 = cVar.f380558b;
        long j17 = cVar.f380557a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        java.lang.String m65291x71b41ca8 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65291x71b41ca8(j17, str2, str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, m65291x71b41ca8);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jSONArray.put(jSONObject);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("imageInfoList", jSONArray);
        return jSONObject2;
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.app.Activity activity;
        if (jSONObject != null) {
            java.lang.String string = jSONObject.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
            if (string.equals("CutsomEmoticonManagerPage")) {
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName(c(), "com.tencent.mm.plugin.emoji.ui.EmojiCustomUI");
                intent.putExtra("key_emoji_panel_type", 0);
                intent.putExtra("key_from_settings_mine", true);
                android.content.Context c17 = c();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                c17.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                android.content.Context c18 = c();
                activity = c18 instanceof android.app.Activity ? (android.app.Activity) c18 : null;
                if (activity != null) {
                    activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
                }
                this.f224975e.d();
                return;
            }
            boolean equals = string.equals("CutsomEmoticonManagerSelfiePage");
            int i17 = this.f225096g;
            if (equals) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClassName(c(), "com.tencent.mm.plugin.emoji.ui.EmojiCustomUI");
                intent2.putExtra("key_emoji_panel_type", i17);
                intent2.putExtra("key_from_settings_mine", true);
                android.content.Context c19 = c();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c19, arrayList2.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                c19.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(c19, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                android.content.Context c27 = c();
                activity = c27 instanceof android.app.Activity ? (android.app.Activity) c27 : null;
                if (activity != null) {
                    activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
                }
                this.f224975e.d();
                return;
            }
            if (string.equals("EmoticonProductListManagerPage")) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setClassName(c(), "com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity");
                intent3.putExtra("key_emoji_panel_type", i17);
                intent3.putExtra("key_from_settings_mine", true);
                android.content.Context c28 = c();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent3);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(c28, arrayList3.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                c28.startActivity((android.content.Intent) arrayList3.get(0));
                yj0.a.f(c28, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                android.content.Context c29 = c();
                activity = c29 instanceof android.app.Activity ? (android.app.Activity) c29 : null;
                if (activity != null) {
                    activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
                }
                this.f224975e.d();
                return;
            }
            if (string.equals("EmoticonPrivacySettingPage")) {
                android.content.Intent intent4 = new android.content.Intent();
                intent4.setClassName(c(), "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductDialogUI");
                android.content.Context c37 = c();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent4);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(c37, arrayList4.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                c37.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(c37, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                android.content.Context c38 = c();
                activity = c38 instanceof android.app.Activity ? (android.app.Activity) c38 : null;
                if (activity != null) {
                    activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
                }
                this.f224975e.d();
                return;
            }
            if (!string.equals("EmoticonEditPage")) {
                this.f224975e.a();
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String string2 = jSONObject.getString("liteappAppid");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            hashMap.put("appId", string2);
            java.lang.String string3 = jSONObject.getString("liteappPath");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, string3);
            java.lang.String string4 = jSONObject.getString("liteappExtendQuery");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            hashMap.put("query", string4);
            android.content.Intent intent5 = new android.content.Intent();
            intent5.setClass(c(), com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.ActivityC16239xc81f635b.class);
            intent5.putExtra("proxyui_action_code_key", 19);
            int i18 = m93.j.M + 1;
            m93.j.M = i18;
            m93.j.N.put(java.lang.Integer.valueOf(i18), this);
            intent5.putExtra("callback_id", m93.j.M);
            intent5.putExtra("post_emoticon_params", hashMap);
            android.content.Context c39 = c();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(intent5);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c39, arrayList5.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "chooseMediaFromAlbum", "(Ljava/util/HashMap;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            c39.startActivity((android.content.Intent) arrayList5.get(0));
            yj0.a.f(c39, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "chooseMediaFromAlbum", "(Ljava/util/HashMap;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            android.content.Context c47 = c();
            activity = c47 instanceof android.app.Activity ? (android.app.Activity) c47 : null;
            if (activity != null) {
                activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public void u(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "onPostEmoticonCompleted");
        try {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "callback data is null");
                this.f224975e.a();
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "onPostEmoticonCompleted path " + stringExtra);
            if (!android.text.TextUtils.isEmpty(stringExtra)) {
                this.f224975e.f(A(stringExtra), false);
                return;
            }
            java.lang.String stringExtra2 = intent.getStringExtra("md5");
            if (android.text.TextUtils.isEmpty(stringExtra2)) {
                this.f224975e.a();
            } else {
                this.f224975e.f(A(((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Ni(stringExtra2)).T()), false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiEmoticonStorePersonalCenterPageRouter", "callback error:" + e17.getMessage());
            this.f224975e.a();
        }
    }
}
